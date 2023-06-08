package EJ1_extra.Raiz.Serv;

import EJ1_extra.Raiz.Raiz;
import java.util.Scanner;

public class raizServ {

    Raiz raiz = new Raiz();
    Scanner leer = new Scanner(System.in);

    public void constructor() {
        System.out.println("Ingrese a");
        raiz.setA(leer.nextInt());
        System.out.println("Ingrese b");
        raiz.setB(leer.nextInt());
        System.out.println("Ingrese c");
        raiz.setC(leer.nextInt());

    }

    public double getDiscriminante() {
        //invoco (b^2)-4*a*c
        double discriminate = (Math.pow(raiz.getB(), 2)) - 4 * raiz.getA() * raiz.getC();
        return discriminate;

    }

    public boolean tienRaices(double discriminate) {
        return discriminate >= 0;  //devuelve true si se cumple

    }

    public void obtenerRaices(double discriminate) {
    
        
        double resultado1 = 0;
        double resultado2 = 0;

        if (tienRaices(discriminate)) {

            resultado1 = (-raiz.getB() + Math.sqrt(Math.pow(raiz.getB(), 2) - (4 * raiz.getA() * raiz.getC()))) / (2 * raiz.getA());
            System.out.println("El resulado 1 es : " + resultado1);

            resultado2 = (-raiz.getB() - Math.sqrt(Math.pow(raiz.getB(), 2) - (4 * raiz.getA() * raiz.getC()))) / (2 * raiz.getA());
            System.out.println("El resulado 2 es : " + resultado2);

        }else {System.out.println("ERROR no hay raiz");}

    }

}
