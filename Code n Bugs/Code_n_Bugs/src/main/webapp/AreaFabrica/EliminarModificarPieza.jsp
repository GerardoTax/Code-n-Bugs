<%-- 
    Document   : EliminarModificarPieza
    Created on : 31/08/2021, 01:23:17 AM
    Author     : dell
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="DB.GenericaDB"%>
<%@page import="Modelo.PiezasMadera"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <jsp:include page="/Recursos/PaquetesLinck.jsp"/>
    <table class="table table-success table-striped">
        <thead>
        <h2 align="center" > Eliminar y Modificar Piezas </h2>
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

                    for(int i=0;i<list.size();i++){
                %>
                 <td><%=list.get(i).getCanidad()%></td>
                <td><%=list.get(i).getTipo()%></td>
                 <td>Q<%=list.get(i).getPrecio()%></td> 
                <th <button type="button" value="${list.get(i).getTipo()}"  name="Editar"  class="btn btn-secondary btn-lg">Editar</button></th>
                <th> <a class="btn btn-outline-secondary" href=ControladorPiezas?menu=p" >Eliminar</th>
            </tr>
                <%
                     }
                %>
               
        </tbody>
    </table>
</html>







