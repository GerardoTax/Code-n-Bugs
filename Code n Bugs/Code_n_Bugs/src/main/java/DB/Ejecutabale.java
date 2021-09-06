/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import CargaDatos.CargaDatos;
import ManejadorUtilidades.ExcepcionCampos;
import ManejadorUtilidades.VerificarCampos;
import Modelo.Mueble;
import Modelo.PiezasMadera;
import Modelo.Usuario;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class Ejecutabale {
   // private static ArrayList<Usuario> listaUsuario;
  
    public static void main(String args []) {
      
        
           /* ArrayList<PiezasMadera> list; 
            PiezasMadera pieza=new PiezasMadera();
            GenericaDB<PiezasMadera> listaPiezas= new GenericaDB<PiezasMadera>();
            list= (ArrayList<PiezasMadera>) listaPiezas.selectRows("SELECT* FROM materia_prima", pieza.getClass(),"PIEZA");
             
           */
            
            
             
            
            System.out.println("El directorio temporal del sistema es "
  + System.getProperty("java.io.tmpdir"));
            
            
            
            
            
        
            /*  Usuario tmp=new Usuario();
            GenericaDB<Usuario> DB=new GenericaDB<Usuario>();
            listaUsuario= (ArrayList<Usuario>) DB.selectRows("SELECT* FROM personal", tmp.getClass(),"USUARIO");
            
            for(int i=0; i<listaUsuario.size();i++){
            if(listaUsuario.get(i).getUsuario().equals("Juan")){
            
            }
            
            }
            */
            /* Mueble tmp=new Mueble();
            GenericaDB<Mueble> DB=new GenericaDB<Mueble>();
            
            listaUsuario= (ArrayList<Mueble>) DB.selectRows("SELECT* FROM mueble", tmp.getClass(),"MUEBLE");
            int i=0;
            while(listaUsuario !=null){}
            
            if(listaUsuario.get(i).getNombre().equals("Escritorio")){
            System.out.println("Existe "+listaUsuario.get(i).getNombre());
            listaUsuario=null;
            }
            i++;*/
         //   VerificarCampos tmp=new VerificarCampos();
            
           //     try {
            //double r= tmp.convertirdouble("30.22");
            //System.out.println(r);
       // } catch (Exception e) {
        //}
        /*    Usuario g=new Usuario();
            Object nueva;
            try {
            ConsultaGenericaDB<Usuario> tmp=new ConsultaGenericaDB<Usuario>();
       nueva= tmp.selectRows("SELECT * FROM personal WHERE usuario='Luis' and password=546546  and tipo=1", tmp.getClass(),"USUARIO");
         if(nueva.equals(g)){
             nueva=g;
             System.out.println(g.getUsuario());
         } 
        } catch (Exception e) {
            System.out.println("perdio");
        }
           */
        }
    
      
    }
        
           
        
        
        
          
      
        
        
   
    
    //GenericaModelo<String> uno=new GenericaModelo<String>();
   
      
       

   

    

