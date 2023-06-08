package clase_8;

import java.util.Scanner;

/**
 * Crear una función rellene un vector con números aleatorios, pasándole un
 * arreglo por parámetro. Después haremos otra función o procedimiento que
 * imprima el vector.
 */
public class EjercicioExtra_3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        System.out.println("Ingrese el tamaño del VICTORRRR");
        n = leer.nextInt();
        

        int[] vector = new int[n];
        
        llenado(vector , n);

    }

    public static void llenado(int vector[], int n) {

        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 100 + 1);

        }
        System.out.println("muestro su vec:");
        //muestro vector
        for (int i = 0; i < n; i++) {
            System.out.print("/" + vector [i] + "/");

        }
        System.out.println(" ");
    }
}
