/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DB.GenericaDB;
import Modelo.EnsamblePiezas;
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
@WebServlet(name = "ControladorEnsamblar", urlPatterns = {"/ControladorEnsamblar"})
public class ControladorEnsamblar extends HttpServlet {

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
            out.println("<title>Servlet ControladorEnsamblar</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorEnsamblar at " + request.getContextPath() + "</h1>");
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
          
            String mueble=request.getParameter("mueble");
            String estado=request.getParameter("accion");
            
            String usu =request.getParameter("valor");
            EnsamblePiezas nu= new EnsamblePiezas(); 
            GenericaDB<EnsamblePiezas> Db= new GenericaDB<EnsamblePiezas>();
            
            switch (estado) {
            case "buscar":
                try {
                ArrayList<EnsamblePiezas> info;
                info=  (ArrayList<EnsamblePiezas>)Db.selectRows("SELECT* FROM emsamble_piezas WHERE mueble='"+mueble+"'",nu.getClass(),"ENZAMBLEPIEZA");
                request.setAttribute("lista", info);
                request.setAttribute("t",usu);
                request.getRequestDispatcher("/AreaFabrica/EmsamblarMueble.jsp").forward(request, response);
              
            } catch (Exception e) {
                request.getRequestDispatcher("/Recursos/PaginaError.jsp").forward(request, response);
            }   
                
                
                break;
            case "guardar":
                     String pieza=request.getParameter("pieza");
                     request.setAttribute("nombre",mueble);
                     request.setAttribute("nombrepieza",pieza);
                    
                    request.getRequestDispatcher("/AreaFabrica/EmsamblarMueble.jsp").forward(request, response);
                
                break;
            default:
                throw new AssertionError();
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
