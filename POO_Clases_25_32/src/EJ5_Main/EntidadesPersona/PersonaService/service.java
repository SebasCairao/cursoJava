
package EJ5_Main.EntidadesPersona.PersonaService;

import EJ5_Main.EntidadesPersona.Persona;

import java.util.Date;
import java.util.Scanner;


public class service {

    Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {

        Persona p1 = new Persona();
        System.out.println("ingrese su nombre");
        p1.setNombre(leer.next());
        System.out.println("Ingrese su fecha de nacimiento: dia , mes, anio");

        int dia = leer.nextInt();
        int mes = leer.nextInt();
        int anio = leer.nextInt();
        Date fecha = new Date(anio - 1900, mes - 1, dia);

        p1.setNacimiento(fecha);
        return p1;
    }

    public int edad(Persona p1) {
        Date fechaActual = new Date();

        fechaActual.setYear(fechaActual.getYear());

        int edad = ((fechaActual.getYear()) - p1.getNacimiento().getYear());

        if (fechaActual.getMonth() < p1.getNacimiento().getMonth()) {
            edad--;
        }
        if (fechaActual.getMonth() == p1.getNacimiento().getMonth() && fechaActual.getDate() < p1.getNacimiento().getDate()) {
            edad--;
        }
        return edad;

    }

    public boolean menorEdad(Persona p1, int edad) {
        boolean menorEdad = false;
        if (edad < 18) {
            menorEdad = true;
        }
        return menorEdad;
    }

    public void mostrarP(Persona p1, int edad) {
        System.out.println(" Nombre " + p1.getNombre());
        Date fechanacer = p1.getNacimiento();
        System.out.println("Fecha de Nacimiento " + (fechanacer.getYear() + 1900) + "/" + (fechanacer.getMonth() + 1) + "/" + fechanacer.getDate());
        System.out.println("Edad " + edad);

    }

}
