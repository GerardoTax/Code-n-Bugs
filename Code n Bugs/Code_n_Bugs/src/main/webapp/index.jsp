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
        <title>JSP Page</title>
    </head>
    <jsp:include page="/Recursos/PaquetesLinck.jsp" />
    <body> 
        <nav class="navbar navbar-expand-lg navbar-light bg-info" >
        <div class="container-fluid"> 
           <div class="container-fluid">
             <a class="navbar-brand" href="#">Muebleria Code n' Bugs</a>
           </div>
        </div>
           <div class="nav-item">
           <a href="Login.jsp" class="btn btn-secondary">Inicar Sesion</a>
           </di> 
        </nav>        
        
        <table border="0" width="1000" align="center">
            <%
                try{
                ArrayList<Mueble> lista= MuebleDB.obtenerMueble();
                int saltoLinea=0;
                for(int i=0; i<lista.size(); i++){    
            %>    
            
           
                
            <th>
                <br><br>
                <%= lista.get(i).getNombre() %><br>
                <%= "Q"+lista.get(i).getPrecio() %><br>
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
