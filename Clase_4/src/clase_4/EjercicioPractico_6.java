/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla el siguiente menú:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa directamente, se debe mostrar el siguiente mensaje de confirmación: 
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
 */
package clase_4;

import java.util.Scanner;

public class EjercicioPractico_6 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese dos numeros positivos");

        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int opcion;
        String respuesta;
// VARIABLES SE DEFINEN ANTES DE TODO

        do {
            System.out.println("SELECCIONE:");
            System.out.println("---------------:");
            System.out.println("1.SUMAR");
            System.out.println("2.RESTAR");
            System.out.println("3.MULTIPLICAR");
            System.out.println("4.DIVIDIR");
            System.out.println("5.SALIR");
            
            respuesta ="N"; //LE TENGO QUE DAR UN VALOR; YA QUE SOLO QUEDA DEFINIDA EN EL SWICH//

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("RESULTADO : " + (num2 + num1));
                    break;
                case 2:
                    System.out.println("RESULTADO : " + (num2 - num1));
                    break;
                case 3:
                    System.out.println("RESULTADO : " + (num2 * num1));
                    break;
                case 4:
                    System.out.println("RESULTADO : " + (num2 / num1));
                    break;
                case 5:
                    System.out.println("Desea salir? S/N");
                    
                    respuesta = leer.next();
                    
            }
        } while (!"S".equals(respuesta));

    }
}
