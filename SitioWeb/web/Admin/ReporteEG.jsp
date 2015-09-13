<%-- 
    Document   : ReporteEG
    Created on : 10/09/2015, 22:51:28
    Author     : walter
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="../WEB-INF/jspf/MasterStyle.jspf" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reporte EG</title>
    </head>
    <body>
        <div id ="page">
            <%@include file="../WEB-INF/jspf/header.jspf" %>
            <div id="mainarea">
                <%@include file="../WEB-INF/jspf/menuAdmin.jspf" %>
                <div id="contentarea">
                    <h3>Reporte Estación General</h3>
                    equilibrado a partir del id
                    <br>
                   <%-- start web service invocation --%><hr/>
                    <%
                        try {
                            com.webservice.WSEDD_Service service = new com.webservice.WSEDD_Service();
                            com.webservice.WSEDD port = service.getWSEDDPort();
                            // TODO process result here
                            java.lang.String result = port.graficarAVLEG();
                            out.println("<img src=\""+result+"\" alt=\"reporte estaciones generales\" width=\"600\"/>");
                        } catch (Exception ex) {
                            // TODO handle custom exceptions here
                        }
                    %>
                    <%-- end web service invocation --%><hr/> 
                </div>
            </div>
                <%@include file="../WEB-INF/jspf/Footer.jspf" %>
        </div>
    </body>
</html>
