<%-- 
    Document   : AddBus
    Created on : 08/09/2015, 23:33:43
    Author     : walter
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
    <head>
        <%@include file="../WEB-INF/jspf/MasterStyle.jspf" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Buses</title>
    </head>
    <body>
        <div id="page">
            <%@include file="../WEB-INF/jspf/header.jspf" %>
            <div id="mainarea">
                <%@include file ="../WEB-INF/jspf/menuAdmin.jspf" %>
                <div id="contentarea">
                    <br>
                    <br>
                    <br>
                    <h2>Ingrese el id del nuevo bus</h2>
                    <form method="post" action="/SitioWeb/AddBus">
                        <table border="0" cellpadding="5">
                            <thead>
                                <tr>
                                    <th></th>
                                    <th></th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>
                                        Ingrese el Id:
                                    </td>
                                    <td>
                                        <input name="txtIdBus" type="text" required placeholder="idBus" >
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        
                                    </td>
                                    <td>
                                        <input type="reset" value="Cancelar">
                                        <input type="submit" value="Aceptar" >
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    </form>
                    <br>
                    <br>
                    <br>
                </div>
            </div>
                <%@include file="../WEB-INF/jspf/Footer.jspf" %>
        </div>
                
    </body>
</html>