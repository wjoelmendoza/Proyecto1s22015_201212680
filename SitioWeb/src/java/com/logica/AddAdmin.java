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

/**
 *
 * @author walter
 */
@WebServlet(name = "AddAdmin", urlPatterns = {"/AddAdmin"})
public class AddAdmin extends HttpServlet {

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

        
        response.sendRedirect("/SitioWeb/Admin/AgregarAdministrador.jsp");
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
        this.processRequest(request, response);
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
        processRequest(request, response);
        String correoAdmin = request.getParameter("txtMail");
        String contra = request.getParameter("txtPass");
        String rContra = request.getParameter("txtRPass");
        if(!correoAdmin.isEmpty()&&!contra.isEmpty()&&!rContra.isEmpty()){
            if(contra.equals(rContra)){
                agregarAdministrador(correoAdmin, contra);
            }
        }
       // chequear como hacer para retornar el error en caso que las contraseñas no coincidan
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

    private void agregarAdministrador(java.lang.String correoAdmo, java.lang.String passAdmo) {
        com.webservice.WSEDD_Service service = new com.webservice.WSEDD_Service();
        com.webservice.WSEDD port = service.getWSEDDPort();
        port.agregarAdministrador(correoAdmo, passAdmo);
    }

    
}
