/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public final class Dispatcher extends Exception {
    public static String showErrorMessage(int msg) {
        switch(msg) {
            case 0 -> { return "Nome do produto deve ter mais do que 2 caracteres"; }
            case 1 -> { return "Estoque não deve ser zero!"; }
            case 2 -> { return "Preço está zerado ou negativo!"; }
            case 3 -> { return "Você deve informar o nome do fornecedor!"; }
        }

        return "Erro não mapeado";
    }
}
