/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. 
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 */
package clase_4;

import java.util.Scanner;

public class EjercicioExtra_3 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String letra;
        letra = leer.next().toLowerCase();

        switch (letra) {
            case "a":
                System.out.println("Es Vocal");
                break;
            case "e":
                System.out.println("Es Vocal");
                break;
            case "i":
                System.out.println("Es Vocal");
                break;
            case "o":
                System.out.println("Es Vocal");
                break;
            case "u":
                System.out.println("Es Vocal");

                break;
            default:
                System.out.println("No es vocal");
        }

    }

}
