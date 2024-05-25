/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Model.Produto;
import dao.ProdutoDAO;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import handlers.DispatcherLog;
import view.Erro;

/**
 *
 * @author miguel.sdasilva00@gmail.com
 */
public class ProdutoController {

    private final ProdutoDAO dao = new ProdutoDAO();
    
    public ProdutoController() {
    }
    
    public boolean inserirNovo(Produto produto) {
        boolean dadosEstaoFormatadosCorretamente = validaObjeto(produto);
        if(dadosEstaoFormatadosCorretamente) {
            boolean inseridoNovoProduto = dao.InsertProdutoDB(produto);            
            return inseridoNovoProduto;
        }
        
        return false;
    }
    
    // Efetua validações da formatação do texto de acordo com regra de negócio.
    private boolean validaObjeto(Produto produto){
        
        if(produto.getNome_produto().isBlank() ||
                produto.getNome_produto().isEmpty() ||
                produto.getNome_produto().length() <= 2) 
        {
            new Erro(DispatcherLog.ERRO_NOME_MENOR_2)
                    .setVisible(true);
            return false;
        } 
        
        if(produto.getQuantidade_estoque() < 1 ||
                produto.getQuantidade_estoque() == Integer.MIN_VALUE) {
            new Erro(DispatcherLog.ERRO_ESTOQUE_ZERADO)
                    .setVisible(true);
            return false;
        }
        
        if(produto.getPreco() <= 0f || 
                produto.getPreco() == Float.MIN_VALUE) {
            new Erro(DispatcherLog.ERRO_PRECO_ZERADO_OU_ABAIXO)
                    .setVisible(true);
            return false;
        }
        
        if(produto.getFornecedor().isBlank() ||
                produto.getFornecedor().isEmpty()) {
            new Erro(DispatcherLog.ERRO_FORNECEDOR_VAZIO)
                    .setVisible(true);
            return false;
        }
        
        // Pega a data atual do sistema ao criar novo produto.
        if(produto.getData_cadastro() == null) {
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date date = new Date();
            produto.setData_cadastro(dateFormat.format(date));
        }
        
        return true;
    }

    public ArrayList<Produto> getProdutoLista() {
        return dao.getMinhaLista();
    }

    public ArrayList<Produto> carregaEstoqueBaixo() {
        return dao.carregaEstoqueBaixo();
    }

    public void atualiza(Produto produto) {
        dao.UpdateProdutoDB(produto);
    }

    public void deletaProdutoPelo(int id_produto) {
        dao.DeleteProdutoDB(id_produto);
    }

    public Produto carregaProdutoPelo(int id) {
        return dao.carregaProduto(id);
    }
    
    public String calculaValorTotal() {
        int somaQtd = 0;
        float somaTotalProdutos = 0f;
        
        ArrayList<Integer> quantidades =  dao.getQuantidades();
        for(Integer qtd : quantidades) {
            somaQtd = somaQtd + qtd;
        }
        
        ArrayList<Float> precos = dao.getPrecoTotal();
        for (float preco: precos) {
            somaTotalProdutos = somaTotalProdutos + preco;
        }
        
        double valorFinal = somaTotalProdutos * somaQtd;
        
        String valor = String.format("%,.2f", valorFinal);
        return valor;
    }
    
}
