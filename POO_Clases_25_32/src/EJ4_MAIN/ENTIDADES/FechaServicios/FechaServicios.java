package EJ4_MAIN.ENTIDADES.FechaServicios;

import java.util.Date;
import java.util.Scanner;

public class FechaServicios {

    Scanner leer = new Scanner(System.in);

    //creo mi objeto nuevo del tipo EntidadesDate llamado E1
    public Date fechaNacimiento() {
        System.out.println("Ingrese el DIA de su nacimiento");
        int dia = leer.nextInt();
        System.out.println("Ingrese el MES de su nacimiento");
        int mes = leer.nextInt();
        System.out.println("Ingrese el AÑO de su nacimiento");
        int anio = leer.nextInt();

        return new Date(anio - 1900, mes - 1, dia);

    }

    public Date fechaActual() {
        Date fechaActual = new Date();
        return fechaActual;
    }

    public void mostrar(Date fechaNacimiento, Date fechaActual) {
        System.out.println("naciste el " + fechaNacimiento.getDate() + "/" + (fechaNacimiento.getMonth() + 1) + "/" + fechaNacimiento.getYear());
        System.out.println("Fecha actual " + fechaActual.getDate() + "/" + (fechaActual.getMonth() + 1) + "/" + (fechaActual.getYear() + 1900));
    }

    public int edad(Date fechaNacimiento, Date fechaActual) {

        int edad = fechaActual.getYear() - fechaNacimiento.getYear();

        return edad;
    }

}
