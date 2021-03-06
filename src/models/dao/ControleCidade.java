/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.dao;

import models.dao.ConectaBanco;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import models.ModelCidade;


 //metodo para inserir cidade altomaticamente

public class ControleCidade {
    ConectaBanco connCidade = new ConectaBanco();
    
    public void inserirCidade(ModelCidade mod) throws SQLException{
        connCidade.conexao();
        PreparedStatement pst = connCidade.conn.prepareStatement("insert into cidade(nome_cidades,id_estado)values(?,?)");
        pst.setString(1,mod.getNome());
        pst.setInt(2,mod.getCod_Estado());
        pst.execute();
        connCidade.desconecta();
    }
    
    //função para alterar a cidade
    public void alterarCidade(ModelCidade mod) throws SQLException{
        connCidade.conexao();
        PreparedStatement pst = connCidade.conn.prepareStatement("update cidade set nome_cidades=?, id_estado=? where id_cidade =? ");
        pst.setString(1,mod.getNome());
        pst.setInt(2,mod.getCod_Estado());
        pst.setInt(3,mod.getCod());
        pst.execute();
    }
    public void ExcluiCidade(ModelCidade mod){
        connCidade.conexao();
        try {
            PreparedStatement pst = connCidade.conn.prepareStatement("delete from cidade where id cidade =?");
            pst.setInt(1, mod.getCod());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Deletado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no delete");
        }
        
    }
}