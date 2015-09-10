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
     * This is a sample web service operation
     * @param txt
     * @return 
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

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
     */
    @WebMethod(operationName = "graficarAVLChoferes")
    public String graficarAVLChoferes() {
        //TODO write your implementation code here:
        return arbolChofer.graficar();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "graficarAVLAdmo")
    public String graficarAVLAdmo() {
        //TODO write your implementation code here:
        return arbolAdmo.graficar();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "graficarAVLEG")
    public String graficarAVLEG() {
        //TODO write your implementation code here:
        return estacionesG.graficar();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "graficarAVLEC")
    public String graficarAVLEC() {
        //TODO write your implementation code here:
        return estacionesC.graficar();
    }
    
    

}
