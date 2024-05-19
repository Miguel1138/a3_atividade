/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author User
 */
public final class Dispatcher extends Exception{
     
    public static String mostrarMensagemDeErro(DispatcherLog msg) {
        
        switch(msg) {
            case ERRO_NOME_MENOR_2 -> { return "Nome do produto deve ter mais do que 2 caracteres"; }
            case ERRO_ESTOQUE_ZERADO -> { return "Estoque não deve ser zero!"; }
            case ERRO_PRECO_ZERADO_OU_ABAIXO -> { return "Preço está zerado ou negativo!"; }
            case ERRO_FORNECEDOR_VAZIO -> { return "Você deve informar o nome do fornecedor!"; }
        }

        return "Erro não mapeado";
    }
}