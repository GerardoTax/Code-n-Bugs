<%-- 
    Document   : index
    Created on : 24/08/2021, 04:06:32 PM
    Author     : dell
--%>

<%@page import="DB.MuebleDB"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Modelo.Mueble"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
       
        <title>JSP Page</title>
    </head>
    
    <body>   
        <table border="0" width="1000" align="center">  
            <tr bgcolor="secondary">
                <th><a href="index.jsp" class="btn btn-secondary">Catalogo</a> </th>
                <th><a href="Login.jsp" class="btn btn-secondary">Iniciar Sesion</a> </th>
                <th><a href="" class="btn btn-secondary">Cerrar Sesion</a> </th>
                <th width="200" ></th>
            </tr>
        </table>
        
        <table border="0" width="1000" align="center">
            <%
                try{
                ArrayList<Mueble> lista= MuebleDB.obtenerMueble();
                int saltoLinea=0;
                for(int i=0; i<lista.size(); i++){    
            %>    
            <th> 
                <%= lista.get(i).getNombre() %><br>
                <%= "Q"+lista.get(i).getPrecio() %><br>
                <a href="indexModificar.jsp" class="btn btn-secondary">Modificar</a> 
                <a href="" class="btn btn-secondary">Añadir</a>      
            </th>
          <%
              saltoLinea++;
              if(saltoLinea==4){
           %>
           <br>
           <tr>
              <%
               saltoLinea=0;
              }
              }
            }catch(Exception e){
            }
              %>
        </table>
       
    </body>
       
</html>
