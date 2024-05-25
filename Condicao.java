package view;

import Model.Produto;
import controller.ProdutoController;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Condicao extends javax.swing.JFrame {

    private static Produto produto;
    private static Telas flag;
    
    // Removido JFrame pois não 
    public Condicao(Produto produto, Telas flag) {
        Condicao.flag = flag;
        Condicao.produto = produto;
        initComponents();
        
        this.getContentPane().setBackground(Color.decode("#02153D"));
        String caminhoIcone = "/view/img/ico.png";
        ImageIcon icone = new ImageIcon(getClass().getResource(caminhoIcone));
        this.setIconImage(icone.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlTexto = new javax.swing.JLabel();
        jbNao = new javax.swing.JButton();
        jbSim = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Confirmar");
        setResizable(false);

        jlTexto.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jlTexto.setForeground(new java.awt.Color(241, 241, 241));
        jlTexto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTexto.setText("Deseja realizar a operação?");

        jbNao.setBackground(new java.awt.Color(1, 151, 175));
        jbNao.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        jbNao.setForeground(new java.awt.Color(255, 255, 255));
        jbNao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons/xmark.png"))); // NOI18N
        jbNao.setText("Não");
        jbNao.setBorderPainted(false);
        jbNao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbNao.setFocusPainted(false);
        jbNao.setIconTextGap(10);
        jbNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNaoActionPerformed(evt);
            }
        });

        jbSim.setBackground(new java.awt.Color(50, 195, 176));
        jbSim.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        jbSim.setForeground(new java.awt.Color(255, 255, 255));
        jbSim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons/check.png"))); // NOI18N
        jbSim.setText("Sim");
        jbSim.setBorderPainted(false);
        jbSim.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbSim.setFocusPainted(false);
        jbSim.setIconTextGap(10);
        jbSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSimActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(23, 47, 100));
        jSeparator1.setForeground(new java.awt.Color(23, 47, 100));
        jSeparator1.setEnabled(false);
        jSeparator1.setMaximumSize(new java.awt.Dimension(3, 3));
        jSeparator1.setOpaque(true);
        jSeparator1.setPreferredSize(new java.awt.Dimension(3, 3));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlTexto, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbNao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSim)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNao)
                    .addComponent(jbSim))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNaoActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jbNaoActionPerformed

    private void jbSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSimActionPerformed
        ProdutoController controller = new ProdutoController();        
        if (flag == Telas.ALTERAR_PRODUTO) {
            controller.atualiza(produto);
        } else if (flag == Telas.EXCLUIR_PRODUTO) {
            controller.deletaProdutoPelo(produto.getId_produto());
        }
        this.setVisible(false);
        GerenciaProdutos tela = new GerenciaProdutos();
        tela.setVisible(true);
    }//GEN-LAST:event_jbSimActionPerformed

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
            java.util.logging.Logger.getLogger(Condicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Condicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Condicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Condicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Condicao(produto, flag).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbNao;
    private javax.swing.JButton jbSim;
    private javax.swing.JLabel jlTexto;
    // End of variables declaration//GEN-END:variables
}
