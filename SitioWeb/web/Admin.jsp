<%-- 
    Document   : Admin
    Created on : 31/08/2015, 11:33:20 PM
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
        
        
        <form action="LogAdmin" method="post">
            <input name="txtMail" type="email" required="true" /><br/>
            <input name="txtPass" type="password" required="true"/><br/>
            <input type="submit" value="Hecho" /><br/>
            <input type="reset" value="Cancelar"/><br/>
        </form>
    
    <%-- start web service invocation --%><hr/>
    <%
    try {
	com.webservice.WSEDD_Service service = new com.webservice.WSEDD_Service();
	com.webservice.WSEDD port = service.getWSEDDPort();
	 // TODO initialize WS operation arguments here
	java.lang.String name = "";
	// TODO process result here
	java.lang.String result = port.hello(name);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    </body>
</html>
