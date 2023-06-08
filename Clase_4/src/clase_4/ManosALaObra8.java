/*
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
package clase_4;

import java.util.Scanner;


public class ManosALaObra8 {

 
    public static void main(String[] args) {
        System.out.println("Ingrese una respuesta del 0 al 9");
        
        Scanner leer = new Scanner(System.in);
  	 
   	int respuesta = leer.nextInt();
                       
  	 
   	while (respuesta >= 0 && respuesta <= 10) {
      	 
    	System.out.println("Numero Valido");
    	respuesta = leer.nextInt();
   	   }
        System.out.println("ERROR");
    }
    
    
   
     
}
