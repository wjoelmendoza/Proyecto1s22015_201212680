/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estructura;

import com.estructura.generica.NodoLD;

/**
 *
 * @author walter
 */
public class ListaBuses {
    private NodoLD<Bus> origen, fin;
    private int size;
    public ListaBuses(){
        origen = fin = null;
        size =0;
    }
    
    private boolean disponible(Bus bus){
        NodoLD<Bus> aux = origen;
        while(aux != null){
            if(aux.getDato().igualA(bus))
                return false;
            
            aux = aux.getSiguiente();
        }
        
        return true;
    }
    
    public boolean vacia(){
        return origen == null;
    }
    
    public void insertarElemento(Bus bus){
        NodoLD<Bus> aux = new NodoLD<>(bus);
        
        if(!vacia()){
            
            if(disponible(bus)){
                size++;
                aux.setAnterior(fin);
                fin.setSiguiente(aux);
                fin = aux;
            }
            
        }else{
            
            size++;
            origen = fin = aux;
            
        }
    }
    
    public int getSize(){
        
        return size;
        
    }
    
    public void bubbleSort(){
        
    }
}
