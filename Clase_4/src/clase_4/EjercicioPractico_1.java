/*
Crear un programa que dado un número determine si es par o impar
 */
package clase_4;

import java.util.Scanner;

public class EjercicioPractico_1 {


    public static void main(String[] args) {
      
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
                
        int numero = leer.nextInt();
                
      if (numero == 0) {

            System.out.println("Es cero");

        } else if(numero % 2 == 0) {

            System.out.println("Es par");

        }else{
            
            System.out.println("Es impar");
            
        }
        
        
        
    }
    
}
