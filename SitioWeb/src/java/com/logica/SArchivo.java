/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logica;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import java.util.*;
import org.apache.commons.fileupload.*;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.*;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author walter
 */
@WebServlet(name = "SArchivo", urlPatterns = {"/SArchivo"})
public class SArchivo extends HttpServlet {
    private static final String  ubicacionArchivo="../work/Catalina/localhost/SitioWeb";
    DiskFileItemFactory factory = new DiskFileItemFactory();
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("/SitioWeb/Admin/CargarArchivo.jsp");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.subirArchivo(request);
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    public void subirArchivo(HttpServletRequest request){
        factory.setSizeThreshold(1024);
        factory.setRepository(new File(ubicacionArchivo));
        ServletFileUpload upload = new ServletFileUpload(factory);
        
        try{
            List<FileItem> partes = upload.parseRequest(request);
            for(FileItem item : partes){
                File file = new File(ubicacionArchivo, item.getName());
                item.write(file);
                this.leerCSV(file);
            }
        } catch (Exception ex) {
            Logger.getLogger(SArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void leerCSV(File file){
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String reglon;
            while((reglon = br.readLine())!=null){
                this.asignacionBuses(reglon);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SArchivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void asignacionBuses(java.lang.String lnCSV) {
        com.webservice.WSEDD_Service service = new com.webservice.WSEDD_Service();
        com.webservice.WSEDD port = service.getWSEDDPort();
        port.asignacionBuses(lnCSV);
    }
    
    
}
