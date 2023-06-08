package Entidades;

import java.util.Scanner;

public class Jugador {

    Scanner leer = new Scanner(System.in);
    private RevolverAgua r = new RevolverAgua();
    
    
    private Integer ID;
    private String nombre;
    private boolean mojado;

    public Jugador() {
    }

    public Jugador(Integer ID, String nombre, boolean mojado) {
        this.ID = ID;
        this.nombre = nombre;
        this.mojado = mojado;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    public Integer getID() {
        return ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Jugador{" + "ID=" + ID + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }
    
    
      public void disparo(RevolverAgua r){
       
      r.mojar();
      r.siguienteChorro();
      
      
    }
   
     
}
