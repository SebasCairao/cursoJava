package Servicios;

import EJ1_Main.Entidades.Cadena;
import java.util.Scanner;

public class CadenaServicios {

    public Cadena crearFrase() {
        Scanner leer = new Scanner(System.in);
        //creo el objetoaca
        Cadena c1 = new Cadena();
        System.out.println("Ingresa frase");
        c1.setFrase(leer.next());
        c1.setLongitud(c1.getFrase().length());

        return c1;
    }

    public void mostrarVocal(Cadena c1) {

        int cont = 0;
        String aux;
        for (int i = 0; i < c1.getLongitud(); i++) {
            aux = c1.getFrase().substring(i, i + 1);
            if (aux.equals("a") || aux.equals("e") || aux.equals("i") || aux.equals("o") || aux.equals("u")) {
                cont = cont + 1;
            }

        }
        System.out.println("cantidad de vocales " + cont);
    }

    public void invertir(Cadena c1) {
        String frase2 = "";
        String aux;
        for (int i = c1.getLongitud(); i > 0; i--) {
            aux = c1.getFrase().substring(i - 1, i);
            frase2 = frase2.concat(aux);
        }
        System.out.println("la frase inver es " + frase2);
    }

    public void vecesRepetido(Cadena c1) {
        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese una letra ");
        String letra = leer.next();
        String aux = "";
        int cont = 0;
        for (int i = 0; i < c1.getLongitud(); i++) {
            aux = c1.getFrase().substring(i, i + 1);
            if (aux.equals(letra)) {
                cont++;

            }
        }

        System.out.println("cantidad de veces repe: " + cont);

    }

    public void comparaLongitud(Cadena c1) {
        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese una frase nueva para comparar longitudes con la 1er frase");
        String frase3 = leer.next();

        if (c1.getLongitud() == frase3.length()) {
            System.out.println("Las longis son iguales " + c1.getLongitud());

        } else {
            System.out.println("las longis no son iguales ");
            System.out.println(" longitud de frase 1 = " + c1.getLongitud() + " y la de frase3 = " + frase3.length());
        }
    }

    public void unirFrase(Cadena c1) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una frase ");
        String frase4 = leer.nextLine();
        System.out.println("Frase nueva : " + c1.getFrase() + " " + frase4);

    }

    public void remplazaLetra(Cadena c1) {
        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese una letra ");
        String letra2 = leer.next();
        String frasex = "";
        String aux;
        for (int i = 0; i < c1.getLongitud(); i++) {
            aux = c1.getFrase().substring(i, i + 1);
            if (aux.equals("a")) {
                frasex = frasex.concat(letra2);
            } else {
                frasex = frasex.concat(aux);
            }
        }
        System.out.println("la nueva frase quedo asi " + frasex);
    }

    public boolean contiene(Cadena c1) {
        boolean contiene = false;
        Scanner leer = new Scanner(System.in);
        String aux = "";
        System.out.println("ingrese una letra ");
        String letra9 = leer.next();
        for (int i = 0; i < c1.getLongitud(); i++) {
            aux = c1.getFrase().substring(i, i + 1);
            if (aux.equals(letra9)) {
                contiene = true;
            }
        }System.out.println("" + contiene);
        return contiene;

    }

}
