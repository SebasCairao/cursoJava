package Servicios;

import Entidades.EntidadMascota;
import Entidades.EntidadPersona;
import java.util.ArrayList;
import java.util.Scanner;

public class Servicios {

    Scanner leer = new Scanner(System.in);
    private ArrayList<EntidadPersona> personaYPerro = new ArrayList();
    EntidadMascota mascota1 = new EntidadMascota();
    EntidadMascota mascota2 = new EntidadMascota();

    public void crearMascota() {

        System.out.println("atributos mascotas 1");

        mascota1.setNombre("chicote");
        mascota1.setRaza("ovejero");

        System.out.println("atributos mascotas 2");

        mascota2.setNombre("pepito");
        mascota2.setRaza("caniche");

    }

    public void crearPersonaYPerro() {

        EntidadPersona persona1 = new EntidadPersona();
        EntidadPersona persona2 = new EntidadPersona();
        System.out.println("atributos de persona1");
        persona1.setNombre("Claudia");
        persona1.setApellido("gomez");
        persona1.setEdad(26);
        persona1.setDNI(33333333);
        System.out.println("asigne una mascota");

        crearMascota();
        persona1.setMascota(mascota1);

        System.out.println("atributos de persona2");
        persona2.setNombre("Carlos");
        persona2.setApellido("gil");
        persona2.setEdad(299);
        persona2.setDNI(33333331);
        System.out.println("asigne una mascota");

        crearMascota();
        persona2.setMascota(mascota2);

        personaYPerro.add(persona1);
        personaYPerro.add(persona2);

    }

    public void mostrar() {

        System.out.println(" asi queda la lista de personas con sus mascotas asignadas");

        for (EntidadPersona lista1 : personaYPerro) {
            System.out.println("+" + lista1.toString());
        }
    }

}
