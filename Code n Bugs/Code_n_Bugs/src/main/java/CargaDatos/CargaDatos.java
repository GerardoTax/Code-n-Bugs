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
import java.util.ArrayList;
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
            String[] campos=separarCampos(linea);
            //pasamos el texto a objeto
            Object  nuevoObjeto=Constructor.construirClases(campos);
            if(nuevoObjeto!=null){
                lisNueva.add((T) nuevoObjeto);
            }
           
        }
        fr.close(); 
        return lisNueva;
    }
     private String[] separarCampos(String linea) {
        String inicioVehiculo = "Usuario(";
        String lineaDeCampos = linea.substring(inicioVehiculo.length(), linea.length() - 2);
        System.out.println(lineaDeCampos);
        String[] campos = lineaDeCampos.split(",");
        return campos;
    }

}
