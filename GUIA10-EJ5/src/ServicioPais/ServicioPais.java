package ServicioPais;

import EntidadPais.EntidadPais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ServicioPais {

    Scanner leer = new Scanner(System.in);
    private Set<EntidadPais> conjuntoDePais = new HashSet();

    public void crearPais() {
        EntidadPais paisCreado = new EntidadPais();
        System.out.println("Ingrese su pais, no pueden ser repetidos: ");
        paisCreado.setNombrePais(leer.next());
        conjuntoDePais.add(paisCreado);
    }

    public void agregarPais() {
        String x;
        do {
            crearPais();
            System.out.println("Desea usted enlistar mas paises");
            x = leer.next().toUpperCase();
        } while (x.equals("S"));
    }

    public void mostrar() {
        System.out.println("La lista de paises es la siguiente : ");
        for (EntidadPais var : conjuntoDePais) {
            System.out.println(" " + var.toString());
        }

    }

    public void ordenarPaises() {
        ArrayList<EntidadPais> listaOrdenada = new ArrayList<>(conjuntoDePais);
        Collections.sort(listaOrdenada);

        System.out.println("La lista de paises ordenada por nombre es la siguiente:");
        for (EntidadPais pais : listaOrdenada) {
            System.out.println(pais.toString());
        }

    }
}
