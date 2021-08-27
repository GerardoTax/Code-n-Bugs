<%-- 
    Document   : Login
    Created on : 25/08/2021, 12:29:24 AM
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
     <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
    <body> 
        <div class="container mt-4 col-lg-4">
            <div class="card col-sm-10">
                <div class="card-body">
                    <form class="form-sign" action="Validar" method="POST">
                        <div class="form-group text-center">
                            <h3>Login</h3>
                            <label>Bien venidos al sistema</label>
                            <img src="https://www.google.com/imgres?imgurl=https%3A%2F%2Fimage.flaticon.com%2Ficons%2Fpng%2F512%2F44%2F44948.png&imgrefurl=https%3A%2F%2Fwww.flaticon.es%2Ficono-gratis%2Fsimbolo-de-usuario-masculino-negro_44948&tbnid=Abzciaagz1e1wM&vet=12ahUKEwiQjtrju9DyAhUED98KHU8GAccQMygoegUIARCgAg..i&docid=nq3U5Q7VH0da2M&w=512&h=512&q=iconos%20de%20usuario&hl=es&ved=2ahUKEwiQjtrju9DyAhUED98KHU8GAccQMygoegUIARCgAg" class="rounded float-left" alt="250">
                        </div>
                        <div class="form-group">
                            <label>Usuario</label>
                            <input required type="text" name="usuario" class=" form-control">
                        </div>
                        <div class="form-group">
                             <label>Contraseña</label>
                            <input required type="password" name="clave" class=" form-control">            
                            
                        </div>
                        <div>
                            <label>Area en la que Pertenece</label>
                            <select name="tipo" class="custom-select custom-select-lg mb-3">
                                <option value="1">Fabrica</option>
                                <option value="2">Ventas</option>
                                <option value="3">Administracion</option>
                            </select>
                        </div>  
                        <div class="d-grid gap-2">
                        <input type="submit" name="buton" value="Ingresar" class="btn btn-secondary btn-block">
                        </div>
                    </form>
                </div>
            </div>
        </div> 
    </body>
     <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
     <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
     <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>
</html>
