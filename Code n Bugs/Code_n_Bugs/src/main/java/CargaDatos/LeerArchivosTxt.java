/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CargaDatos;

import Conexcion.Conexcion;
import DB.UsuarioDB;
import EnumEstado.Tipo;
import Modelo.Usuario;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author dell
 */
public class LeerArchivosTxt {
      
    public void leerFichero(File archivo) throws FileNotFoundException, IOException {
        int cont = 0;
        while (cont != 6) {
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                verificarEntidad(separarEnditad(linea), cont);
            }
            fr.close();
            cont++;
        }

    }
     public String[] separarEnditad(String linea) {
        String campos[] = null;
        campos = linea.split("\\(");
        return campos;
    }
     
     public void verificarEntidad(String campos[], int turno) {
        if (turno == 0 && campos[0].equals(Tipo.USUARIO.name())) {
            insertarUsuario(limpiar(campos[1]));
        }
        if (turno == 1 && campos[0].equals(Tipo.PIEZA.name())) {
            //insertarPieza(limpiar(campos[1]));
        }
        if (turno == 2 && campos[0].equals(Tipo.MUEBLE.name())) {
            //insertarMueble(limpiar(campos[1]));
        }
        if (turno == 3 && campos[0].equals(Tipo.ENSAMBLE_PIEZAS.name())) {
            //insertarPiezaMueble(limpiar(campos[1]));
        }
        if (turno == 4 && campos[0].equals(Tipo.ENSAMBLE_MUEBLE.name())){
            //auxDB.EnsamblarMueble();
            //insertarEnsamble(limpiar(campos[1]));
        }
        if (turno == 5 && campos[0].equals(Tipo.CLIENTE.name())) {
            //insertarCliente(limpiar(campos[1]));
        }

    }
     
    public ArrayList<String> limpiar(String linea) {
        ArrayList<String> lista = new ArrayList<>();
        String subCampo[] = null;
        String cadena = linea.substring(0, linea.length() - 1);
        subCampo = cadena.split(",");
        for (int i = 0; i < subCampo.length; i++) {
            String lineaLimp = subCampo[i].replace("\"", "");
            lista.add(lineaLimp);
        }

        return lista;
    }
    
    public void insertarUsuario(ArrayList<String> lista)  {
            UsuarioDB db=new UsuarioDB();
            Usuario nuevoUsuario= new Usuario();
            nuevoUsuario= db.verificarExistencia(lista.get(0));
           
             if(nuevoUsuario.getUsuario() !=null)
             {   
                 try {
                    int tipo=Integer.valueOf(lista.get(2));
                    System.out.println(lista.get(0));
                    System.out.println(lista.get(1));
                    System.out.println(lista.get(2));
                    Statement insert=Conexcion.getConecion().createStatement();
                    insert.executeLargeUpdate("INSERT INTO personal VALUES("+lista.get(0)+",'"+lista.get(1)+"',"+tipo+")");
                 } catch (NumberFormatException | SQLException e) {
                 }
                   
             }
        
        }

    
}

