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
public class EntidadPersona {
    
    private String nombre;
    private String apellido;
    private Integer edad;
    private Integer DNI;
    private EntidadMascota mascota;

    public EntidadPersona() {
    }

    public EntidadPersona(String nombre, String apellido, Integer edad, Integer DNI, EntidadMascota mascota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.DNI = DNI;
        this.mascota = mascota;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public Integer getDNI() {
        return DNI;
    }

    public EntidadMascota getMascota() {
        return mascota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public void setMascota(EntidadMascota mascota) {
        this.mascota = mascota;
    }

    @Override
    public String toString() {
        return "EntidadPersona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", DNI=" + DNI + ", mascota=" + mascota + '}';
    }
     
    
    
    
    
    
}
