/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

/**
 *
 * @author dell
 */
import Conexcion.Conexcion;
import Modelo.Mueble;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
public class MuebleDB {
    
   
    public static ArrayList<Mueble> obtenerMueble(){
     
       ArrayList<Mueble> listaMueble= new ArrayList<Mueble>(); 
       
        try {
            Statement insert=Conexcion.getConecion().createStatement();
            ResultSet rs = insert.executeQuery("SELECT * FROM mueble");
            while (rs.next()){
                
                Mueble nuevoMueble= new Mueble(rs.getString("nombre"),rs.getDouble("precio"));
               // System.out.println(nuevoMueble.getNombre()+"----------------"+nuevoMueble.getPrecio());
                listaMueble.add(nuevoMueble);
            }
           rs.close();
        } catch (Exception e) {
            System.out.println("ERROR AL MOMENTO DE CAGAR----->");
            System.out.println("Error :): " + e.getMessage());
        }
        return listaMueble;
    }
    
    public static void  ingresarMuebles(String nombre, double precio){
        try {
            Statement insert=Conexcion.getConecion().createStatement();
                Mueble nuevoMueble= new Mueble(nombre,precio);
              insert.executeLargeUpdate("INSERT INTO mueble VALUES('"+nuevoMueble.getNombre()+"','"+nuevoMueble.getPrecio()+"')");
        } catch (Exception e) {
            System.out.println("ERROR"+e);
        }
        
    }
    
    public static void eliminarMuebles(){
        try {
            Statement insert=Conexcion.getConecion().createStatement();
              insert.executeLargeUpdate("DELETE FROM mueble WHERE nombre='Mesa lisa'");
        } catch (Exception e) {
            System.out.println("ERROR"+e);
        }
    
    }
}
