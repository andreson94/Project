/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author andreson.csilva
 */
public class Cidade {

    private int cod;
    private String nome;
    private int cod_Estado;
    
    /**
     * @return the cod
     */
    public int getCod() {
        return cod;
    }

    /**
     * @param cod the cod to set
     */
    public void setCod(int cod) {
        this.cod = cod;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cod_Estado
     */
    public int getCod_Estado() {
        return cod_Estado;
    }

    /**
     * @param cod_Estado the cod_Estado to set
     */
    public void setCod_Estado(int cod_Estado) {
        this.cod_Estado = cod_Estado;
    }
 
}