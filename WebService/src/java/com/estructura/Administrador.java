/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estructura;

import com.estructura.interfaces.Comparar;

/**
 *
 * @author walter
 * 
 **/
public class Administrador implements Comparar {
    private String correo;
    private String pass;
    
    public Administrador(String correo, String contrasenha){
        this.pass = contrasenha;
        this.correo = correo;
    }
    
    public String getContrasenha(){
        return pass;
    }
    
    public String getCorreo(){
        return correo;
    }

    public void setContrasenha(String pass){
        this.pass = pass;
    }
    
    public void setCorreo(String correo){
        this.correo = correo;
    }
    
    @Override
    public boolean mayorQue(Comparar dato) {
        Administrador admo = (Administrador) dato;
        int aux = this.correo.compareTo(admo.correo);
        return aux > 0;
    }

    @Override
    public boolean menorQue(Comparar dato) {
        Administrador admo = (Administrador) dato;
        int aux = this.correo.compareTo(admo.correo);
        return aux < 0;
    }

    @Override
    public boolean igualA(Comparar dato) {
        Administrador admo = (Administrador) dato;
        int aux = this.correo.compareTo(admo.correo);
        return aux == 0;
    }
    
}
