package com.logica;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.users.Admin;
import com.webservice.Administrador;
import java.io.IOException;
//import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author walter
 */
@WebServlet(urlPatterns = {"/LogAdmin"})
public class LogAdmin extends HttpServlet {
    private boolean log;
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
        //response.setContentType("text/html;charset=UTF-8");
//        String nameAdmin = request.getParameter("txtMail");
//        String passAdmin = request.getParameter("txtPass");
//        if(nameAdmin.isEmpty() && passAdmin.isEmpty()){
//            System.out.println("vacios");
//        }
        
        
      //  response.sendRedirect("/SitioWeb/Admin/.jsp");
        
       // System.out.println("processRequest");
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
        
        //processRequest(request, response);
        
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
//        processRequest(request, response);
//        response.encodeRedirectURL("Admin.jsp");
//        System.out.println("doPost");
        HttpSession sesion = request.getSession();
        String correo = request.getParameter("txtMail");
        String password = request.getParameter("txtPass");
        if(login(correo,password)){
            log = true;
            //tentativamente esto funcione para las demas
            sesion.setAttribute("usuario", new Admin(correo));
            response.sendRedirect("/SitioWeb/Admin/AgregarAdministrador.jsp");
        }else{
            log = false;
            response.sendRedirect("/SitioWeb/Home.jsp");
        }
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
    
//no es aplicable este metodo
//    private static void agregarAdministrador(java.lang.String correoAdmo, java.lang.String passAdmo) {
//        com.webservice.WSEDD_Service service = new com.webservice.WSEDD_Service();
//        com.webservice.WSEDD port = service.getWSEDDPort();
//        port.agregarAdministrador(correoAdmo, passAdmo);
//    }
//    

    private Administrador logAdmin(java.lang.String lcorreoAdmin) {
        com.webservice.WSEDD_Service service = new com.webservice.WSEDD_Service();
        com.webservice.WSEDD port = service.getWSEDDPort();
        return port.logAdmin(lcorreoAdmin);
    }

    private boolean login(String correo, String password){
        boolean aux = false;
        Administrador auxA = this.logAdmin(correo);
        System.out.println(auxA);
        if(auxA!=null){
            if(password.equals(auxA.getContrasenha()))
                aux = true;
        }
        
        return aux;
    }
    
}
