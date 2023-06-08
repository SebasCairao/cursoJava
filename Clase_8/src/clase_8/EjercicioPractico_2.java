package clase_8;


import java.util.Random;
import java.util.Scanner;

/**
 * Recorrer un vector de N enteros contabilizando cuántos números son de 1
 * dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
public class EjercicioPractico_2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int n = leer.nextInt();
        int[] vector = new int[n];
        int q=0;
        Random random = new Random(); //creo el random

        //llenado
        for (int i = 0; i < n; i++) {
            vector[i] = random.nextInt(1000);
            
        }
              for (int i = 0; i < n; i++) {
                  System.out.println("[" + vector [i]+ "]");;
            
        }
              
              
        
        


        
   
        
        
        
        
        
        

//        int num;
//        int num1;
//        int num2;
//        int num3;
//        
//        num=(int)(Math.random()*10-4);
//        num1=(int)(Math.random()*10-4);
//        num2=(int)(Math.random()*10-4);
//        num3=(int)(Math.random()*10-4);
//        
//        
//        
//        System.out.println(" " + num);
//        System.out.println(" " + num1);
//        System.out.println(" " + num2);
//        System.out.println(" " + num3);
//   
    }

}
