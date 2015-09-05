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
        ListaBuses a1 = new ListaBuses();
//        ArbolAVL avl = new ArbolAVL();
//        avl.insertar(new Numero(40));
//        avl.insertar(new Numero(4));
//        avl.insertar(new Numero(3));
//        avl.insertar(new Numero(60));
//        avl.insertar(new Numero(30));
//        avl.insertar(new Numero(2));
//        avl.insertar(new Numero(1));
//        avl.insertar(new Numero(61));
//        avl.insertar(new Numero(63));
//        avl.insertar(new Numero(64));
//        avl.insertar(new Numero(62));
//        avl.insertar(new Numero(65));
       // avl.inorden(avl.getRaiz());
       // System.out.println();
        
        //avl.eliminar(new Numero(60));
        //avl.inorden(avl.getRaiz());
       // System.out.println();
        
        //avl.graficarArbol();
        a1.insertar(new Bus("20"));
        a1.insertar(new Bus("25"));
        a1.insertar(new Bus("2"));
        a1.insertar(new Bus("0"));
        a1.insertar(new Bus("1"));
        a1.bubbleSort();
        a1.graficar();
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
