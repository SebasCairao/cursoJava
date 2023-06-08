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
public class Clientes {
    
    
    private String nombre;
    private String apellido;
    private Integer DNI;
    private String mail;
    private String telefono;

    public Clientes() {
    }

    public Clientes(String nombre, String apellido, Integer DNI, String mail, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.mail = mail;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getDNI() {
        return DNI;
    }

    public String getMail() {
        return mail;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Clientes{" + "nombre=" + nombre + ", apellido=" + apellido + ", DNI=" + DNI + ", mail=" + mail + ", telefono=" + telefono + '}';
    }
    
    
    
    
    
}
