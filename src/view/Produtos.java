/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import models.ModelProduto;
import models.dao.ConectaBanco;
import models.dao.ControleProduto;
import utilitarios.ModeloTabela;

/**
 *
 * @author andreson.csilva
 */
public class Produtos extends javax.swing.JFrame {

    ConectaBanco conexao = new ConectaBanco();
    ModelProduto mod = new ModelProduto();
    ControleProduto control = new ControleProduto();
    
    public Produtos() {
        initComponents();
        preencherTabela("select * from produto order by nome_produto");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblCod = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        lblModelo = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        lblQtd = new javax.swing.JLabel();
        txtQtd = new javax.swing.JTextField();
        lblPreco = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProduto = new javax.swing.JTable();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtMarca = new javax.swing.JTextField();
        lblQtd1 = new javax.swing.JLabel();
        txtTamanho = new javax.swing.JTextField();
        lblTamanho = new javax.swing.JLabel();
        txtCor = new javax.swing.JTextField();
        lblCor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Produtos");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro de Produtos");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblCod.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCod.setText("Código:");

        txtCod.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtCod.setEnabled(false);

        lblModelo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblModelo.setText("Modelo");

        txtModelo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtModelo.setEnabled(false);

        lblQtd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblQtd.setText("Quantidade:");

        txtQtd.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtQtd.setEnabled(false);

        lblPreco.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPreco.setText("Preço:");

        txtPreco.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtPreco.setEnabled(false);

        tableProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProdutoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableProduto);

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/NOVO.png"))); // NOI18N
        btnNovo.setToolTipText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/SALVAR.png"))); // NOI18N
        btnSalvar.setToolTipText("Salvar");
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ALTERAR.png"))); // NOI18N
        btnAlterar.setToolTipText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/EXCLUIR.png"))); // NOI18N
        btnExcluir.setToolTipText("Deletar");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/SAIR.png"))); // NOI18N
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/CANCELAR VENDA.png"))); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtMarca.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtMarca.setEnabled(false);

        lblQtd1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblQtd1.setText("Marca:");

        txtTamanho.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTamanho.setEnabled(false);

        lblTamanho.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblTamanho.setText("Tamanho:");

        txtCor.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtCor.setEnabled(false);

        lblCor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCor.setText("Cor:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblModelo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lblCor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCor)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblQtd1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTamanho)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblQtd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPreco)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNovo)
                .addGap(18, 18, 18)
                .addComponent(btnSalvar)
                .addGap(18, 18, 18)
                .addComponent(btnAlterar)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar)
                .addGap(18, 18, 18)
                .addComponent(btnSair)
                .addGap(82, 82, 82))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCod)
                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblModelo)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQtd1)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPreco)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQtd)
                    .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTamanho)
                    .addComponent(txtTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCor)
                    .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvar)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnCancelar)
                    .addComponent(btnNovo)
                    .addComponent(btnSair))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(685, 400));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
      txtModelo.setText("");
        txtModelo.setEnabled(false);
        txtMarca.setText("");
        txtMarca.setEnabled(false);
        txtCor.setText("");
        txtCor.setEnabled(false);
        txtTamanho.setText("");
        txtTamanho.setEnabled(false);
        txtQtd.setText("");
        txtQtd.setEnabled(false);
        txtPreco.setText("");
        txtPreco.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnSalvar.setEnabled(false);
        btnNovo.setEnabled(true);
        btnCancelar.setEnabled(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        //recebe o texto digitado nos campo e guarda
        try {
            mod.setModelo(txtModelo.getText());
            mod.setMarca(txtMarca.getText());
            mod.setCor(txtCor.getText());
            mod.setTamanho(Integer.parseInt(txtTamanho.getText()));
            mod.setPreco_venda(Float.parseFloat(txtPreco.getText()));
            mod.setQuantidade(Integer.parseInt(txtQtd.getText()));
            control.inserirProduto(mod);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        txtModelo.setText("");
        txtModelo.setEnabled(false);
        txtMarca.setText("");
        txtMarca.setEnabled(false);
        txtCor.setText("");
        txtCor.setEnabled(false);
        txtTamanho.setText("");
        txtTamanho.setEnabled(false);
        txtQtd.setText("");
        txtQtd.setEnabled(false);
        txtPreco.setText("");
        txtPreco.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnSalvar.setEnabled(false);
        btnNovo.setEnabled(true);
        btnCancelar.setEnabled(false);
        preencherTabela("select * from produto order by nome_produto");
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        try {
            //efetua a alteração recebendo o modelo
            mod.setId_produto(Integer.parseInt(txtCod.getText()));
            mod.setModelo(txtModelo.getText());
            mod.setMarca(txtMarca.getText());
            mod.setCor(txtCor.getText());
            mod.setTamanho(Integer.parseInt(txtTamanho.getText()));
            mod.setPreco_venda(Float.parseFloat(txtPreco.getText()));
            mod.setQuantidade(Integer.parseInt(txtQtd.getText()));
            control.alterarProduto(mod);
        } catch (SQLException ex) {
            
        }
        txtModelo.setText("");
        txtModelo.setEnabled(false);
        txtMarca.setText("");
        txtMarca.setEnabled(false);
        txtCor.setText("");
        txtCor.setEnabled(false);
        txtTamanho.setText("");
        txtTamanho.setEnabled(false);
        txtQtd.setText("");
        txtQtd.setEnabled(false);
        txtPreco.setText("");
        txtPreco.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnSalvar.setEnabled(false);
        btnNovo.setEnabled(true);
        btnCancelar.setEnabled(false);
        preencherTabela("select * from produto order by nome_produto");
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        mod.setId_produto(Integer.parseInt(txtCod.getText()));
        control.ExcluirProduto(mod);
        txtModelo.setText("");
        txtModelo.setEnabled(false);
        txtMarca.setText("");
        txtMarca.setEnabled(false);
        txtCor.setText("");
        txtCor.setEnabled(false);
        txtTamanho.setText("");
        txtTamanho.setEnabled(false);
        txtQtd.setText("");
        txtQtd.setEnabled(false);
        txtPreco.setText("");
        txtPreco.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnSalvar.setEnabled(false);
        btnNovo.setEnabled(true);
        btnCancelar.setEnabled(false);
        preencherTabela("select * from produto order by nome_produto");

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        txtModelo.setText("");
        txtModelo.setEnabled(true);
        txtMarca.setText("");
        txtMarca.setEnabled(true);
        txtCor.setText("");
        txtCor.setEnabled(true);
        txtTamanho.setText("");
        txtTamanho.setEnabled(true);
        txtQtd.setText("");
        txtQtd.setEnabled(true);
        txtPreco.setText("");
        txtPreco.setEnabled(true);
        btnAlterar.setEnabled(true);
        btnExcluir.setEnabled(true);
        btnSalvar.setEnabled(true);
        btnNovo.setEnabled(false);
        btnCancelar.setEnabled(true);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void tableProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProdutoMouseClicked
        //adcionando o evento para quando clicar na tablea em cima de algum produto aparecer nos campos
        
        String nome_Produto = (String) tableProduto.getValueAt(tableProduto.getSelectedRow(),0); 
        conexao.conexao();
        conexao.executaSQL("select * from produto where nome_produto=" + nome_Produto + "'");
        try {
            conexao.rs.first();
            txtCod.setText(String.valueOf(conexao.rs.getInt("id_produto")));
            txtModelo.setText(conexao.rs.getString("nome_produto"));
            txtMarca.setText(conexao.rs.getString("marca"));
            txtCor.setText(conexao.rs.getString("cor"));
            txtTamanho.setText(conexao.rs.getString("tamanho"));
            txtPreco.setText(String.valueOf(conexao.rs.getFloat("preco_venda")));
            txtQtd.setText(String.valueOf(conexao.rs.getInt("quantidade")));
            conexao.desconecta();
            txtModelo.setText("");
            txtModelo.setEnabled(true);
            txtMarca.setText("");
            txtMarca.setEnabled(true);
            txtCor.setText("");
            txtCor.setEnabled(true);
            txtTamanho.setText("");
            txtTamanho.setEnabled(true);
            txtQtd.setText("");
            txtQtd.setEnabled(true);
            txtPreco.setText("");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(rootPane, "erro ao carregar");
           //conexao.desconecta();
        }
    }//GEN-LAST:event_tableProdutoMouseClicked
public void preencherTabela(String SQL){
           ArrayList dados = new ArrayList();
           
           String [] Colunas =  new String[]{"ID", "Modelo", "Marca","Cor","Tamanho","Preço","Quantidade"};
           conexao.conexao();
           conexao.executaSQL(SQL);
        try {
            conexao.rs.first();
            do{
                dados.add(new Object[]{conexao.rs.getInt("id_produto"),conexao.rs.getString("nome_produto"), conexao.rs.getString("marca"),
                conexao.rs.getString("cor"),conexao.rs.getInt("tamanho"),conexao.rs.getFloat("preco_venda"),conexao.rs.getInt("quantdade")});
                
            }while(conexao.rs.next());
        } catch (SQLException ex) {
            
        }
            ModeloTabela modelo = new ModeloTabela(dados, Colunas);
            tableProduto.setModel(modelo);
            tableProduto.getColumnModel().getColumn(0).setPreferredWidth(50);
            tableProduto.getColumnModel().getColumn(0).setResizable(false);
            tableProduto.getColumnModel().getColumn(1).setPreferredWidth(150);
            tableProduto.getColumnModel().getColumn(1).setResizable(false);
            tableProduto.getColumnModel().getColumn(2).setPreferredWidth(100);
            tableProduto.getColumnModel().getColumn(2).setResizable(false);
            tableProduto.getColumnModel().getColumn(3).setPreferredWidth(100);
            tableProduto.getColumnModel().getColumn(3).setResizable(false);
            tableProduto.getColumnModel().getColumn(4).setPreferredWidth(50);
            tableProduto.getColumnModel().getColumn(4).setResizable(false);
            tableProduto.getColumnModel().getColumn(5).setPreferredWidth(50);
            tableProduto.getColumnModel().getColumn(5).setResizable(false);
            tableProduto.getColumnModel().getColumn(6).setPreferredWidth(50);
            tableProduto.getColumnModel().getColumn(6).setResizable(false);
            tableProduto.getTableHeader().setReorderingAllowed(false);
            tableProduto.setAutoResizeMode( tableProduto.AUTO_RESIZE_OFF);
            tableProduto.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            //conexao.desconecta();
        }
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
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Produtos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCod;
    private javax.swing.JLabel lblCor;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblQtd;
    private javax.swing.JLabel lblQtd1;
    private javax.swing.JLabel lblTamanho;
    private javax.swing.JTable tableProduto;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtCor;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtQtd;
    private javax.swing.JTextField txtTamanho;
    // End of variables declaration//GEN-END:variables
}
