package juego;

import Entidades.Jugador;
import Entidades.RevolverAgua;
import java.util.ArrayList;
import java.util.Scanner;

public class juego {

    Scanner leer = new Scanner(System.in);
    private ArrayList<Jugador> jugadores;
    private RevolverAgua r;

    public juego() {
    }

    public juego(ArrayList<Jugador> jugadores, RevolverAgua r) {
        this.jugadores = jugadores;
        this.r = r;
    }

 

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public RevolverAgua getR() {
        return r;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public void setR(RevolverAgua r) {
        this.r = r;
    }

    public void llenarJuego(ArrayList<Jugador> jugadores, RevolverAgua r) {

        System.out.println("ingrese la cantidad de jugadores: ");
        int cantidad;
        cantidad = leer.nextInt();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el nombre del jugador " + (i + 1) + " ");
            Jugador personaCreada = new Jugador();
            personaCreada.setNombre(leer.next());
            personaCreada.setID(i);
            jugadores.add(personaCreada);
        }

        r.llenar();

        System.out.println("imprimimos los jugadores");
        for (Jugador jugadore : jugadores) {
            System.out.println("+" + jugadore.toString());
        }
    }

    public void rondas(ArrayList<Jugador> jugadores, RevolverAgua r) {
//
//        if (jugadores.isEmpty()) {
//            System.out.println("No hay jugadores en el juego.");
//            return;
//        }

        boolean flag = true;
        do {

            for (Jugador jugadore : jugadores) {
                System.out.println("Jugador : " + jugadore.getNombre() + " Dispara");
                if (r.mojar()) {
                    System.out.println("Mojado!");
                    jugadore.setMojado(true);
                    flag=false;
                    break;
                } else {
                    System.out.println("Safaste ");
                    jugadore.setMojado(false);
                    r.siguienteChorro();
                  

                }

            }
        } while (flag);
        for (Jugador fin : jugadores) {
            System.out.println("Tabla jugadores "  + fin.toString()  );
        }
        
    }
}
