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
public class Ruta implements Comparar,Cloneable {
    private String nombre;
    private Lista estaciones;
    
    public Ruta(String nombre){
        estaciones =new Lista();
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void agregarEstacion(Estacion nueva){
        Estacion aux = (Estacion)estaciones.buscar(nueva);
        if(aux == null)
            estaciones.insertar(nueva);
    }
    
    @Override
    public boolean mayorQue(Comparar dato) {
        Ruta aux = (Ruta) dato;
        return this.nombre.compareTo(aux.nombre) > 0;
    }

    @Override
    public boolean menorQue(Comparar dato) {
        Ruta aux = (Ruta) dato;
        return this.nombre.compareTo(aux.nombre) < 0;
    }

    @Override
    public boolean igualA(Comparar dato) {
        Ruta aux = (Ruta) dato;
        return this.nombre.compareTo(aux.nombre) == 0;
    }
    
}
