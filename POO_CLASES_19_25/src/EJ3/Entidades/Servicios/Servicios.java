package EJ3.Entidades.Servicios;

import EJ3.Entidades.Persona;
import java.util.Scanner;

public class Servicios {

    Scanner leer = new Scanner(System.in);
    Persona p1 = new Persona();

    public boolean esMayorDeEdad() {
        boolean mayor = false;

        if (p1.getEdad() >= 18) {
            mayor = true;
        }
        return mayor;
    }

    public void crearPersona() {
        System.out.println("Ingrese nombre ");
        p1.setNombre(leer.next());
        System.out.println("Ingrese edad ");
        p1.setEdad(leer.nextInt());
        System.out.println("Ingrese peso ");
        p1.setPeso(leer.nextInt());
        System.out.println("Ingrese altura ");
        p1.setAltura(leer.nextDouble());
        System.out.println("Ingrese sexo siendo : ");
        System.out.println(" H. Para Hombre ");
        System.out.println(" M. Para Mujer ");
        System.out.println(" O. Para Otre ");
        p1.setSexo(leer.next());
        switch (p1.getSexo()) {
            case "H":
            case "h":
                break;
            case "M":
            case "m":
                break;
            case "O":
            case "o":
                break;
            default:
                System.out.println("ERROR");
        }
    }

    public int calcularIMC() {
        double IMC = p1.getPeso() / (Math.pow(p1.getAltura(), 2));
        int aux = 0;
        if (IMC <= 20) {
            System.out.println("Bajo peso ");
            aux = -1;
        } else if (IMC > 20 && IMC <= 25) {
            System.out.println("Peso ideal");
            aux = 0;

        } else {
            System.out.println("Sobre peso");
        }
        aux = 1;
        return aux;
    }
  
     public int esMayor() {
        int mayor = 0;

        if (p1.getEdad() >= 18) {
            mayor = 1;
        }
        return mayor;
    }
     
     
     

     
     

}






















