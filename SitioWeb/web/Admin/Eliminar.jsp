<%-- 
    Document   : Eliminar
    Created on : 11/09/2015, 22:17:48
    Author     : walter
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="../WEB-INF/jspf/MasterStyle.jspf" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Eliminar Cuentas</title>
    </head>
    <body>
        <div id ="page">
            <%@include file= "../WEB-INF/jspf/header.jspf" %>
            <div id="mainarea">
                <%@include file="../WEB-INF/jspf/menuAdmin.jspf" %>
                <div id="contentarea" >
                    <h4>La eliminación solamente se realiza una a la vez y es aquella donde se ingresa el dato y se presiona el botón eliminar correspondiente</h4>
                    <hr>
                    <h3>Eliminar Administrador</h3>
                    <form method="post" action="/SitioWeb/EliminarAdmin">
                        <table cellpadding="5">
                            <tr>
                                <td>
                                    Ingrese el correo del<br>
                                    administrador:
                                </td>
                                <td>
                                    <input name="correoAdmin" type="email" required placeholder="admin@admin.com" >
                                </td>
                            </tr>
                            <tr>
                                <td></td>
                                <td>
                                    <input type="reset" value="Cancelar">
                                    <input type="submit" value="Eliminar">
                                </td>
                            </tr>
                        </table>
                    </form>
                    <hr>
                    <h3>Eliminar Bus</h3>
                    <form method="post" >
                        <table cellpadding="5">
                            <tr>
                                <td>
                                    Ingrese el correo del<br>
                                    administrador:
                                </td>
                                <td>
                                    <input type="email" required placeholder="pendiente" >
                                </td>
                            </tr>
                            <tr>
                                <td></td>
                                <td>
                                    <input type="reset" value="Cancelar">
                                    <input type="submit" value="Eliminar">
                                </td>
                            </tr>
                        </table>
                    </form>
                    <hr>
                    <h3>Eliminar Chofer</h3>
                    <form method="post" action="/SitioWeb/EliminarChofer">
                        <table cellpadding="5">
                            <tr>
                                <td>
                                    Ingrese la clave del<br>chofer:
                                </td>
                                <td>
                                    <input name="claveC" type="number" required placeholder="2570" min="0" >
                                </td>
                            </tr>
                            <tr>
                                <td></td>
                                <td>
                                    <input type="reset" value="Cancelar">
                                    <input type="submit" value="Eliminar">
                                </td>
                            </tr>
                        </table>
                    </form>
                    <hr>
                    <h3>Eliminar Estación Clave</h3>
                    <form method="post" action="/SitioWeb/EliminarEC">
                        <table cellpadding="5">
                            <tr>
                                <td>
                                    Ingrese el id de la<br>Estación clave:
                                </td>
                                <td>
                                    <input name="idEC" type="number" required placeholder="2009" min="0" >
                                </td>
                            </tr>
                            <tr>
                                <td></td>
                                <td>
                                    <input type="reset" value="Cancelar">
                                    <input type="submit" value="Eliminar">
                                </td>
                            </tr>
                        </table>
                    </form>
                    <hr>
                    <h3>Eliminar Estación General</h3>
                    <form method="post" action="/SitioWeb/EliminarEG">
                        <table cellpadding="5">
                            <tr>
                                <td>
                                    Ingrese el id de la<br>Estación General:
                                </td>
                                <td>
                                    <input name="idEG" type="number" required placeholder="2015" min="0" >
                                </td>
                            </tr>
                            <tr>
                                <td></td>
                                <td>
                                    <input type="reset" value="Cancelar">
                                    <input type="submit" value="Eliminar">
                                </td>
                            </tr>
                        </table>
                    </form>
                    <hr>
                </div>
            </div>
                <%@include file="../WEB-INF/jspf/Footer.jspf" %>
        </div>
    </body>
</html>
