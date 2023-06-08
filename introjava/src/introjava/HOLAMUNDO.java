package introjava;

import java.util.Scanner;



public class HOLAMUNDO {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        
        Scanner /*tipo es la CLASE*/ leer /*nombre*/ = new Scanner(System.in)/*Objeto*/;
        String nombre;
        System.out.println("ingresa tu nombre");
        nombre = leer.next();
        System.out.println("Hola mundo, soy : " + nombre + " y programe en JAVA");
               
    }
    
}
