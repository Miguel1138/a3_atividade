package dao;

import Model.Produto;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;

public class ProdutoDAO {

    public static ArrayList<Produto> produtos_list = new ArrayList<>();

    public ProdutoDAO() {
    }

    public int maiorID() throws SQLException {

        int maiorID = 0;
        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT MAX(id_produto) id_produto FROM tb_produto");
            res.next();
            maiorID = res.getInt("id_produto");

            stmt.close();

        } catch (SQLException ex) {
        }

        return maiorID;
    }
    
    

    public Connection getConexao() {

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

        } catch (ClassNotFoundException e) {  //Driver n�o encontrado
            System.out.println("O driver nao foi encontrado. " + e.getMessage() );
            return null;

        } catch (SQLException e) {
            System.out.println("Nao foi possivel conectar...");
            return null;
        }
    }

    // Retorna a Lista de Alunos(objetos)
    public ArrayList getMinhaLista() {
        
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
                Date dataCadastro = res.getDate("data_cadastro");
                String fornecedor = res.getString("fornecedor");
                
                Produto objeto = new Produto(id, nome, descricao, estoque, preco, dataCadastro, fornecedor);

                produtos_list.add(objeto);
            }

            stmt.close();

        } catch (SQLException ex) {
        }

        return produtos_list;
    }

    // Cadastra novo aluno
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
            // TODO: Pesquisar sobre casting de date util e sql.
            stmt.setDate(5, objeto.getData_cadastro());
            stmt.setString(6, objeto.getFornecedor());            
            
            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
        

    }

    // Deleta um aluno espec�fico pelo seu campo ID
    public boolean DeleteProdutoDB(int id) {
        try {
            Statement stmt = this.getConexao().createStatement();
            stmt.executeUpdate("DELETE FROM tb_produto WHERE id_produto = " + id);
            stmt.close();            
            
        } catch (SQLException erro) {
        }
        
        return true;
    }

    // Edita um aluno espec�fico pelo seu campo ID
    public boolean UpdateProdutoDB(Produto objeto) {
        // TODO Como fazeR A BUSCA POR iD.
        String sql = "UPDATE tb_produto set nome_produto = ? ,descricao_produto = ? ,quantidade_estoque = ? ,preco = ?, data_cadastro = ?, fornecedor = ?"
                + " WHERE id_produto = ?";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setString(1, objeto.getNome_produto());
            stmt.setString(2, objeto.getDescricao_produto());
            stmt.setInt(3, objeto.getQuantidade_estoque());
            stmt.setFloat(4, objeto.getPreco());
            stmt.setDate(5, objeto.getData_cadastro());
            stmt.setString(6, objeto.getFornecedor());
            
            stmt.setInt(7, objeto.getId_produto());

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }
    
    
    
    public void carregaEsgotados() {
        String sql = "SELECT * FROM  tb_produto "
                + " WHERE quantidade_estoque = 0";
        
        try {
             Statement stmt = this.getConexao().createStatement();
             ResultSet res = stmt.executeQuery(sql);
             
               while (res.next()) {
                int id = res.getInt("id_produto");
                String nome = res.getString("nome_produto");
                String descricao = res.getString("descricao_produto");
                int estoque = res.getInt("quantidade_estoque");
                float preco = res.getFloat("preco");
                Date dataCadastro = res.getDate("data_cadastro");
                String fornecedor = res.getString("fornecedor");
                
                Produto objeto = new Produto(id, nome, descricao, estoque, preco, dataCadastro, fornecedor);

                produtos_list.add(objeto);
            }
            stmt.close();
        } catch(Exception e) {
            // TODO: Tratar Exceção.
        }
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
            objeto.setData_cadastro(res.getDate("data_cadastro"));
            objeto.setFornecedor(res.getString("fornecedor"));
            
            stmt.close();            
            
        } catch (SQLException erro) {
        }
        return objeto;
    }
    
    
}
