/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import Conexcion.Conexcion;
import ManejadorUtilidades.VerificarCampos;
import Modelo.PiezasMadera;
import Modelo.Usuario;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author dell
 */
public class PiezaDB {
    
     public PiezasMadera verificar(String nombre){
        PiezasMadera nuevot=new PiezasMadera();
        try {
             Statement insert=Conexcion.getConecion().createStatement();
            ResultSet rs = insert.executeQuery("SELECT * FROM materia_prima WHERE tipo_pieza='"+nombre+"'");
            while (rs.next()){
                nuevot.setTipo(rs.getString("tipo_pieza"));
                nuevot.setPrecio(rs.getDouble("precio"));
                nuevot.setCantidad(rs.getInt("cantidad"));
                     
            }
           rs.close();
            
        } catch (Exception e) {
        }
           
        return nuevot;
    }
     
     public void actualizar(String tipo, int cantidad, double precio){
           
         try {   
                Statement Update=Conexcion.getConecion().createStatement();
                Update.executeLargeUpdate( "UPDATE materia_prima SET cantidad ='"+cantidad+" ', precio= '"+precio+"'  WHERE tipo_pieza = '"+tipo+"'");
         } catch (Exception e) {
         }
             
     
     }
}
