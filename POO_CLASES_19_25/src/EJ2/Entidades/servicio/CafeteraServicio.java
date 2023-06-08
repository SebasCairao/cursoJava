package EJ2.Entidades.servicio;

import EJ2.Entidades.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {

    Scanner leer = new Scanner(System.in);
    Cafetera C1 = new Cafetera();

    public void llenarCafetera() {

        C1.setCapacidadactual(C1.getCapacidadMaxima());
    }

    public void servirTaza() {
        int taza = 0;
        System.out.println("ingrese la capacidad de la taza en cl");
        taza = leer.nextInt();

        if (taza <= C1.getCapacidadactual()) {
            System.out.println("La taza esta llena");
            C1.setCapacidadactual(C1.getCapacidadactual() - taza);
        } else {
            System.out.println("la taza no esta llena, tiene " + C1.getCapacidadactual() + " cl de cafe");
            C1.setCapacidadactual(0);
        }
    }

    public void vaciarCafe() {
        System.out.println("Vaciamos lentamente el cafe de la cafetera");
        C1.setCapacidadactual(0);
    }

    public void cafeActual() {
        System.out.println("La cafetera tiene: " + C1.getCapacidadactual());
    }

    public void agregarCafe() {
        int cafe = 0;
        System.out.println("Cuanto cafe desea dervir?");
        cafe = leer.nextInt();
        C1.setCapacidadactual(C1.getCapacidadactual() + cafe);
    }

}
