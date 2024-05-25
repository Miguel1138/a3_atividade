package dao;

import Model.Produto;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProdutoDAO {

    public static ArrayList<Produto> produtos_list = new ArrayList<>();

    
    public ProdutoDAO() {
    }

    public Connection getConexao() throws SQLException {
        Connection connection = null;  //inst�ncia da conex�o

        try {
            // Carregamento do JDBC Driver
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);

            // Configurar a conex�o
            String server = "localhost"; //caminho do MySQL
            String database = "a3_atividade";
            String url = "jdbc:mysql://" + server + ":3306/" + database + "?useTimezone=true&serverTimezone=UTC";
            String user = "root";
            String password = "MySQL@123";

            connection = DriverManager.getConnection(url, user, password);

            // Testando..
            if (connection != null) {
                System.out.println("Status: Conectado!");
            } else {
                System.out.println("Status: N�O CONECTADO!");
            }

            return connection;

        } catch (ClassNotFoundException e) {//Driver n�o encontrado
            throw new ClassCastException("O driver nao foi encontrado. " + e.getMessage() );

        } catch (SQLException e) {
            throw new SQLException("Não foi possível conectar ao banco..." + e.getMessage());
        }
    }

    // Retorna a Lista de Produto (objetos)
    public ArrayList<Produto> getMinhaLista() {
        produtos_list.clear(); // Limpa nosso ArrayList

        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_produto");
            
            while (res.next()) {

                int id = res.getInt("id_produto");
                String nome = res.getString("nome_produto");
                String descricao = res.getString("descricao_produto");
                int estoque = res.getInt("quantidade_estoque");
                float preco = res.getFloat("preco");
                String dataCadastro = res.getString("data_cadastro");
                String fornecedor = res.getString("fornecedor");
                
                Produto objeto = new Produto(id, nome, descricao, estoque, preco, dataCadastro, fornecedor);

                produtos_list.add(objeto);
            }

            stmt.close();

        } catch (SQLException ex) {   
            
        }

        return produtos_list;
    }

    // Cadastra novo Produto
    public boolean InsertProdutoDB(Produto objeto) {
        String sql = "INSERT INTO tb_produto( " + 
                "nome_produto,descricao_produto,quantidade_estoque,preco,data_cadastro, fornecedor" + 
                ") VALUES(?,?,?,?,?,?)";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setString(1, objeto.getNome_produto());
            stmt.setString(2, objeto.getDescricao_produto());
            stmt.setInt(3, objeto.getQuantidade_estoque());
            stmt.setFloat(4, objeto.getPreco());
            stmt.setString(5, objeto.getData_cadastro());
            stmt.setString(6, objeto.getFornecedor());            
            
            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
        

    }

    // Deleta um Produto espec�fico pelo seu campo ID
    public boolean DeleteProdutoDB(int id) {
        try {
            Statement stmt = this.getConexao().createStatement();
            stmt.executeUpdate("DELETE FROM tb_produto WHERE id_produto = " + id);
            stmt.close();            
            
        } catch (SQLException erro) {        }
        
        return true;
    }

    // Edita um Produto espec�fico pelo seu campo ID
    public boolean UpdateProdutoDB(Produto objeto) {
        String sql = "UPDATE tb_produto set nome_produto = ? ,descricao_produto = ? ,quantidade_estoque = ? ,preco = ?, data_cadastro = ?, fornecedor = ?"
                + " WHERE id_produto = ?";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setString(1, objeto.getNome_produto());
            stmt.setString(2, objeto.getDescricao_produto());
            stmt.setInt(3, objeto.getQuantidade_estoque());
            stmt.setFloat(4, objeto.getPreco());
            stmt.setString(5, objeto.getData_cadastro());
            stmt.setString(6, objeto.getFornecedor());
            
            stmt.setInt(7, objeto.getId_produto());

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }
    
    public ArrayList<Produto> carregaEstoqueBaixo() {
        String sql = "SELECT * FROM  tb_produto "
                + " WHERE quantidade_estoque <= 100";
        
        produtos_list.clear();
        try {
             Statement stmt = this.getConexao().createStatement();
             ResultSet res = stmt.executeQuery(sql);
             
             while (res.next()) {
                int id = res.getInt("id_produto");
                String nome = res.getString("nome_produto");
                String descricao = res.getString("descricao_produto");
                int estoque = res.getInt("quantidade_estoque");
                float preco = res.getFloat("preco");
                String dataCadastro = res.getString("data_cadastro");
                String fornecedor = res.getString("fornecedor");
                
                Produto objeto = new Produto(id, nome, descricao, estoque, preco, dataCadastro, fornecedor);

                produtos_list.add(objeto);
            }
            stmt.close();
        } catch(Exception e) {
            // TODO: Tratar Exceção.
        }
        
        return produtos_list;
    }

    public Produto carregaProduto(int id) {
        Produto objeto = new Produto();
        objeto.setId_produto(id);
        
        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_produto WHERE id_produto = " + id);
            res.next();

            objeto.setNome_produto(res.getString("nome_produto"));
            objeto.setDescricao_produto(res.getString("descricao_produto"));
            objeto.setQuantidade_estoque(res.getInt("quantidade_estoque"));
            objeto.setPreco(res.getFloat("preco"));
            objeto.setData_cadastro(res.getString("data_cadastro"));
            objeto.setFornecedor(res.getString("fornecedor"));
            
            stmt.close();            
            
        } catch (SQLException erro) {
        }
        return objeto;
    }
    
       public ArrayList<Integer> getQuantidades() {
        String sql = "SELECT quantidade_estoque FROM tb_produto";
        ArrayList<Integer> quantidades = new ArrayList<>();
        
        try {
            Statement stmt = this.getConexao().createStatement();
             ResultSet res = stmt.executeQuery(sql);
             while(res.next()) {
                 int quantidade = res.getInt("quantidade_estoque");
                 quantidades.add(quantidade);
             }
             
             stmt.close();
        } catch(SQLException e) {
            
        }
        return quantidades;
    }

    public ArrayList<Float> getPrecoTotal() {
        String sql = "SELECT preco FROM tb_produto";
        ArrayList<Float> precos = new ArrayList<>();
        
        try {
            Statement stmt = this.getConexao().createStatement();
             ResultSet res = stmt.executeQuery(sql);
             while(res.next()) {
                 float preco = res.getFloat("preco");
                 precos.add(preco);
             }
             
             stmt.close();
        } catch(SQLException e) {
            
        }
        return precos;
    }
    
}
