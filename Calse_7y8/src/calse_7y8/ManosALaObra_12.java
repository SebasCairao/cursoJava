/*
Crea un procedimiento EsMultiplo que reciba los dos números 
pasados por el usuario, validando que el primer número múltiplo del
segundo e imprima si el primer número es múltiplo del segundo, sino informe que no lo son.
 */
package calse_7y8;

import java.util.Scanner;

public class ManosALaObra_12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba el 1er num");
        int num1 = leer.nextInt();
        System.out.println("Escriba el 2er num");
        int num2 = leer.nextInt();

        EsMultiplo (num1,num2);
                
    }//Fin MAIN

    public static void EsMultiplo(int num1, int num2) {

        if (num1 % num2 == 0) {
            System.out.println("Es Multiplo el 1 del 2");
        } else {
            System.out.println("No es multiplo");
        }
     }
}// Fin CLASS
