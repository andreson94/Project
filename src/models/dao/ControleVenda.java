/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.dao;

import models.dao.ConectaBanco;
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
    int codProd,codCliente;
   
    
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
    public void FechaVenda(ModelVenda mod){
            AchaCliente(mod.getNomeCliente());
    conexao.conexao();
        try {
            PreparedStatement pst = conexao.conn.prepareStatement("update venda set data_venda=?, valor_venda=?, id_cliente=? where id_venda=?");
            
        } catch (SQLException ex) {
            Logger.getLogger(ControleVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
        conexao.desconecta();
}
    public void AchaCliente(String nome){
            
    conexao.conexao();
        try {
           conexao.executaSQL("select * from clientes where nome cliente="+nome+"");
           conexao.rs.first();
           codCliente = conexao.rs.getInt("id_cliente");
        } catch (SQLException ex) {
            Logger.getLogger(ControleVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
        conexao.desconecta();
 }
    }