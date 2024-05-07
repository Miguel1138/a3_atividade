/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Model.Produto;
import java.util.ArrayList;
import java.sql.Date;

/**
 *
 * @author User
 */
public class MockDao {
    
    private ArrayList<Produto> produtos = new ArrayList<>();
    
    public MockDao() {
        Date dataCadastro = new Date(2024, 05, 02);
        
        
        produtos.add(new Produto(
                1, "Coca Cola", "Refrigerante 350ml", 1000, 4.99f, dataCadastro, "Coca - Cola"
        ));
        
        produtos.add(new Produto(
                2, "Pepsi ", "Refrigerante 2l", 500, 8.99f, dataCadastro, "Pepsi"
        ));
    }
    
    
    public ArrayList<Produto> getProdutos() {
        return produtos;
    }
    
    public boolean insertProdutoMockDB(Produto produto) {
        produtos.add(produto);
        produtos.notify();
        return produtos.contains(produto);
    }
    
    public boolean deleteProdutoMockDB(int index) {
        Produto produto = produtos.get(index);
        produtos.remove(index);
        
        // Verifica se o produto ainda está cadastrado dentro da lista.
        return !produtos.contains(produto);
    }
    
    public boolean updateProdutoMockDB(int index, Produto produto) {
        Produto p = produtos.get(index);
        p.setNome_produto(produto.getNome_produto());
        p.setDescricao_produto(produto.getDescricao_produto());
        p.setPreco(produto.getPreco());
        p.setQuantidade_estoque(produto.getQuantidade_estoque());
        p.setData_cadastro(produto.getData_cadastro());
        p.setFornecedor(produto.getFornecedor());
        
        produtos.add(index, p);
        return produtos.contains(p);
    }
    
}
