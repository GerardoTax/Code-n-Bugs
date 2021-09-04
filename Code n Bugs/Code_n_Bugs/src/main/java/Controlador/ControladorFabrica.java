/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ManejadorUtilidades.VerificarCampos;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author dell
 */
@WebServlet(name = "ControladorFabrica", urlPatterns = {"/ControladorFabrica"})
public class ControladorFabrica extends HttpServlet {

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
        try {
            String accion=request.getParameter("accion");
            String usu=request.getParameter("usuario");
            
        switch (accion) {
            case "Emsamblar":
                
                request.getRequestDispatcher("/AreaFabrica/EmsamblarMueble.jsp?valor="+usu).forward(request, response);
                
            break;
            
            case "Registrar":
                request.getRequestDispatcher("/AreaFabrica/RegistrarMueble.jsp").forward(request, response);
                
            break;
            
            case "Consulta":      
                 request.getRequestDispatcher("/AreaFabrica/Consulta.jsp").forward(request, response);
                 
            break;
            case "ConsultaMueble":
                    request.getRequestDispatcher("/AreaFabrica/ConsultaMuebles.jsp").forward(request, response);
            break;
            case "Pieza":
                request.getRequestDispatcher("/AreaFabrica/Piezas.jsp").forward(request, response);
                
            break;
            case "EliminarModificarPieza":
                request.getRequestDispatcher("/AreaFabrica/EliminarModificarPieza.jsp").forward(request, response);
                
            break;
            default:
                
               
        }
        } catch (Exception e) {
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
