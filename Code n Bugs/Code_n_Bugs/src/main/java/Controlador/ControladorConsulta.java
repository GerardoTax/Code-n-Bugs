/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DB.GenericaDB;
import Modelo.Mueble;
import Modelo.PiezasMadera;
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
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
@WebServlet(name = "ControladorConsulta", urlPatterns = {"/ControladorConsulta"})
public class ControladorConsulta extends HttpServlet {

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
    

    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String valor=request.getParameter("accion");
            String valorMueble=request.getParameter("valormueble");
            ArrayList<Mueble> lista;
            Mueble nuevomueble=new Mueble();
            GenericaDB<Mueble> dbmueble=new GenericaDB<Mueble> ();
            ArrayList<PiezasMadera> list;
            PiezasMadera pieza=new PiezasMadera();
            GenericaDB<PiezasMadera> db=new GenericaDB<PiezasMadera> ();
        if(valor.equals("menor")){
           
            try {
                list= (ArrayList<PiezasMadera>)db.selectRows("SELECT* FROM materia_prima ORDER BY cantidad",pieza.getClass(),"PIEZA");
                request.setAttribute("lista", list);
                 request.getRequestDispatcher("/AreaFabrica/Consulta.jsp").forward(request, response);
            } catch (Exception e) {
                request.getRequestDispatcher("/Recursos/PaginaError.jsp").forward(request, response);
            }
        }
        else if (valor.equals("mayor")){
            try {
                list= (ArrayList<PiezasMadera>)db.selectRows("SELECT* FROM materia_prima ORDER BY cantidad DESC",pieza.getClass(),"PIEZA");
                request.setAttribute("lista", list);
                request.getRequestDispatcher("/AreaFabrica/Consulta.jsp").forward(request, response);
            } catch (Exception e) {
                request.getRequestDispatcher("/Recursos/PaginaError.jsp").forward(request, response);
            }
        }
        else if(valor.equals("menormueble")){
            try {
                
                lista= (ArrayList<Mueble>)dbmueble.selectRows("SELECT* FROM mueble ORDER BY muebles_disponibles DESC",nuevomueble.getClass(),"MUEBLE");
                request.setAttribute("listamueble", lista);
                request.getRequestDispatcher("/AreaFabrica/ConsultaMuebles.jsp").forward(request, response);
 
            } catch (Exception e) {
                request.getRequestDispatcher("/Recursos/PaginaError.jsp").forward(request, response);
            }
        
        }
        else if(valor.equals("mayormueble")){
            try {
                lista= (ArrayList<Mueble>)dbmueble.selectRows("SELECT* FROM mueble ORDER BY muebles_disponibles",nuevomueble.getClass(),"MUEBLE");
                request.setAttribute("listamueble", lista);
                request.getRequestDispatcher("/AreaFabrica/ConsultaMuebles.jsp").forward(request, response);
            } catch (Exception e) {
                request.getRequestDispatcher("/Recursos/PaginaError.jsp").forward(request, response);
            }
        
        }
      
    }

    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    
    
        
}
