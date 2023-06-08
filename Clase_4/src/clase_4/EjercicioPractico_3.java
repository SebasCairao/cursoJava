/*
Realizar un programa que solo permita introducir solo frases o palabras 
de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java.
 */
package clase_4;

import java.util.Scanner;

public class EjercicioPractico_3 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese Frase");

        String Frase = leer.next();
        int cont = Frase.length();

        if (cont >=8){
    
       System.out.println("Correcto es de 8");
       
       } else {
           System.out.println("la Frase es : " + Frase + " Tiene  " + cont + " letras " + " MAL");     
                }
       
       
    }

}
