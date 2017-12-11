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
import models.ModelCidade;
import models.dao.ConectaBanco;
import models.dao.ControleCidade;
import utilitarios.ModeloTabela;

/**
 *
 * @author andreson.csilva
 */
public class Cidade extends javax.swing.JFrame {
    
    ConectaBanco connEstado = new ConectaBanco();
    ConectaBanco connCidade = new ConectaBanco();
    
    ModelCidade mod = new ModelCidade();
    ControleCidade control = new ControleCidade();
    
    public Cidade() throws SQLException {
        initComponents();
   
        try{
        connEstado.conexao();
        connCidade.conexao();
        preencherTabela("select * from cidade inner join estados on cidade.id_estado = estados.id_estado");
        connEstado.executaSQL("select * from estados order by nome_estado");
        cbEstados.removeAllItems();//remove todos os itens da cbox
        connEstado.rs.first();
            do{
                cbEstados.addItem(connEstado.rs.getString("nome_estado"));
            }while(connEstado.rs.next());
            }catch(SQLException ex){
                
        }
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTela = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblEstados = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnPrimeiro = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCidade = new javax.swing.JTable();
        btnAnterior = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        cbEstados = new javax.swing.JComboBox<>();
        btnSair = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        lblTela.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTela.setText("Cadastro de Cidades");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblCodigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCodigo.setText("Código");

        lblNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNome.setText("Nome");

        lblEstados.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblEstados.setText("Estados:");

        txtCodigo.setEnabled(false);

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/NOVO.png"))); // NOI18N
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/SALVAR.png"))); // NOI18N
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ALTERAR.png"))); // NOI18N
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/EXCLUIR.png"))); // NOI18N
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

        tableCidade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableCidade);

        btnAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/PRIMEIRO.png"))); // NOI18N
        btnAnterior.setToolTipText("Anterior");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ULTIMO1.png"))); // NOI18N
        btnUltimo.setToolTipText("Último");
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });

        btnProximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ULTIMO.png"))); // NOI18N
        btnProximo.setToolTipText("Próximo");
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });

        txtNome.setEnabled(false);

        cbEstados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCodigo)
                            .addComponent(lblNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(lblEstados, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbEstados, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(247, 247, 247))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDeletar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPrimeiro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUltimo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAnterior)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnProximo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSair))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                    .addComponent(lblEstados)
                    .addComponent(cbEstados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnSalvar)
                    .addComponent(btnAlterar)
                    .addComponent(btnDeletar)
                    .addComponent(btnPrimeiro)
                    .addComponent(btnUltimo)
                    .addComponent(btnAnterior)
                    .addComponent(btnProximo)
                    .addComponent(btnSair)
                    .addComponent(btnCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(lblTela)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTela)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        txtCodigo.setText("");
        txtNome.setText("");
        txtNome.setEnabled(true);
        cbEstados.setEnabled(true);
        btnAlterar.setEnabled(true);
        btnDeletar.setEnabled(true);
        btnSalvar.setEnabled(true);
        btnNovo.setEnabled(false);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        //chamando o estado na tela de Cidade e inserindo a Cidade pelo metodo inserir
        try {
            mod.setNome(txtNome.getText());
            connEstado.executaSQL("select * from estados where nome_estado="+cbEstados.getSelectedItem()+"");
            connEstado.rs.first();
            mod.setCod_Estado(connEstado.rs.getInt("id_estado"));
            control.inserirCidade(mod);
            preencherTabela("select * from cidade inner join estados on cidade.id_estado = estados.id_estado");
        
            txtCodigo.setText("");
            txtNome.setText("");
            txtNome.setEnabled(false);
            cbEstados.setEnabled(false);
            btnAlterar.setEnabled(false);
            btnDeletar.setEnabled(false);
            btnSalvar.setEnabled(false);
            btnCancelar.setEnabled(false);
            btnNovo.setEnabled(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Erro ao Salvar");
        }
        
        
       
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroActionPerformed
        txtNome.setVisible(true);
        btnAlterar.setEnabled(true);
        btnDeletar.setEnabled(true);
        btnCancelar.setEnabled(true);
        try {
            connCidade.executaSQL("select * from cidade order by id_cidade");
            connCidade.rs.first();
            txtCodigo.setText(String.valueOf(connCidade.rs.getInt("id_cidade")));
            txtNome.setText(connCidade.rs.getString("nome_cidades"));
            connEstado.executaSQL("select * from estados where id_estado="+connCidade.rs.getInt("id_estado"));
            connEstado.rs.first();
            cbEstados.setSelectedItem(connEstado.rs.getString("nome_estado"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao setar o primeiro registro" + ex);
        }
    }//GEN-LAST:event_btnPrimeiroActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        
        try{
            
            mod.setCod(Integer.parseInt(txtCodigo.getText()));
            mod.setNome(txtNome.getText());
            connCidade.executaSQL("select * from estados where nome_estados = " + cbEstados.getSelectedItem()+"");
            connCidade.rs.first();
            mod.setCod_Estado(connCidade.rs.getInt("id_estado"));
            control.alterarCidade(mod);
            preencherTabela("select * from cidade inner join estados on cidade.id_estado = estados.id_estado");
            
            txtCodigo.setText("");
            txtNome.setText("");
            txtNome.setEnabled(false);
            cbEstados.setEnabled(false);
            btnAlterar.setEnabled(false);
            btnDeletar.setEnabled(false);
            btnSalvar.setEnabled(false);
            btnCancelar.setEnabled(false);
            btnNovo.setEnabled(true);
        }catch(SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Erro ao Alterar");
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        
        btnAlterar.setEnabled(true);
        btnDeletar.setEnabled(true);
        btnCancelar.setEnabled(true);
        try {
            mod.setCod(Integer.parseInt(txtCodigo.getText()));
            mod.setNome(txtNome.getText());
            mod.setCod_Estado(connCidade.rs.getInt("id_estado"));
            control.ExcluiCidade(mod);
            preencherTabela("select * from cidade inner join estados on cidade.id_estado = estados.id_estado");
            
            txtCodigo.setText("");
            txtNome.setText("");
            txtNome.setEnabled(false);
            cbEstados.setEnabled(false);
            btnAlterar.setEnabled(false);
            btnDeletar.setEnabled(false);
            btnSalvar.setEnabled(false);
            btnCancelar.setEnabled(false);
            btnNovo.setEnabled(true);
        } catch (SQLException ex) {
            Logger.getLogger(Cidade.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        txtNome.setVisible(true);      
        btnAlterar.setEnabled(true);
        btnDeletar.setEnabled(true);
        btnCancelar.setEnabled(true);                                  
        try {
            connCidade.executaSQL("select * from cidade order by id_cidade");
            connCidade.rs.last();
            txtCodigo.setText(String.valueOf(connCidade.rs.getInt("id_cidade")));
            txtNome.setText(connCidade.rs.getString("nome_cidades"));
            connEstado.executaSQL("select * from estados where id_estado="+connCidade.rs.getInt("id_estado"));
            connEstado.rs.first();
            cbEstados.setSelectedItem(connEstado.rs.getString("nome_estado"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao setar o ultimo registro" + ex);
        }
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        txtNome.setVisible(true);      
        btnAlterar.setEnabled(true);
        btnDeletar.setEnabled(true);
        btnCancelar.setEnabled(true); 
        try {
            //connCidade.executaSQL("select * from cidade order by id_cidade");
            connCidade.rs.previous();
            txtCodigo.setText(String.valueOf(connCidade.rs.getInt("id_cidade")));
            txtNome.setText(connCidade.rs.getString("nome_cidades"));
            connEstado.executaSQL("select * from estados where id_estado="+connCidade.rs.getInt("id_estado"));
            connEstado.rs.first();
            cbEstados.setSelectedItem(connEstado.rs.getString("nome_estado"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao setar o registro anterior" + ex);
        }   // TODO add your handling code here:
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtCodigo.setText("");
        txtNome.setText("");
        txtNome.setEnabled(false);
        cbEstados.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnDeletar.setEnabled(false);
        btnSalvar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnNovo.setEnabled(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        txtCodigo.setText("");
        btnAlterar.setEnabled(true);
        btnDeletar.setEnabled(true);
        btnCancelar.setEnabled(true);
        try {
            //connCidade.executaSQL("select * from cidade order by id_cidade");
            connCidade.rs.next();
            txtCodigo.setText(String.valueOf(connCidade.rs.getInt("id_cidade")));
            txtNome.setText(connCidade.rs.getString("nome_cidades"));
            connEstado.executaSQL("select * from estados where id_estado="+connCidade.rs.getInt("id_estado"));
            connEstado.rs.first();
            cbEstados.setSelectedItem(connEstado.rs.getString("nome_estado"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao setar o proximo registro" + ex);
        }
    }//GEN-LAST:event_btnProximoActionPerformed
    public void preencherTabela(String SQL){
           ArrayList dados = new ArrayList();
           
           String [] Colunas =  new String[]{"ID", "Nome", "Estado"};
         
           connCidade.executaSQL(SQL);
        try {
            connCidade.rs.first();
            do{
                dados.add(new Object[]{connCidade.rs.getInt("id_cidade"),connCidade.rs.getString("nome_cidade"), connCidade.rs.getString("sigla_estado")});
                
            }while(connCidade.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao preencher a tabela");
        }
            ModeloTabela modelo = new ModeloTabela(dados, Colunas);
           tableCidade.setModel(modelo);
           tableCidade.getColumnModel().getColumn(0).setPreferredWidth(110);
           tableCidade.getColumnModel().getColumn(0).setResizable(false);
           tableCidade.getColumnModel().getColumn(1).setPreferredWidth(200);
           tableCidade.getColumnModel().getColumn(1).setResizable(false);
           tableCidade.getColumnModel().getColumn(2).setPreferredWidth(110);
           tableCidade.getColumnModel().getColumn(2).setResizable(false);
           tableCidade.getTableHeader().setReorderingAllowed(false);
           tableCidade.setAutoResizeMode(tableCidade.AUTO_RESIZE_OFF);
           tableCidade.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Cidade().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Cidade.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPrimeiro;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JComboBox<String> cbEstados;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblEstados;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTela;
    private javax.swing.JTable tableCidade;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables

   
}
