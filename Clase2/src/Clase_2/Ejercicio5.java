/*
Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número.
 */
package intro.java;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        int num = 0;
        System.out.println("Escriba un valor entero");
        Scanner leer = new Scanner(System.in); //Leo lo que escribo por pantalla
        num = leer.nextInt();
        System.out.println("El doble es:" + num * 2);
        System.out.println("El triple es:" + num * 3);
        System.out.println("La raiz cuadrada es:" + Math.sqrt(num));
    }
}