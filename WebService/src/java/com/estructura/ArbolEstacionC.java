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
public class ArbolEstacionC {
    ArbolAVL estaciones;
    
    public ArbolEstacionC(){
        estaciones = new ArbolAVL();
    }
    
    public void agregar(EstacionClave ec){
        estaciones.insertar(ec);
    }
    
    public void eliminar(int id){
        EstacionClave ec = new EstacionClave(id);
        estaciones.eliminar(ec);
    }
    
    public EstacionClave buscar(int id){
        EstacionClave aux=new EstacionClave(id),aux1 = null;
        Comparar com = estaciones.buscar(aux);
        if(com != null)
            aux1 = (EstacionClave) com;
        
        return aux1;
    }
}
