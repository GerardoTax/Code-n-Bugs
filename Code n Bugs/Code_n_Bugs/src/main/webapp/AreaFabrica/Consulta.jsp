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
       <div class="d-flex">
            <div class="col-sm-8">
                <form action="/ControladorConsulta" method="post">                 
                   <table class="table table-success table-striped">
                        <thead>
                        <h2 align="center" > Consulta de informacion de Piezas </h2>
                        <div align="center">
                            <button  type="submit" value="menor" name="accion"class="btn btn-primary">Menor a Mayor</button>
                            <button  type="submit" value="mayor" name="accion"class="btn btn-secondary">Mayor a Menor</button> 

                            <br><br>
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
                                    try{
                                           ArrayList<PiezasMadera> list=(ArrayList<PiezasMadera>) request.getAttribute("lista");
                                           for(PiezasMadera piezasMadera: list ){

                                %>
                                <td><%= piezasMadera.getCanidad() %></td>
                                <td><%= piezasMadera.getTipo() %></td>
                                <td>Q<%=piezasMadera.getPrecio() %></td> 
                            </tr>
                                <%
                                            }
                                    }catch(Exception e){

                                    }
                                %>
                        </tbody>

                     </table>     
                </form>   
            </div>
            <div class="col-7 sm-5">
                <img src="../Imagenes/mesaMadera.jpg" alt=""/>
            </div>            
        </div>       
    </body>
</html>
