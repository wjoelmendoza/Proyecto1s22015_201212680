<%-- 
    Document   : LogEC
    Created on : 20/09/2015, 14:56:19
    Author     : walter
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="/WEB-INF/jspf/MaStL.jspf" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Estación Clave</title>
    </head>
    <body>
        <div id="page">
            <%@include file="/WEB-INF/jspf/header.jspf" %>
            <div id="mainarea">
                <%@include file="/WEB-INF/jspf/MasIn.jspf" %>
                <div id="contentarea">
                    <br>
                    <br>
                    <br>
                    <br>
                    <h3>Ingrese los datos correspondientes para ingresar como Estación Clave:</h3>
                    <form method="post" action="/SitioWeb/LogEC">
                        <table>
                            <tr>
                                <td>Ingrese su Id:</td>
                                <td><input name="idEC" type="number" min="0" placeholder="00000" required /></td>
                            </tr>
                            <tr>
                                <td>Ingrese su Contraseña:</td>
                                <td><input name="passwordEC" type="password" placeholder="123456" required/></td>
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
                </div>
            </div>
                <%@include file="/WEB-INF/jspf/Footer.jspf" %>
        </div>
    </body>
</html>
