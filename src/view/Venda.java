/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import models.ModelVenda;
import models.dao.ConectaBanco;
import models.dao.ControleVenda;
import utilitarios.ModeloTabela;

/**
 *
 * @author andreson.csilva
 */
public class Venda extends javax.swing.JFrame {

    ConectaBanco conn = new ConectaBanco();
    ControleVenda control = new ControleVenda();
    ModelVenda mod = new ModelVenda();
    int flag =1, codVenda;
    float preco_produto,total=0;

    public Venda() {
        initComponents();
        
        //try{
          //  MaskFormatter form = new MaskFormatter("##/##/####");
            //txtData.setFormatterFactory(new DefaultFormatterFactory(form));
        //}catch(ParseException ex){
            
        
        SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        Date hoje = new Date();
        txtData.setText(df.format(hoje));
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
        txtCliente = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        btnBuscaCliente = new javax.swing.JButton();
        txtProduto = new javax.swing.JTextField();
        lblProduto = new javax.swing.JLabel();
        btnBuscaProduto = new javax.swing.JButton();
        txtQtd = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtValorItem = new javax.swing.JTextField();
        lblValor = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePesquisa = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableVenda = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnCancelVenda = new javax.swing.JButton();
        txtData = new javax.swing.JFormattedTextField();
        btnFinalizarVenda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela de Vendas");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Vendas");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNome.setText("Nome do Cliente:");

        lblData.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblData.setText("Data:");

        btnBuscaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/PESQUISAR.png"))); // NOI18N
        btnBuscaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaClienteActionPerformed(evt);
            }
        });

        lblProduto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblProduto.setText("Produto:");

        btnBuscaProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/PESQUISAR.png"))); // NOI18N
        btnBuscaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaProdutoActionPerformed(evt);
            }
        });

        txtQtd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtQtdFocusGained(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Quantidade:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Valor por Item:");

        lblValor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblValor.setText("Valor:");

        tablePesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablePesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePesquisaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablePesquisa);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Tabela de Pesquisa:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Itens de Venda:");

        tableVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tableVenda);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Valor:");

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/NOVO.png"))); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnCancelVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/CANCELAR VENDA.png"))); // NOI18N
        btnCancelVenda.setText("Cancelar Venda");
        btnCancelVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelVendaActionPerformed(evt);
            }
        });

        txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        txtData.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDataFocusGained(evt);
            }
        });

        btnFinalizarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/FINALIZAR VENDA.png"))); // NOI18N
        btnFinalizarVenda.setText("Finalizar Venda");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5)
                                    .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblValor)
                                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6)
                                    .addComponent(txtValorItem, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblData)
                                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnFinalizarVenda)
                                .addGap(29, 29, 29)
                                .addComponent(btnCancelVenda))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNome)
                                    .addComponent(lblProduto)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                                        .addComponent(txtProduto, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnBuscaProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBuscaCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblValor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(lblData))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtValorItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBuscaCliente)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(btnBuscaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAdd)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelVenda)
                    .addComponent(btnFinalizarVenda))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(486, 666));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaClienteActionPerformed
        flag = 1;
        preencherTabelaCliente("select * from clientes where nome_cliente like '%"+txtCliente.getText()+"%'");
    }//GEN-LAST:event_btnBuscaClienteActionPerformed

    private void btnBuscaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaProdutoActionPerformed
        conn.conexao();
        try {
            PreparedStatement pst = conn.conn.prepareStatement("insert into venda (valor_venda)values(?)");
            pst.setFloat(1, 0);
            pst.execute();
            conn.executaSQL("select * from venda");
            conn.rs.last();
            codVenda = conn.rs.getInt("id_venda");
        } catch (SQLException ex) {
            
        }
        
        try {
            MaskFormatter form;
            form = new MaskFormatter("##/##/#####");
            txtData.setFormatterFactory(new DefaultFormatterFactory(form));
        } catch (ParseException ex) {
            Logger.getLogger(Venda.class.getName()).log(Level.SEVERE, null, ex);
        }
        flag = 2;
        preencherTabelaCliente("select * from produto where nome_produto like '%"+txtProduto.getText()+"%'");
    }//GEN-LAST:event_btnBuscaProdutoActionPerformed
    
    private void tablePesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePesquisaMouseClicked
             /* evento para quando clicar com o mouse na tabela ele preencha os compos, adcionei um flag para controlar
        e diferenciar quando for cliente ou produto*/
        
        if(flag==1){
             String nome_Cliente = (String) tablePesquisa.getValueAt(tablePesquisa.getSelectedRow(),1); 
             txtCliente.setText(nome_Cliente);
        }else{
             
            try {
                String nome_produto = (String) tablePesquisa.getValueAt(tablePesquisa.getSelectedRow(),1);
                conn.executaSQL("select * from produto where nome_produto='" + nome_produto +"'");
                conn.rs.first();
                float preco_produto = conn.rs.getFloat("preco_venda");
                txtProduto.setText(nome_produto);
                txtValorItem.setText(String.valueOf(preco_produto));
                conn.desconecta();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane,"erro ao pesquisar preço");
            }
             
        }
    }//GEN-LAST:event_tablePesquisaMouseClicked

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // adciona o produto na venda
        
        
        try {
            int idVenda,quantidade=0;
            conn.conexao();
        conn.executaSQL("select * from produto where nome_produto='"+txtProduto.getText()+"'");
        conn.rs.first();
        quantidade = conn.rs.getInt("quantidade");
        if(quantidade>=Integer.parseInt(txtQtd.getText())){
        mod.setNomeProduto(txtProduto.getText());
        mod.setQtdItem(Integer.parseInt(txtQtd.getText()));
        mod.setId_Venda(codVenda);
        control.adicionaItem(mod);
        mod.setNomeProduto(txtProduto.getText());
        mod.setQtdItem(Integer.parseInt(txtQtd.getText()));
        mod.setId_Venda(codVenda);
        control.adicionaItem(mod);
        preencherItensVenda("select * from produto inner join itens_venda_produto"
                + " on produto.id_produto = itens_venda_produto.id_produto"
                + "inner join venda on venda.id_venda = itens_venda_produto.id_venda where venda.id_venda="+codVenda);
        
        }else{
            JOptionPane.showMessageDialog(rootPane, "Indisponivel");
        }
        //total=total+Float.parseFloat(txtValorItem.getText())*Integer.parseInt(txtQtd.getText());
        //txtValor.setText(String.valueOf(total));
        
        } catch (SQLException ex) {
            Logger.getLogger(Venda.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //total=total+Float.parseFloat(txtValorItem.getText())*Integer.parseInt(txtQtd.getText());
        //txtValor.setText(String.valueOf(total));
        preencherItensVenda("select * from produto inner join itens_venda_produto"
                + " on produto.id_produto = itens_venda_produto.id_produto"
                + "inner join venda on venda.id_venda = itens_venda_produto.id_venda where venda.id_venda="+codVenda);
        
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtDataFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDataFocusGained
        float valorTotal;
        valorTotal = Float.parseFloat(txtValorItem.getText())*Integer.parseInt(txtQtd.getText());
        txtValor.setText(String.valueOf(total));
    }//GEN-LAST:event_txtDataFocusGained

    private void txtQtdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQtdFocusGained
        float valorTotal;
        valorTotal = Float.parseFloat(txtValorItem.getText())*Integer.parseInt(txtQtd.getText());
        txtValor.setText(String.valueOf(valorTotal));
    }//GEN-LAST:event_txtQtdFocusGained

    private void btnCancelVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelVendaActionPerformed
        try {
            control.cancelarVenda();
        } catch (SQLException ex) {
        }
        dispose();
    }//GEN-LAST:event_btnCancelVendaActionPerformed

    public void preencherTabelaCliente(String sql){
        
        ArrayList dados = new ArrayList();
        
        String [] Colunas = new String[]{"Código","Nome"};
        conn.conexao();
        conn.executaSQL(sql);
        try{
            conn.rs.first();
            do{
                dados.add(new Object[]{conn.rs.getString("id_cliente"), conn.rs.getString("nome_cliente")});
            }while(conn.rs.next());
        }catch(SQLException ex){
            
        }
       ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        tablePesquisa.setModel(modelo);
        tablePesquisa.getColumnModel().getColumn(0).setPreferredWidth(100);
        tablePesquisa.getColumnModel().getColumn(0).setResizable(false);
        tablePesquisa.getColumnModel().getColumn(1).setPreferredWidth(300);
        tablePesquisa.getColumnModel().getColumn(1).setResizable(false);
        tablePesquisa.getTableHeader().setReorderingAllowed(false);
        tablePesquisa.setAutoResizeMode(tablePesquisa.AUTO_RESIZE_OFF);
        tablePesquisa.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
    }
    public void preencherTabelaProduto(String sql){
        
        
        ArrayList dados = new ArrayList();
        
        String [] Colunas = new String[]{"Código","Nome","Cor","Marca","Qtde"};
        conn.conexao();
        conn.executaSQL(sql);
        try{
            conn.rs.first();
            do{
                dados.add(new Object[]{conn.rs.getString("id_produto"), conn.rs.getString("nome_produto"),
                    conn.rs.getString("cor"),conn.rs.getString("marca"), conn.rs.getString("quantidade")});
            }while(conn.rs.next());
        }catch(SQLException ex){
            
        }
       ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        tablePesquisa.setModel(modelo);
        tablePesquisa.getColumnModel().getColumn(0).setPreferredWidth(50);
        tablePesquisa.getColumnModel().getColumn(0).setResizable(false);
        tablePesquisa.getColumnModel().getColumn(1).setPreferredWidth(200);
        tablePesquisa.getColumnModel().getColumn(1).setResizable(false);
        tablePesquisa.getColumnModel().getColumn(2).setPreferredWidth(100);
        tablePesquisa.getColumnModel().getColumn(2).setResizable(false);
        tablePesquisa.getColumnModel().getColumn(3).setPreferredWidth(100);
        tablePesquisa.getColumnModel().getColumn(3).setResizable(false);
        tablePesquisa.getColumnModel().getColumn(4).setPreferredWidth(100);
        tablePesquisa.getColumnModel().getColumn(4).setResizable(false);
        tablePesquisa.getTableHeader().setReorderingAllowed(false);
        tablePesquisa.setAutoResizeMode(tablePesquisa.AUTO_RESIZE_OFF);
        tablePesquisa.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
    }
    public void preencherItensVenda(String sql){
        
        ArrayList dados = new ArrayList();
        
        String [] Colunas = new String[]{"Descrição","Quantidade","Valor Total"};
        conn.conexao();
        conn.executaSQL(sql);
        try{
            conn.rs.first();
            do{
                float valorProduto = conn.rs.getFloat("preco_venda");
                int qtdVendida = conn.rs.getInt("quantidade_produto");
                dados.add(new Object[]{conn.rs.getString("nome_produto"), conn.rs.getString("quantidade_produto"),valorProduto*qtdVendida});
            }while(conn.rs.next());
        }catch(SQLException ex){
            
        }
       ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        tableVenda.setModel(modelo);
        tableVenda.getColumnModel().getColumn(0).setPreferredWidth(100);
        tableVenda.getColumnModel().getColumn(0).setResizable(false);
        tableVenda.getColumnModel().getColumn(1).setPreferredWidth(300);
        tableVenda.getColumnModel().getColumn(1).setResizable(false);
        tableVenda.getColumnModel().getColumn(2).setPreferredWidth(300);
        tableVenda.getColumnModel().getColumn(2).setResizable(false);
        tableVenda.getTableHeader().setReorderingAllowed(false);
        tableVenda.setAutoResizeMode(tablePesquisa.AUTO_RESIZE_OFF);
        tableVenda.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        SomaProduto();
    }
    public void SomaProduto(){
        total=0;
        int qtd=0;
        float valor=0;
        conn.executaSQL("select * from itens_venda_produto inner join produto on itens_venda_produto.id_produto = produto.id_produto where id_venda"+ codVenda);
        try {
            //conn.rs.first();
            while(conn.rs.next()){
                qtd = conn.rs.getInt("quantidade");
                valor = conn.rs.getFloat("preco_venda");
                total = total + conn.rs.getFloat("preco_venda")*conn.rs.getInt("quantidade_produto");
            }
            txtValor.setText(String.valueOf(total));
        } catch (SQLException ex) {
            Logger.getLogger(Venda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
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
            java.util.logging.Logger.getLogger(Venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Venda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBuscaCliente;
    private javax.swing.JButton btnBuscaProduto;
    private javax.swing.JButton btnCancelVenda;
    private javax.swing.JButton btnFinalizarVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblProduto;
    private javax.swing.JLabel lblValor;
    private javax.swing.JTable tablePesquisa;
    private javax.swing.JTable tableVenda;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtProduto;
    private javax.swing.JTextField txtQtd;
    private javax.swing.JTextField txtValor;
    private javax.swing.JTextField txtValorItem;
    // End of variables declaration//GEN-END:variables
}
