package clase_8;

import java.util.Scanner;

/**
 * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y
 * muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A se
 * denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
 */
public class EjercicioPractico_4 {

    public static void main(String[] args) {
//defino
        int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[3][3];
        
        
//lleno matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizA[i][j] = (int) (Math.random() * 10 + 1);
            }
        }
        
//la muestro
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matrizA[i][j] + "]");
            }
            System.out.println(" ");
        }
        System.out.println("-----------------------------------");
 // hacemos la traspuesta:
 
         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matrizA[j][i] + "]");
            }
            System.out.println(" ");
        }
 
        
        
        
        
        
        
    }//MAIN

}//FINCLASS
