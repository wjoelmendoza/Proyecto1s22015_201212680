/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webservice;

import com.estructura.Administrador;
import com.estructura.ArbolAdmo;
import com.estructura.ArbolChofer;
import com.estructura.ArbolEstacionC;
import com.estructura.ArbolEstacionG;
import com.estructura.Bus;
import com.estructura.Chofer;
import com.estructura.EstacionClave;
import com.estructura.EstacionGeneral;
import com.estructura.ListaBuses;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author walter
 */
@WebService(serviceName = "WSEDD")
public class WSEDD {
    ArbolAdmo arbolAdmo = new ArbolAdmo();
    ListaBuses buses = new ListaBuses();
    ArbolChofer arbolChofer = new ArbolChofer();
    ArbolEstacionC estacionesC = new ArbolEstacionC();
    ArbolEstacionG estacionesG = new ArbolEstacionG();

    /**
     * Web service operation
     * @param correoAdmo
     * @param passAdmo
     */
    @WebMethod(operationName = "agregarAdministrador")
    @Oneway
    public void agregarAdministrador(@WebParam(name = "correoAdmo") String correoAdmo, @WebParam(name = "passAdmo") String passAdmo) {
        arbolAdmo.agregar(new Administrador(correoAdmo, passAdmo));
    }

    /**
     * Web service operation
     * @param idBus
     */
    @WebMethod(operationName = "addBus")
    @Oneway
    public void addBus(@WebParam(name = "idBus") String idBus) {
        buses.insertar(new Bus(idBus));
    }

    /**
     * Web service operation
     * @param clavec
     * @param apellidoC
     * @param contraC
     * @param correoC
     * @param nombreC
     */
    @WebMethod(operationName = "addChofer")
    @Oneway
    public void addChofer(@WebParam(name ="claverC")int clavec, @WebParam(name ="apellidoC")String apellidoC,
            @WebParam(name ="contraC")String contraC,@WebParam(name="correoC")String correoC, @WebParam(name ="nombreC")String nombreC) {
        arbolChofer.agregar(new Chofer(clavec,apellidoC,contraC,correoC,nombreC));
    }

    /**
     * Web service operation
     * @param claveEC
     * @param contraEC
     * @param nombreEC
     */
    @WebMethod(operationName = "addEstacionC")
    @Oneway
    public void addEstacionC(@WebParam(name = "claveEC") int claveEC, @WebParam(name = "contraEC") String contraEC, @WebParam(name = "nombreEC") String nombreEC) {
        estacionesC.agregar(new EstacionClave(claveEC,0,contraEC,nombreEC));
    }

    /**
     * Web service operation
     * @param claveEG
     * @param contraEG
     * @param nombreEG
     */
    @WebMethod(operationName = "addEstacionG")
    @Oneway
    public void addEstacionG(@WebParam(name = "claveEG") int claveEG, @WebParam(name = "contraEG") String contraEG, @WebParam(name = "nombreEG") String nombreEG)  {
        estacionesG.agregar(new EstacionGeneral(claveEG, 0,contraEG, nombreEG));
        
    }

    /**
     * Web service operation
     * @param parameter
     * @return 
     */
    @WebMethod(operationName = "grafListaBuses")
    public String grafListaBuses(@WebParam(name = "parameter") String parameter) {
        //TODO write your implementation code here:
        buses.graficar();
        return buses.getNombreGraf();
    }

    /**
     * Web service operation
     * @return 
     */
    @WebMethod(operationName = "graficarAVLChoferes")
    public String graficarAVLChoferes() {
        //TODO write your implementation code here:
        return arbolChofer.graficar();
    }

    /**
     * Web service operation
     * @return 
     */
    @WebMethod(operationName = "graficarAVLAdmo")
    public String graficarAVLAdmo() {
        //TODO write your implementation code here:
        return arbolAdmo.graficar();
    }

