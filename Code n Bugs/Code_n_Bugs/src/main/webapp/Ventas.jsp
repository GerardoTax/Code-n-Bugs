<%-- 
    Document   : Ventas
    Created on : 25/08/2021, 01:06:04 AM
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
        <nav class="navbar navbar-expand-lg navbar-light bg-warning">
            <div class="container-fluid">
              <a class="navbar-brand" href="#">AREA DE VENTAS</a>
              <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                  <li class="nav-item">
                    <a style="border: none" class="btn btn-lg" href="#">Consulta de compras </a>
                  </li>
                  <li class="nav-item">
                    <a style="border: none" class="btn btn-lg" href="#">Consulta de devoluciones</a>
                  </li>
                  <li class="nav-item">
                    <a style="border: none" class="btn btn-lg" href="#">Consulta de muebles</a>
                  </li>
                  <li class="nav-item">
                    <a style="border: none" class="btn btn-lg" href="#">Consulta de ventas</a>
                  </li>
                  
                  
                </ul>
              </div>
            </div>

        </nav>
        <div class="m-4" style="height: 550px;" >
              <iframe name="ventaFormulario" style="height: 100%; width: 100%; border: none"  >
                   
              </iframe>
               
        </div>
    </body>
</html>
