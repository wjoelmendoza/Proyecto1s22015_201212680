<%-- 
    Document   : bienvenido
    Created on : 20/09/2015, 11:52:43
    Author     : walter
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../WEB-INF/jspf/vChofer.jspf"%>
<%validarSesion(request.getSession(),response);%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="../WEB-INF/jspf/MasterStyle.jspf"%>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bienvenido</title>
    </head>
    <body>
        <div id="page">
            <%@include file="../WEB-INF/jspf/header.jspf"%>
            <div id="mainarea">
                <div id="sidebar">
                    <div id="sidebarnav">
                        <a href="/SitioWeb/Salir">Salir</a>
                    </div>
                </div>
                <div id = "contentarea">
                    Hola a ingresado como un usuario tipo chofer
                </div>
                
            </div>
            <%@include file="../WEB-INF/jspf/Footer.jspf" %>
        </div>
    </body>
</html>
