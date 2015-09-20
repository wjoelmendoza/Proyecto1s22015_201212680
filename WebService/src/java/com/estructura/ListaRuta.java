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
public class ListaRuta {
   Lista rutas ;
   
   public ListaRuta(){
       rutas = new Lista();
   }
   
   public void agregar(Ruta nueva){
       Ruta aux = (Ruta) rutas.buscar(nueva);
       
       if(aux == null){
           rutas.insertar(nueva);
       }
   }
   
   public Ruta buscar(String nombre){
       return (Ruta)rutas.buscar(new Ruta(nombre));
   }
}
