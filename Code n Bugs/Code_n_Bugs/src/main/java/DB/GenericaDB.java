/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;


import CargaDatos.Constructor;
import Conexcion.Conexcion;
import Modelo.EnsamblePiezas;
import Modelo.Mueble;
import Modelo.PiezasMadera;
import Modelo.Usuario;
import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author dell
 * @param <T>
 */
public class GenericaDB<T> {
   private  String primero;
    
   public GenericaDB(){
      this.primero=null;
    }

    public String  getPrimero() {
        return primero;
    }

    public void setPrimero(String  primero) {
        this.primero = primero;
    }
    
   public List<T> selectRows (String query, Class clase,String campo){
        List<T> listObject = new ArrayList();
        try {
            Statement sentence = Conexcion.getConecion().createStatement();
            ResultSet rs=sentence.executeQuery(query);
            while (rs.next()){
             
                Object  nuevoObjeto=construir(rs,campo);
                if(nuevoObjeto!=null){
                    listObject.add((T) nuevoObjeto);
                }
            }
           rs.close();
         } catch (Exception e) {
            System.out.println("Error :): " + e.getMessage());
        }
         return listObject;
    }
   
   public static Object construir(ResultSet rs,String campo)  {
        Object nuevoObjeto=null;
        switch (campo) {
            case "USUARIO":
            {
                try {
                    nuevoObjeto= new Usuario(rs.getString("usuario"),rs.getString("password"),rs.getInt("tipo"));
                } catch (SQLException ex) {
                    Logger.getLogger(GenericaDB.class.getName()).log(Level.SEVERE, null, ex);
                }
            }         
            break;
            case "MUEBLE":
            {
                try {
                    nuevoObjeto= new Mueble(rs.getString("nombre"),rs.getDouble("precio"));
                } catch (SQLException ex) {
                    Logger.getLogger(GenericaDB.class.getName()).log(Level.SEVERE, null, ex);
                }
            }         
                break;
            case "PIEZA":
            {
                try {
                    nuevoObjeto= new PiezasMadera(rs.getInt("cantidad"),rs.getString("tipo_pieza"),rs.getDouble("precio"));
                } catch (SQLException ex) {
                    Logger.getLogger(GenericaDB.class.getName()).log(Level.SEVERE, null, ex);
                }
            }         
             break; 
             case "ENZAMBLEPIEZA":
            {
                try {
                    nuevoObjeto= new EnsamblePiezas(rs.getString("mueble"),rs.getString("pieza"),rs.getInt("cantidad"));
                } catch (SQLException ex) {
                    Logger.getLogger(GenericaDB.class.getName()).log(Level.SEVERE, null, ex);
                } 
            }    
            break;    
        }
        return nuevoObjeto;
    }
    
   public static int covertirEntero(String campo){
        int valor =Integer.valueOf(campo);
        return valor;
    }
    
  
  
}
