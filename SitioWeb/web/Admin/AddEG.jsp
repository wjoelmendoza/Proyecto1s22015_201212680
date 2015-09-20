<%-- 
    Document   : AddEG
    Created on : 2/09/2015, 10:53:53 PM
    Author     : walter
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file = "../WEB-INF/jspf/vAdmin.jspf" %>
<%validarSesion(request.getSession(),response);%>
<!DOCTYPE html>
<html xmlns:h="http://java.sun.com/jsf/html" xmlns:f="http://java.sun.com/jsf/core">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="../WEB-INF/jspf/MasterStyle.jspf" %>
        <title>Agregar Estación General</title>
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
                <h3> Ingrese  todos los datos que a continuación se le solicitan para poder crear una estación General</h3>
                <form action="/SitioWeb/AddEG" method="POST">
                    <table border="0" cellpadding="5">
                        <thead>
                            <tr>
                                <th></th>
                                <th></th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>Ingrese el ID:</td>
                                <td><input name="idEG" type="number" required/></td>
                            </tr>
                            <tr>
                                <td>Ingrese el Nombre:</td>
                                <td><input name="nombreEG" required type="text" placeholder="Centro Historico" /> </td>
                            </tr>
                            <tr>
                                <td>Ingrese contraseña:</td>
                                <td><input name="contraEG" required type="password" placeholder="123456"/></td>
                            </tr>
                            <tr>
                                <td>Confirme contraseña:</td>
                                <td><input name="confEG" required type="password" placeHolder="123456"/></td>
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
