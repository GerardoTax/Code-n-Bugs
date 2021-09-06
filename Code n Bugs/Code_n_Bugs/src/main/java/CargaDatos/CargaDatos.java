/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CargaDatos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import javax.servlet.http.Part;
import javax.swing.JTextArea;

/**
 *
 * @author dell
 */
public class CargaDatos<T> {
    
    public ArrayList<T> leerFichero(File archivo) throws FileNotFoundException, IOException {
        ArrayList<T> lisNueva = new ArrayList<>();
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        String linea;
        while ((linea = br.readLine()) != null) {
            //con la linea leida, separamos los campos
           
            //pasamos el texto a objeto
           
            
           
        }
        fr.close(); 
        return lisNueva;
    }
    
    public ArrayList<T> leer(Part filePart) throws IOException{
        ArrayList<T> list=null;
        String fileName = filePart.getHeader("Content-type");
        InputStream fileStream = filePart.getInputStream();
        System.out.println(fileName);
        System.out.println(filePart.getHeader("Content-disposition"));
        try (BufferedReader in = new BufferedReader(new InputStreamReader(fileStream))) {
            String line = in.readLine();
            while (line != null) {
                System.out.println(line);
                line = in.readLine();
            }
           
        } catch (Exception ex) {
            // manejo de error
        }
        return list;
    }
    
     private void separarCampos(String linea) {
         
         switch (linea) {
           
            case "USUARIO":
                String inicioCampo = "USUARIO(";
                String lineaDeCampos = linea.substring(inicioCampo.length(), linea.length() - 2);
                System.out.println(lineaDeCampos);
                String[] campos = lineaDeCampos.split(",");
                 
            break;
                
                
            case "PIEZA":
                
            break;
            
            case "MUEBLE":
                 
            break;
                 
            case "ENSAMBLE_PIEZAS":
                 
            break;
            case "CLIENTE":
            
            break;
                 
             default:
                 throw new AssertionError();
         }
          
     }
}
