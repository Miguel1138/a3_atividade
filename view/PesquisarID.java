/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Model.Produto;
import controller.ProdutoController;


/**
 *
 * @author Gabriel
 */
public class PesquisarID extends javax.swing.JFrame {
    
    private static Telas flag;    
    private final ProdutoController controller;
    private Produto produto;
    
    public PesquisarID(Telas flag) {
        this.controller = new ProdutoController();
        PesquisarID.flag = flag;
        initComponents();
        if (flag == Telas.ALTERAR_PRODUTO){
            this.jbConfirmar.setText("Alterar");
        } else if (flag == Telas.EXCLUIR_PRODUTO) {
            this.jbConfirmar.setText("Excluir");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jlTexto = new javax.swing.JLabel();
        jtfCampo = new javax.swing.JTextField();
        jbCancelar = new javax.swing.JButton();
        jbConfirmar = new javax.swing.JButton();
        jbLocalizar = new javax.swing.JButton();
        jlID = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jtfDescricao = new javax.swing.JTextField();
        jtfPreco = new javax.swing.JTextField();
        jtfEstoque = new javax.swing.JTextField();
        jlData = new javax.swing.JLabel();
        jtfFornecedor = new javax.swing.JTextField();
        jlID1 = new javax.swing.JLabel();
        jlID2 = new javax.swing.JLabel();
        jlID3 = new javax.swing.JLabel();
        jlID4 = new javax.swing.JLabel();
        jlID5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Localizar");
        setResizable(false);

        jlTexto.setText("Insira o ID correspondente do produto:");

        jtfCampo.setToolTipText("");

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbConfirmar.setText("Confirmar");
        jbConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmarActionPerformed(evt);
            }
        });

        jbLocalizar.setText("Localizar");
        jbLocalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLocalizarActionPerformed(evt);
            }
        });

        jlID.setText("ID:");

        jtfNome.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtfNome.setText("Nome");

        jtfDescricao.setText("Descrição");

        jtfPreco.setText("Preço");

        jtfEstoque.setText("Estoque");

        jlData.setText("Data de Cadastro:");

        jtfFornecedor.setText("Fornecedor");

        jlID1.setText("Descrição: ");

        jlID2.setText("Nome:");

        jlID3.setText("Estoque");

        jlID4.setText("Preço");

        jlID5.setText("Fornecedor:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlTexto)
                        .addGap(18, 18, 18)
                        .addComponent(jtfCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbLocalizar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlID2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlID1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlID4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlID3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlID5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                            .addComponent(jtfEstoque)
                            .addComponent(jtfPreco)
                            .addComponent(jtfDescricao)
                            .addComponent(jtfNome)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlID, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlData, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbConfirmar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTexto)
                    .addComponent(jtfCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbLocalizar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlData)
                    .addComponent(jlID))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlID2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfDescricao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlID1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlID4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlID3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlID5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCancelar)
                    .addComponent(jbConfirmar))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        this.setVisible(false);
        GerenciaProdutos tela = new GerenciaProdutos();
        tela.setVisible(true);
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbLocalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLocalizarActionPerformed
        int id = Integer.parseInt(this.jtfCampo.getText());
        produto = controller.carregaProdutoPelo(id);
        preencheDados();
    }//GEN-LAST:event_jbLocalizarActionPerformed

    private void jbConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarActionPerformed
        produto.setNome_produto(this.jtfNome.getText());
        produto.setDescricao_produto(this.jtfDescricao.getText());
        produto.setQuantidade_estoque(Integer.parseInt(this.jtfEstoque.getText()));
        produto.setPreco(Float.parseFloat(this.jtfPreco.getText()));
        produto.setFornecedor(this.jtfFornecedor.getText());
        
        Condicao condicao = new Condicao(produto, flag);
        condicao.setVisible(true);
    }//GEN-LAST:event_jbConfirmarActionPerformed
    
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
            java.util.logging.Logger.getLogger(PesquisarID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisarID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisarID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisarID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesquisarID(flag).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbConfirmar;
    private javax.swing.JButton jbLocalizar;
    private javax.swing.JLabel jlData;
    private javax.swing.JLabel jlID;
    private javax.swing.JLabel jlID1;
    private javax.swing.JLabel jlID2;
    private javax.swing.JLabel jlID3;
    private javax.swing.JLabel jlID4;
    private javax.swing.JLabel jlID5;
    private javax.swing.JLabel jlTexto;
    private javax.swing.JTextField jtfCampo;
    private javax.swing.JTextField jtfDescricao;
    private javax.swing.JTextField jtfEstoque;
    private javax.swing.JTextField jtfFornecedor;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfPreco;
    // End of variables declaration//GEN-END:variables

    private void preencheDados() {
        this.jlID.setText("ID: " + Integer.toString(produto.getId_produto()));
        this.jtfNome.setText(produto.getNome_produto());
        this.jtfDescricao.setText(produto.getDescricao_produto());
        this.jtfEstoque.setText(Integer.toString(produto.getQuantidade_estoque()));
        this.jtfPreco.setText(Float.toString(produto.getPreco()));
        this.jlData.setText("Data de Cadastro: " + produto.getData_cadastro());
    }
    
}
