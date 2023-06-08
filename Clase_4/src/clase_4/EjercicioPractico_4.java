/*
Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’. 
Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, 
en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función Substring y equals() de Java
 */
package clase_4;

import java.util.Scanner;

public class EjercicioPractico_4 {
    
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese Frase");

        String Frase = leer.next();
        
        String Letra = Frase.substring(0,1);
        
        
        if (Letra.equals("a")){
            System.out.println("CORRECTO : "  +  Letra);
        }else{
            System.out.println("ERROR : " +  Letra);
        }
          
    }
    }
    

