<%-- 
    Document   : EmsamblarMueble
    Created on : 27/08/2021, 12:32:28 AM
    Author     : dell
--%>

<%@page import="Modelo.EnsamblePiezas"%>
<%@page import="DB.MuebleDB"%>
<%@page import="Modelo.Mueble"%>
<%@page import="Modelo.Mueble"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
     
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <jsp:include page="/Recursos/PaquetesLinck.jsp" />
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Bien venido a !</h1>
        <div class="d-flex">
             
            <div class="card col-sm-4">
                <form class="form-sign" action="ControladorEnsamblar" method="post">
                    <div class="mb-3">
                      <label for="exampleInputEmail1" class="form-label">Muble a enzamblar</label>
                       <div>
                           <select name="mueble" class="custom-select custom-select-lg mb-3">
                           <%  try{
                                    ArrayList<Mueble> lista= MuebleDB.obtenerMueble();
                                    for(Mueble mueble: lista){ 
                               %>
                            
                                <option value="<%= mueble.getNombre() %>" name="muebleEnsamblar"> <%= mueble.getNombre() %></option>
                                <%
                                }}catch(Exception e){} 
                            %>
                            </select>
                            <div>
                                <label> Usuario</label>
                                <%
                                    String usu =request.getParameter("valor");
                                    
                                    %>
                                    <label name="nombreUsuario" value="<%= usu%>" class=" form-control">${t}</label>
                                    <input required type="text" value="<%= usu%>" name="p" class=" form-control">
                                    
                                    
                            </div>
                            
                            <div>
                                 
                                 <input type="date" name="fecha" min="2018-03-25" max="2018-05-25" step="2"/>
                            </div>     

                                 
                            </div>
                        </div>  
                            <button  type="submit" value="buscar" name="accion"class="btn btn-primary">Bucar piezas necesarias</button>
                            <button  type="submit" value="guardar" name="accion"class="btn btn-primary">Ensamblar mueble</button>
                  </form>
                <div> 
                    <br>
                     <table class="table table-success table-striped">
                        <thead>
                          <tr>
                            <th scope="col">Mueble a ensamblar</th>
                            <th scope="col">piezas necesarias</th>
                            <th scope="col">cantidad de piezas necesarias</th>
                          </tr>
                        </thead>
                        <%
                            try{ 
                            ArrayList<EnsamblePiezas> list=(ArrayList<EnsamblePiezas>) request.getAttribute("lista");
                             for(EnsamblePiezas ensable: list )
                             {
                            %>
                        <tbody>
                          <tr>
                            <td><%= ensable.getNombreMueble() %></td>
                            <td value="<%=ensable.getPieza()%>" name="pieza" ><%=ensable.getPieza()%></td>
                            <td value="<%=ensable.getCantidad()%>"><%=ensable.getCantidad()%></td>
                          </tr>
                          <%
                              }
                            } catch(Exception e){
                            }

                          %>
                        </tbody>
                    </table>
                </div>
            </div>
            </div>
        </div>            
    </body>

</html>
