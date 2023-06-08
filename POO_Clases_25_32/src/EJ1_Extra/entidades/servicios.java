package EJ1_Extra.entidades;

import java.util.Random;
import java.util.Scanner;

public class servicios {

    String[] arreglo1 = new String[12];
    String mesSecreto;

    public servicios() {
        arreglo1[0] = "enero";
        arreglo1[1] = "febrero";
        arreglo1[2] = "marzo";
        arreglo1[3] = "abril";
        arreglo1[4] = "mayo";
        arreglo1[5] = "junio";
        arreglo1[6] = "julio";
        arreglo1[7] = "agosto";
        arreglo1[8] = "septiembre";
        arreglo1[9] = "octubre";
        arreglo1[10] = "noviembre";
        arreglo1[11] = "diciembre";
        mesSecreto = arreglo1[0];
    }

    public String[] getArreglo1() {
        return arreglo1;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void adivine(String mesSecreto) {
        System.out.println("Ingrese un mes en minuscula: ");
        Scanner leer = new Scanner(System.in);

        Random r = new Random();
        String adivina = leer.next();
        mesSecreto = arreglo1[r.nextInt(11)];

        if (adivina.equals(mesSecreto)) {
            System.out.println("Adivinaste ");
        } else {
            System.out.println("Erraste ");
        }
        System.out.println("secret" + mesSecreto);
    }
}
