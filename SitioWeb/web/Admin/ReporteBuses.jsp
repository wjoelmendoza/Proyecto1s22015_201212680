<%-- 
    Document   : ReporteBuses
    Created on : 08/09/2015, 22:11:07
    Author     : walter
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file = "../WEB-INF/jspf/vAdmin.jspf" %>
<%validarSesion(request.getSession(),response);%>
<!DOCTYPE html>
    <head>
        <%@include file="../WEB-INF/jspf/MasterStyle.jspf" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reporte Buses</title>
    </head>
    <body>
        <div id="page">
            <%@include file="../WEB-INF/jspf/header.jspf" %>
            <div id="mainarea">
                <%@include file ="../WEB-INF/jspf/menuAdmin.jspf" %>
                <div id="contentarea">
                    <h3>Reporte del listado de Buses</h3>
                    <form method="post" action="/SitioWeb/OrdenBuses">
                        <table cellpadding="5">
                            <tr>
                                <td>Para ordenar los datos<br>pulse el botón:</td>
                                <td><input type="submit" value="Ordenar" ></td>
                            </tr>
                        </table>
                    </form>
                    
                    <br><hr/>
                    
                        <%
                            try {
                                com.webservice.WSEDD_Service service = new com.webservice.WSEDD_Service();
                                com.webservice.WSEDD port = service.getWSEDDPort();
                                // TODO initialize WS operation arguments here
                                java.lang.String parameter = "";
                                // TODO process result here
                                java.lang.String result = port.grafListaBuses(parameter);
                                out.println("<img src=\""+result +"\" alt=\"reporte\" width=\"600\" />");
                            } catch (Exception ex) {
                                // TODO handle custom exceptions here
                                out.println("No Image");
                            }
                            %><hr/>
                </div>
            </div>
                <%@include file="../WEB-INF/jspf/Footer.jspf" %>
        </div>
    </body>
</html>
