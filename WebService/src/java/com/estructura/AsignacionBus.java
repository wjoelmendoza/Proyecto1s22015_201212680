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
public class AsignacionBus {
    private int id;
    private int idBus;
    private String ruta;
    private int claveChofer;
    private String horaI;
    private String horaF;
    private String fecha;
    
    public AsignacionBus(int id, int idBus, String ruta, int claveChofer, String horaI,String horaF, String fecha){
        this.id = id;
        this.idBus = idBus;
        this.ruta = ruta;
        this.claveChofer = claveChofer;
        this.horaF = horaF;
        this.horaI = horaI;
        this.fecha = fecha;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int idBus(){
        return idBus;
    }
    
    public void setIdBus(int idBus){
        this.idBus = idBus;
    }
    
    public String getRuta(){
        return ruta;
    }
    
    public void setRuta(String ruta){
        this.ruta = ruta;
    }
    
    public int getClaveChofer(){
        return claveChofer;
    }
    
    public void setClaveChofer(int claveChofer){
        this.claveChofer =claveChofer;
    }
    
    public String getHoraF(){
        return horaF;
    }
    
    public void setHoraF(String horaF){
        this.horaF = horaF;
    }
    
    public String getHoraI(){
        return horaI;
    }
    
    public void setHoraI(String horaI){
        this.horaI = horaI;
    }
    
    public String getFecha(){
        return fecha;
    }
    
    public void setFecha(String fecha){
        this.fecha = fecha;
    }
}
