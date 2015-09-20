<%-- 
    Document   : ReporteEC
    Created on : 11/09/2015, 00:39:56
    Author     : walter
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file = "../WEB-INF/jspf/vAdmin.jspf" %>
<%validarSesion(request.getSession(),response);%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="../WEB-INF/jspf/MasterStyle.jspf" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reporte Estaciones clave</title>
    </head>
    <body>
        <div id="page">
            <%@include file="../WEB-INF/jspf/header.jspf" %>
            <div id = "mainarea">
                <%@include file ="../WEB-INF/jspf/menuAdmin.jspf" %>
                <div id="contentarea">
                    <h3>
                        Reporte del Árbol de Estaciones Clave
                    </h3>
                    equilibrado por medio del id
                    <br>
                    <%-- start web service invocation --%><hr/>
                    <%
                        try {
                            com.webservice.WSEDD_Service service = new com.webservice.WSEDD_Service();
                            com.webservice.WSEDD port = service.getWSEDDPort();
                            // TODO process result here
                            java.lang.String result = port.graficarAVLEC();
                            out.println("<img src=\""+result+"\" alt=\"reporte estacion clave\" width=\"600\" />");
                        } catch (Exception ex) {
                            // TODO handle custom exceptions here
                        }
                    %>
                    <%-- end web service invocation --%><hr/>
                </div>
            </div>
                <%@include file="../WEB-INF/jspf/Footer.jspf" %>
        </div>
    </body>
</html>
