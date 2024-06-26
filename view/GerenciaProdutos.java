/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import view.components.HeaderColor;
import Model.Produto;
import controller.ProdutoController;
import java.awt.Color;
import javax.swing.ImageIcon;

import javax.swing.table.DefaultTableModel;

public class GerenciaProdutos extends javax.swing.JFrame {
    
    private final ProdutoController controller;
    
    public GerenciaProdutos() {
        this.controller = new ProdutoController();
        initComponents();
        carregarDados();
        
        jBtnVoltar.setVisible(false);
        this.getContentPane().setBackground(Color.decode("#02153D"));
        String caminhoIcone = "/view/img/ico.png";
        ImageIcon icone = new ImageIcon(getClass().getResource(caminhoIcone));
        this.setIconImage(icone.getImage());
        tableProdutos.getTableHeader().setDefaultRenderer(new HeaderColor());
        tableProdutos.setRowHeight(25);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jspTabela = new javax.swing.JScrollPane();
        tableProdutos = new javax.swing.JTable();
        labelTextoValor = new javax.swing.JLabel();
        labelValorTotal = new javax.swing.JLabel();
        buttonEstqBaixo = new javax.swing.JButton();
        jbNovo = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jBtnVoltar = new javax.swing.JButton();
        jmbBarra = new javax.swing.JMenuBar();
        jmArquivo = new javax.swing.JMenu();
        jmiSair = new javax.swing.JMenuItem();
        jmProduto = new javax.swing.JMenu();
        jmiNovo = new javax.swing.JMenuItem();
        jmiAlterar = new javax.swing.JMenuItem();
        jmiApagar = new javax.swing.JMenuItem();
        jmAjuda = new javax.swing.JMenu();
        jmiSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Atacado Programado");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(600, 400));

        jspTabela.setBackground(new java.awt.Color(23, 47, 100));
        jspTabela.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jspTabela.setForeground(new java.awt.Color(23, 47, 100));
        jspTabela.setFocusable(false);
        jspTabela.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N

        tableProdutos.setBackground(new java.awt.Color(23, 47, 100));
        tableProdutos.setForeground(new java.awt.Color(241, 241, 241));
        tableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Descrição", "Quantidade", "Preço", "Data", "Fornecedor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableProdutos.setFillsViewportHeight(true);
        tableProdutos.setFocusable(false);
        tableProdutos.setGridColor(new java.awt.Color(2, 21, 61));
        tableProdutos.setRowHeight(25);
        tableProdutos.setRowSelectionAllowed(false);
        tableProdutos.setSelectionBackground(new java.awt.Color(241, 241, 241));
        tableProdutos.setSelectionForeground(new java.awt.Color(241, 241, 241));
        tableProdutos.setShowGrid(false);
        tableProdutos.setShowHorizontalLines(true);
        tableProdutos.getTableHeader().setReorderingAllowed(false);
        jspTabela.setViewportView(tableProdutos);

        labelTextoValor.setBackground(new java.awt.Color(241, 241, 241));
        labelTextoValor.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        labelTextoValor.setForeground(new java.awt.Color(255, 255, 255));
        labelTextoValor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelTextoValor.setText("Valor total:");

        labelValorTotal.setBackground(new java.awt.Color(241, 241, 241));
        labelValorTotal.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        labelValorTotal.setForeground(new java.awt.Color(255, 255, 255));
        labelValorTotal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelValorTotal.setText("R$ 0,00");

        buttonEstqBaixo.setBackground(new java.awt.Color(1, 151, 175));
        buttonEstqBaixo.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        buttonEstqBaixo.setForeground(new java.awt.Color(255, 255, 255));
        buttonEstqBaixo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons/graph-down.png"))); // NOI18N
        buttonEstqBaixo.setText("Mostrar Baixo Estoque");
        buttonEstqBaixo.setBorderPainted(false);
        buttonEstqBaixo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonEstqBaixo.setFocusPainted(false);
        buttonEstqBaixo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonEstqBaixo.setIconTextGap(10);
        buttonEstqBaixo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEstqBaixoActionPerformed(evt);
            }
        });

        jbNovo.setBackground(new java.awt.Color(1, 151, 175));
        jbNovo.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        jbNovo.setForeground(new java.awt.Color(255, 255, 255));
        jbNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons/plus.png"))); // NOI18N
        jbNovo.setText("Novo Produto");
        jbNovo.setBorderPainted(false);
        jbNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbNovo.setFocusPainted(false);
        jbNovo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jbNovo.setIconTextGap(10);
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });

        jbAlterar.setBackground(new java.awt.Color(1, 151, 175));
        jbAlterar.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        jbAlterar.setForeground(new java.awt.Color(255, 255, 255));
        jbAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons/transition-right.png"))); // NOI18N
        jbAlterar.setText("Alterar Produto");
        jbAlterar.setBorderPainted(false);
        jbAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbAlterar.setFocusPainted(false);
        jbAlterar.setIconTextGap(10);
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jbExcluir.setBackground(new java.awt.Color(1, 151, 175));
        jbExcluir.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        jbExcluir.setForeground(new java.awt.Color(255, 255, 255));
        jbExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons/xmark.png"))); // NOI18N
        jbExcluir.setText("Excluir Produto");
        jbExcluir.setToolTipText("");
        jbExcluir.setBorderPainted(false);
        jbExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbExcluir.setFocusPainted(false);
        jbExcluir.setIconTextGap(10);
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jBtnVoltar.setBackground(new java.awt.Color(1, 151, 175));
        jBtnVoltar.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        jBtnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        jBtnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/icons/graph-up.png"))); // NOI18N
        jBtnVoltar.setText("Mostrar Estoque Usual");
        jBtnVoltar.setBorderPainted(false);
        jBtnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBtnVoltar.setFocusPainted(false);
        jBtnVoltar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBtnVoltar.setIconTextGap(10);
        jBtnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVoltarActionPerformed(evt);
            }
        });

        jmbBarra.setBackground(new java.awt.Color(75, 34, 122));
        jmbBarra.setBorderPainted(false);
        jmbBarra.setMargin(new java.awt.Insets(0, 10, 0, 0));
        jmbBarra.setMinimumSize(new java.awt.Dimension(193, 40));

        jmArquivo.setBackground(new java.awt.Color(23, 47, 100));
        jmArquivo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jmArquivo.setForeground(new java.awt.Color(241, 241, 241));
        jmArquivo.setText("Arquivo");
        jmArquivo.setBorderPainted(false);
        jmArquivo.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N

        jmiSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jmiSair.setBackground(new java.awt.Color(23, 47, 100));
        jmiSair.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jmiSair.setForeground(new java.awt.Color(241, 241, 241));
        jmiSair.setText("Sair");
        jmiSair.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));
        jmiSair.setBorderPainted(false);
        jmiSair.setContentAreaFilled(false);
        jmiSair.setIconTextGap(10);
        jmiSair.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jmiSair.setOpaque(true);
        jmiSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSairActionPerformed(evt);
            }
        });
        jmArquivo.add(jmiSair);

        jmbBarra.add(jmArquivo);

        jmProduto.setBackground(new java.awt.Color(23, 47, 100));
        jmProduto.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jmProduto.setForeground(new java.awt.Color(255, 255, 255));
        jmProduto.setText("Produto");
        jmProduto.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N

        jmiNovo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jmiNovo.setBackground(new java.awt.Color(23, 47, 100));
        jmiNovo.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jmiNovo.setForeground(new java.awt.Color(241, 241, 241));
        jmiNovo.setText("Novo Produto");
        jmiNovo.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));
        jmiNovo.setBorderPainted(false);
        jmiNovo.setContentAreaFilled(false);
        jmiNovo.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jmiNovo.setOpaque(true);
        jmiNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiNovoActionPerformed(evt);
            }
        });
        jmProduto.add(jmiNovo);

        jmiAlterar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jmiAlterar.setBackground(new java.awt.Color(23, 47, 100));
        jmiAlterar.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jmiAlterar.setForeground(new java.awt.Color(241, 241, 241));
        jmiAlterar.setText("Alterar Produto");
        jmiAlterar.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));
        jmiAlterar.setBorderPainted(false);
        jmiAlterar.setContentAreaFilled(false);
        jmiAlterar.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jmiAlterar.setOpaque(true);
        jmiAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAlterarActionPerformed(evt);
            }
        });
        jmProduto.add(jmiAlterar);

        jmiApagar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jmiApagar.setBackground(new java.awt.Color(23, 47, 100));
        jmiApagar.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jmiApagar.setForeground(new java.awt.Color(241, 241, 241));
        jmiApagar.setText("Excluir Produto");
        jmiApagar.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));
        jmiApagar.setBorderPainted(false);
        jmiApagar.setContentAreaFilled(false);
        jmiApagar.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jmiApagar.setOpaque(true);
        jmiApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiApagarActionPerformed(evt);
            }
        });
        jmProduto.add(jmiApagar);

        jmbBarra.add(jmProduto);

        jmAjuda.setBackground(new java.awt.Color(23, 47, 100));
        jmAjuda.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jmAjuda.setForeground(new java.awt.Color(255, 255, 255));
        jmAjuda.setText("Ajuda");
        jmAjuda.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jmAjuda.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jmiSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F12, 0));
        jmiSobre.setBackground(new java.awt.Color(23, 47, 100));
        jmiSobre.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jmiSobre.setForeground(new java.awt.Color(241, 241, 241));
        jmiSobre.setText("Sobre");
        jmiSobre.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));
        jmiSobre.setBorderPainted(false);
        jmiSobre.setContentAreaFilled(false);
        jmiSobre.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jmiSobre.setOpaque(true);
        jmiSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSobreActionPerformed(evt);
            }
        });
        jmAjuda.add(jmiSobre);

        jmbBarra.add(jmAjuda);

        setJMenuBar(jmbBarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelTextoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonEstqBaixo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnVoltar))
                            .addComponent(jspTabela))
                        .addGap(14, 14, 14))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jspTabela, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelTextoValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelValorTotal)
                        .addComponent(buttonEstqBaixo))
                    .addComponent(jBtnVoltar))
                .addGap(13, 13, 13))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonEstqBaixoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEstqBaixoActionPerformed
        this.setVisible(false);
        DefaultTableModel modelo = (DefaultTableModel) this.tableProdutos.getModel();
        modelo.setNumRows(0);
        
        for(Produto p: controller.carregaEstoqueBaixo()){
           modelo.addRow(new Object[]{
            p.getId_produto(),
            p.getNome_produto(),
            p.getDescricao_produto(),
            p.getQuantidade_estoque(),
            p.getPreco(),
            p.getData_cadastro(),
            p.getFornecedor(),
           });
       }
        
        this.setVisible(true);
        jBtnVoltar.setVisible(true);
        buttonEstqBaixo.setVisible(false);
        
    }//GEN-LAST:event_buttonEstqBaixoActionPerformed

    private void jmiSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jmiSairActionPerformed

    private void jmiSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSobreActionPerformed
        carregarTela(Telas.SOBRE);
    }//GEN-LAST:event_jmiSobreActionPerformed
   
  private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        carregarTela(Telas.NOVO_PRODUTO);
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jBtnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnVoltarActionPerformed
        jBtnVoltar.setVisible(false);
        buttonEstqBaixo.setVisible(true);
        carregarDados();
    }//GEN-LAST:event_jBtnVoltarActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        carregarTela(Telas.ALTERAR_PRODUTO);
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        carregarTela(Telas.EXCLUIR_PRODUTO);
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jmiAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAlterarActionPerformed
        carregarTela(Telas.ALTERAR_PRODUTO);
    }//GEN-LAST:event_jmiAlterarActionPerformed

    private void jmiNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiNovoActionPerformed
        carregarTela(Telas.NOVO_PRODUTO);
    }//GEN-LAST:event_jmiNovoActionPerformed

    private void jmiApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiApagarActionPerformed
        carregarTela(Telas.EXCLUIR_PRODUTO);
    }//GEN-LAST:event_jmiApagarActionPerformed
  
    
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
            java.util.logging.Logger.getLogger(GerenciaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciaProdutos().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEstqBaixo;
    private javax.swing.JButton jBtnVoltar;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbNovo;
    private javax.swing.JMenu jmAjuda;
    private javax.swing.JMenu jmArquivo;
    private javax.swing.JMenu jmProduto;
    private javax.swing.JMenuBar jmbBarra;
    private javax.swing.JMenuItem jmiAlterar;
    private javax.swing.JMenuItem jmiApagar;
    private javax.swing.JMenuItem jmiNovo;
    private javax.swing.JMenuItem jmiSair;
    private javax.swing.JMenuItem jmiSobre;
    private javax.swing.JScrollPane jspTabela;
    private javax.swing.JLabel labelTextoValor;
    private javax.swing.JLabel labelValorTotal;
    private javax.swing.JTable tableProdutos;
    // End of variables declaration//GEN-END:variables

   private void carregarDados() {
       DefaultTableModel modelo = (DefaultTableModel) this.tableProdutos.getModel();
       modelo.setNumRows(0);
       // Retorna a lista já instanciando a tabela.
       for(Produto p: controller.getProdutoLista()){
           modelo.addRow(new Object[]{
            p.getId_produto(),
            p.getNome_produto(),
            p.getDescricao_produto(),
            p.getQuantidade_estoque(),
            p.getPreco(),
            p.getData_cadastro(),
            p.getFornecedor(),
           });
       }
       
       String valor = controller.calculaValorTotal();
       this.labelValorTotal.setText(valor);
       
  }
   
    private void carregarTela(Telas tela) {
        switch(tela) {
            case NOVO_PRODUTO -> { 
                NovoProduto nProduto = new NovoProduto();
                this.setVisible(false);
                nProduto.setVisible(true);
            }
            case SOBRE -> {
                Sobre sobre = new Sobre();
                this.setVisible(false);
                sobre.setVisible(true);
            }
            
            case ALTERAR_PRODUTO -> {
                PesquisarID pID = new PesquisarID(tela);
                this.setVisible(false);
                pID.setVisible(true);
            }
            
            case EXCLUIR_PRODUTO -> {
                PesquisarID pID = new PesquisarID(tela);
                this.setVisible(false);
                pID.setVisible(true);
            }
        }
    }

    public void atualizarPlanilha() {
        carregarDados();
        this.setVisible(true);
    }
        
}
