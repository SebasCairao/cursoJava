/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12ej1;

import Entity.Animal;
import Entity.Caballo;
import Entity.Gato;
import Entity.Perro;



/**
 *
 * @author play_
 */
public class Guia12MO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal perro = new Perro("Jorgito", "Eukanuba", 10 ,"Chiquito");
        perro.alimentarse();
        Animal gato = new Gato("Carlitos", "Gati", 50 ,"Siames");
        gato.alimentarse();
        Animal caballo = new Caballo("Pepito", "Heno", 15 ,"Lindo");
        caballo.alimentarse();
    }
}
