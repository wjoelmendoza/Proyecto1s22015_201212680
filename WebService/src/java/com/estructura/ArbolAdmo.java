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
public class ArbolAdmo {
    
    ArbolAVL admos ;
    
    public ArbolAdmo(){
        admos = new ArbolAVL();
        admos.insertar(new Administrador("wjoelmendoza@gmail.com","123456"));
    }
    
    public void agregar(Administrador admin){
        admos.insertar(admin);
    }
    
    public void eliminar(String correo){
        Administrador aux = new Administrador(correo , "");
        System.out.println(correo);
        admos.eliminar(aux);
    }
    
    public Administrador buscar(String correo){
        Administrador aux = new Administrador(correo, ""), aux2 = null;
        
        Comparar com = admos.buscar(aux);
        
        if(com!=null)
            aux2 = (Administrador) com;
        
        return aux2;
    }
    
    public String graficar(){
        admos.graficarArbol("arbolAdmo");
        return admos.getImage();
    }
}
