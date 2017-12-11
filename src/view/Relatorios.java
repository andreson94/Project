/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.ListSelectionModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import models.dao.ConectaBanco;
import utilitarios.ModeloTabela;

/**
 *
 * @author andreson.csilva
 */
public class Relatorios extends javax.swing.JFrame {
    ConectaBanco conn = new ConectaBanco();

    /**
     * Creates new form Relatorios
     */
    public Relatorios() {
        initComponents();
        try{
            MaskFormatter form = new MaskFormatter("##/##/####");
            txtData.setFormatterFactory(new DefaultFormatterFactory(form));
        }catch(ParseException ex){
            
        }
        
    }
 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelData = new javax.swing.JLabel();
        txtData = new javax.swing.JFormattedTextField();
        btnPesquisa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableRealizada = new javax.swing.JTable();
        labelVenda = new javax.swing.JLabel();
        labelDetalhes = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableDetalhe = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelData.setText("Data:");

        btnPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/PESQUISAR.png"))); // NOI18N
        btnPesquisa.setText("Pesquisa");
        btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaActionPerformed(evt);
            }
        });

        tableRealizada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Sigla"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableRealizada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableRealizadaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableRealizada);

        labelVenda.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelVenda.setText("Vendas Realizadas:");

        labelDetalhes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelDetalhes.setText("Detalhe das Venda:");

        tableDetalhe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Sigla"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableDetalhe);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelVenda)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisa))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDetalhes))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelData)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisa))
                .addGap(18, 18, 18)
                .addComponent(labelVenda)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelDetalhes)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Relatório de vendas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed
        // TODO add your handling code here:
        preencherTabela("select * from venda inner join clientes on venda.id_cliente = clientes.id_cliente where data_venda='" +txtData.getText()+"'" );
    }//GEN-LAST:event_btnPesquisaActionPerformed

    private void tableRealizadaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableRealizadaMouseClicked
        // TODO add your handling code here:
        int cod = (int) tableRealizada.getValueAt(tableRealizada.getSelectedRow(), 0);
        preencherTableDetalhes("select * from venda inner join itens_venda_produto on venda.id_venda = itens_venda_produto.id_venda inner join produto on itens_venda_produto.id_produto = produto.id_produto where venda.id_venda="+cod);
        
    }//GEN-LAST:event_tableRealizadaMouseClicked
     public void preencherTableDetalhes(String SQL){
         ArrayList dados = new ArrayList();
         String [] Colunas = new String[]{"Produto","Quantidade"};
         conn.conexao();
         conn.executaSQL(SQL);
         try{
             conn.rs.first();
             do{
                 dados.add(new Object[]{conn.rs.getString("nome_produto"), conn.rs.getString("quantidade_produto")});
             }while(conn.rs.next());
         }catch(SQLException ex){
             
         }
         ModeloTabela modelo = new ModeloTabela(dados, Colunas);
         tableDetalhe.setModel(modelo);
         tableDetalhe.getColumnModel().getColumn(0).setPreferredWidth(200);
         tableDetalhe.getColumnModel().getColumn(0).setResizable(false);
         tableDetalhe.getColumnModel().getColumn(1).setPreferredWidth(100);
         tableDetalhe.getColumnModel().getColumn(1).setResizable(false);
         tableDetalhe.getTableHeader().setReorderingAllowed(false);
         tableDetalhe.setAutoResizeMode(tableDetalhe.AUTO_RESIZE_OFF);
         tableDetalhe.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
         
     }
         public void preencherTabela(String SQL){
        ArrayList dados = new ArrayList();
        
        String[] Colunas = new String[]{"ID","Data Venda", "Valor da Venda", "Cliente"};
        conn.conexao();
        conn.executaSQL(SQL);
        try{
            conn.rs.first();
            do{
                dados.add(new Object[]{conn.rs.getInt("id_venda"), conn.rs.getString("data_venda")});
            }while(conn.rs.next());
        }catch(SQLException ex){
            
        }
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        tableRealizada.setModel(modelo);
        tableRealizada.getColumnModel().getColumn(0).setPreferredWidth(50);
        tableRealizada.getColumnModel().getColumn(0).setResizable(false);
        tableRealizada.getColumnModel().getColumn(1).setPreferredWidth(100);
        tableRealizada.getColumnModel().getColumn(1).setResizable(false);
        tableRealizada.getColumnModel().getColumn(2).setPreferredWidth(100);
        tableRealizada.getColumnModel().getColumn(2).setResizable(false);
        tableRealizada.getColumnModel().getColumn(3).setPreferredWidth(250);
        tableRealizada.getColumnModel().getColumn(3).setResizable(false);
        tableRealizada.getTableHeader().setReorderingAllowed(false);
        tableRealizada.setAutoResizeMode(tableRealizada.AUTO_RESIZE_OFF);
        tableRealizada.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        
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
            java.util.logging.Logger.getLogger(Relatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Relatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Relatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Relatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Relatorios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelData;
    private javax.swing.JLabel labelDetalhes;
    private javax.swing.JLabel labelVenda;
    private javax.swing.JTable tableDetalhe;
    private javax.swing.JTable tableRealizada;
    private javax.swing.JFormattedTextField txtData;
    // End of variables declaration//GEN-END:variables
}
