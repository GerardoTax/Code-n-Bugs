<%-- 
    Document   : EmsamblarMueble
    Created on : 27/08/2021, 12:32:28 AM
    Author     : dell
--%>

<%@page import="Modelo.PiezasMadera"%>
<%@page import="Modelo.EnsamblePiezas"%>
<%@page import="DB.MuebleDB"%>
<%@page import="Modelo.Mueble"%>
<%@page import="Modelo.Mueble"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%                    //String b=request.getParameter("valor");
            String usu =request.getParameter("valor");
           // if(usu.equals(null)){
             //                         usu=b;
            //}  
                                 
                                
        %>
        <head>
     
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <jsp:include page="/Recursos/PaquetesLinck.jsp" />
        <title>JSP Page</title>
    </head>
    <body>
        

        <h1>Bien venido a !</h1>
         
                 
        <div class="d-flex">
             
                <div class="card col-4 sm-7">
                    <div>
                        <h2  >Ensamblar mueble</h2>
                    </div>
                    <div>
                        <labe>Usuario:</labe>
                        <input readonly=readonly required type="text" value="${usuarioCrear}" name="p" class=" form-control"><br>
                        <labe>Mueble a ensamblar</labe>
                        <input readonly=readonly required type="text" value="${selec}" name="p" class=" form-control"><br>
                        <labe>Fecha de ensamble:</labe><br><br>
                        <input type="date" name="fecha" min="2018-03-25" max="2025-05-25" step="2"/><br><br>
                        <button  type="submit" value="guardar" name="accion"class="btn btn-primary">Ensamblar mueble</button><br>
                        <%
                          try{ 
                            ArrayList<PiezasMadera> l=(ArrayList<PiezasMadera>) request.getAttribute("pita");
                             for(PiezasMadera nuPiezasMadera: l ){
                        %>
                        <input readonly=readonly required type="text" value="<%=nuPiezasMadera.getTipo() %>" name="p" class=" form-control"><br>
                        <%
                                }
                            }catch(Exception e){}
                            %>
                    </div>
                            
                            
                </div>   
                <div class="card col-sm-8">
                    <form class="row g-3" action="ControladorEnsamblar" method="post">
                        <br>
                        <div class="col-md-6">
                          <label for="inputEmail4" class="form-label">Mueble a ensamblar</label>
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
                        </div>
                        <div class="col-md-6">
                          <label for="inputPassword4" class="form-label">Usuario</label>
                          <input readonly=readonly required type="text" value="<%=usu%>" name="usuarioIngrese" class=" form-control">
                        </div>
                        <div class="col-12">
                            <label for="inputZip" class="form-label">Fecha: </label>
                            <input type="date" name="fecha" min="2018-03-25" max="2025-05-25" step="2"/><br><br>
                        </div>
                        <%
                            try{ 
                            ArrayList<EnsamblePiezas> list=(ArrayList<EnsamblePiezas>) request.getAttribute("lista");
                             for(EnsamblePiezas ensable: list )
                             {
                            %>
                        <div class="col-md-6">
                          <label for="inputCity" class="form-label">Piezas</label>
                          <input type="text" name="Piezas" value="<%= ensable.getPieza() %>" class="form-control" id="inputCity">
                        </div>
                        <div class="col-md-2">
                          <label for="inputState" class="form-label">Cantidad</label>
                          <input type="text" name="Cantidad" value="<%= ensable.getCantidad() %>" class="form-control" id="inputZip">
                        </div>
                        <div class="col-md-2">
                          <label for="inputZip" class="form-label">precio</label>
                          <input type="text" name="Precio" value="<%= ensable.getCantidad() %>" class="form-control" id="inputZip">
                        </div>
                        
                             <%
                              }
                            } catch(Exception e){
                            }

                          %>
                        <div class="col-12">
                            <br>
                          <button type="submit" value="buscar" name="accion" class="btn btn-primary">Bucar piezas</button>
                        </div>
                      </form>
            </div>
                        
            </div>
                
    </body>

</html>
