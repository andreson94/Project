package models.dao;

import models.dao.ConectaBanco;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import models.ModelTelefone;

/**
 *
 * @author andreson.csilva
 */
public class ControleTelefone {
    ConectaBanco connTelefone = new ConectaBanco();
    
    public void inserirTel(ModelTelefone mod) throws SQLException{
        connTelefone.conexao();
        PreparedStatement pst = connTelefone.conn.prepareStatement("insert into telefone(numero_tel,id_id_telefone)values()");
        pst.setString(1,mod.getTel());
        pst.setInt(2,mod.getCod());
        pst.execute();
        connTelefone.desconecta();
    }
    
    //função para alterar a cidade
    public void alterarTel(ModelTelefone mod) throws SQLException{
        connTelefone.conexao();
        PreparedStatement pst = connTelefone.conn.prepareStatement("update telefone set numero_tel=?, id_telefoe=?");
        pst.setString(1,mod.getTel());
        pst.setInt(2,mod.getCod());
        pst.execute();
    }
    public void ExcluirTel(ModelTelefone mod){
        connTelefone.conexao();
        try {
            PreparedStatement pst = connTelefone.conn.prepareStatement("delete from telefone where id_telefone =?");
            pst.setInt(1, mod.getCod());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Deletado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no delete");
        }
        
    }
}
