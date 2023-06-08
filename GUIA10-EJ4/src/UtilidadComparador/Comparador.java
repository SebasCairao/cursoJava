/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UtilidadComparador;

import EntidadPeliculas.EntidadPeliculas;
import java.util.Comparator;

/**
 *
 * @author Seba
 */
public class Comparador {

    public static Comparator<EntidadPeliculas> ordenNombre = new Comparator<EntidadPeliculas>() {
        @Override
        public int compare(EntidadPeliculas t, EntidadPeliculas t1) {
            return t.getTitulo().compareTo(t1.getTitulo());
        }
    };

    public static Comparator<EntidadPeliculas> ordenNombre2 = new Comparator<EntidadPeliculas>() {
        @Override
        public int compare(EntidadPeliculas t1, EntidadPeliculas t) {
            return t.getTitulo().compareTo(t1.getTitulo());
        }
    };

    public static Comparator<EntidadPeliculas> ordenduracion = new Comparator<EntidadPeliculas>() {
        @Override
        public int compare(EntidadPeliculas t1, EntidadPeliculas t) {
            return t1.getHoras().compareTo(t.getHoras());
        }
    };

    public static Comparator<EntidadPeliculas> ordenduracion2 = new Comparator<EntidadPeliculas>() {
        @Override
        public int compare(EntidadPeliculas t1, EntidadPeliculas t) {
            return t.getHoras().compareTo(t1.getHoras());
        }
    };

}
