package guia10.ej4;

import EntidadPeliculas.EntidadPeliculas;
import ServicioPelicula.ServicioPelicula;
import UtilidadComparador.Comparador;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ServicioPelicula servpeli = new ServicioPelicula();

        servpeli.agregarpeli();
        servpeli.mostrarLista();
        servpeli.mostrarListaMasUnaHora();

        System.out.println("ORDENACION");

//        METODO GPT        
//        ArrayList<EntidadPeliculas> listaOrdenada = servpeli.getListaPelis();  // geteo el metodo getpelis
//        Collections.sort(listaOrdenada, Comparador.ordenNombre);
//        servpeli.mostrarLista();
//        Metodo orden en servicio
        servpeli.orderMenorAMayor();
        servpeli.orderMayorAMenor();
        servpeli.ordenduracion();
        servpeli.ordenduracion2();

    }

}
