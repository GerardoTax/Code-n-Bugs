<%-- 
    Document   : Carga
    Created on : 5/09/2021, 12:31:00 AM
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Upload</title>
    </head>
    <body>
        <form action="ControladorCargaDatos" method="POST"  enctype="multipart/form-data">
            <label for="datafile">Seleccione un archivo</label>
            <input type="file" name="datafile">
            <br>
            <button type="submit">Subir</button>
        </form>
    </body>
</html>
