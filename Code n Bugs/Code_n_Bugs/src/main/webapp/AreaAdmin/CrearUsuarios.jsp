<%-- 
    Document   : CrearUsuarios
    Created on : 2/09/2021, 10:47:22 PM
    Author     : dell
--%>

<%@page import="Modelo.Usuario"%>
<%@page import="DB.GenericaDB"%>
<%@page import="Modelo.PiezasMadera"%>
<%@page import="Modelo.PiezasMadera"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>
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
      <div class="d-flex">
                <div class="card col-sm-4">
                    <form class="form-sign" action="ControladorCrearUsuarios" method="POST" style="border: none">
                        <div class="form-group text-center">
                            <br>
                            <h3>Creacion de usuarios </h3>
                            <img src="../Imagenes/mesaMadera.jpg" width="140" height="120"/>
                        </div>
                        <div class="form-group">
                            <label>Nombre De Usuario</label>
                            <input required type="text"  value="${campo.getUsuario()}" name="nombre" class=" form-control">
                        </div>
                        <div class="form-group">
                             <label>Password</label>
                            <input required type="text" value="${campo.getContraseña()}" name="pass" class=" form-control">         
                        </div>
                        
                        <div>
                            <label>Area en la que Pertenece</label>
                            <select value="${campo.getTipo()}"  name="tipo" class="custom-select custom-select-lg mb-3">
                                <option value="1">Fabrica</option>
                                <option value="2">Ventas</option>
                                <option value="3">Administracion</option>
                            </select>
                        </div>  
                        <div class="d-grid gap-2">
                            <input type="submit" name="buton" value="Crear"  class="btn btn-secondary btn-block">
                            <input type="submit" name="buton" value="Actualizar"  class="btn btn-primary btn-block">
                        </div>
                    </form>
                </div>
                <div class="col-sm-8">
                    
                     <table class="table table-success table-striped">
        <thead>
        <h2 align="center" > Eliminar y Modificar Usuarios</h2>
        <tr>
            <th scope="col">Nombre </th>
            <th scope="col">Password</th>
            <th scope="col">Tipo</th>
        </tr>
        </thead>
        <tbody>
             <tr>
                <% 
                    ArrayList<Usuario> lista; 
                    Usuario u=new Usuario();
                    GenericaDB<Usuario> listaUsuario= new GenericaDB<Usuario>();
                    lista= (ArrayList<Usuario>) listaUsuario.selectRows("SELECT* FROM personal", u.getClass(),"USUARIO");

                    for( Usuario usuario: lista){
                %>
                 <td><%= usuario.getUsuario() %></td>
                <td><%= usuario.getContraseña() %></td>
                 <td><%= usuario.getTipo() %></td> 
                 <th> <a class="btn btn-outline-secondary" href="ControladorCrearUsuarios?opciones=Editar&variable=<%=usuario.getUsuario()%>">Editar</th>
                <th>  <a class="btn btn-outline-secondary" href="ControladorCrearUsuarios?opciones=Eliminar&id=<%=usuario.getUsuario()%>">Eliminar</th>
            </tr>
                <%
                     }
                %>
               
        </tbody>
    </table>
                    
                </div>
                
        </div>
   
    </body>
</html>
