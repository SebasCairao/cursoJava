package Clase_2;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int num1, num2, sum = 0;

        System.out.println("Ingrese un num1");
        num1 = leer.nextInt();
        System.out.println("Ingrese un num2");
        num2 = leer.nextInt();

        sum = num1 + num2;
        System.out.println("el resultado es: " + sum);

    }

}
