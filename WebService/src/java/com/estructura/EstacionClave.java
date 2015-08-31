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
public class EstacionClave extends EstacionGeneral {

    public EstacionClave(int id) {
        super(id);
    }
    
    public EstacionClave(int clave, int personas, String contrasenha, String nombre){
        super(clave, personas, contrasenha, nombre);
    }
    
}
