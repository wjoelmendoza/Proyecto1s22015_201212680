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
 */
public class Chofer implements Comparar {
    private String nombre;
    private String apellido;
    private int clave;
    private String contrasenha;
    private String correo;
    private ListaFecha fechas;
    //lista de tiempos de visita pasa a ser un atributo del las fechas?
    /**
     * Crea un nuevo objeto con nombre chofer, correo chofer@chofer.com y contraseña
     * chofer 
     * @param clave  es la clave del chofer que se esta instanciando;
     * 
     */
    
    public Chofer(int clave){
        nombre ="chofer";
        correo = "chofer@chofer.com";
        this.clave = clave;
        fechas = new ListaFecha();
    }
    
    public Chofer(int clave, String apellido, String contrasenha, String correo, String nombre){
        this.clave = clave;
        this.apellido = apellido;
        this.contrasenha = contrasenha;
        this.correo = correo;
        this.nombre = nombre;
        fechas = new ListaFecha();
    }

    public String getApellido(){
        return apellido;
    }
    
    public String getContrasenha(){
        return contrasenha;
    }
    
    public String getCorreo(){
        return correo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public void setCorreo(String correo){
        this.correo = correo;
    }
    
    public void setContrasenha(String contrasenha){
        this.contrasenha = contrasenha;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    @Override
    public boolean mayorQue(Comparar dato) {
        Chofer aux = (Chofer) dato;
        return this.clave > aux.clave;
    }

    @Override
    public boolean menorQue(Comparar dato) {
        Chofer aux = (Chofer) dato;
        return this.clave < aux.clave;
    }

    @Override
    public boolean igualA(Comparar dato) {
        Chofer aux = (Chofer) dato;
        return this.clave == aux.clave;
    }
    
    public void setClave(int clave){
        this.clave = clave;
    }
    
    @Override
    public String toString(){
        return clave +"\n" + nombre;
    }
    
    private void iniciaF(){
        fechas.insertar();
    }
    
}
