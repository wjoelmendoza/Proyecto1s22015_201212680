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
public class Estacion implements Comparar{
    private int id;
    private String tipo;
    
    public Estacion(int id , String tipo){
        this.id = id;
        this.tipo = tipo;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return id;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public String getTipo(){
        return tipo;
    }

    @Override
    public boolean mayorQue(Comparar dato) {
        Estacion aux =(Estacion) dato;
        return this.id > aux.id;
    }

    @Override
    public boolean menorQue(Comparar dato) {
        Estacion aux =(Estacion) dato;
        return this.id < aux.id;
    }

    @Override
    public boolean igualA(Comparar dato) {
        Estacion aux =(Estacion) dato;
        return this.id == aux.id && tipo.equals(aux.tipo);
    }
}
