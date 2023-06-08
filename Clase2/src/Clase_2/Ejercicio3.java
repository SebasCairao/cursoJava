/*
 Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
 */
package Clase_2;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        System.out.println("Ingrese una frase");
        Scanner leer = new Scanner(System.in);
        String frase = leer.nextLine();
        
             
        
        System.out.println("Su frase en minusculas es: " + frase.toLowerCase());
         System.out.println("Su frase en mayuscula es: " + frase.toUpperCase());
                
            
        
        
        
    }
    
}
