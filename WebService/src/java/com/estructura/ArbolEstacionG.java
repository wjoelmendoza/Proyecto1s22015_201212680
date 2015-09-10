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
public class ArbolEstacionG {
    ArbolAVL estaciones;
    
    public ArbolEstacionG(){
        estaciones = new ArbolAVL();
    }
    
    public void agregar(EstacionGeneral eg){
        estaciones.insertar(eg);
    }
    
    public void eliminar(int id){
        EstacionGeneral aux = new EstacionGeneral(id);
        estaciones.eliminar(aux);
    }
    
    public EstacionGeneral buscar(int id){
        EstacionGeneral aux = new EstacionGeneral(id),aux1 = null;
        Comparar com = estaciones.buscar(aux);
        if(com!= null)
            aux1 = (EstacionGeneral) com;
        
        return aux1;
    }
    
    public String graficar(){
        estaciones.graficarArbol("avlEG");
        return estaciones.getImage();
    }
}
