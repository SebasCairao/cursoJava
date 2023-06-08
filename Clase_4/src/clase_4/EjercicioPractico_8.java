/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
. */
package clase_4;

import java.util.Scanner;

public class EjercicioPractico_8 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int num1;
        num1 = leer.nextInt();
        
        
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num1; j++) {

                if (i == 0 || i == num1 - 1 || j == 0 || j == num1 - 1) {
                    System.out.print(" * ");

                } else {
                    System.out.print("   ");
                }
            }//FOR j
         System.out.println("");
        }//FOR i
    }//CIERRA EL main
}//cierro class



