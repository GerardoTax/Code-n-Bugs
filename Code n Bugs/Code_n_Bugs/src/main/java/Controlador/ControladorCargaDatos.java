/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import CargaDatos.Constructor;
import CargaDatos.LeerArchivosTxt;
import Conexcion.Conexcion;
import Modelo.Usuario;
import static com.mysql.cj.conf.PropertyKey.PATH;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author dell
 */
@WebServlet(name = "ControladorCargaDatos", urlPatterns = {"/ControladorCargaDatos"})
@MultipartConfig()
public class ControladorCargaDatos extends HttpServlet {

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
       
    }

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Part filePart = request.getPart("datafile");
        String nombreArch= filePart.getSubmittedFileName();
        String path=this.getServletConfig().getServletContext().getRealPath("/datefile");
        File directorio= new  File(path);
        if(!directorio.exists()){
            directorio.mkdir();
        }
         filePart.write(path+"/"+nombreArch);
        File archivo= new File(path+"/"+nombreArch);
        LeerArchivosTxt  tmp= new LeerArchivosTxt(); 
        tmp.leerFichero(archivo);
        
    }
         
        

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
   
}
