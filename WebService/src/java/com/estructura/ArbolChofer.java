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
public class ArbolChofer {
    private ArbolAVL choferes;
    
    public ArbolChofer(){
        choferes = new ArbolAVL();
    }
    
    public void agregar(Chofer chofer){
        choferes.insertar(chofer);
    }
    
    public Chofer buscar(int id){
        Chofer aux=null;
        Comparar com;
        Chofer aux1 = new Chofer(id);
        
        com =  choferes.buscar(aux1);
        
        if(com  !=null )
            aux = (Chofer) com;
        
        return aux;
    }
    
    public void eliminar(int id){
        Chofer aux= new Chofer(id);
        choferes.eliminar(aux);
    }
    
}
