/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estructura;

import com.estructura.generica.NodoLD;
import graphViz.GraphViz;
import java.io.File;

/**
 *
 * @author walter
 */
public class ListaBuses {
    private NodoLD<Bus> origen, fin;
    private int size;
    private String nomGraf;
    private GraphViz gv;
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
    
    public void insertar(Bus bus){
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
        NodoLD<Bus> auxb1,auxb2,auxb3;
        Bus aux1,aux2;
        
        if(!vacia()){
            auxb1 =
            auxb2 = origen.getSiguiente();
            int i , j;
            for(i = size-1; i >-1; i--){
                for(j = 1; j <=i; j++){
                    auxb3 = auxb2.getAnterior();
                    //dato anterior
                    aux1 = auxb3.getDato();
                    //dato actual
                    aux2 = auxb2.getDato();
                    if(aux1.mayorQue(aux2)){
                        auxb2.setDato(aux1);
                        auxb3.setDato(aux2);
                    }
                    auxb2 = auxb2.getSiguiente();
                }
                
                auxb2=auxb1;
            }
        }
    }
    public void graficar(){
        if(!vacia()){
            nomGraf="lista" + System.currentTimeMillis() +".png";
            int i =0;
            gv = new GraphViz();
            gv.addln(gv.start_graph());
            gv.addln("rankdir = LR;");
            NodoLD<Bus> aux = origen;
            
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
