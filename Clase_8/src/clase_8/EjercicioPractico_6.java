package clase_8;

import java.util.Scanner;

/**
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
 * donde la suma de sus filas, sus columnas y sus diagonales son idénticas.
 * Crear un programa que permita introducir un cuadrado por teclado y determine
 * si este cuadrado es mágico o no. El programa deberá comprobar que los números
 * introducidos son correctos, es decir, están entre el 1 y el 9.
 */
public class EjercicioPractico_6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

//defino
        int[][] matriz = new int[3][3];
        int diag = 0;
        int diag2 = 0;
        int sumfila0 = 0;
        int sumfila1 = 0;
        int sumfila2 = 0;
        int sumcol0 = 0;
        int sumcol1 = 0;
        int sumcol2 = 0;

//lleno matrizA       
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = leer.nextInt();
            }
        }

//sumo diagonales
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (i == j) {
                    diag = diag + matriz[i][j]; // suma diagonal normal
                }
                if (i + j == 2) {
                    diag2 = diag2 + matriz[i][j]; // diagonal inv
                }
            }
        }

        for (int j = 0; j < 3; j++) {
            sumfila0 = sumfila0 + matriz[0][j];
            sumfila1 = sumfila1 + matriz[1][j];
            sumfila2 = sumfila2 + matriz[2][j];

        }
        for (int i = 0; i < 3; i++) {
            sumcol0 = sumcol0 + matriz[i][0];
            sumcol1 = sumcol1 + matriz[i][1];
            sumcol2 = sumcol2 + matriz[i][2];
            
        }

//muestro
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println(" ");
        }

        System.out.println("-----------------------------------");

        System.out.println(" diag " + diag);
        System.out.println(" diag2 " + diag2);
        System.out.println(" sumfila0 " + sumfila0);
        System.out.println(" sumfila1 " + sumfila1);
        System.out.println(" sumfila2 " + sumfila2);
        System.out.println(" sumcol0 " + sumcol0);
        System.out.println(" sumcol1 " + sumcol1);
        System.out.println(" sumcol2 " + sumcol2);

    }
}
