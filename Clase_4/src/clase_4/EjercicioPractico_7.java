/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
este tipo de dispositivo lee cadenas enviadas por el usuario. 
Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, 
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas. 
Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().
 */
package clase_4;

import java.util.Scanner;

public class EjercicioPractico_7 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        String palabra;
        int contNO;
        int contOK;
        int longi;
        contOK = 0;
        contNO = 0;
        longi = 0;

        do {
            System.out.println("RS232: -Ingrese una palabra correcta");
            palabra = leer.next();
            longi = palabra.length();

            if (longi == 5 && (("X".equals(palabra.subSequence(0,1)))) && (("O".equals(palabra.subSequence(longi - 1, longi)) ))) {
                contOK = contOK + 1;
                System.out.println("RS232: -CORRECTO " + contOK);
            } 
            else if ("&&&&&".equals(palabra)){
            break;
                   
            }
            else {
                contNO = contNO + 1;
                System.out.println("RS232: -INCORRECTO " + contNO);
            }
           
        } while (!"&&&&&".equals(palabra));

        System.out.println("RS232: -CORRECTO " + contOK); 
        System.out.println("RS232: -INCORRECTO " + contNO);
    }

}
