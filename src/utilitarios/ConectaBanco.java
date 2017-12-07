/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitarios;

import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author João
 */
public class ConectaBanco {
    
    public Statement stm;
    public ResultSet rs;
    private String driver = "org.postgresql.Driver";
    private String caminho = "jdbc:postgresql://localhost:5432/calcados";
    private String usuario = "postgres";
    private String senha = "admin";
    public Connection conn;//realiza a conexão com o banco de dados
    
    public void conexao(){//realiza a conexão com o banco
        
        try {
            System.setProperty("jdbc.Drivers", driver);
            conn = DriverManager.getConnection(caminho, usuario, senha);
           // JOptionPane.showMessageDialog(null, "conectado com sucesso");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "erro de conexão:\n Erro:" + ex.getMessage());
        }
        
    }
    public void desconecta(){//metodo para fechar conexão
        try {
            conn.close();
            JOptionPane.showMessageDialog(null, "desconectado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao fechar conexão:\n Erro:" + ex.getMessage());
        }
    }
}
