/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Conexcion.Conexcion;
import DB.PiezaDB;
import ManejadorUtilidades.ExcepcionCampos;
import ManejadorUtilidades.VerificarCampos;
import Modelo.PiezasMadera;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author dell
 */
@WebServlet(name = "ControladorPiezas", urlPatterns = {"/ControladorPiezas"})
public class ControladorPiezas extends HttpServlet {

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
          String tipo=request.getParameter("menu");
          
           switch (tipo) {
            case "Eliminar":
                 try {
                     String nom=request.getParameter("id");
                      if(tipo.equals("Eliminar")){
                            Statement eliminar=Conexcion.getConecion().createStatement();
                            eliminar.executeLargeUpdate("DELETE FROM  materia_prima WHERE tipo_pieza='"+nom+"'");
                            request.getRequestDispatcher("/AreaFabrica/Piezas.jsp").forward(request, response);
                        }  
                }catch (Exception e) {
                }
                
                break;
                case "Editar":
                   String nombre=request.getParameter("variable");
                    PiezaDB db= new PiezaDB();
                    try {
                        PiezasMadera nu=db.verificar(nombre);
                        request.setAttribute("llenar",nu);
                        request.getRequestDispatcher("/AreaFabrica/Piezas.jsp").forward(request, response);
                    } catch (Exception e) {
                    }
                break;
            default:
                
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
           
            
            String crear=request.getParameter("buton");
            if (crear.equals("Guardar")){
                VerificarCampos cam=new VerificarCampos(); 
                String tipo= request.getParameter("tipoPieza");
                PiezasMadera piezas=new PiezasMadera(); 
                PiezaDB DB=new PiezaDB();
                try {          
                  int  cantidad=cam.convertir(request.getParameter("cantidadUnidad"));
                  double precio=cam.convertirdouble(request.getParameter("costoUnidad"));
                   piezas=DB.verificar(tipo); 
                   if(piezas.getTipo().equals(tipo)){

                         int piezastotal=piezas.getCanidad()+cantidad;
                         double precioDB=piezas.getCanidad()*piezas.getPrecio();
                         double precionuevo=cantidad*precio;
                         double nuevoPrecio=(precioDB+precionuevo)/piezastotal;
                         Statement Update=Conexcion.getConecion().createStatement();
                         Update.executeLargeUpdate( "UPDATE materia_prima SET cantidad ='"+piezastotal+ " ', precio= '"+nuevoPrecio+"'  WHERE tipo_pieza = '"+tipo+"'");
                         request.getRequestDispatcher("/AreaFabrica/Piezas.jsp").forward(request, response);
                            
                    }
                
                } catch (Exception e) {
                try {
                    int  cantidad=cam.convertir(request.getParameter("cantidadUnidad"));
                    double precio=cam.convertirdouble(request.getParameter("costoUnidad"));
                    Statement insert=Conexcion.getConecion().createStatement();
                    insert.executeLargeUpdate("INSERT INTO materia_prima VALUES("+cantidad+",'"+tipo+"',"+precio+")");
                    request.getRequestDispatcher("/AreaFabrica/Piezas.jsp").forward(request, response);
                    
                } catch (Exception ex) {
                        response.sendRedirect("/Recursos/PaginaError.jsp");
                }
            
            }
        }
         
            else if (crear.equals("Actualizar")){
             PiezaDB db= new PiezaDB();
             VerificarCampos cam=new VerificarCampos(); 
             String tipo= request.getParameter("tipoPieza");
             try {
                 int  cantidad=cam.convertir(request.getParameter("cantidadUnidad"));
                 double precio=cam.convertirdouble(request.getParameter("costoUnidad"));
                  db.actualizar(tipo,cantidad,precio);
                  request.getRequestDispatcher("/AreaFabrica/Piezas.jsp").forward(request, response);
             } catch (Exception e) {
                 response.sendRedirect("/Recursos/PaginaError.jsp");
             }
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
