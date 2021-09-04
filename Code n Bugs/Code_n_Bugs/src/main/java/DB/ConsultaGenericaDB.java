/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import Conexcion.Conexcion;
import Modelo.Mueble;
import Modelo.Usuario;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author dell
 */
public class ConsultaGenericaDB<T> {
    
    
    
    
    
     public Object selectRows (String query, Class clase,String campo){
        Object nuevo=null;
        try {
            Statement sentence = Conexcion.getConecion().createStatement();
            ResultSet rs=sentence.executeQuery(query);
            while (rs.next()){
             
                 nuevo=GenericaDB.construir(rs, campo);
                
            }
           rs.close();
         } catch (Exception e) {
            System.out.println("Error :): " + e.getMessage());
        }
         return nuevo;
     }
     
      public static void  ingresarMuebles(String nombre, double precio, int cant){
        try {
            Statement insert=Conexcion.getConecion().createStatement();
                Mueble nuevoMueble= new Mueble(nombre,precio,cant);
              insert.executeLargeUpdate("INSERT INTO mueble VALUES('"+nuevoMueble.getNombre()+"','"+nuevoMueble.getPrecio()+"')");
        } catch (Exception e) {
            System.out.println("ERROR"+e);
        }
        
    }
    
}
