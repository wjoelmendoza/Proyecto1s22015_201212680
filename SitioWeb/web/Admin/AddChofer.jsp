<%-- 
    Document   : AddChofer
    Created on : 3/09/2015, 02:11:08 AM
    Author     : walter
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns:h="http://java.sun.com/jsf/html" xmlns:f="http://java.sun.com/jsf/core">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="../WEB-INF/jspf/MasterStyle.jspf" %>
        <title>Agregar Chofer</title>
    </head>
    <body>
        <div id="page">
            <%@include file= "../WEB-INF/jspf/header.jspf" %>
            <div id="mainarea">
                <%@include file="../WEB-INF/jspf/menuAdmin.jspf" %>
            <div id="contentarea">
                <br>
                <br>
                <br>
                <br>
                <br>
                <br>
                <br>
                <br>
                <h3> Ingrese  todos los datos que a continuación se le solicitan para poder registrar al nuevo chofer</h3>
                <form action="/AddChofer" method="POST">
                    <table border="0" cellpadding="5">
                        <thead>
                            <tr>
                                <th></th>
                                <th></th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>Ingrese Nombre:</td>
                                <td><input name="txtNombre" type="text" required="true" min="0" width="200px" placeholder="Walter Joel"/></td>
                            </tr>
                            <tr>
                                <td>Ingrese el Apellido:</td>
                                <td><input name="txtApellido" required="true" type="text" width="200px" placeholder="Mendoza Chiguichón" /> </td>
                            </tr>
                            <tr>
                                <td>Ingrese la clave:</td>
                                <td><input name="txtClave" required="true" type="number" placeholder="555"></td>
                            </tr>
                            <tr>
                                <td>Ingrese contraseña:</td>
                                <td><input name="contraEG" required="true" type="password" width="200px" placeholder="123456"/></td>
                            </tr>
                            <tr>
                                <td>Confirme contraseña:</td>
                                <td><input name="confEG" required="true" type="password" placeHolder="123456"/></td>
                            </tr>
                            <tr>
                                <td></td>   
                                <td><input type="reset" value="Cancelar" /><input type="submit" value="Aceptar"></td>
                            </tr>
                        </tbody>
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
            </div>
            </div>
                <%@include file="../WEB-INF/jspf/Footer.jspf"  %>
        </div>
    </body>
</html>
</html>
