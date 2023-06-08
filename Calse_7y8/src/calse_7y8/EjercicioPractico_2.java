/*
Diseñe una función que pida el nombre y la edad de N personas e imprima 
los datos de las personas ingresadas por teclado e indique si son mayores o menores de edad. 
Después de cada persona, el programa debe preguntarle al usuario si quiere 
seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No
 */
package calse_7y8;

import java.util.Scanner;

public class EjercicioPractico_2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba cant de persona");
        int per = leer.nextInt();
        String aux;

        MayorEdad(per);

    }// fin MAIN


    public static void MayorEdad(int per) {

        Scanner leer = new Scanner(System.in);

        String salida = "";
        //do {
        for (int i = 0; i < per; i++) {
            System.out.println("Escriba nombre");
            String nombre = leer.nextLine();
            System.out.println("Escriba la edad");
            int edad = leer.nextInt();
            leer.nextLine(); //descarto

            System.out.println(nombre + " " + edad);

            if (edad >= 18) {
                System.out.println("Es Mayor de edad");
            } else {
                System.out.println("No es mayor");
            }

            System.out.println("Desea seguir S/N??");

            salida = leer.nextLine();

            if (salida.equals("N")) {
                break;
            } else {
                System.out.println("seguimos:");
            }

        }
    }
    //while ("S".equals(salida));

    //return 0;
}

//FIN CLSS
