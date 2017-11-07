/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;


import Mock.MockProduto;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.produto.Produto;
import service.produto.ServicoProduto;

/**
 *
 * @author andreson.csilva
 */
public class VendasProdutos extends javax.swing.JPanel {

    /**
     * Creates new form VandasProdutos
     */
    public VendasProdutos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vendasLancamento = new javax.swing.JPanel();
        labelCodProd = new javax.swing.JLabel();
        txtCodProd = new javax.swing.JTextField();
        ButtonFinalVenda = new javax.swing.JButton();
        PaneVendas = new javax.swing.JScrollPane();
        TableVendas = new javax.swing.JTable();
        ButtonIncluir = new javax.swing.JButton();
        ButtonExcluir = new javax.swing.JButton();
        labelSaldo = new javax.swing.JLabel();
        labelValorSaldo = new javax.swing.JLabel();
        labelPagamento = new javax.swing.JLabel();
        labelValorPagamento = new javax.swing.JLabel();
        labelCliente = new javax.swing.JLabel();
        TextCliente = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        ButtonConsultar = new javax.swing.JToggleButton();

        labelCodProd.setText("Cód. Produto");

        txtCodProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodProdActionPerformed(evt);
            }
        });

        ButtonFinalVenda.setText("Finalizar Venda");
        ButtonFinalVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonFinalVendaActionPerformed(evt);
            }
        });

        TableVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Modelo", "Marca", "Tamanho", "Cor", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        PaneVendas.setViewportView(TableVendas);

        ButtonIncluir.setText("Incluir");
        ButtonIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonIncluirActionPerformed(evt);
            }
        });

        ButtonExcluir.setText("Excluir");
        ButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonExcluirActionPerformed(evt);
            }
        });

        labelSaldo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelSaldo.setText("Saldo:");

        labelValorSaldo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelValorSaldo.setText("0,0");

        labelPagamento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelPagamento.setText("A Pagar:");

        labelValorPagamento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelValorPagamento.setText("0,0");

        labelCliente.setText("Cliente");

        TextCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextClienteActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        ButtonConsultar.setText("Consultar");
        ButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout vendasLancamentoLayout = new javax.swing.GroupLayout(vendasLancamento);
        vendasLancamento.setLayout(vendasLancamentoLayout);
        vendasLancamentoLayout.setHorizontalGroup(
            vendasLancamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vendasLancamentoLayout.createSequentialGroup()
                .addGroup(vendasLancamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vendasLancamentoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelPagamento)
                        .addGap(27, 27, 27)
                        .addComponent(labelValorPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(vendasLancamentoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(PaneVendas, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE))
                    .addGroup(vendasLancamentoLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(vendasLancamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCodProd)
                            .addComponent(labelCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(vendasLancamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCodProd, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(TextCliente))
                        .addGap(27, 27, 27)
                        .addGroup(vendasLancamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ButtonIncluir)
                            .addComponent(ButtonConsultar))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(vendasLancamentoLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(vendasLancamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(vendasLancamentoLayout.createSequentialGroup()
                                .addComponent(btnCancelar)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(vendasLancamentoLayout.createSequentialGroup()
                                .addComponent(ButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButtonFinalVenda)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelSaldo)
                                .addGap(27, 27, 27)
                                .addComponent(labelValorSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        vendasLancamentoLayout.setVerticalGroup(
            vendasLancamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vendasLancamentoLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(vendasLancamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCodProd)
                    .addComponent(ButtonIncluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(vendasLancamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCliente)
                    .addComponent(TextCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonConsultar))
                .addGap(22, 22, 22)
                .addComponent(PaneVendas, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(vendasLancamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonExcluir)
                    .addComponent(labelSaldo)
                    .addComponent(labelValorSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonFinalVenda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(vendasLancamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPagamento)
                    .addComponent(labelValorPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(btnCancelar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vendasLancamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vendasLancamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExcluirActionPerformed
        
        ((DefaultTableModel)TableVendas.getModel()).removeRow(TableVendas.getSelectedRow());
        
    }//GEN-LAST:event_ButtonExcluirActionPerformed

    private void ButtonIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonIncluirActionPerformed
            
        int codigoDigitado;
        
        try{

            codigoDigitado = Integer.parseInt(txtCodProd.getText());
        
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, "O código informado não está no formato adequado"); 
           return;
        }
            
            
       if(txtCodProd.getText().isEmpty()){
           JOptionPane.showMessageDialog(this, "Código inválido"); 
           return; 
       }
        
       Produto p = null;
       
       try{
           p = ServicoProduto.obterProduto(codigoDigitado);
       } catch(Exception e){
           
       }
        
        DefaultTableModel validacao = (DefaultTableModel)TableVendas.getModel();
        validacao.addRow(new Object[] {p.getCod_produto(), p.getModelo(), p.getMarca(),p.getTamanho(),p.getCor(), p.getPreco()});
        
            
        
        labelCodProd.requestFocus();
        
    }//GEN-LAST:event_ButtonIncluirActionPerformed

    private void ButtonFinalVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonFinalVendaActionPerformed
    
        
        
    }//GEN-LAST:event_ButtonFinalVendaActionPerformed

    private void TextClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextClienteActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
         TelaPrincipal tp = (TelaPrincipal)getRootPane().getParent();
        tp.returnToTitle();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtCodProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodProdActionPerformed
      
    }//GEN-LAST:event_txtCodProdActionPerformed

    private void ButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonConsultarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ButtonConsultarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton ButtonConsultar;
    private javax.swing.JButton ButtonExcluir;
    private javax.swing.JButton ButtonFinalVenda;
    private javax.swing.JButton ButtonIncluir;
    private javax.swing.JScrollPane PaneVendas;
    private javax.swing.JTable TableVendas;
    private javax.swing.JTextField TextCliente;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel labelCliente;
    private javax.swing.JLabel labelCodProd;
    private javax.swing.JLabel labelPagamento;
    private javax.swing.JLabel labelSaldo;
    private javax.swing.JLabel labelValorPagamento;
    private javax.swing.JLabel labelValorSaldo;
    private javax.swing.JTextField txtCodProd;
    private javax.swing.JPanel vendasLancamento;
    // End of variables declaration//GEN-END:variables
}
