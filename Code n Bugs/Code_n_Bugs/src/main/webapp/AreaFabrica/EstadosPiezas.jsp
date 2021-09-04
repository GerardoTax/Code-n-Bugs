<%-- 
    Document   : EstadosPiezas
    Created on : 2/09/2021, 08:58:06 AM
    Author     : dell
--%>

<%@page import="DB.GenericaDB"%>
<%@page import="Modelo.PiezasMadera"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
     <jsp:include page="/Recursos/PaquetesLinck.jsp" />
     <body>
         <div class="d-flex">
              <div>
                  <img src="../Imagenes/mesaMadera.jpg" alt=""/>
              </div>
             <div class="col-sm-8">
                 <div>
                     <h2 align="center" > Seguimiento de piezas</h2> 
                     <h2 align="center"> Agotas o apunto de Agotarse</h2>
                 </div>
                 <table class="table table-warning table-striped">
                        <thead>
                          <tr>
                            <th scope="col">Cantidad</th>
                            <th scope="col">Nombre de Pieza</th>
                            <th scope="col">Estado</th>
                          </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <% 
                                    ArrayList<PiezasMadera> list; 
                                    PiezasMadera pieza=new PiezasMadera();
                                    GenericaDB<PiezasMadera> listaPiezas= new GenericaDB<PiezasMadera>();
                                    String q="SELECT*  FROM materia_prima WHERE cantidad=(SELECT Min(cantidad)  FROM materia_prima)";
                                    list= (ArrayList<PiezasMadera>) listaPiezas.selectRows(q, pieza.getClass(),"PIEZA");

                                    for( PiezasMadera piezasMadera: list){
                                %>
                                 <td><%= piezasMadera.getCanidad() %></td>
                                 <td><%= piezasMadera.getTipo() %></td>
                                 <%
                                     if(piezasMadera.getCanidad()==0){
                                    
                                        out.print("<td>Agotado </td>");
                                    }
                                    else out.print("<td>Existencia</td>");
                                    
                                 %>
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
