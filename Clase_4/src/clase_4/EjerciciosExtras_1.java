/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, 
si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package clase_4;

import java.util.Scanner;

public class EjerciciosExtras_1 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int min = leer.nextInt();

        System.out.println("El resultado es en horas es  : " + min / 60);
        System.out.println("El resultado es en dias es  : " + (min / 60) / 24);

    }

}
