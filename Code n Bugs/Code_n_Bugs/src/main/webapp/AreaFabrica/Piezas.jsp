<%-- 
    Document   : Piezas
    Created on : 27/08/2021, 01:24:47 AM
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Piezas</title>
    </head>
    <jsp:include page="/Recursos/PaquetesLinck.jsp" />
    <body>
         <div class="container">
            <div class="row">
                <div class="col">
                    <form class="form-sign" action="ControladorPiezas" method="POST">
                        <div class="form-group text-center">
                            <br><br>
                            <h3>Crear Pieza</h3>
                            <label>Area de Fabrica</label>
                            
                        </div>
                        <div class="form-group">
                            <label>Tipo</label>
                            <input required type="text" name="tipoPieza" class=" form-control">
                        </div>
                        <div class="form-group">
                             <label>Costo por unidad</label>
                            <input required type="text" name="costoUnidad" class=" form-control">            
                            
                        </div>
                        
                        <div class="form-group">
                             <label>Cantidad de piezas </label>
                            <input required type="text" name="cantidadUnidad" class=" form-control">            
                        </div>
                        <div class="d-grid gap-2">
                            <input type="submit" name="buton" value="Guardar"  class="btn btn-secondary btn-block">
                        </div>
                    </form>
                </div>
                <div class="col order-5">
                    <br><br>
                    <img name="crearjpg" src="../Imagenes/Imagenes.jpg" ALIGN=LEFT WIDTH=400 HEIGHT=400/>
                </div>
                <div class="col order-1">
                    <form  >
                        <div class="form-group text-center">
                            <br><br>
                            <h3>Crear Pieza</h3>
                            <label>Area de Fabrica</label>
                            <a class="dropdown-item" href="#">${usuario.getUsuario()}</a>
                        </div>
                        
                    </form>
                </div>
             </div>
        </div>
        
    </body>
</html>
