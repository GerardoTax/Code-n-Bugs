<%-- 
    Document   : Fabrica
    Created on : 25/08/2021, 12:58:55 AM
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP Page</title>
    </head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
    <body>
       <nav class="navbar navbar-expand-lg navbar-light bg-info" >
          <div class="container-fluid">
             <a class="navbar-brand" href="#">AREA DE FABRICA</a>
             <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
             </button>
                 <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-3 mb-lg-0">
                        <li class="nav-item">
                            <a style="border: none " class="btn btn-outline-secondary" href="ControladorFabrica?accion=Emsamblar&usuario=${usuario.getUsuario()}"  target="ventaFormularios">Emsamblar muebles</a>
                        </li>
                        <li class="nav-item">
                        <a  style="border: none " class="btn btn-outline-secondary" href="ControladorFabrica?accion=Registrar" target="ventaFormularios">Registrar muebles </a>
                        </li>
                        <li class="nav-item dropdown">
                            <a style="border: none" class="btn btn-outline-secondary" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                Consulta
                             </a>
                             <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <a class="dropdown-item" href="ControladorFabrica?accion=Consulta" target="ventaFormularios">Consultar Informacion de Piezas</a>
                                <a class="dropdown-item" href="ControladorFabrica?accion=ConsultaMueble" target="ventaFormularios">Consultar Informacion de Muebles</a>
                             </div>
                        </li>
                        <li class="nav-item">
                            <a  style="border: none" class="btn btn-outline-secondary" href="/AreaFabrica/EstadosPiezas.jsp" target="ventaFormularios">Piezas agotadas</a>
                        </li>
                        
                        <li class="nav-item">
                        <a  style="border: none " class="btn btn-outline-secondary" href="ControladorFabrica?accion=Pieza" target="ventaFormularios">Piezas de Madera </a>
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
              <iframe name="ventaFormularios" style="height: 100%; width: 100%; border: none"  >
                   
              </iframe>
               
                   </div>
      
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>
    </body>
</html>
