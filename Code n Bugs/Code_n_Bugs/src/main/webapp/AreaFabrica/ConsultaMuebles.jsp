<%-- 
    Document   : ConsultaMuebles
    Created on : 1/09/2021, 12:20:19 PM
    Author     : dell
--%>

<%@page import="DB.MuebleDB"%>
<%@page import="Modelo.Mueble"%>
<%@page import="Modelo.Mueble"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <jsp:include page="/Recursos/PaquetesLinck.jsp"/>
    <body>
         <div class="col-sm-8">
                    
                     <table class="table table-success table-striped">
        <thead>
        <h2 align="center" > Consulta de tabla </h2>
        <div align="center">
        <a class="btn btn-outline-secondary" href="#">Ordenar de mayor a menor</a>
        <a class="btn btn-outline-secondary" href="#">Ordenar de menor a mayor</a>
        <div>
            
        </div>
        </div>
        <tr>
            <th scope="col">Mueble </th>
            <th scope="col">otros</th>
            <th scope="col">Precio por unidad </th>
        </tr>
        </thead>
        <tbody>
             <tr>
                <%
                try{
                ArrayList<Mueble> lista= MuebleDB.obtenerMueble();
                for( Mueble mueble :lista){    
            %>  
                 <td><%= mueble.getNombre() %></td>
                 <td><%= mueble.getPrecio() %></td>
                 
            </tr>
                <%
                  }
                    }catch(Exception e){
                    }
                %>
               
        </tbody>
    </table>
                    
                </div>
    </body>
</html>
