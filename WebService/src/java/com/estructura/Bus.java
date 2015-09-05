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
public class Bus implements Comparar, Cloneable {
    private String id;
    private Lista horarios ;
    
    /**
     * inicializa el objeto con el
     * @param id que se esta recibiendo
     */
    
    
    public Bus(String id){
        horarios= new Lista();
        this.id = id;
    }

    /**
     * 
     * @return el id del objeto en cuestión.
     */
    public String getId(){
        return id;
    }
    
    /**
     * cambia el id del objeto por el que recibe como parámetro
     * @param id 
     */
    public void setId(String id){
        this.id = id;
    }
    
    /**
     * 
     * @param dato, se compara el id de este objeto se compara con el id del dato que se esta recibiendo
     * @return verdadero si y solo si el id del objeto que invoca el método es mayor que el id del 
     * objeto que se recibe como parámetro
     * 
     */
    
    @Override
    public boolean mayorQue(Comparar dato) {
        Bus aux = (Bus) dato;
        
        int value = this.id.compareTo(aux.id);
        
        //System.out.println(value);
        return value > 0;
    }

    /**
     * 
     * @param dato
     * @return 
     */
    @Override
    public boolean menorQue(Comparar dato) {
        Bus aux =(Bus) dato;
        int value = this.id.compareTo(aux.id);
        return value < 0;
    }

    /**
     * 
     * @param dato compara el id con el id del objeto actual
     * @return verdadero si y solo si los id con iguales
     */
    
    @Override
    public boolean igualA(Comparar dato) {
        Bus aux = (Bus) dato;
        int value = aux.id.compareTo(id);
        return value == 0;
    }
    
    @Override
    public String toString(){
        return id;
    }
    
    @Override
    public Bus clone(){
        Bus clon = new Bus (this.id);
        return clon;
    }
}
