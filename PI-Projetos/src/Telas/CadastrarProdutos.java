
package Telas;


import javax.swing.JOptionPane;
import model.produto.Produto;
import service.produto.ServicoProduto;

/**
 *
 * @author andreson.csilva
 */
public class CadastrarProdutos extends javax.swing.JPanel {

    
    public CadastrarProdutos() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cor_text = new javax.swing.JTextField();
        Modelo_text = new javax.swing.JTextField();
        Codigo_text = new javax.swing.JTextField();
        Genero_combo = new javax.swing.JComboBox<>();
        Preco_float = new javax.swing.JTextField();
        Marca_text = new javax.swing.JTextField();
        Codigo_label = new javax.swing.JLabel();
        Preco_label = new javax.swing.JLabel();
        Cor_label = new javax.swing.JLabel();
        Modelo_label = new javax.swing.JLabel();
        Genero_label = new javax.swing.JLabel();
        Marca_label = new javax.swing.JLabel();
        Cadastrar_button = new javax.swing.JButton();
        Cancelar_button = new javax.swing.JButton();
        Tamanho_text = new javax.swing.JTextField();
        Tamanho_label = new javax.swing.JLabel();

        Cor_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cor_textActionPerformed(evt);
            }
        });

        Genero_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Masculino", "Feminino", "Outros" }));

        Codigo_label.setText("Código:");

        Preco_label.setText("Preço:");

        Cor_label.setText("Cor:");

        Modelo_label.setText("Modelo:");

        Genero_label.setText("Gênero:");

        Marca_label.setText("Marca:");

        Cadastrar_button.setText("Cadastrar");
        Cadastrar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cadastrar_buttonActionPerformed(evt);
            }
        });

        Cancelar_button.setText("Cancelar");
        Cancelar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancelar_buttonActionPerformed(evt);
            }
        });

        Tamanho_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tamanho_textActionPerformed(evt);
            }
        });

        Tamanho_label.setText("Tamanho:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Codigo_text)
                            .addComponent(Modelo_label, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Modelo_text)
                            .addComponent(Genero_label, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(Genero_combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(100, 100, 100)))
                        .addGap(341, 341, 341))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tamanho_label)
                            .addComponent(Codigo_label))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cor_label)
                            .addComponent(Preco_label)
                            .addComponent(Marca_label)
                            .addComponent(Cor_text)
                            .addComponent(Preco_float)
                            .addComponent(Marca_text)
                            .addComponent(Tamanho_text))
                        .addGap(196, 196, 196)
                        .addComponent(Cadastrar_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Cancelar_button)
                        .addGap(27, 27, 27))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Codigo_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Codigo_text)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Modelo_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Modelo_text)
                .addGap(10, 10, 10)
                .addComponent(Genero_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Genero_combo)
                .addGap(22, 22, 22)
                .addComponent(Tamanho_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Tamanho_text)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Marca_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Marca_text)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cor_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Cor_text)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Preco_label)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(Preco_float))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Cadastrar_button)
                        .addComponent(Cancelar_button)))
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Cor_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cor_textActionPerformed
        
    }//GEN-LAST:event_Cor_textActionPerformed
        //Listener do botão cadastrar
    private void Cadastrar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cadastrar_buttonActionPerformed
        Produto  p = new Produto();
        
       
        p.setCod_produto(Long.parseLong(Codigo_text.getText().toString()));
       
        p.setPreco(Float.parseFloat(Preco_float.getText().toString()));
        
        p.setTamanho(Tamanho_text.getText());
       
        p.setModelo(Modelo_text.getText());
        
        p.setMarca(Marca_text.getText());
        
        p.setCor(Cor_text.getText());
        
        p.setGenero((String) Genero_combo.getSelectedItem());
        
        
        
        try{
            //Chama o serviço produto
            ServicoProduto.cadastrarProduto(p);
        }catch (Exception e){
            //tratamento de erro
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
            
        }
        
        //Inserido com sucesso
        JOptionPane.showMessageDialog(this, "Produto inserido",
                "Cadastro bem-sucedido", JOptionPane.INFORMATION_MESSAGE);
        
        //limpa os campos
        Codigo_text.setText("");
        Preco_float.setText("");
        Modelo_text.setText("");
        Genero_combo.setSelectedIndex(0);
        Marca_text.setText("");
        Cor_text.setText("");
        Tamanho_text.setText("");
    }//GEN-LAST:event_Cadastrar_buttonActionPerformed
    //Listener para cancelar(fechar)
    private void Cancelar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancelar_buttonActionPerformed
         TelaPrincipal tp = (TelaPrincipal)getRootPane().getParent();
        tp.returnToTitle();
    }//GEN-LAST:event_Cancelar_buttonActionPerformed

    private void Tamanho_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tamanho_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tamanho_textActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cadastrar_button;
    private javax.swing.JButton Cancelar_button;
    private javax.swing.JLabel Codigo_label;
    private javax.swing.JTextField Codigo_text;
    private javax.swing.JLabel Cor_label;
    private javax.swing.JTextField Cor_text;
    private javax.swing.JComboBox<String> Genero_combo;
    private javax.swing.JLabel Genero_label;
    private javax.swing.JLabel Marca_label;
    private javax.swing.JTextField Marca_text;
    private javax.swing.JLabel Modelo_label;
    private javax.swing.JTextField Modelo_text;
    private javax.swing.JTextField Preco_float;
    private javax.swing.JLabel Preco_label;
    private javax.swing.JLabel Tamanho_label;
    private javax.swing.JTextField Tamanho_text;
    // End of variables declaration//GEN-END:variables
}
