package clase_8;

import java.util.Scanner;

/**
 * Realizar un algoritmo que calcule la suma de todos los elementos de un vector
 * de tamaño N, con los valores ingresados por el usuario
 */
public class EjercicioExtra_1 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
 
        int n;
        System.out.println("Ingrese las dimensiones");
        n = leer.nextInt();
        int[] num = new int[n];
        int suma = 0;
        int t = 0;
        System.out.println("ingrese los numeros desu vector");
        
        
        //lleno el vector
        
        for (int i = 0; i < n; i++) {
            num[i] = leer.nextInt();
            suma += num [i]; //acumulador  --> suma = suma + num [i];
            t++;  //contador --> Cont = cont +1

        }
        //muestro vector 

        for (int i = 0; i < num.length; i++) {
            System.out.print("" + num[i] + "");

        }
        System.out.println(" ");
        System.out.println("suma es : " +  suma);
        System.out.println("contador : " +  t);
        
        

    }

}
