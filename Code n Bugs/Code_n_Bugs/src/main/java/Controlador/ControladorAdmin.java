/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Conexcion.Conexcion;
import DB.GenericaDB;
import DB.PiezaDB;
import DB.UsuarioDB;
import Modelo.PiezasMadera;
import Modelo.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "ControladorAdmin", urlPatterns = {"/ControladorAdmin"})
public class ControladorAdmin extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
             
         
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                String menu=request.getParameter("accion"); 
              try {
            switch (menu) {
                case "CrearUsuario":
                    request.getRequestDispatcher("/AreaAdmin/CrearUsuarios.jsp").forward(request, response);
                
                    break;
                case "CrearMueble":
                    request.getRequestDispatcher("/AreaAdmin/CrearMubles.jsp").forward(request, response);
                    
                break;
                case "CargaArchivo":
                   
                      request.getRequestDispatcher("/AreaAdmin/CargaDatos.jsp").forward(request, response);
                break;    
                default:
                    throw new AssertionError();
    }
        } catch (Exception e) {
        }
              
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
