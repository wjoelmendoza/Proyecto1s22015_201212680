/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estructura;

import com.estructura.generica.NodoLD;
import com.estructura.interfaces.Comparar;
import graphViz.GraphViz;
import java.io.File;

/**
 *
 * @author walter
 */
public class Lista {
    private NodoLD<Comparar> origen, fin;
    private int size;
    private String nomGraf;
    private GraphViz gv;
    
    public Lista(){
        size =0;
        origen = fin = null;
    }
    
    public int getSize(){
        return size;
    }
    
    public boolean vacio(){
        return origen == null;
    }
    
    public Comparar buscar(Comparar bsq){
        Comparar aux = null;
        NodoLD<Comparar> aux1 = origen;
        
        if(!vacio()){
            while(aux1 != null){
                aux = aux1.getDato();
                if(aux.igualA(bsq))
                    return aux;
                aux1 = aux1.getSiguiente();
            }
        }
        return aux;
    }
    
    public String getNombreGraf(){
        return nomGraf;
    }
    
    public void insertar(Comparar dato){
        NodoLD<Comparar> nuevo = new NodoLD<>(dato);
        size++;
        if(!vacio()){
            fin.setSiguiente(nuevo);
            nuevo.setAnterior(fin);
            fin = nuevo;
        }else{
            origen = fin = nuevo;
        }
    }
    
    public void setNombreGraf(String name){
        this.nomGraf = name;
    }
    
    public void graficar(){
        if(!vacio()){
            nomGraf="lista" + System.currentTimeMillis() +".png";
            int i =0;
            gv = new GraphViz();
            gv.addln(gv.start_graph());
            gv.addln("rankdir = LR;");
            NodoLD<Comparar> aux = origen;
            
            while(aux != null){
                gv.addln("n" + i + "[label=\""+aux.getDato().toString() +"\"];" );
                aux = aux.getSiguiente();
                i++;
            }
            
            for(i=0;i<size;i++){
                if(i<size-1)
                    gv.add("n"+i +"->");
                else
                    gv.add("n" + i +";\n");
            }
            
            for(i=size-1; i >=0; i--){
                if(i>0)
                    gv.add("n" + i +"->");
                else
                    gv.add("n" + i+";\n");
            }
            gv.addln(gv.end_graph());
            
            File ext = new File(nomGraf);
            gv.writeGraphToFile(gv.getGraph(gv.getDotSource(), "png"), ext);
        }
    }
}
