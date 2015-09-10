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
    
    /**
     * 
     * @param id este valor es que se utiliza para realizar la búsqueda 
     * y su respectiva eliminación si coincide algún objeto con dicho id
     */
    public void eliminar(int id){
        EstacionClave ec = new EstacionClave(id);
        estaciones.eliminar(ec);
    }
    
    /**
     * 
     * @param id es el parámetro mediante el cual se realiza la búsqueda
     * @return una EstacioClave si se localiza algún objeto que coincida con el
     * id que viene como parámetro o null si no se encuentra ningún dato
     */
    public EstacionClave buscar(int id){
        EstacionClave aux=new EstacionClave(id),aux1 = null;
        Comparar com = estaciones.buscar(aux);
        if(com != null)
            aux1 = (EstacionClave) com;
        
        return aux1;
    }
    
    /**
     * 
     * @return La URL para acceder a la imagen generada
     */
    public String graficar(){
        estaciones.graficarArbol("avlEC");
        return estaciones.getImage();
    }
}
