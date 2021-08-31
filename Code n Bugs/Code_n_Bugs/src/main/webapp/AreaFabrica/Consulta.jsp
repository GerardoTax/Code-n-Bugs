<%-- 
    Document   : Consulta
    Created on : 27/08/2021, 01:24:15 AM
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <jsp:include page="/Recursos/PaquetesLinck.jsp"/>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <%
                            
                        for (int i=0; i<10; i++) {
                                out.print("Id:" );
                                out.print("<br />");
                                //out.print("<a href='DetailsServlet?id=""'>");
                                out.print("Resultado: " );
                                out.print("<a />");
                                out.print("<br />");
                                out.print("<br />");
                            }
                    %>
                </div>
            </div>
            
        </div>
    </body>
</html>
