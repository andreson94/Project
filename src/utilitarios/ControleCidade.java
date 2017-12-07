/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitarios;

import javax.swing.JOptionPane;
import models.ModelCidade;

/**
 *
 * @author andreson.csilva
 */
public class ControleCidade {
    public void inserirCidade(ModelCidade mod){
        
        JOptionPane.showMessageDialog(null,mod.getNome());
    }
}
