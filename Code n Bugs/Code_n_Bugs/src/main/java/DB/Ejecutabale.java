/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import CargaDatos.CargaDatos;
import Modelo.Mueble;
import Modelo.Usuario;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class Ejecutabale {
    private static ArrayList<Mueble> listaUsuario;
    private static Object Usua;
    public static void main(String args []) {
      
        
      /* Usuario tmp=new Usuario();
        Generica<Usuario> DB=new Generica<Usuario>();
        listaUsuario= (ArrayList<Usuario>) DB.selectRows("SELECT* FROM personal", tmp.getClass(),"USUARIO");
        
        for(int i=0; i<listaUsuario.size();i++){
            System.out.println(listaUsuario.get(i).getUsuario());
        }*/
        
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
            consulta("Luis","546546",1);
            
        }
    
        public static void consulta(String usu, String conta, int tip){
            Usuario t=new Usuario();
            ConsultaGenericaDB<Usuario> con=new ConsultaGenericaDB<Usuario>();
            //Usua=con.selectRows("SELECT * FROM personal WHERE usuario='"+usu+"' and password='"+conta+"' and tipo="+tip, t.getClass(), "USUARIO");
            
            
       }
    }
        
           
        
        
        
          
      
        
        
   
    
    //GenericaModelo<String> uno=new GenericaModelo<String>();
   
      
       

   

    

