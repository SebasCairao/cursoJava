package EJ1_Main;

import EJ1_Main.Entidades.Cadena;
import Servicios.CadenaServicios;

public class Main {

    public static void main(String[] args) {

        CadenaServicios cs = new CadenaServicios();
        Cadena c1 = cs.crearFrase();

        cs.mostrarVocal(c1);
        cs.invertir(c1);
        cs.vecesRepetido(c1);
        cs.comparaLongitud(c1);
        cs.unirFrase(c1);
        cs.remplazaLetra(c1);
        cs.contiene(c1);

    }

}
