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
        <nav class="navbar navbar-expand-lg navbar-light bg-info" >
          <div class="container-fluid">
             <a class="navbar-brand" href="#">Area Administrativa</a>
             <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
             </button>
                 <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-3 mb-lg-0">
                        <li class="nav-item">
                            <a style="border: none " class="btn btn-outline-secondary" href="ControladorFabrica?accion=Emsamblar"  target="ventaFormularios">Reporte de ventas</a>
                        </li>
                        <li class="nav-item">
                        <a  style="border: none " class="btn btn-outline-secondary" href="ControladorFabrica?accion=Registrar" target="ventaFormularios">Reporte de devoluciones </a>
                        </li>
                         <li class="nav-item">
                        <a  style="border: none " class="btn btn-outline-secondary" href="ControladorFabrica?accion=Registrar" target="ventaFormularios">Reporte de usuario </a>
                        </li>
                         <li class="nav-item">
                        <a  style="border: none " class="btn btn-outline-secondary" href="ControladorFabrica?accion=Registrar" target="ventaFormularios">Reporte de muebles </a>
                        </li>
                        <li class="nav-item dropdown">
                            <a style="border: none" class="btn btn-outline-secondary" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                Consulta
                             </a>
                             <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <a class="dropdown-item" href="ControladorFabrica?accion=Consulta" target="ventaFormularios">Consultar Informacion de Piezas</a>
                                <a class="dropdown-item" href="ControladorFabrica?accion=Consulta" target="ventaFormularios">Consultar Informacion de Muebles</a>
                             </div>
                        </li>
                        <li class="nav-item">
                            <a  style="border: none" class="btn btn-outline-secondary" href="#">Piezas agotadas</a>
                        </li>
                        
                        <li class="nav-item">
                        <a  style="border: none " class="btn btn-outline-secondary" href="ControladorFabrica?accion=Pieza" target="ventaFormularios">Piezas de Madera </a>
                        </li>
               
                    </ul>
                </div>
                    <div class="btn-group text-center" role="group"  >
                        <button id="btnGroupDrop1" type="button" class="btn btn-secondary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Admin:   ${usuario.getUsuario()}
                        </button>
                        <div class="dropdown-menu" aria-labelledby="btnGroupDrop1">
                        <a class="dropdown-item" href="#">${usuario.getUsuario()}</a>
                        <a class="dropdown-item" href="index.jsp">Cerrar Sesion</a>
                        </div>
                        </div>                  
             </div>
        </nav>
        <div class="m-4" style="height: 550px;" >
            <iframe name="ventaFormularios" style="height: 100%; width: 100%; border: none">
                <div>
                    <div>
                        <div>
                            
                        </div>
                    </div>
                </div>
            </iframe>
               
        </div>
      
    </body>
</html>
