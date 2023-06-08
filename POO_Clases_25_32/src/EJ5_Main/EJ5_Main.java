/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ5_Main;

import EJ5_Main.EntidadesPersona.Persona;
import EJ5_Main.EntidadesPersona.PersonaService.service;

/**
 *
 * @author Seba
 */
public class EJ5_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        service s1 = new service();
        Persona p11 = s1.crearPersona();

        s1.mostrarP(p11, s1.edad(p11));
        System.out.println("Es menor? " + s1.menorEdad(p11, s1.edad(p11)));
    }

}
