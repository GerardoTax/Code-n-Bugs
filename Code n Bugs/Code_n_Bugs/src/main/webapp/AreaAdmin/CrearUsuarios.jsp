<%-- 
    Document   : CrearUsuarios
    Created on : 2/09/2021, 10:47:22 PM
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
     <jsp:include page="/Recursos/PaquetesLinck.jsp" />
    <body> 
       
        <div class="container mt-4 col-lg-4">
            <div class="card col-sm-10">
                <div class="card-body">
                    <form class="form-sign" action="Validar" method="POST">
                        <div class="form-group text-center">
                            <h3>Crear Usuario</h3>
                            <img src="Imagenes/iconoUsuario.png"  width="140" height="120"/>
                        </div>
                        <div class="form-group">
                            <label>Usuario</label>
                            <input required type="text" name="usuarioCrear" class=" form-control">
                        </div>
                        <div class="form-group">
                             <label>Contraseña</label>
                            <input required type="text" name="claveCrear" class=" form-control">            
                            
                        </div>
                        <div>
                            <label>Area en la que Pertenece</label>
                            <select name="tipoCrear" class="custom-select custom-select-lg mb-3">
                                <option value="1">Fabrica</option>
                                <option value="2">Ventas</option>
                                <option value="3">Administracion</option>
                            </select>
                        </div>  
                        <div class="d-grid gap-2">
                        <input type="submit" name="buton" value="Crear Usuario" class="btn btn-secondary btn-block">
                        </div>
                    </form>
                </div>
            </div>
        </div> 
        </div>
       
   
    </body>
</html>
