/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.components;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author User
 */

public class HeaderColor extends DefaultTableCellRenderer {

    public HeaderColor() {
        setOpaque(true);
        setFont(new Font("Dubai", Font.BOLD, 12));
    }
    
    @Override
    public Component getTableCellRendererComponent(
            JTable table, Object value, boolean selected, boolean focused, int row, int column
    ) {
        super.getTableCellRendererComponent(table, value, selected, focused, row, column);
        setBackground(new Color(50, 195, 176));
        setForeground(new Color(255, 255, 255));
        setFont(new Font("Dubai", Font.BOLD, 12));
        return this;
    }
}
    

