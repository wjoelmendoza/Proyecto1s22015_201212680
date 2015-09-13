/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estructura;

/**
 *
 * @author walter
 */
public class ListaFecha {
    private Lista fecha;
    public ListaFecha(){
        fecha = new Lista();
    }
    
    public boolean vacio(){
        return fecha.vacio();
    }
    
    public int getSize(){
        return fecha.getSize();
    }
    
    public void insertar(){
        fecha.insertar(null);
    }
}
