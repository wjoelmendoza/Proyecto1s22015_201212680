<%-- 
    Document   : LogChofer
    Created on : 20/09/2015, 12:58:46
    Author     : walter
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="/WEB-INF/jspf/MaStL.jspf" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Chofer</title>
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
                    <h3>Ingrese los datos correspondientes para ingresar como chofer:</h3>
                    <form method="post" action="/SitioWeb/LogChofer">
                        <table>
                            <tr>
                                <td>Ingrese su Clave:</td>
                                <td><input name="lClaveChofer" type="number" placeholder="0000" required /></td>
                            </tr>
                            <tr>
                                <td>Ingrese su Contraseña:</td>
                                <td><input name="lpassword" type="password" placeholder="123456" required/></td>
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
