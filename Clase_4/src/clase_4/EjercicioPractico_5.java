/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a 
continuación solicite números al usuario hasta que la suma de los números 
introducidos supere el límite inicial.
 */
package clase_4;

import java.util.Scanner;

public class EjercicioPractico_5 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese limite");

        int lim = leer.nextInt();
        int suma = 0;
        int num = 0;

        Scanner leer2 = new Scanner(System.in);

        do {
            System.out.println("Ingrese numero a sumar");
            num = leer.nextInt();
            suma = num + suma;

        } while (suma < lim);

        System.out.println("Superaste el limite campeon" + " la suma es :" + suma);

    }
}

