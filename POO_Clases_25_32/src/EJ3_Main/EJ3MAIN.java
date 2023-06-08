package EJ3_Main;

import EJ3_Main.Servicios.servicios.Servicios;

public class EJ3MAIN {

    public static void main(String[] args) {
        
        Servicios arreglos = new Servicios();
        double[] arreglo1 = new double[50];
        double[] arreglo2 = new double[20];

        arreglos.inicializara(arreglo1);

        arreglos.mostrar(arreglo1);
        System.out.println("---------");

        arreglos.ordenar(arreglo1);

        arreglos.mostrar(arreglo1);
        System.out.println("---------");

        arreglos.inicializarb(arreglo1,arreglo2);
        arreglos.mostrar(arreglo2);
        
        

    }

}
