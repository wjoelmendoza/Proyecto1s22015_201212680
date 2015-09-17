<%-- 
    Document   : CargarArchivo
    Created on : 13/09/2015, 01:06:03
    Author     : walter
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="../WEB-INF/jspf/MasterStyle.jspf" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cargar datos</title>
    </head>
    <body>
        <div id="page">
            <%@include file="../WEB-INF/jspf/header.jspf" %>
            <div id ="mainarea">
                <%@include file="../WEB-INF/jspf/menuAdmin.jspf" %>
                <div id="contentarea">
                    <h3>En esta pagina podrá cargar un archivo csv e ingresar los datos de forma masiva</h3>
                    <form method="post" action="/SitioWeb/SArchivo" enctype="multipart/form-data" >
                        <input name="file" type="file" accept=".csv"> <br><br>
                        <input type="submit" value="Subir Archivo">
                    </form>
                </div>
            </div>
                <%@include file="../WEB-INF/jspf/Footer.jspf" %>
        </div>
    </body>
</html>
