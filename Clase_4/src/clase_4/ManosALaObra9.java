/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero".  
El programa deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse. 
Nota: recordar el uso de la sentencia break.
 */
package clase_4;

import java.util.Scanner;

public class ManosALaObra9 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero;
        int suma;
        int cont;
        suma = 0;
        cont = 0;

        do {
            numero = leer.nextInt();
            suma = numero + suma;
            cont = 1 + cont;
            if (cont > 20) {
                numero = 0;
            } else {
                System.out.println("Ingrese otro  numero " + cont);
            }
        } while (numero != 0);
        
        if (cont >= 20) {
            System.out.println("Ya se paso de 20 intentos: " + cont);
        } else {
            System.out.println("Se capturo el numero cero  " + suma);

        }
    }
}
