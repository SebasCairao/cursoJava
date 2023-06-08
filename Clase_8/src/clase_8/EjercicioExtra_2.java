package clase_8;

import java.util.Scanner;

/**
 * Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
 * comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
 * elementos).
 */
public class EjercicioExtra_2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int n;
        System.out.println("Ingrese las dimensiones");
        n = leer.nextInt();
        int[] vec1 = new int[n];
        int[] vec2 = new int[n];
        int c = 0;

        System.out.println("ingrese los numeros  vector1");

        for (int i = 0; i < n; i++) {
            vec1[i] = leer.nextInt();
        }

        System.out.println("ingrese los numeros  vector1");

        for (int i = 0; i < n; i++) {
            vec2[i] = leer.nextInt();
        }

//muestro vector
        System.out.println("sus vectores son los siguientes1");

        for (int i = 0; i < n; i++) {
            System.out.print("" + vec2[i] + "");
        }
        System.out.println(" ");
        for (int i = 0; i < n; i++) {
            System.out.print("" + vec1[i] + "");
        }
//check
        for (int i = 0; i < n; i++) {

            if (vec1[i] != vec2[i]) {
                c++;
                break;
            }
        }

        if (c == 0) {
            System.out.println("\nSon iguales");
        } else {
            System.out.println("\nNo son iguales");
        }

    }
}
