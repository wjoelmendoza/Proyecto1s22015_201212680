<%-- 
    Document   : CargaArchivo
    Created on : 1/09/2015, 10:34:41 PM
    Author     : walter
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file = "../WEB-INF/jspf/vAdmin.jspf" %>
<%validarSesion(request.getSession(),response);%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>File Upload</title>
    </head>
    <body>
        Select a file to upload: <br/>
        <form action="UploadServlet" method="post" enctype="multipart/form-data" >
            <input type="file" name="file" size="50"/>
            <br/>
            <input type="submit" value="UploadFile" />
        </form>
    </body>
</html>
