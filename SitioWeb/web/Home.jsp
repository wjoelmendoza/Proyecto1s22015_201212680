<%-- 
    Document   : Home
    Created on : 28/08/2015, 12:21:00 AM
    Author     : walter
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="" method="post">
        <table>
            <tr>
                <td><label id="lbl1">Ingrese su correo Electrónico:</label></td>
                <td><input type="email" required="true" placeHolder="correo@dominio.com" name="correo"  ></td>
            </tr>
            <tr>
                <td><label id="lbl2">Ingrese su Contraseña:</label></td>
                <td><input type="password" required="true" name="contrasena"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Ingresar"/></td>
            </tr>
        </table>
    </form>
    
    </body>
</html>
