/*

 */
package ServicioPelicula;

import EntidadPeliculas.EntidadPeliculas;
import UtilidadComparador.Comparador;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ServicioPelicula {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<EntidadPeliculas> listaPelis = new ArrayList();

    public void crearPeli() {
        EntidadPeliculas pelicula = new EntidadPeliculas();
        System.out.println("Ingrese el nombre de la peli: ");
        pelicula.setTitulo(leer.next());
        System.out.println("Ingrese nombre del director: ");
        pelicula.setDirector(leer.next());
        System.out.println("Ingrese la duracion en hs ");
        pelicula.setHoras(leer.nextDouble());
        listaPelis.add(pelicula);
    }

    public void agregarpeli() {
        String x;
        do {
            crearPeli();
            System.out.println("Desea agregar otra peli S/N");
            x = leer.next().toUpperCase();
        } while (x.equals("S"));
    }

    public void mostrarLista() {
        System.out.println("la lista es :");
        for (EntidadPeliculas listaPeli : listaPelis) {
            System.out.println(" " + listaPeli.toString());
        }
    }

    public void mostrarListaMasUnaHora() {

        System.out.println("Las pelis con mas de una hora son estas: ");

        for (EntidadPeliculas listaPeliMasUnaHs : listaPelis) {
            if (listaPeliMasUnaHs.getHoras() > 1) {
                System.out.println(" " + listaPeliMasUnaHs.toString());
            } else {

            }
        }
    }

    /// metodo ordenar dentro de serv
    public void orderMenorAMayor() {

        Collections.sort(listaPelis, Comparador.ordenNombre);
        System.out.println("Ordenada de menor a mayor por titulo");
        for (EntidadPeliculas listado : listaPelis) {
            System.out.println("lista" + listado);
        }
    }

    public void orderMayorAMenor() {

        Collections.sort(listaPelis, Comparador.ordenNombre2);
        System.out.println("Ordenada de mayor a manor por titulo");
        for (EntidadPeliculas listado : listaPelis) {
            System.out.println("lista" + listado);
        }
    }

    public void ordenduracion() {

        Collections.sort(listaPelis, Comparador.ordenduracion);
         System.out.println("Lista ordenada de menor a mayor DURACION");
        for (EntidadPeliculas listado : listaPelis) {
            System.out.println("lista" + listado);
        }
    }

    public void ordenduracion2() {

        Collections.sort(listaPelis, Comparador.ordenduracion2);
        System.out.println("Lista ordenada de mayor a menor DURACION");
        for (EntidadPeliculas listado : listaPelis) {
            System.out.println("lista" + listado);
        }
    }

//metodo retun para pasar listapelis  a main
    public ArrayList<EntidadPeliculas> getListaPelis() {
        return listaPelis;
    }

}
