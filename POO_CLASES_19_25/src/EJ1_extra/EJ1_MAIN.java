package EJ1_extra;

import EJ1_extra.Raiz.Raiz;
import EJ1_extra.Raiz.Serv.raizServ;

public class EJ1_MAIN {

    public static void main(String[] args) {

        Raiz raiz = new Raiz();
        raizServ eq = new raizServ();

        eq.constructor(); //construyo
        eq.getDiscriminante(); // formulo
        System.out.println("Este es el resultado del discri:" + eq.getDiscriminante());

        eq.tienRaices(eq.getDiscriminante()); // compruevo si tiene raices e imprimo

        System.out.println(" El metodo tiene raices???" + eq.tienRaices(eq.getDiscriminante()));

        eq.obtenerRaices(eq.getDiscriminante());
        
                
        
    
    }

}
