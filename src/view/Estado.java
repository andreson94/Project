/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import models.dao.ConectaBanco;
import utilitarios.ModeloTabela;
import java.util.ArrayList;
import javax.swing.ListSelectionModel;
import utilitarios.ModeloTabela;
import java.util.ArrayList;
import javax.swing.ListSelectionModel;

/**
 *
 * @author andreson.csilva
 */
public class Estado extends javax.swing.JFrame {

    ConectaBanco conecta = new ConectaBanco();
    
    
    public Estado() {
        initComponents();
        conecta.conexao();
        preencherTabela("select * from estados order by id_estado");
        
    }

  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblSigla = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtSigla = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableEstado = new javax.swing.JTable();
        txtNome = new javax.swing.JTextField();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnPrimeiro = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Estados");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro de Estados");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblCodigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCodigo.setText("Código");

        lblNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNome.setText("Nome");

        lblSigla.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSigla.setText("Sigla");

        txtSigla.setEnabled(false);

        tableEstado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableEstado);

        txtNome.setEnabled(false);

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/NOVO.png"))); // NOI18N
        btnNovo.setText("NOVO");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/SALVAR.png"))); // NOI18N
        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ALTERAR.png"))); // NOI18N
        btnAlterar.setText("ALTERAR");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/EXCLUIR.png"))); // NOI18N
        btnDeletar.setText("Deletar");
        btnDeletar.setEnabled(false);
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        btnPrimeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/PRIMEIRO1.png"))); // NOI18N
        btnPrimeiro.setToolTipText("Primeiro");
        btnPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroActionPerformed(evt);
            }
        });

        btnUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ULTIMO1.png"))); // NOI18N
        btnUltimo.setToolTipText("Último");
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });

        btnAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/PRIMEIRO.png"))); // NOI18N
        btnAnterior.setToolTipText("Anterior");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnProximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ULTIMO.png"))); // NOI18N
        btnProximo.setToolTipText("Próximo");
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/SAIR.png"))); // NOI18N
        btnSair.setText("SAIR");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCodigo)
                            .addComponent(lblNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(lblSigla, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSigla, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeletar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPrimeiro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUltimo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAnterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnProximo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSair)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome)
                    .addComponent(lblSigla)
                    .addComponent(txtSigla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnSalvar)
                    .addComponent(btnAlterar)
                    .addComponent(btnDeletar)
                    .addComponent(btnPrimeiro)
                    .addComponent(btnUltimo)
                    .addComponent(btnAnterior)
                    .addComponent(btnProximo)
                    .addComponent(btnSair))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(334, 334, 334)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(881, 430));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try{

            PreparedStatement pst = conecta.conn.prepareStatement("insert into estados (nome_estado,sigla_estado)values(?,?)");
            pst.setString(1,txtNome.getText());
            pst.setString(2,txtSigla.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this,"Salvo com sucesso");
            preencherTabela("select * from estados order by id_estado");
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Erro");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        try {
            PreparedStatement pst = conecta.conn.prepareStatement("delete from estados where sigla_estado= ?");
            pst.setString(1, txtSigla.getText());
            pst.execute();
            JOptionPane.showMessageDialog(rootPane,"Excluido com sucesso");
            preencherTabela("select * from estados order by id_estado");
        } catch (SQLException ex) {
            Logger.getLogger(Estado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        try {
            PreparedStatement pst = conecta.conn.prepareStatement("update estados set nome_estado =?, sigla_estado = ? where id_estado= ?");
            pst.setString(1, txtNome.getText());
            pst.setString(2, txtSigla.getText());
            pst.setInt(3,Integer.parseInt(txtCodigo.getText()));
            pst.execute();
            JOptionPane.showMessageDialog(rootPane,"Excluido com sucesso");
            preencherTabela("select * from estados order by id_estado");
        } catch (SQLException ex) {
            Logger.getLogger(Estado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroActionPerformed
        btnAlterar.setVisible(true);
        btnDeletar.setVisible(true);
        txtNome.setVisible(true);
        txtSigla.setVisible(true);
        try {
            conecta.executaSQL("select * from estados");
            conecta.rs.first();
            txtCodigo.setText(String.valueOf(conecta.rs.getInt("id_estado")));
            txtNome.setText(conecta.rs.getString("nome_estado"));
            txtSigla.setText(conecta.rs.getString("sigla_estado"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Erro ao alterar dados");
        }
    }//GEN-LAST:event_btnPrimeiroActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        btnAlterar.setVisible(true);
        btnDeletar.setVisible(true);
        txtNome.setVisible(true);
        txtSigla.setVisible(true);
        try {
            conecta.executaSQL("select * from estados");
            conecta.rs.last();
            txtCodigo.setText(String.valueOf(conecta.rs.getInt("id_estado")));
            txtNome.setText(conecta.rs.getString("nome_estado"));
            txtSigla.setText(conecta.rs.getString("sigla_estado"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Erro ao mostrar dados");
        }
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        btnAlterar.setVisible(true);
        btnDeletar.setVisible(true);
        txtNome.setVisible(true);
        txtSigla.setVisible(true);
        try {
            conecta.executaSQL("select * from estados");
            conecta.rs.previous();
            txtCodigo.setText(String.valueOf(conecta.rs.getInt("id_estado")));
            txtNome.setText(conecta.rs.getString("nome_estado"));
            txtSigla.setText(conecta.rs.getString("sigla_estado"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Erro ao mostrar dados");
        }
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        btnAlterar.setVisible(true);
        btnDeletar.setVisible(true);
        txtNome.setVisible(true);
        txtSigla.setVisible(true);
        
        try {
            conecta.rs.next();
            txtCodigo.setText(String.valueOf(conecta.rs.getInt("id_estado")));
            txtNome.setText(conecta.rs.getString("nome_estado"));
            txtSigla.setText(conecta.rs.getString("sigla_estado"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Erro ao mostrar dados");
        }
        
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        txtCodigo.setText("");
        txtNome.setText("");
        txtSigla.setText("");
        txtNome.setEnabled(true);
        txtSigla.setEnabled(true);
        btnAlterar.setEnabled(true);
        btnDeletar.setEnabled(true);
        btnSalvar.setEnabled(true);
        btnNovo.setEnabled(false);
        
    }//GEN-LAST:event_btnNovoActionPerformed
        public void preencherTabela(String SQL){
           ArrayList dados = new ArrayList();
           
           String [] Colunas =  new String[]{"ID", "Nome", "Sigla"};
         
           conecta.executaSQL(SQL);
        try {
            conecta.rs.first();
            do{
                dados.add(new Object[]{conecta.rs.getInt("id_estado"),conecta.rs.getString("nome_estado"), conecta.rs.getString("sigla_estado")});
                
            }while(conecta.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao preencher a tabela");
        }
            ModeloTabela modelo = new ModeloTabela(dados, Colunas);
           tableEstado.setModel(modelo);
           tableEstado.getColumnModel().getColumn(0).setPreferredWidth(110);
           tableEstado.getColumnModel().getColumn(0).setResizable(false);
           tableEstado.getColumnModel().getColumn(1).setPreferredWidth(280);
           tableEstado.getColumnModel().getColumn(1).setResizable(false);
           tableEstado.getColumnModel().getColumn(2).setPreferredWidth(110);
           tableEstado.getColumnModel().getColumn(2).setResizable(false);
           tableEstado.getTableHeader().setReorderingAllowed(false);
           tableEstado.setAutoResizeMode(tableEstado.AUTO_RESIZE_OFF);
           tableEstado.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        }

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

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
            java.util.logging.Logger.getLogger(Estado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPrimeiro;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSigla;
    private javax.swing.JTable tableEstado;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSigla;
    // End of variables declaration//GEN-END:variables
}
