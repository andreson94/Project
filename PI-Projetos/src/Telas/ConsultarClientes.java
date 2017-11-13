/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Mock.MockCliente;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.cliente.Cliente;
import service.cliente.ServicoCliente;

public class ConsultarClientes extends javax.swing.JPanel {

    /**
     * Creates new form TelaPrincipal
     */
    public ConsultarClientes() {
        initComponents();

        cbxEstado.addItem("Sao Paulo");
        cbxEstado.addItem("Mato Grosso");

        txtBairro.setEnabled(false);
        txtCidade.setEnabled(false);
        txtComplemento.setEnabled(false);
        txtCep.setEnabled(false);
        txtEmail.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtNumero.setEnabled(false);
        txtTelefone.setEnabled(false);
        cbxEstado.setEnabled(false);

        tblCliente.getColumnModel().getColumn(0).setMaxWidth(0);
        tblCliente.getColumnModel().getColumn(0).setMinWidth(0);
        tblCliente.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
        tblCliente.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jComboBox5 = new javax.swing.JComboBox<>();
        jTextField18 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        txtPesquisa = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnConsulta = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSalver = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        txtComplemento = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        txtCep = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        cbxEstado = new javax.swing.JComboBox<>();
        jLabel73 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JFormattedTextField();
        jLabel74 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Masculino", "Feminino", "Outros" }));

        jLabel21.setText("Código:");

        jLabel22.setText("Preço:");

        jLabel24.setText("Cor:");

        jLabel25.setText("Modelo:");

        jLabel26.setText("Tamanho:");

        jLabel28.setText("Marca:");

        jButton7.setText("Cadastrar");

        jButton8.setText("Cancelar");

        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "codigo", "Nome", "Endereço", "Telefone", "CPF", "RG", "Sexo", "Cidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCliente);

        txtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaActionPerformed(evt);
            }
        });

        jLabel10.setText("Pesquisar:");

        btnConsulta.setText("Consultar");
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSalver.setText("Salvar");
        btnSalver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalverActionPerformed(evt);
            }
        });

        btnAtualizar.setText("Alterar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Alterar"));

        jLabel66.setText("Complento:");

        jLabel67.setText("CEP:");

        jLabel68.setText("Endereço");

        jLabel69.setText("Bairro:");

        jLabel70.setText("Cidade:");

        txtCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCidadeActionPerformed(evt);
            }
        });

        jLabel71.setText("Nº:");

        jLabel72.setText("Estado:");

        jLabel73.setText("E-mail:");

        txtEmail.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel74.setText("Telefone:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel74)
                            .addComponent(jLabel73)
                            .addComponent(txtEmail)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel69, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBairro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel68))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel71)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel66)
                            .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel67)
                            .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel68)
                            .addComponent(jLabel71))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel66)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBairro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel70)
                            .addComponent(jLabel69))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel72)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(cbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel67)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel73)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel74)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jButton1.setText("cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnConsulta)
                        .addGap(0, 16, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAtualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalver))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsulta))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir)
                    .addComponent(btnAtualizar)
                    .addComponent(btnSalver)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        try {
            DefaultTableModel modelCliente = (DefaultTableModel) tblCliente.getModel();

                modelCliente.setNumRows(0);

            if (!txtPesquisa.getText().toString().isEmpty()) {

                for (int i = 0; i < MockCliente.listar().size(); i++) {
                    if (MockCliente.listar().get(i).getNome().trim().equals(txtPesquisa.getText().toString().trim())) {

                        int codigo = MockCliente.listar().get(i).getId();
                        String nome = MockCliente.listar().get(i).getNome();
                        String endereco = MockCliente.listar().get(i).getEndereco();
                        String telefone = MockCliente.listar().get(i).getTelefone();
                        String cpf = MockCliente.listar().get(i).getCpf();
                        String rg = MockCliente.listar().get(i).getRg();
                        String sexo = MockCliente.listar().get(i).getSexo();
                        String cidade = MockCliente.listar().get(i).getCidade();

                        Object[] obj = {codigo, nome, endereco, telefone, cpf, rg, sexo, cidade};
                        modelCliente.addRow(obj);
                    }

                }

            } else {
                for (int i = 0; i < MockCliente.listar().size(); i++) {

                    int codigo = MockCliente.listar().get(i).getId();
                    String nome = MockCliente.listar().get(i).getNome();
                    String endereco = MockCliente.listar().get(i).getEndereco();
                    String telefone = MockCliente.listar().get(i).getTelefone();
                    String cpf = MockCliente.listar().get(i).getCpf();
                    String rg = MockCliente.listar().get(i).getRg();
                    String sexo = MockCliente.listar().get(i).getSexo();
                    String cidade = MockCliente.listar().get(i).getCidade();

                    Object[] obj = {codigo, nome, endereco, telefone, cpf, rg, sexo, cidade};
                    modelCliente.addRow(obj);
                }

            }
            tblCliente.setModel(modelCliente);
            DefaultTableModel ModeloClientes = (DefaultTableModel) tblCliente.getModel();
            tblCliente.setRowSorter(new TableRowSorter(ModeloClientes));

            tblCliente.getColumnModel().getColumn(0).setMaxWidth(0);
            tblCliente.getColumnModel().getColumn(0).setMinWidth(0);
            tblCliente.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
            tblCliente.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_btnConsultaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TelaPrincipal tp = (TelaPrincipal) getRootPane().getParent();
        tp.returnToTitle();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSalverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalverActionPerformed
        // TODO add your handling code here:

        Cliente cliente = new Cliente();
        cliente.setId((int) tblCliente.getValueAt(tblCliente.getSelectedRow(), 0));
        cliente.setBairro(txtBairro.getText().toString());
        cliente.setCidade(txtCidade.getText().toString());
        cliente.setComplemento(txtComplemento.getText().toString());
        cliente.setCep(txtCep.getText().toString());
        cliente.setEmail(txtEmail.getText().toString());
        cliente.setEndereco(txtEndereco.getText().toString());
        cliente.setNumEnd(txtNumero.getText().toString());
        cliente.setTelefone(txtTelefone.getText().toString());
        cliente.setEstado(cbxEstado.getSelectedItem().toString());

        try {
            for (int i = 0; i < MockCliente.listar().size(); i++) {
                if(MockCliente.listar().get(i).getId() == cliente.getId()){
                    cliente.setCpf(MockCliente.listar().get(i).getCpf());
                    cliente.setDataNasc(MockCliente.listar().get(i).getDataNasc());
                    cliente.setEstadoCivil(MockCliente.listar().get(i).getEstadoCivil());
                    cliente.setNome(MockCliente.listar().get(i).getNome());
                    cliente.setRg(MockCliente.listar().get(i).getRg());
                    cliente.setSexo(MockCliente.listar().get(i).getSexo());
                    cliente.setSobrenome(MockCliente.listar().get(i).getSobrenome());
                }
            }
        } catch (Exception ex) {

        }

        try {
            MockCliente.atualizar(cliente);

            DefaultTableModel Modelo = (DefaultTableModel) tblCliente.getModel();
            Modelo.setNumRows(0);

            tblCliente.getColumnModel().getColumn(0).setMaxWidth(0);
            tblCliente.getColumnModel().getColumn(0).setMinWidth(0);
            tblCliente.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
            tblCliente.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
        } catch (Exception ex) {
            Logger.getLogger(ConsultarClientes.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSalverActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        // TODO add your handling code here:
        txtBairro.setEnabled(true);
        txtCidade.setEnabled(true);
        txtComplemento.setEnabled(true);
        txtCep.setEnabled(true);
        txtEmail.setEnabled(true);
        txtEndereco.setEnabled(true);
        txtNumero.setEnabled(true);
        txtTelefone.setEnabled(true);
        cbxEstado.setEnabled(true);
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void tblClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClienteMouseClicked
        // TODO add your handling code here:

        try {
            txtBairro.setText(MockCliente.listar().get(tblCliente.getSelectedRow()).getBairro());
            txtCep.setText(MockCliente.listar().get(tblCliente.getSelectedRow()).getCep());
            txtCidade.setText(MockCliente.listar().get(tblCliente.getSelectedRow()).getCidade());
            txtComplemento.setText(MockCliente.listar().get(tblCliente.getSelectedRow()).getComplemento());
            txtEmail.setText(MockCliente.listar().get(tblCliente.getSelectedRow()).getEmail());
            txtEndereco.setText(MockCliente.listar().get(tblCliente.getSelectedRow()).getEndereco());
            txtNumero.setText(MockCliente.listar().get(tblCliente.getSelectedRow()).getNumEnd());
            txtTelefone.setText(MockCliente.listar().get(tblCliente.getSelectedRow()).getTelefone());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tblClienteMouseClicked

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        service.cliente.ServicoCliente servico = new ServicoCliente();

        try {

            int codigo = (int) tblCliente.getValueAt(tblCliente.getSelectedRow(), 0);

            servico.excluirCliente(codigo);

            txtBairro.setText("");
            txtCep.setText("");
            txtCidade.setText("");
            txtComplemento.setText("");
            txtEmail.setText("");
            txtEndereco.setText("");
            txtNumero.setText("");
            txtTelefone.setText("");

            txtBairro.setEnabled(false);
            txtCidade.setEnabled(false);
            txtComplemento.setEnabled(false);
            txtCep.setEnabled(false);
            txtEmail.setEnabled(false);
            txtEndereco.setEnabled(false);
            txtNumero.setEnabled(false);
            txtTelefone.setEnabled(false);
            cbxEstado.setEnabled(false);

            DefaultTableModel Modelo = (DefaultTableModel) tblCliente.getModel();
            Modelo.setNumRows(0);

            tblCliente.getColumnModel().getColumn(0).setMaxWidth(0);
            tblCliente.getColumnModel().getColumn(0).setMinWidth(0);
            tblCliente.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
            tblCliente.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
        } catch (Exception e) {

        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void txtCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCidadeActionPerformed

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalver;
    private javax.swing.JComboBox<String> cbxEstado;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JFormattedTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

}
