/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package handlers;

/**
 *
 * @author miguel.sdasilva00@gmail.com
 */
public enum DispatcherLog {
    ERRO_NOME_MENOR_2("Nome do produto deve ter mais do que 2 caracteres"),
    ERRO_ESTOQUE_ZERADO("Estoque não deve ser zero!"),
    ERRO_PRECO_ZERADO_OU_ABAIXO("Preço está zerado ou negativo!"),
    ERRO_FORNECEDOR_VAZIO("Você deve informar o nome do fornecedor!"),
    ERRO_CADASTRO_NAO_EFETUADO("Erro não mapeado"), 
    ERRO_ID_NÃO_INFORMADO("Um Id deve ser Informado!"),
    ERRO_ID_FORA_ESCOPO("Valor do Id acima do último registrado");
    
    
    private String msg;

    
    DispatcherLog(String msg){
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    
}
