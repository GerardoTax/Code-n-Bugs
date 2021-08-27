/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DB.UsuarioDB;
import Modelo.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author dell
 */
@WebServlet(name = "Validar", urlPatterns = {"/Validar"})

public class Validar extends HttpServlet {
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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Validar</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Validar at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                Usuario nuevo=new Usuario();
                UsuarioDB nuevoDB = new UsuarioDB();
        
         try {
                 String usu=request.getParameter("usuario");
                 String cla=request.getParameter("clave");
                 int tipo=Integer.valueOf(request.getParameter("tipo"));
                 nuevo=nuevoDB.verificar(usu,cla,tipo);
                 request.setAttribute("usuario", nuevo);
                 
               if(nuevo.getUsuario() !=null){
                   int var=nuevo.getTipo();
                   
                  // request.getRequestDispatcher("Fabrica.jsp").forward(request, response);
                   switch (var) {
                        case 1:
                           request.getRequestDispatcher("Fabrica.jsp").forward(request, response);
                           break;
                        case 2:
                           //request.getRequestDispatcher("Ventas.jsp").forward(request, response);
                           break;   
                       default:
                           throw new AssertionError();
                   }
                   
               }  
               else {
                   request.getRequestDispatcher("Login.jsp").forward(request, response);
               }
        } catch (Exception e) {
        }
            
               
            
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
