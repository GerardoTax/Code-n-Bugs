/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Conexcion.Conexcion;
import DB.UsuarioDB;
import Modelo.Usuario;
import java.io.IOException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author dell
 */
@WebServlet(name = "ControladorCrearUsuarios", urlPatterns = {"/ControladorCrearUsuarios"})
public class ControladorCrearUsuarios extends HttpServlet {

  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
  
  }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String tipo=request.getParameter("opciones");
                
                switch (tipo) {
                    case "Eliminar":
                        try {
                        String usu=request.getParameter("id");
                         Statement eliminar=Conexcion.getConecion().createStatement();
                        eliminar.executeLargeUpdate("DELETE FROM personal WHERE usuario='"+usu+"'");
                        request.getRequestDispatcher("/AreaAdmin/CrearUsuarios.jsp").forward(request, response);
                        }catch (Exception e) {
                            request.getRequestDispatcher("/Recursos/PaginaError.jsp").forward(request, response);
                         }
                    break;
                    case "Editar":
                        
                        UsuarioDB tm= new UsuarioDB();
                        try {
                            String nombre=request.getParameter("variable");
                            Usuario p= tm.verificarExistencia(nombre);
                            request.setAttribute("campo",p);
                            request.getRequestDispatcher("/AreaAdmin/CrearUsuarios.jsp").forward(request, response);
                        } catch (Exception e) {
                            request.getRequestDispatcher("/Recursos/PaginaError.jsp").forward(request, response);
                        }
                        
                            
                        break;
                    default:
                        throw new AssertionError();
                }        
              
              
    } 
       

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String crearUsuario=request.getParameter("buton");
 
         if(crearUsuario.equals("Crear")){
             try {
                String  nom=request.getParameter("nombre");
                String  conta=request.getParameter("pass");
                int tipo= Integer.valueOf(request.getParameter("tipo"));
                Statement insert=Conexcion.getConecion().createStatement();
                insert.executeLargeUpdate("INSERT INTO personal VALUES('"+nom+"','"+conta+"',"+tipo+")");
                request.getRequestDispatcher("/AreaAdmin/CrearUsuarios.jsp").forward(request, response);
             } catch (Exception e) {
                 request.getRequestDispatcher("/Recursos/PaginaError.jsp").forward(request, response);
             }
         }
         else if (crearUsuario.equals("Actualizar")){
             try {
                 String  nom=request.getParameter("nombre");
                String contraseña=request.getParameter("pass");
                int tipo= Integer.valueOf(request.getParameter("tipo"));
                Statement insert=Conexcion.getConecion().createStatement();
                insert.executeLargeUpdate("UPDATE personal SET password='"+contraseña+"', tipo= '"+tipo+"'  WHERE usuario = '"+nom+"'");
                request.getRequestDispatcher("/AreaAdmin/CrearUsuarios.jsp").forward(request, response);
                 
             } catch (Exception e) {
                 request.getRequestDispatcher("/Recursos/PaginaError.jsp").forward(request, response);
             }
            }
    }
   
   

}
