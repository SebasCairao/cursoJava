package clase_8;
import java.util.Scanner;
public class EjercicioPractico_1 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        String[] compa = new String[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese el nombre del integrante");
            compa[i] = leer.next();
            System.out.println("[" + compa[i] + "]");

        }
        System.out.println("El resultado es el siguiente");

        for (int i = 0; i < 3; i++) {
            System.out.print("[" + compa[i] + "]");

        }
    }
}
