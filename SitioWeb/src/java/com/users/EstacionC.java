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
public class EstacionC implements IUser{
    private String tipo;
    private int id ;
    
    public EstacionC(int id){
        this.id= id;
        tipo = Constantes.ec;
    }
    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
}
