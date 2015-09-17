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
public class Admin implements IUser {
    private String tipo;
    private String correo;

    public Admin (String correo){
        this.correo = correo;
        tipo = Constantes.admin;
    }
    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void setCorreo(String correo){
        this.correo = correo;        
    }
    
    public String getCorreo(){
        return correo;
    }
}
