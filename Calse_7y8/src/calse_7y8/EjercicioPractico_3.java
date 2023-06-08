package calse_7y8;

import java.util.Scanner;

/**
 * Crea una aplicación que a través de una función nos convierta una cantidad de
 * euros introducida por teclado a otra moneda, estas pueden ser a dólares,
 * yenes o libras. La función tendrá como parámetros, la cantidad de euros y la
 * moneda a convertir que será una cadena, este no devolverá ningún valor y
 * mostrará un mensaje indicando el cambio (void). El cambio de divisas es: 0.86
 * libras es un 1 € 1.28611 $ es un 1 € 129.852 yenes es un 1 €
 */
public class EjercicioPractico_3 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int euro;
        String tipo;
        System.out.println("Ingrese la cantidad de euros:");
        euro = leer.nextInt();
        System.out.println("\n Ingrese tipo de cambio: \n Libra \n Dolar \n Yen");
        tipo = leer.next();

        Convertor(euro, tipo);

    }//Fin MAIN

    public static void Convertor(int euro, String tipo) {
           
            switch (tipo) {
            case "libra":
                System.out.println("Euro: " + euro + " Libra: " + (euro * 0.86));
                break;
            case "dolar":
                System.out.println("Euro: " + euro + " Dolar: " + (euro * 1.28611));
                break;
            case "yen":
                System.out.println("Euro: " + euro + " yen: " + (euro * 129.852));

                break;
            default:
                System.out.println("ERROR");

        }

    }

}//FIN CLAS
