package view;

import handlers.DispatcherLog;
import java.awt.Color;
import javax.swing.ImageIcon;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Gabriel
 */
public class Erro extends javax.swing.JFrame {

    /**
     * Creates new form Erro
     */
    private static DispatcherLog motivo;
    
    public Erro(DispatcherLog motivo) {
        initComponents();
        Erro.motivo = motivo;
        this.jlErroMotivo.setText(motivo.getMsg());
        
        this.getContentPane().setBackground(Color.decode("#02153D"));
        String caminhoIcone = "/view/img/ico.png";
        ImageIcon icone = new ImageIcon(getClass().getResource(caminhoIcone));
        this.setIconImage(icone.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlTitulo = new javax.swing.JLabel();
        jlMotivo = new javax.swing.JLabel();
        jlErroMotivo = new javax.swing.JLabel();
        jsSeparador = new javax.swing.JSeparator();
        jbOk = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Erro");
        setResizable(false);

        jlTitulo.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        jlTitulo.setForeground(new java.awt.Color(242, 242, 242));
        jlTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitulo.setText("Não foi possível realizar a operação.");

        jlMotivo.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        jlMotivo.setForeground(new java.awt.Color(242, 242, 242));
        jlMotivo.setText("Motivo:");

        jlErroMotivo.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jlErroMotivo.setForeground(new java.awt.Color(242, 242, 242));
        jlErroMotivo.setText("[Insira motivo aqui]");
        jlErroMotivo.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jsSeparador.setBackground(new java.awt.Color(23, 47, 100));
        jsSeparador.setForeground(new java.awt.Color(23, 47, 100));
        jsSeparador.setOpaque(true);

        jbOk.setBackground(new java.awt.Color(50, 195, 176));
        jbOk.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        jbOk.setForeground(new java.awt.Color(255, 255, 255));
        jbOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons/check.png"))); // NOI18N
        jbOk.setText("OK");
        jbOk.setBorderPainted(false);
        jbOk.setFocusPainted(false);
        jbOk.setIconTextGap(10);
        jbOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jsSeparador)
                    .addComponent(jlErroMotivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlMotivo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbOk))
                    .addComponent(jlTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlMotivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlErroMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jsSeparador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jbOk)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbOkActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jbOkActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Erro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Erro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Erro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Erro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Erro(motivo).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbOk;
    private javax.swing.JLabel jlErroMotivo;
    private javax.swing.JLabel jlMotivo;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JSeparator jsSeparador;
    // End of variables declaration//GEN-END:variables
}