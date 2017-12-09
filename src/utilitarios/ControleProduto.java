package utilitarios;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import models.ModelProduto;

/**
 *
 * @author andreson.csilva
 */
public class ControleProduto {
    
    ModelProduto mod = new ModelProduto();
    ConectaBanco conexao = new ConectaBanco();
    
    
    public void inserirProduto(ModelProduto mod) throws SQLException{
        
        try {
        PreparedStatement pst = conexao.conn.prepareStatement("insert into produto(nome_produto,"
                + "marca,cor,tamanho,preco_venda,quantidade)values(?,?,?,?,?,?)");
        pst.setString(1,mod.getModelo());
        pst.setString(2,mod.getMarca());
        pst.setString(3,mod.getCor());
        pst.setInt(4,mod.getTamanho());
        pst.setFloat(5,mod.getPreco_venda());
        pst.setInt(6,mod.getQuantidade());  
        pst.execute();
        conexao.desconecta();
        JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar");
        }
    }
    
    //função para alterar a cidade
    public void alterarProduto(ModelProduto mod) throws SQLException{
        conexao.conexao();
        
        try {
        PreparedStatement pst = conexao.conn.prepareStatement("update set produto(nome_produto=?,"
                + "marca=?,cor=?,tamanho=?,preco_venda=?,quantidade=? where id_Produto=?)");
        pst.setString(1,mod.getModelo());
        pst.setString(2,mod.getMarca());
        pst.setString(3,mod.getCor());
        pst.setInt(4,mod.getTamanho());
        pst.setFloat(5,mod.getPreco_venda());
        pst.setInt(6,mod.getQuantidade());
        pst.setInt(7,mod.getId_produto());
        pst.execute();
        
        JOptionPane.showMessageDialog(null, "Alterado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na Alteração");
        }
    }
    public void ExcluirProduto(ModelProduto mod){
        //Exclui o produto recebendo o id como paramentro
        conexao.conexao();
    try {
        PreparedStatement pst = conexao.conn.prepareStatement("delete from produto where id_Produto=?)");
        pst.setInt(7,mod.getId_produto());
        pst.execute();
            JOptionPane.showMessageDialog(null, "Deletado com sucesso");
    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no delete");
    }
        
    }
}


