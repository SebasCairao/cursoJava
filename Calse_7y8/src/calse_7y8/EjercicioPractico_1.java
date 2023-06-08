/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir 
entre sumar, restar, multiplicar y dividir. La aplicación debe tener una función para cada
operación matemática y deben devolver sus resultados para imprimirlos en el main
 */
package calse_7y8;

import java.util.Scanner;

public class EjercicioPractico_1 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba el 1er num");
        int num1 = leer.nextInt();
        System.out.println("Escriba el 1er num");
        int num2 = leer.nextInt();
        int op;

        System.out.println("SELECCIONE:");
        System.out.println("---------------:");
        System.out.println("1.SUMAR");
        System.out.println("2.RESTAR");
        System.out.println("3.MULTIPLICAR");
        System.out.println("4.DIVIDIR");
        System.out.println("5.SALIR");
        op = leer.nextInt();

        switch (op) {
            case 1:
                System.out.println("El resultado es" + SUMAR(num1, num2));
                break;
            case 2:
                System.out.println("El resultado es" + RESTAR(num1, num2));
                break;
            case 3:
                System.out.println("El resultado es" + MULTI(num1, num2));
                break;
            case 4:
                System.out.println("El resultado es" + DIV(num1, num2));
                break;
            case 5:
                System.out.println("SALISTE");
                break;
            default:
                System.out.println("ERRORRRRDCVZDSVSBETFGH");
        }

    }//Fin MAIN

    public static int SUMAR(int num1, int num2) {
        int resultado = num1 + num2;
        return resultado;
    }

    public static int RESTAR(int num1, int num2) {
        int resultado = num1 - num2;
        return resultado;
    }

    public static int MULTI(int num1, int num2) {
        int resultado = num1 * num2;
        return resultado;
    }

    public static double DIV(double num1, double num2) {
        double resultado = num1 / num2;
        return resultado;
    }

}//Fin Class
