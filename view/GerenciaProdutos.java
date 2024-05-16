/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Model.Produto;
import dao.ProdutoDAO;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gabriel
 */
public class GerenciaProdutos extends javax.swing.JFrame {

    private ProdutoDAO dao = new ProdutoDAO();

    public GerenciaProdutos() {
         initComponents();
         jBtnVoltar.setVisible(false);
         carregarDados();
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jBtnVoltar = new javax.swing.JButton();
        jmbBarra = new javax.swing.JMenuBar();
        jmArquivo = new javax.swing.JMenu();
        jmiSair = new javax.swing.JMenuItem();
        jmProduto = new javax.swing.JMenu();
        jmiNovo = new javax.swing.JMenuItem();
        jmiApagar = new javax.swing.JMenuItem();
        jmiAlterar = new javax.swing.JMenuItem();
        jmAjuda = new javax.swing.JMenu();
        jmiSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        jspTabela.setViewportView(tableProdutos);

        labelTextoValor.setText("Valor total:");

        labelValorTotal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelValorTotal.setText("R$ 0,00");

        buttonEstqBaixo.setText("Produtos em Estoque Baixo");
        buttonEstqBaixo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEstqBaixoActionPerformed(evt);
            }
        });

        jButton1.setText("Novo Produto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Alterar Produto");

        jButton3.setText("Excluir Produto");

        jBtnVoltar.setText("Voltar");
        jBtnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVoltarActionPerformed(evt);
            }
        });

        jmArquivo.setText("Arquivo");

        jmiSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jmiSair.setText("Sair");
        jmiSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSairActionPerformed(evt);
            }
        });
        jmArquivo.add(jmiSair);

        jmbBarra.add(jmArquivo);

        jmProduto.setText("Produto");

        jmiNovo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jmiNovo.setText("Novo Produto");
        jmiNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiNovoActionPerformed(evt);
            }
        });
        jmProduto.add(jmiNovo);

        jmiApagar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jmiApagar.setText("Apagar Produto");
        jmProduto.add(jmiApagar);

        jmiAlterar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jmiAlterar.setText("Alterar Produto");
        jmiAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAlterarActionPerformed(evt);
            }
        });
        jmProduto.add(jmiAlterar);

        jmbBarra.add(jmProduto);

        jmAjuda.setText("Ajuda");

        jmiSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F12, 0));
        jmiSobre.setText("Sobre");
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jspTabela, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelTextoValor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelValorTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonEstqBaixo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnVoltar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jspTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonEstqBaixo)
                    .addComponent(labelValorTotal)
                    .addComponent(labelTextoValor)
                    .addComponent(jBtnVoltar))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonEstqBaixoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEstqBaixoActionPerformed
        // TODO add your handling code here:
        // Chamar método de busca com base no valor estoque
        this.setVisible(false);
        DefaultTableModel modelo = (DefaultTableModel) this.tableProdutos.getModel();
        modelo.setNumRows(0);
                
        ArrayList<Produto> produtos_lista = new ArrayList<>(); 
        produtos_lista = dao.carregaEstoqueBaixo();
        for(Produto p: produtos_lista){
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

    private void jmiNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiNovoActionPerformed
        carregaJanela(1);
    }//GEN-LAST:event_jmiNovoActionPerformed

    private void jmiAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAlterarActionPerformed
        // TODO Inserir chamada para o método insert do DAO. 
        // Pegar informação do formulário
        // Instanciar um objeto e inserir essas informações.
        // chamar o método UpdateDAO. 
    }//GEN-LAST:event_jmiAlterarActionPerformed

    private void jmiSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jmiSairActionPerformed

    private void jmiSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSobreActionPerformed
        carregaJanela(2);
    }//GEN-LAST:event_jmiSobreActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        carregaJanela(1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jBtnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnVoltarActionPerformed
        jBtnVoltar.setVisible(false);
        buttonEstqBaixo.setVisible(true);
        carregarDados();
    }//GEN-LAST:event_jBtnVoltarActionPerformed

    
    
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
       
       ArrayList<Produto> produtos_lista = new ArrayList<>();

       produtos_lista = dao.getMinhaLista();
       for(Produto p: produtos_lista){
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
       
  }
   
    private void carregaJanela(int janela) {
        switch(janela) {
            case 1 -> { 
                NovoProduto tela1 = new NovoProduto();
                this.setVisible(false);
                tela1.setVisible(true);
            }
            case 2 -> {
                Sobre tela2 = new Sobre();
                tela2.setVisible(true);
            }
        }
    }

    public void atualizarPlanilha() {
// TODO atualizar lista após inserção no banco.;
        carregarDados();
        this.setVisible(true);
    }
}
