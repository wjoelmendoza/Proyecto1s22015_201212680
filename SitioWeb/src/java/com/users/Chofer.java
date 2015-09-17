/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.users;

/**
 *
 * @author walter
 */
public class Chofer implements IUser {
    private String tipo ;
    private int clave;
    
    public Chofer(int clave){
        this.clave = clave;
        tipo = Constantes.chofer;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public int getclave(){
        return clave;
    }
    
    public void setClave(int clave){
        this.clave = clave;
    }
}
