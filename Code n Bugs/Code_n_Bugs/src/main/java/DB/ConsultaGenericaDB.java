/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import Conexcion.Conexcion;
import Modelo.Usuario;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author dell
 */
public class ConsultaGenericaDB<T> {
    
    
    
    
    
    public Object selectRows (String query, Class clase,String campo){
        Object consulta=null;
             try {
            Statement sentence = Conexcion.getConecion().createStatement();
            ResultSet rs=sentence.executeQuery(query);
            while (rs.next()){
             
                Object  nuevoObjeto =GenericaDB.construir(rs, campo);
                
            }
           rs.close();
         } catch (Exception e) {
            System.out.println("Error :): " + e.getMessage());
        }
        return consulta;
    
    }
        
  
    
}
