<%-- 
    Document   : Piezas
    Created on : 27/08/2021, 01:24:47 AM
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
        <title>Piezas</title>
    </head>
    <jsp:include page="/Recursos/PaquetesLinck.jsp" />
    <body>
            <div class="d-flex">
                <div class="card col-sm-4">
                    <form class="form-sign" action="ControladorPiezas" method="POST" style="border: none">
                        <div class="form-group text-center">
                            <br>
                            <h3>Crear Pieza</h3>
                            <img src="../Imagenes/mesaMadera.jpg" width="140" height="120"/>
                        </div>
                        <div class="form-group">
                            <label>Tipo</label>
                            <input required type="text"  value="${llenar.getTipo()}" name="tipoPieza" class=" form-control">
                        </div>
                        <div class="form-group">
                             <label>Costo por unidad</label>
                            <input required type="text" value="${llenar.getPrecio()}" name="costoUnidad" class=" form-control">            
                            
                        </div>
                        
                        <div class="form-group">
                             <label>Cantidad de piezas </label>
                            <input required type="text" value="${llenar.getCanidad()}" name="cantidadUnidad" class=" form-control">            
                        </div>
                        <div class="d-grid gap-2">
                            <input type="submit" name="buton" value="Guardar"  class="btn btn-secondary btn-block">
                            <input type="submit" name="buton" value="Actualizar"  class="btn btn-primary btn-block">
                        </div>
                    </form>
                </div>
                <div class="col-sm-8">
                    
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

                    for( PiezasMadera piezasMadera: list){
                %>
                 <td><%= piezasMadera.getCanidad() %></td>
                <td><%= piezasMadera.getTipo() %></td>
                 <td>Q<%=piezasMadera.getPrecio() %></td> 
                 <th> <a class="btn btn-outline-secondary" href="ControladorPiezas?menu=Editar&variable=<%=piezasMadera.getTipo()%>">Editar</th>
                <th> <a class="btn btn-outline-secondary" href="ControladorPiezas?menu=Eliminar&id=<%=piezasMadera.getTipo()%>">Eliminar</th>
            </tr>
                <%
                     }
                %>
               
        </tbody>
    </table>
                    
                </div>
                
        </div>
        
    </body>
</html>
