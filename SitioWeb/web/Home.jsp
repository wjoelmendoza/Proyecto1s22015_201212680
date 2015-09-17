<%-- 
    Document   : Home
    Created on : 28/08/2015, 12:21:00 AM
    Author     : walter
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="/WEB-INF/jspf/MaStL.jspf" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <div id="page">
            <%@include file= "../WEB-INF/jspf/header.jspf" %>
            <div id="mainarea">
                <%@include file="/WEB-INF/jspf/MasIn.jspf" %>
               
            <div id="contentarea" >
                <br>
                <br>
                <br>
                <br>
                <br>
                <br>
                <br>
                <br>
                <br>
                <br>
                <br>
            <h3>Ingrese los datos Correspondientes para ingresar como un administrador:</h3>
            <form method="post" action="/SitioWeb/LogAdmin">
                <table>
                    <tr>
                        <td>Correo:</td>
                        <td><input name="txtMail" type="email" required/></td>
                    </tr>
                    <tr>
                        <td>Ingrese su Contraseña:</td>
                        <td><input name="txtPass" type="password" required/></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="reset" value="Cancelar" />
                        <input type="submit" value="Aceptar"/></td>
                    </tr>
                </table>
            </form>
             <br>
                <br>
                <br>
                <br>
                <br>
                <br>
                <br>
                <br>
                <br>
                <br>
                <br>
        </div>
               
            </div>
        <%@include file="../WEB-INF/jspf/Footer.jspf" %>
        </div>
    </body>
</html>
