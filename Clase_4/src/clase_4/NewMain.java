/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_4;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic herent num1;
        int num1;
        int num2;
        int resultado ;
        String menu;
        
        System.out.println("Ingrese dos numeros:");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        
        do {
        System.out.println("MENU:\n" + "1:sumar\n" + "2:restar\n" + "3:multiplicar\n" + "4:dividir:\n" + "5:salir\n");
        System.out.println("Eliga una opcion.");
        menu = sc.next();
        
        switch (menu) {
            case "1":
                resultado = num1 + num2;System.out.println("el resultado es:" + resultado);
                break;
            case "2":
                resultado = num1 - num2;System.out.println("el resultado es:" + resultado);
                break;
            case "3":
                resultado = num1 * num2;System.out.println("el resultado es:" + resultado);
                break;
            case "4":
                resultado = num1 / num2;System.out.println("el resultado es:" + resultado);
                break;
                
            case "5":
                System.out.println("Esta seguro que desea salir del programa? (S/N");
                
                menu = sc.next();          
        }                
        }while(!"s".equals(menu)&&!"S".equals(menu));
        
    }
}
