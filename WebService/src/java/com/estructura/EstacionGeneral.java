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
public class EstacionGeneral implements Comparar {
    private final int id;
    private int personas;
    private String contrasenha;
    private String nombre;
    
    public EstacionGeneral(int id){
        this.id =id;
        personas =0;
        contrasenha ="";
        nombre ="";
    }
    
    public EstacionGeneral(int id, int personas, String contrasenha, String nombre){
        this.id = id;
        this.personas = personas;
        this.contrasenha = contrasenha;
        this.nombre = nombre;
    }
    
    public int getId(){
        return id;
    }
    
    public int getPersonas(){
        if( personas>0)
            return personas;
        else
            return 0;
    }
    
    public String getContrasenha(){
        return contrasenha;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setContrasenha(String pas){
        this.contrasenha = pas;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void incrementarPersonas(int personas){
        if(this.personas >0)
            this.personas += personas;
        else
            this.personas = personas;
    }
    
    public void decrementarPersonas(int personas){
        if(this.personas > 0)
            this.personas -= personas;
        else{
            System.out.println("ya no hay personas en la estacion");
            this.personas = 0;
        }
    }

    @Override
    public boolean mayorQue(Comparar dato) {
        EstacionGeneral aux = (EstacionGeneral)dato;
        return this.id > aux.id;
    }

    @Override
    public boolean menorQue(Comparar dato) {
        EstacionGeneral aux = (EstacionGeneral) dato;
        return this.id < aux.id;
    }

    @Override
    public boolean igualA(Comparar dato) {
        EstacionGeneral aux = (EstacionGeneral) dato;
        return this.id == aux.id;
    }
}
