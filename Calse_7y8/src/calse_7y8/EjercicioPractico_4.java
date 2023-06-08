package calse_7y8;

import java.util.Scanner;

/**
 * Crea una aplicación que nos pida un número por teclado y con una función se
 * lo pasamos por parámetro para que nos indique si es o no un número primo,
 * debe devolver true si es primo, sino false. Un número primo es aquel que solo
 * puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo, ya que 25 es
 * divisible entre 5, sin embargo, 17 si es primo.
 */
public class EjercicioPractico_4 {

    public static void main(String[] args) {
        System.out.println("Ingrese un numero");
        Scanner leer = new Scanner(System.in);
        int num = leer.nextInt();

        primo(num);
           
    }
    
    public static void primo(int num) {

        if ((num/num)==1){
            System.out.println("El numero es primo");
        
        }else System.out.println("el numero no es primo");
        
        
    }

}
