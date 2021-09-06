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
import java.util.ArrayList;

/**
 *
 * @author dell
 */
public class UsuarioDB {
    
    public  ArrayList<Usuario> obtenerUsuario(){
     
       ArrayList<Usuario> listaUsuario= new ArrayList<Usuario>(); 
       
        try {
            Statement insert=Conexcion.getConecion().createStatement();
            ResultSet rs = insert.executeQuery("SELECT * FROM personal");
            while (rs.next()){
                
                Usuario nuevoUsuario= new Usuario(rs.getString("usuario"),rs.getString("password"),rs.getInt("tipo"));
               // System.out.println(nuevoMueble.getNombre()+"----------------"+nuevoMueble.getPrecio());
                listaUsuario.add(nuevoUsuario);
            }
           rs.close();
        } catch (Exception e) {
            System.out.println("ERROR AL MOMENTO DE CAGAR----->");
            System.out.println("Error :): " + e.getMessage());
        }
        return listaUsuario;
    }
    
    
    public Usuario verificar(String usuario, String contraseña, int tipo){
        Usuario nuevo=new Usuario();
        try {
             Statement insert=Conexcion.getConecion().createStatement();
            ResultSet rs = insert.executeQuery("SELECT * FROM personal WHERE usuario='"+usuario+"' and password='"+contraseña+"' and tipo="+tipo);
            while (rs.next()){
                nuevo.setUsuario(rs.getString("usuario"));
                nuevo.setContraseña(rs.getString("password"));
                nuevo.setTipo(rs.getInt("tipo"));
            }
           rs.close();
            
        } catch (Exception e) {
        }
           
        return nuevo;
    }
    
    public Usuario verificarExistencia(String usuario){
        Usuario Usuarionuevo=new Usuario();
        try {
             Statement insert=Conexcion.getConecion().createStatement();
            ResultSet rs = insert.executeQuery("SELECT * FROM personal WHERE usuario='"+usuario+"'");
            while (rs.next()){
                Usuarionuevo.setUsuario(rs.getString("usuario"));
                Usuarionuevo.setContraseña(rs.getString("password"));
                Usuarionuevo.setTipo(rs.getInt("tipo"));
            }
           rs.close();
            
        } catch (Exception e) {
            
        }
           
        return Usuarionuevo;
    }
}
