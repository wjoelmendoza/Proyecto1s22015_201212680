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
public class PruebaPaquete {
    public static void main(String[] arg ){
//        ArbolAdmo aa =new ArbolAdmo();
//        aa.agregar(new Administrador("wjoelmendoza@hotmail.com","123456"));
//        aa.agregar(new Administrador("lines@hotmail.com","123456"));
//        aa.graficar();
//        aa.eliminar("wjoelmendoza@hotmail.com");
//        aa.graficar();
//        ArbolAVL avl = new ArbolAVL();
//        avl.insertar(new Numero(1));
//        Numero au = (Numero)avl.buscar(new Numero(1));
//        if(au!=null){
//            System.out.println("encontrado");
//        }else
//            System.out.println("no encontrado");
//        avl.insertar(new Numero(2));
//        avl.insertar(new Numero(3));
//        avl.insertar(new Numero(4));
//        avl.insertar(new Numero(5));
//        avl.insertar(new Numero(6));
//        avl.insertar(new Numero(7));
//        //avl.insertar(null);
//        //avl.graficarArbol("avlpuro");
//        avl.eliminar(new Numero(7));
//       // avl.graficarArbol("avlpuro");
//        avl.eliminar(new Numero(5));
//        //avl.graficarArbol("avlpuro");
//        avl.eliminar(new Numero(6));
//       // avl.graficarArbol("avlpuro");
//        avl.insertar(new Numero(5));
//        //avl.graficarArbol("avlpuro");
//        avl.insertar(new Numero(6));
//        avl.insertar(new Numero(7));
//        avl.insertar(new Numero(8));
//        avl.insertar(new Numero(9));
//        avl.insertar(new Numero(10));
//        avl.insertar(new Numero(11));
//        avl.insertar(new Numero(12));
//        avl.insertar(new Numero(13));
//        avl.insertar(new Numero(14));
//        avl.insertar(new Numero(15));
//        avl.insertar(new Numero(16));
//        avl.insertar(new Numero(17));
//        avl.insertar(new Numero(18));
//        avl.insertar(new Numero(19));
//        avl.insertar(new Numero(20));
//        avl.insertar(new Numero(21));
//        avl.insertar(new Numero(22));
//        avl.insertar(new Numero(23));
//        avl.insertar(new Numero(16));
//        avl.insertar(new Numero(16));
//        avl.insertar(new Numero(16));
//        avl.insertar(new Numero(16));
//        avl.insertar(new Numero(16));
//       // avl.graficarArbol("avlpuro");
        ArbolAdmo avlA = new ArbolAdmo();
        Administrador admin = avlA.buscar("wjoelmendoza@gmail.com");
        if(admin !=null)
            System.out.println("encontrado");
        else
            System.out.println("no encontrado");
    }
}

class Numero implements Comparar{
    private int valor;

    public Numero(int valor){
        this.valor = valor;
    }
    
    public void setValor(int valor){
        this.valor = valor;
    }
    
    public int getValor(){
        return valor;
    }
    
    @Override
    public boolean mayorQue(Comparar dato) {
        Numero aux = (Numero) dato;
        return this.valor > aux.valor;
    }

    @Override
    public boolean menorQue(Comparar dato) {
        Numero aux = (Numero) dato;
        return this.valor < aux.valor;
    }

    @Override
    public boolean igualA(Comparar dato) {
        Numero aux = (Numero) dato;
        return this.valor == aux.valor;
    }
    
    @Override
    public String toString(){
        return "" + valor;
    }
}
