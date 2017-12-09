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
import models.ModelCliente;

/**
 *
 * @author joao.vrevangelista
 */

    public class ControleCliente {
    
    ConectaBanco conex = new ConectaBanco();
    ModelCliente modCli = new ModelCliente();
    int codBairro, codCidade, codTel;
    String Bairro, Cidade, Telefone;
    
    public void Inserir(ModelCliente mod){
        conex.conexao();
        buscaCod(mod.getBairro(), mod.getCidade(), mod.getTelefone());
        
        try {
            PreparedStatement pst = conex.conn.prepareStatement("inset into clientes (nome_clientes, endereco_clienre, rg_cliente, cpf_cliente,"
                    + "id_bairro) values(?,?,?,?,?");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getEndereco());
            pst.setString(3, mod.getRg());
            pst.setString(4, mod.getCpf());
            buscaCod(mod.getBairro(), mod.getCidade(), mod.getTelefone());
            pst.setInt(5, codBairro);
            pst.execute();
            //atualiza
            conex.executaSQL("select * from telefone where numero_tel='"+mod.getTelefone()+"'");
            conex.rs.first();
            codTel = conex.rs.getInt("id_telefone");
            
            conex.executaSQL("select * from clientes where nome_clientes='"+ mod.getNome()+ "'");
            conex.rs.first();
            int codCli = conex.rs.getInt("id_cliente");
            pst = conex.conn.prepareStatement("insert into itens_cli_tel(id_cliente, id_tel)values(?,?)");
            buscaCod(mod.getBairro(), mod.getCidade(), "");
           
            pst.setInt(1, codCli);
            pst.setInt(2, codTel);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Inserido com sucesso");
            
        } catch (SQLException ex) {
            Logger.getLogger(ControleCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        conex.desconecta();
    }
    public void buscaCod(String Bairro, String Cidade, String tel){
        try{
            conex.executaSQL("select * from bairro where nome_bairro='" +Bairro+ "'");
            conex.rs.first();
            codBairro = conex.rs.getInt("id_bairro");
            conex.executaSQL("select * from cidade where nome_cidades='" +Cidade+ "'");
            conex.rs.first();
            codBairro = conex.rs.getInt("id_cidade");
            conex.executaSQL("select * from telefone where nome_tel='" +tel+ "'");
            conex.rs.first();
            codBairro = conex.rs.getInt("id_telefone");
            
        }catch(SQLException ex){
            
        }
    }
    public void alterar(ModelCliente mod){
        conex.conexao();
        try{
            conex.executaSQL("select * from telefone where numero_tel='"+mod.getTelefone()+"'" );
            conex.rs.first();
            codTel=conex.rs.getInt("id_telefone");
            PreparedStatement pst = conex.conn.prepareStatement("update itens_cli_tel set id_tel=? where numero_tel='"+mod.getTelefone()+"'");
            pst.setInt(1, codTel);
            pst.setInt(2, mod.getId());
            pst.execute();
            pst = conex.conn.prepareStatement("update clientes set nome_cliente=?, endereco_cliente=?, rg_cliente=?, "
                    + "cpf_cliente=?, id_bairro=? where id_cliente=?");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getEndereco());
            pst.setString(3, mod.getRg());
            pst.setString(4, mod.getCpf());
            buscaCod(mod.getBairro(), mod.getCidade(), "");
            pst.setInt(5, codBairro);
            pst.setInt(6, codCidade);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Alterado com sucesso");
            
        }catch(SQLException ex){
            
        }
        conex.desconecta();
    }
    public void excluir(ModelCliente mod){
        conex.conexao();
        try{
            PreparedStatement pst = conex.conn.prepareStatement("delete from itens_cli_tel where id_cliente=?");
            pst.setInt(1, mod.getId());
            pst.execute();
            
            pst = conex.conn.prepareStatement("delete from clientes where id_cliente=?");
            pst.setInt(1, mod.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Exlusão realizada");
        }catch(SQLException ex){
            
        }
    }
    public ModelCliente primeiro(){
        conex.conexao();
        try{
            conex.executaSQL("select * from clientes inner join itens_cli_tel on clientes.id_cliente = itens_cli_tel.id_cliente inner join telefone on itens_cli_tel.id_tel = telefone.id_telefone inner join bairro on clientes.id_bairro = bairro.id_bairro inner join cidade on bairro.id_cidade = cidade.id_cidade");
            conex.rs.first();
            modCli.setId(conex.rs.getInt("id_cliente"));
            modCli.setNome(conex.rs.getString("nome_cliente"));
            modCli.setEndereco(conex.rs.getString("endereco_cliente"));
            modCli.setRg(conex.rs.getString("rg_cliente"));
            modCli.setCpf(conex.rs.getString("cpf_cliente"));
            modCli.setBairro(conex.rs.getString("nome_bairro"));
            modCli.setCidade(conex.rs.getString("nome_cidades"));
            modCli.setTelefone(conex.rs.getString("numeor_tel"));
        }catch(SQLException ex){
            
        }
        conex.desconecta();
        return modCli;
    }
    public ModelCliente ult(){
        conex.conexao();
        try{
            conex.executaSQL("select * from clientes inner join itens_cli_tel on clientes.id_cliente = itens_cli_tel.id_cliente inner join telefone on itens_cli_tel.id_tel = telefone.id_telefone inner join bairro on clientes.id_bairro = bairro.id_bairro inner join cidade on bairro.id_cidade = cidade.id_cidade");
            conex.rs.last();
            modCli.setId(conex.rs.getInt("id_cliente"));
            modCli.setNome(conex.rs.getString("nome_cliente"));
            modCli.setEndereco(conex.rs.getString("endereco_cliente"));
            modCli.setRg(conex.rs.getString("rg_cliente"));
            modCli.setCpf(conex.rs.getString("cpf_cliente"));
            modCli.setBairro(conex.rs.getString("nome_bairro"));
            modCli.setCidade(conex.rs.getString("nome_cidades"));
            modCli.setTelefone(conex.rs.getString("numeor_tel"));
        }catch(SQLException ex){
            
        }
        conex.desconecta();
        return modCli;
    }
    public ModelCliente ant(){
        conex.conexao();
        try{
            
            conex.rs.previous();
            modCli.setId(conex.rs.getInt("id_cliente"));
            modCli.setNome(conex.rs.getString("nome_cliente"));
            modCli.setEndereco(conex.rs.getString("endereco_cliente"));
            modCli.setRg(conex.rs.getString("rg_cliente"));
            modCli.setCpf(conex.rs.getString("cpf_cliente"));
            modCli.setBairro(conex.rs.getString("nome_bairro"));
            modCli.setCidade(conex.rs.getString("nome_cidades"));
            modCli.setTelefone(conex.rs.getString("numeor_tel"));
        }catch(SQLException ex){
            
        }
        return modCli;
    }
     public ModelCliente prox(){
        conex.conexao();
        try{
            
            conex.rs.next();
            modCli.setId(conex.rs.getInt("id_cliente"));
            modCli.setNome(conex.rs.getString("nome_cliente"));
            modCli.setEndereco(conex.rs.getString("endereco_cliente"));
            modCli.setRg(conex.rs.getString("rg_cliente"));
            modCli.setCpf(conex.rs.getString("cpf_cliente"));
            modCli.setBairro(conex.rs.getString("nome_bairro"));
            modCli.setCidade(conex.rs.getString("nome_cidades"));
            modCli.setTelefone(conex.rs.getString("numeor_tel"));
        }catch(SQLException ex){
            
        }
        return modCli;
    }
     public void buscaNomes(int codBairro, int codCid){
         try{
         conex.executaSQL("select * from bairro where id_bairro=)" +codBairro);
         conex.rs.first();
         Bairro = conex.rs.getString("nome_bairro");
         conex.executaSQL("select * from cidade where id_cidade=" + codCid);
         conex.rs.first();
         Cidade = conex.rs.getString("nome_cidades");
                 }catch(SQLException ex){
                     
                 }
     }
    
}

    

