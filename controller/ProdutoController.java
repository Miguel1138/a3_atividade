/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Model.Produto;
import dao.ProdutoDAO;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import view.Dispatcher;
import view.DispatcherLog;

/**
 *
 * @author User
 */
public class ProdutoController {

    public ProdutoController() {
    }
    
    public boolean inserirNovo(Produto produto) {
        boolean isDataFormatted = validaObjeto(produto);
        if(isDataFormatted) {
            ProdutoDAO dao = new ProdutoDAO();
            boolean isInserted = dao.InsertProdutoDB(produto);
            return isInserted;
        }
        
        return false;
    }
    
    private boolean validaObjeto(Produto produto){
        // TODO: Efetuar validações de regra de negócio aqui antes de encaminhar para o banco.
        if(produto.getNome_produto().isBlank() ||
                produto.getNome_produto().isEmpty() ||
                produto.getNome_produto().length() < 2) 
        {
            JOptionPane.showMessageDialog(
                    null, 
                    Dispatcher.showErrorMessage(DispatcherLog.ERRO_NOME_MENOR_2)
            );
            return false;
        } 
        
        if(produto.getQuantidade_estoque() < 1) {
            JOptionPane.showMessageDialog(
                    null, 
                    Dispatcher.showErrorMessage(DispatcherLog.ERRO_ESTOQUE_ZERADO)
            );
            return false;
        }
        
        if(produto.getPreco() <= 0f) {
            JOptionPane.showMessageDialog(
                    null, 
                    Dispatcher.showErrorMessage(DispatcherLog.ERRO_PRECO_ZERADO_OU_ABAIXO));
            return false;
        }
        
        if(produto.getFornecedor().isBlank() ||
                produto.getFornecedor().isEmpty()) {
            JOptionPane.showMessageDialog(
                    null, 
                    Dispatcher.showErrorMessage(DispatcherLog.ERRO_FORNECEDOR_VAZIO)
            );
            return false;
        }
        
        if(produto.getData_cadastro() == null) {
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date date = new Date();
            produto.setData_cadastro(dateFormat.format(date));
        }
        
        return true;
    }
    
}
