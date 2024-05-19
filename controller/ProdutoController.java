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
import view.Dispatcher;
import view.DispatcherLog;
import view.Erro;

/**
 *
 * @author miguel.sdasilva00@gmail.com
 */
public class ProdutoController {

    public ProdutoController() {
    }
    
    public boolean inserirNovo(Produto produto) {
        boolean dadosEstaoFormatadosCorretamente = validaObjeto(produto);
        if(dadosEstaoFormatadosCorretamente) {
            ProdutoDAO dao = new ProdutoDAO();
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
            new Erro(Dispatcher.mostrarMensagemDeErro(DispatcherLog.ERRO_NOME_MENOR_2))
                    .setVisible(true);
            return false;
        } 
        
        if(produto.getQuantidade_estoque() < 1 ||
                produto.getQuantidade_estoque() == Integer.MIN_VALUE) {
            new Erro(Dispatcher.mostrarMensagemDeErro(DispatcherLog.ERRO_ESTOQUE_ZERADO)
            ).setVisible(true);
            return false;
        }
        
        if(produto.getPreco() <= 0f || 
                produto.getPreco() == Float.MIN_VALUE) {
            new Erro(Dispatcher.mostrarMensagemDeErro(DispatcherLog.ERRO_PRECO_ZERADO_OU_ABAIXO))
                    .setVisible(true);
            return false;
        }
        
        if(produto.getFornecedor().isBlank() ||
                produto.getFornecedor().isEmpty()) {
            new Erro(Dispatcher.mostrarMensagemDeErro(DispatcherLog.ERRO_FORNECEDOR_VAZIO))
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
        ProdutoDAO dao = new ProdutoDAO();
        return dao.getMinhaLista();
    }

    public ArrayList<Produto> carregaEstoqueBaixo() {
        ProdutoDAO dao = new ProdutoDAO();
        return dao.carregaEstoqueBaixo();
    }
    
}
