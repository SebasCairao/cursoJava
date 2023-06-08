package guia11_ej3;

import Entidades.Baraja;
import Enumeraciones.EnumCartas;
import java.util.ArrayList;

public class MAIN {

    public static void main(String[] args) {
        Baraja baraja = new Baraja();
        ArrayList<EnumCartas> cartas = new ArrayList<EnumCartas>();

        baraja.llenarBaraja();
        baraja.mostrarBaraja();

        baraja.mezclarBaraja();
        baraja.mostrarBaraja();

        baraja.darCartas();
        baraja.cartasDisponible();

    }

}
