<%-- 
    Document   : CrearMubles
    Created on : 4/09/2021, 08:13:59 PM
    Author     : dell
--%>

<%@page import="DB.GenericaDB"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Modelo.PiezasMadera"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <jsp:include page="/Recursos/PaquetesLinck.jsp" />
    </head>
    <body>
        <form class="row g-3 needs-validation" novalidate>
            <div class="col-md-4">
              <label for="validationCustom01" class="form-label">Nombre del mueble</label>
              <input type="text" class="form-control" id="validationCustom01">
              
            </div>
            <div class="col-md-3">
              <label for="validationCustom02" class="form-label">Precio de venta del mueble</label>
              <input type="text" class="form-control" id="validationCustom02" >
            </div>
           
            <div class="col-md-6">
              <label for="validationCustom03" class="form-label">Piezas a eligir</label>
              <select name="mueble" class="custom-select custom-select-lg mb-3">
                           <%  try{
                                    ArrayList<PiezasMadera> list;
                                    PiezasMadera nuevasPiezas = new PiezasMadera();
                                    GenericaDB<PiezasMadera> tmp= new GenericaDB<PiezasMadera>(); 
                                    list = (ArrayList<PiezasMadera>) tmp.selectRows("SELECT* FROM materia_prima",nuevasPiezas.getClass(),"PIEZA");
                                    for(PiezasMadera piezasMadera: list){ 
                               %>
                                <option value="<%=piezasMadera.getTipo()%>" name="muebleEnsamblar"><%=piezasMadera.getTipo()%></option>
                                <%
                                }}catch(Exception e){} 
                            %>
              </select>
              
            </div>
            <div class="col-md-3">
              <label for="validationCustom05" class="form-label">Cantidad de piezas a utilizar</label>
              <input type="text" class="form-control" id="validationCustom05" required>
            </div>
            
            <div class="col-12">
                <br><br>
              <button class="btn btn-primary" type="submit">Crear modelo de mueble</button>
            </div>
          </form>
    </body>
</html>
