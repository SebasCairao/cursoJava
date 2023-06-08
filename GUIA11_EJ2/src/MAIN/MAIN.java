package MAIN;

import Entidades.Jugador;
import Entidades.RevolverAgua;
import java.util.ArrayList;
import juego.juego;

public class MAIN {

    public static void main(String[] args) {
        RevolverAgua r1 = new RevolverAgua();

        juego juego1 = new juego();
        ArrayList<Jugador> j = new ArrayList<Jugador>();

        juego1.llenarJuego(j, r1);
        juego1.rondas(j, r1);

    }

}
