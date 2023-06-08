package Servicios;


import Entidades.*;
import java.util.ArrayList;

public class Servicios {

    private ArrayList<EntidadPersona> grupo = new ArrayList();

    public void crearPersona() {

        EntidadPersona persona = new EntidadPersona();
        persona.setNombre("carlos");
        persona.setApellido("gomez");
        persona.setNum(10);
        persona.setPosicion("medio");

        grupo.add(persona);

        EntidadPersona persona2 = new EntidadPersona();
        persona2.setNombre("veronica");
        persona2.setApellido("diaz");
        persona2.setNum(33);
        persona2.setPosicion("arquera");

        grupo.add(persona2);

        System.out.println("su grupo de personas para el proximo equipo de futbol son: ");
        System.out.println(grupo.toString());

    }
     
    public void crearEquipo() {
        
        EntidadEquipo x = new EntidadEquipo();
        x.setTeam("Cruz Negra");
        x.setJugadores(grupo);
        
        System.out.println("El equipo es: ");
        System.out.println("" + x.toString());
       
    }

}
