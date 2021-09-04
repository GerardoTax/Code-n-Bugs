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
public class Mueble {
    private String nombre;
    private double precio;
    private int mueblesDisponibles;
    
    public Mueble(){}
    
    public Mueble(String nombre,double precio,int mueblesDisponibles){
        this.nombre=nombre;
        this.precio=precio;
        this.mueblesDisponibles=mueblesDisponibles;
    }

    public int getMueblesDisponibles() {
        return mueblesDisponibles;
    }

    public void setMueblesDisponibles(int mueblesDisponibles) {
        this.mueblesDisponibles = mueblesDisponibles;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
