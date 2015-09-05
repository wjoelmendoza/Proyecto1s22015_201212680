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
public class Fecha implements Comparar {
    private String fecha;
    private Lista bus;
    
    public Fecha(){
        bus = new Lista();
    }

    @Override
    public boolean mayorQue(Comparar dato) {
        Fecha aux = (Fecha) dato;
        return this.fecha.compareTo(aux.fecha) > 0;
    }

    @Override
    public boolean menorQue(Comparar dato) {
        Fecha aux = (Fecha) dato;
        return this.fecha.compareTo(aux.fecha) < 0;
    }

    @Override
    public boolean igualA(Comparar dato) {
        Fecha aux = (Fecha)dato;
        return this.fecha.compareTo(aux.fecha) == 0;
    }
    
}
