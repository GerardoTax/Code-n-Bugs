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
         <div class="d-flex">
            <div class="col-sm-8">
                <form action="/ControladorConsulta" method="post">                 
                   <table class="table table-success table-striped">
                        <thead>
                        <h2 align="center" > Consulta de informacion de Muebles </h2>
                        <div align="center">
                            <button  type="submit" value="menormueble" name="accion"class="btn btn-primary">Mayor a Menor</button>
                            <button  type="submit" value="mayormueble" name="accion"class="btn btn-secondary">Menor a Mayor</button> 

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
                                           ArrayList<Mueble> list=(ArrayList<Mueble>) request.getAttribute("listamueble");
                                           for(Mueble mueble: list ){

                                %>
                                <td><%= mueble.getMueblesDisponibles() %></td>
                                <td><%= mueble.getNombre() %></td>
                                <td>Q<%=mueble.getPrecio() %></td> 
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
