/*
Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada en punto, y 
luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se reemplaza por el carácter 
que se indica en la tabla y el resto de los caracteres 
(incluyendo a las vocales acentuadas) se mantienen sin cambios.

Realice un subprograma que reciba una secuencia de caracteres y retorne la 
codificación correspondiente. Utilice la estructura “según” para la transformación. 
Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
 */
package calse_7y8;

import java.util.Scanner;

public class ManosALaObra_11 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra seguida de punto");
        String palabra = leer.nextLine();

        nuevafrase(palabra);
        System.out.println(nuevafrase(palabra));

    }

    public static String nuevafrase(String palabra) {

        String aux = "";
        String nuevafrase = "";
        int lon = palabra.length();

        for (int i = 0; i < lon; i++) {
            aux = palabra.substring(i, i + 1);
            

            switch (aux) {
                case "a":
                    nuevafrase = nuevafrase.concat("@");
                    break;
                case "e":
                    nuevafrase = nuevafrase.concat("#");
                    break;
                case "i":
                    nuevafrase = nuevafrase.concat("$");
                    break;
                case "o":
                    nuevafrase = nuevafrase.concat("%");
                    break;
                case "u":
                    nuevafrase = nuevafrase.concat("*");
                    break;
                default:
                    nuevafrase = nuevafrase.concat(aux);
            }
        }
    return nuevafrase ;
    }
}