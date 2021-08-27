/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexcion;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author dell
 */
public class Conexcion {
    
    private static final String USER="root";
    private static final String PASSWORD="123456789";
    private static final String URL_MYSQL="jdbc:mysql://localhost:3306/mi_muebleria";
    
   public static Connection getConecion(){
     Connection connection=null;
     try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection= DriverManager.getConnection(URL_MYSQL,USER,PASSWORD);
            System.out.println("Satisfacorio");
           
     }catch (Exception e) {
           System.out.println("Erro------>"+e);
       
     }
        return connection;
  
    }
}