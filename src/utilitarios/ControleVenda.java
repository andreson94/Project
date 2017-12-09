/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitarios;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.runtime.regexp.joni.exception.JOniException;
import models.ModelVenda;

/**
 *
 * @author joao.vrevangelista
 */
public class ControleVenda {
    int codProd;
    
    ConectaBanco conexao = new ConectaBanco();
    public void adicionaItem(ModelVenda mod){
        achaCodProduto(mod.getNomeProduto());
        conexao.conexao();
        try {
            PreparedStatement pst = conexao.conn.prepareStatement("insert into itens_venda_produto(id_venda,id_produto,quantidade_produto)values(?,?,?");
            pst.setInt(1, mod.getId_Venda());
            pst.setInt(2, codProd);
            pst.setInt(3, mod.getQtdItem());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Produto add");
            conexao.desconecta();
            
        } catch (SQLException ex) {
            conexao.desconecta();
            Logger.getLogger(ControleVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    public void achaCodProduto(String nome){
     conexao.conexao();
     conexao.executaSQL("select * from produto where nome_produto='"+nome+"'");
        try {
            conexao.rs.first();
            codProd = conexao.rs.getInt("id_produto");
            conexao.desconecta();
        } catch (SQLException ex) {
            conexao.desconecta();
            Logger.getLogger(ControleVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
