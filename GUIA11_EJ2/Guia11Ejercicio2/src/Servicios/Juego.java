/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Jugador;
import Entidades.Revolver;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author dario
 */
public class Juego {

    private Revolver r;
    private List<Jugador> jugadores;

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Juego() {

        this.jugadores = new ArrayList<>();
    }

    public Juego(Revolver r, List<Jugador> jugadores) {
        this.r = r;
        this.jugadores = new ArrayList<>();
    }

    public void llenarJuego() {

        //int numJ=0;
        System.out.println("Cuantos jugadores van a participar?");
        int numJ = sc.nextInt();
        for (int i = 0; i < numJ; i++) {
            System.out.println("Ingrese nombre del judador " + (i + 1));
            String nombre = sc.next();
            Jugador j = new Jugador();
            j.setNombre(nombre);
            j.setId(i);
            jugadores.add(j);
        }
        Revolver r = new Revolver();
        r.llenarRevolver();
        this.r = r;
    }
    
    

    public void ronda() {
        boolean flag = true;
        do {

            for (Jugador victima : jugadores) {
                System.out.println("Victima " + victima.getNombre() + " es tu turno de jugar");
                if (r.mojar()) {
                    System.out.println("Mojado!!");
                    System.out.println(r.toString());
                    flag=false;

                    break;
                } else {
                    System.out.println("Te salvaste!");
                    r.sigChorro();
                }
            }
        } while (flag);
    }

    @Override
    public String toString() {
        return "Juego{" + "r=" + r + ", jugadores=" + jugadores + '}';
    }

}
