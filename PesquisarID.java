/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Model.Produto;
import controller.ProdutoController;
import handlers.DispatcherLog;
import java.awt.Color;
import javax.swing.ImageIcon;


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
        aplicaDesign();
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
        jSeparator1 = new javax.swing.JSeparator();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Localizar");
        setResizable(false);

        jlTexto.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jlTexto.setForeground(new java.awt.Color(241, 241, 241));
        jlTexto.setText("Insira o ID referente ao produto:");

        jtfCampo.setBackground(new java.awt.Color(23, 47, 100));
        jtfCampo.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        jtfCampo.setForeground(new java.awt.Color(242, 242, 242));
        jtfCampo.setToolTipText("");
        jtfCampo.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));

        jbCancelar.setBackground(new java.awt.Color(1, 151, 175));
        jbCancelar.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        jbCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons/xmark.png"))); // NOI18N
        jbCancelar.setText("Cancelar");
        jbCancelar.setBorderPainted(false);
        jbCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbCancelar.setFocusPainted(false);
        jbCancelar.setIconTextGap(10);
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbConfirmar.setBackground(new java.awt.Color(50, 195, 176));
        jbConfirmar.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        jbConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        jbConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons/check.png"))); // NOI18N
        jbConfirmar.setText("Confirmar");
        jbConfirmar.setBorderPainted(false);
        jbConfirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbConfirmar.setFocusPainted(false);
        jbConfirmar.setIconTextGap(10);
        jbConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmarActionPerformed(evt);
            }
        });

        jbLocalizar.setBackground(new java.awt.Color(1, 151, 175));
        jbLocalizar.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        jbLocalizar.setForeground(new java.awt.Color(255, 255, 255));
        jbLocalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons/magnifying-glass.png"))); // NOI18N
        jbLocalizar.setText("Localizar");
        jbLocalizar.setBorderPainted(false);
        jbLocalizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbLocalizar.setFocusPainted(false);
        jbLocalizar.setIconTextGap(10);
        jbLocalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLocalizarActionPerformed(evt);
            }
        });

        jlID.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        jlID.setForeground(new java.awt.Color(241, 241, 241));
        jlID.setText("ID:");

        jtfNome.setEditable(false);
        jtfNome.setBackground(new java.awt.Color(23, 47, 100));
        jtfNome.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        jtfNome.setForeground(new java.awt.Color(242, 242, 242));
        jtfNome.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtfNome.setText("Nome");
        jtfNome.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jtfNome.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jtfDescricao.setBackground(new java.awt.Color(23, 47, 100));
        jtfDescricao.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        jtfDescricao.setForeground(new java.awt.Color(242, 242, 242));
        jtfDescricao.setText("Descrição");
        jtfDescricao.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));

        jtfPreco.setBackground(new java.awt.Color(23, 47, 100));
        jtfPreco.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        jtfPreco.setForeground(new java.awt.Color(242, 242, 242));
        jtfPreco.setText("Preço");
        jtfPreco.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));

        jtfEstoque.setBackground(new java.awt.Color(23, 47, 100));
        jtfEstoque.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        jtfEstoque.setForeground(new java.awt.Color(242, 242, 242));
        jtfEstoque.setText("Estoque");
        jtfEstoque.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));

        jlData.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        jlData.setForeground(new java.awt.Color(241, 241, 241));
        jlData.setText("Data de Cadastro:");

        jtfFornecedor.setBackground(new java.awt.Color(23, 47, 100));
        jtfFornecedor.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        jtfFornecedor.setForeground(new java.awt.Color(242, 242, 242));
        jtfFornecedor.setText("Fornecedor");
        jtfFornecedor.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));

        jlID1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jlID1.setForeground(new java.awt.Color(241, 241, 241));
        jlID1.setText("Descrição: ");

        jlID2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jlID2.setForeground(new java.awt.Color(241, 241, 241));
        jlID2.setText("Nome:");

        jlID3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jlID3.setForeground(new java.awt.Color(241, 241, 241));
        jlID3.setText("Estoque:");

        jlID4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jlID4.setForeground(new java.awt.Color(241, 241, 241));
        jlID4.setText("Preço:");

        jlID5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jlID5.setForeground(new java.awt.Color(241, 241, 241));
        jlID5.setText("Fornecedor:");

        jSeparator2.setBackground(new java.awt.Color(23, 47, 100));
        jSeparator2.setForeground(new java.awt.Color(23, 47, 100));
        jSeparator2.setOpaque(true);

        jSeparator1.setBackground(new java.awt.Color(23, 47, 100));
        jSeparator1.setForeground(new java.awt.Color(23, 47, 100));
        jSeparator1.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2)
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
                        .addComponent(jbCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbConfirmar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlTexto)
                            .addComponent(jlID, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtfCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbLocalizar)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jlData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfCampo)
                    .addComponent(jbLocalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlData)
                    .addComponent(jlID, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtfNome)
                    .addComponent(jlID2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtfDescricao)
                    .addComponent(jlID1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtfPreco)
                    .addComponent(jlID4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlID3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtfFornecedor)
                    .addComponent(jlID5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbConfirmar)
                    .addComponent(jbCancelar))
                .addGap(12, 12, 12))
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
        if(this.jtfCampo.getText().isBlank() || 
                this.jtfCampo.getText().isEmpty()) {
            new Erro(DispatcherLog.ERRO_ID_NÃO_INFORMADO)
                    .setVisible(true);
        } else {
            int id = Integer.parseInt(this.jtfCampo.getText().trim());
            produto = controller.carregaProdutoPelo(id);
            int ultimoIdLista = controller.getProdutoLista().getLast().getId_produto();
            
            if(produto.getId_produto() > ultimoIdLista 
                    || produto.getId_produto() < 1 ){
                new Erro(DispatcherLog.ERRO_ID_FORA_ESCOPO)
                        .setVisible(true);
            } else {
                preencheDados();
            }
        }
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
    private javax.swing.JSeparator jSeparator1;
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

    private void aplicaDesign() {
        this.getContentPane().setBackground(Color.decode("#02153D"));
        String caminhoIcone = "/view/img/ico.png";
        ImageIcon icone = new ImageIcon(getClass().getResource(caminhoIcone));
        this.setIconImage(icone.getImage());
        if (flag == Telas.ALTERAR_PRODUTO){
            this.jbConfirmar.setText("Alterar");
            this.jtfNome.setEnabled(true);
            this.jtfDescricao.setEnabled(true);
            this.jtfEstoque.setEnabled(true);
            this.jtfPreco.setEnabled(true);
            this.jtfFornecedor.setEnabled(true);
        } else if (flag == Telas.EXCLUIR_PRODUTO) {
            this.jbConfirmar.setText("Excluir");
            this.jtfNome.setEnabled(false);
            this.jtfDescricao.setEnabled(false);
            this.jtfEstoque.setEnabled(false);
            this.jtfPreco.setEnabled(false);
            this.jtfFornecedor.setEnabled(false);
        }
    }
    
}
