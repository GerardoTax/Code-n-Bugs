<%-- 
    Document   : Consulta
    Created on : 27/08/2021, 01:24:15 AM
    Author     : dell
--%>

<%@page import="DB.GenericaDB"%>
<%@page import="Modelo.PiezasMadera"%>
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
            <th scope="col">Productos en existencia </th>
            <th scope="col">Tipo de  pieza</th>
            <th scope="col">Precio por unidad </th>
        </tr>
        </thead>
        <tbody>
             <tr>
                <% 
                    ArrayList<PiezasMadera> list; 
                    PiezasMadera pieza=new PiezasMadera();
                    GenericaDB<PiezasMadera> listaPiezas= new GenericaDB<PiezasMadera>();
                    list= (ArrayList<PiezasMadera>) listaPiezas.selectRows("SELECT* FROM materia_prima", pieza.getClass(),"PIEZA");

                    for( PiezasMadera piezasMadera: list){
                %>
                 <td><%= piezasMadera.getCanidad() %></td>
                <td><%= piezasMadera.getTipo() %></td>
                 <td>Q<%=piezasMadera.getPrecio() %></td> 
                 
            </tr>
                <%
                     }
                %>
               
        </tbody>
    </table>
                    
                </div>
    </body>
</html>
