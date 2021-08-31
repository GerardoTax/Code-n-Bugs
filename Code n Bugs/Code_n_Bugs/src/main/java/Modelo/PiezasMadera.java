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
public class PiezasMadera {
    private String tipo;
    private int canidad;
    private double precio;
    
    public PiezasMadera(){}

    public PiezasMadera( int canidad,String tipo, double precio) {
        this.tipo = tipo;
        this.canidad = canidad;
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCanidad() {
        return canidad;
    }

    public void setCanidad(int canidad) {
        this.canidad = canidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
    
}