    /**
     * Web service operation
     * @return 
     */
    @WebMethod(operationName = "graficarAVLEG")
    public String graficarAVLEG() {
        //TODO write your implementation code here:
        return estacionesG.graficar();
    }

    /**
     * Web service operation
     * @return 
     */
    @WebMethod(operationName = "graficarAVLEC")
    public String graficarAVLEC() {
        //TODO write your implementation code here:
        return estacionesC.graficar();
    }
    

    /**
     * Web service operation
     * @param correo
     */
    @WebMethod(operationName = "eliminarAdmo")
    @Oneway
    public void eliminarAdmo(@WebParam(name = "correo") String correo) {
        arbolAdmo.eliminar(correo);
    }

    /**
     * Web service operation
     * @param clave
     */
    @WebMethod(operationName = "eliminarChofer")
    @Oneway
    public void eliminarChofer(@WebParam(name = "clave") int clave) {
        arbolChofer.eliminar(clave);
    }

    /**
     * Web service operation
     * @param clave
     */
    @WebMethod(operationName = "eliminarEstacioG")
    @Oneway
    public void eliminarEstacioG(@WebParam(name = "clave") int clave) {
        estacionesG.eliminar(clave);
    }

    /**
     * Web service operation
     * @param id
     */
    @WebMethod(operationName = "eliminarEstacionC")
    @Oneway
    public void eliminarEstacionC(@WebParam(name = "id") int id) {
        estacionesC.eliminar(id);
    }

    /**
     * Web service operation
     * @param idBus
     */
    @WebMethod(operationName = "eliminarBus")
    @Oneway
    public void eliminarBus(@WebParam(name = "idBus") String idBus) {
        
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ordenarBuses")
    @Oneway
    public void ordenarBuses() {
        buses.bubbleSort();
    }

    /**
     * Web service operation
     * @param clave
     * @return 
     */
    @WebMethod(operationName = "modificarChofer")
    public Chofer modificarChofer(@WebParam(name = "clave") int clave) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     * @param lnCSV
     */
    @WebMethod(operationName = "asignacionBuses")
    @Oneway
    public void asignacionBuses(@WebParam(name = "lnCSV") String lnCSV) {
        //TODO write your implementation code here:
        String[] vecDatos = lnCSV.split(",");
        if(vecDatos.length == 6){
            String idBus = vecDatos[0];
            String ruta = vecDatos[1];
            int claveChofer = Integer.parseInt(vecDatos[2]);
            String horai = vecDatos[3];
            String horaf = vecDatos[4];
            String fecha = vecDatos[5];
            Bus auxB = buses.buscar(idBus);
            Chofer auxC = arbolChofer.buscar(claveChofer);
            
            if(auxB == null)
                buses.insertar(new Bus(idBus));
            
            if(auxC == null)
                arbolChofer.agregar(new Chofer(claveChofer));
        }
    }

    /**
     * Web service operation
     * @param lcorreoAdmin
     * @return 
     */
    @WebMethod(operationName = "logAdmin")
    public Administrador logAdmin(@WebParam(name = "lcorreoAdmin") String lcorreoAdmin) {
        //TODO write your implementation code here:
        return arbolAdmo.buscar(lcorreoAdmin);
    }

    /**
     * Web service operation
     * @param lclaveChofer
     * @return 
     */
    @WebMethod(operationName = "logChofer")
    public Chofer logChofer(@WebParam(name = "lclaveChofer") int lclaveChofer) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     * @param id
     * @return 
     */
    @WebMethod(operationName = "logEG")
    public EstacionGeneral logEG(@WebParam(name = "id") int id) {
        //TODO write your implementation code here:
        return estacionesG.buscar(id);
    }

    /**
     * Web service operation
     * @param lidEG
     * @return 
     */
    @WebMethod(operationName = "logEC")
    public EstacionClave logEC(@WebParam(name = "lidEG") int lidEG) {
        //TODO write your implementation code here:
        return estacionesC.buscar(lidEG);
    }
    

}
