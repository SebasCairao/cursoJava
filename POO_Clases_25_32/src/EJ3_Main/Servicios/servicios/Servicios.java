package EJ3_Main.Servicios.servicios;

import java.util.Arrays;

public class Servicios {

    public void inicializara(double[] arreglo) {

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = Math.random() * 10 + 1;
        }
    }

    public void mostrar(double[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);;
        }

    }

    public void ordenar(double[] arreglo) {
        Arrays.sort(arreglo);

        for (int i = 0; i < arreglo.length / 2; i++) {
            double temp = arreglo[i];  //variable aux
            arreglo[i] = arreglo[arreglo.length - 1 - i];
            arreglo[arreglo.length - 1 - i] = temp;

        }
    }

    public void inicializarb(double[] arreglo1, double[] arreglo2) {

        for (int i = 0; i < arreglo2.length; i++) {
            if (i < 10) {
                arreglo2[i] = arreglo1[i];

            } else {
                arreglo2[i] = 0.5;
            }

        }
    }
    
    
    
    
    
    
    
}
