<%-- 
    Document   : Administrativa
    Created on : 25/08/2021, 01:07:04 AM
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
     <jsp:include page="/Recursos/PaquetesLinck.jsp" />
    <body>
        
        <nav class="navbar navbar-expand-lg navbar-light bg-success">
            
            <div class="container-fluid">
              <a class="navbar-brand" href="Administrativa.jsp">AREA ADMINISTRATIVA</a>
              <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                  <li class="nav-item">
                    <a style="border: none " class="btn btn-outline-secondary" href="ControladorAdmin?accion=Crear" target="ventaFormularios">Consulta de compras </a>
                  </li>
                  <li class="nav-item">
                    <a style="border: none " class="btn btn-outline-secondary" href="ControladorAdmin?accion=CrearUsuario" target="ventaFor">Creacion de Usuario</a>
                  </li>
                  <li class="nav-item">
                    <a style="border: none " class="btn btn-outline-secondary" href="ControladorAdmin?accion=CrearMueble" target="ventaFor">Crear Muble</a>
                  </li>
                  <li class="nav-item">
                    <a style="border: none " class="btn btn-outline-secondary" href="ControladorAdmin?accion=CargaArchivo" target="ventaFor" >Carga de archivo</a>
                  </li>
                  <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="#">Consulta de ventas</a>
                  </li>
                  
                  
                </ul>
              </div>
              <div class="btn-group text-center" role="group"  >
                            <button id="btnGroupDrop1" type="button" class="btn btn-secondary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Usuario:   ${usuario.getUsuario()}
                            </button>
                            <div class="dropdown-menu" aria-labelledby="btnGroupDrop1">
                              <a class="dropdown-item" href="#">${usuario.getUsuario()}</a>
                              <a class="dropdown-item" href="index.jsp">Cerrar Sesion</a>
                            </div>
                        </div>
            </div>

        </nav>
                              
        <div class="m-4" style="height: 550px;" >
              <iframe name="ventaFor" style="height: 100%; width: 100%; border: none"  >
                   
              </iframe>
               
        </div>
                              
    </body>
</html>
