/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author dell
 */
public class EnsamblePiezas {
    private String nombreMueble;
    private String pieza;
    private int cantidad;

    public EnsamblePiezas() {
    
    }
    public EnsamblePiezas(String nombreMueble, String pieza, int cantidad) {
        this.nombreMueble = nombreMueble;
        this.pieza = pieza;
        this.cantidad = cantidad;
    }
 
    
    public String getNombreMueble() {
        return nombreMueble;
    }

    public void setNombreMueble(String nombreMueble) {
        this.nombreMueble = nombreMueble;
    }

    public String getPieza() {
        return pieza;
    }

    public void setPieza(String pieza) {
        this.pieza = pieza;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
