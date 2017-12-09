/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitarios;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import models.ModelBairro;

/**
 *
 * @author João
 */
public class ControleBairro {
     
    ConectaBanco conex = new ConectaBanco();
    ConectaBanco conexPesq = new ConectaBanco();
    int codCid;
    String cidade;
    
    public void Grava(ModelBairro mod){
    conex.conexao();
    try{
        conex.executaSQL("select * from cidade where nome_cidades='" + mod.getCidade() + " ' ");
        conex.rs.first();
        codCid  = conex.rs.getInt("id_cidade");
        PreparedStatement pst = conex.conn.prepareStatement("insert into bairro(nome_bairro, id_cidade)values(?,?) ");
        pst.setString(1, mod.getNome());
        pst.setInt(2, codCid);
        pst.execute();
        JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
    
    }catch (SQLException ex){
        JOptionPane.showMessageDialog(null, "erro ao salvar" + ex);
    }
    conex.desconecta();
    }
    public ModelBairro Primeiro(){
        ModelBairro mod = new ModelBairro();
        conex.conexao();;
        conexPesq.conexao();
        conex.executaSQL("Select * from bairro");
        try{
            conex.rs.first();
            conexPesq.executaSQL("select * from cidade where id_cidade" + conex.rs.getInt("id_cidade"));
            conexPesq.rs.first();
            cidade = conexPesq.rs.getString("nome_cidades");
            mod.setCod(conex.rs.getInt("id_bairro"));
            mod.setNome(conex.rs.getString("nome_bairro"));
            mod.setCidade(cidade);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao mostrar dados" +ex);
        }
        conex.desconecta();
        conexPesq.desconecta();
        return mod;
    }
    public ModelBairro Ant(){
        ModelBairro mod = new ModelBairro();
        conex.conexao();
        conexPesq.conexao();
        try{
            conex.rs.previous();
            conexPesq.executaSQL("select * from cidade where id_cidade=" + conex.rs.getInt("id_cidade"));
            conexPesq.rs.first();
            cidade = conexPesq.rs.getString("nome_cidades");
            mod.setCod(conex.rs.getInt("id_bairro"));
            mod.setNome(conex.rs.getString("nome_bairro"));
            mod.setCidade(cidade);
        }
        catch(SQLException ex) {
            
        }
        conexPesq.desconecta();
        return mod;
    }
    public ModelBairro Prox(){
        ModelBairro mod = new ModelBairro();
        conex.conexao();
        conexPesq.conexao();
        try{
            conex.rs.next();
            conexPesq.executaSQL("select * from cidade where id_cidade=" + conex.rs.getInt("id_cidade"));
            conexPesq.rs.first();
            cidade = conexPesq.rs.getString("nome_cidades");
            mod.setCod(conex.rs.getInt("id_bairro"));
            mod.setNome(conex.rs.getString("nome_bairro"));
            mod.setCidade(cidade);
            
        }catch(SQLException ex){
            
        }
        conexPesq.desconecta();
        return mod;
    }
    public ModelBairro Ult(){
        ModelBairro mod = new ModelBairro();
        conex.conexao();
        conexPesq.conexao();
        conex.executaSQL("Select * from bairro");
        try{
            conex.rs.last();
            conexPesq.executaSQL("select * from cidade where id_cidade=" + conex.rs.getInt("id_cidade"));
            conexPesq.rs.first();
            cidade = conexPesq.rs.getString("nome_cidades");
            mod.setCod(conex.rs.getInt("id_bairro"));
            mod.setNome(conex.rs.getString("nome_bairro"));
            mod.setCidade(cidade);     
        }catch(SQLException ex){
            
        }
        conex.desconecta();
        conexPesq.desconecta();
        return mod;
    }
    public void Editar(ModelBairro mod){
        conex.conexao();
        conexPesq.conexao();
        try{
            conexPesq.executaSQL("select * from cidade where nome_cidade="+ mod.getNome());
            conexPesq.rs.first();
            codCid = conex.rs.getInt("id_cidade");
            PreparedStatement pst = conex.conn.prepareStatement("update bairro set nome_bairro=?, id_cidade=? where id_bairro=" + conex.rs.getInt("id_bairro"));
            pst.setString(1, mod.getNome());
            pst.setInt(2, codCid);
            pst.setInt(3, mod.getCod());
            pst.execute();
        }catch(SQLException ex){
            
        }
        conex.desconecta();
        conexPesq.desconecta();
    }
    public void Excluir(ModelBairro mod){
        conex.conexao();
        try{
            PreparedStatement pst = conex.conn.prepareStatement("delete from bairro where id_bairro=?");
            pst.setInt(1, mod.getCod());
            pst.execute();
        }catch(SQLException ex){
            
        }
        conex.desconecta();
    }
    
}
