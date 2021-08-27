/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CargaDatos;

import Modelo.Usuario;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author dell
 */
public class Constructor {
     
    public static final String USUARIO = "USUARIO";
    public static final String CLIENTE = "CLIENTE";
    //public static final String VEHICULO_PICKUP = "PICKUP";

    public static Object construirClases(String[] campos) {
        Object nuevoObjeto=null;
        switch (campos[0]) {
            case USUARIO:
                    nuevoObjeto= new Usuario(campos[0],campos[1],covertirEntero(campos[2]));
                    
                break;
            case CLIENTE:
                   // vehiculo = new Pickup(campos[1],darFormatoAHora(campos[2]) ,darFormatoAHora(campos[3]) , darFormatoAFecha(campos[4]));
                break;
            
        }
        return nuevoObjeto;

    }
    
    public static LocalTime darFormatoAHora(String horaCadena){
        String[] horaDividida=horaCadena.split(":");
        int hora = Integer.valueOf(horaDividida[0]);
        int minuto = Integer.valueOf(horaDividida[1]);
        return LocalTime.of(hora, minuto);
    }
    
    public static LocalDate darFormatoAFecha(String fechaCadena){
        String[] fechaDividida=fechaCadena.split("/");
        int dia = Integer.valueOf(fechaDividida[0]);
        int mes = Integer.valueOf(fechaDividida[1]);
        int anio = Integer.valueOf(fechaDividida[2]);
        return LocalDate.of(anio, mes, dia);
    }
    public static int covertirEntero(String campo){
        int valor =Integer.valueOf(campo);
        return valor;
    }
}
