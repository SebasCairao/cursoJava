package Entidades;

import Enumeraciones.EnumCartas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Baraja {

    private ArrayList<EnumCartas> cartas;
    private String nombre = "baraja";

    public Baraja() {
    }

    public Baraja(ArrayList<EnumCartas> cartas) {
        this.cartas = cartas;
    }

    public void setCartas(ArrayList<EnumCartas> cartas) {
        this.cartas = cartas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<EnumCartas> getCartas() {
        return cartas;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Baraja{" + "cartas=" + cartas + ", nombre=" + nombre + '}';
    }

    ArrayList<EnumCartas> descarte = new ArrayList<>();
    //////////////////////////////////////////////////////////////////////////////
    public void llenarBaraja() {
        //ArrayList<EnumCartas> cartas = new ArrayList<EnumCartas>();
        cartas = new ArrayList<>();

        for (EnumCartas lista1 : EnumCartas.values()) {
            cartas.add(lista1);
            System.out.println("la cantidad de cartas es "  + cartas.size());
        }
    }

    public void mostrarBaraja() {

        System.out.println("Cartas en la baraja:");
        for (EnumCartas muestrobaraja : cartas) {
            System.out.println(muestrobaraja);//veo los objetos del array
            //System.out.println("" + muestrobaraja.getValor() + " " + muestrobaraja.getPalo());
                   System.out.println(" ");
        }
    }

    public void mezclarBaraja() {
        Collections.shuffle(cartas);
        System.out.println("La baraja ha sido mezclada.");
        System.out.println(" ");
    }

    public EnumCartas siguienteCarta() {
        
        if (cartas.isEmpty()) {
            System.out.println("La baraja está vacía. No hay cartas para tomar.");
            return null;

        } else {
            EnumCartas tomoCarta = cartas.get(0);
            descarte.add(tomoCarta); // lleno eso    
            System.out.println("la carta tomada es  " + tomoCarta);
            cartas.remove(0);
            return tomoCarta;
        }
        
    }
    
    public void cartasDisponible(){
        System.out.println("-----------------------------------------------");
        System.out.println("La cantidad de cartas en baraja es " + cartas.size());
        for (EnumCartas carta : cartas) {
            System.out.println(carta);
        }
            }
    
    
    public void darCartas(){
        System.out.println("-----------------------------------------------");
        Scanner leer = new Scanner(System.in);
         
        System.out.println(" Cuantas cartas desea retirar? " );
        int sacoCartas = leer.nextInt();
         for (int i = 0; i< sacoCartas; i++) {
            siguienteCarta();        
            }
      }       
    
    public void cartasDescartadas(){
        System.out.println("-----------------------------------------------");
        System.out.println("La cantidad de cartas en baraja De descartes es " + descarte.size());
        System.out.println("----");
        
        for (EnumCartas descartadas : descarte) {
            System.out.println(descartadas);
            
        }
        
      }
    
    
    
    
    
    
    
    
    
    

}
