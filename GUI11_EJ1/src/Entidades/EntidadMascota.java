/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Seba
 */
public class EntidadMascota {
    
    
    
    private String raza;
    private String nombre;
    private Double tamaño;
    private Integer edad;

    public EntidadMascota() {
    }

    public EntidadMascota(String raza, String nombre, Double tamaño, Integer edad) {
        this.raza = raza;
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getTamaño() {
        return tamaño;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTamaño(Double tamaño) {
        this.tamaño = tamaño;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "EntidadMascota{" + "raza=" + raza + ", nombre=" + nombre + ", tama\u00f1o=" + tamaño + ", edad=" + edad + '}';
    }
    
    
    
    
    
    
}
