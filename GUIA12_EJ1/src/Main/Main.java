/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Perro;

/**
 *
 * @author Seba
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    
    //Animal a = new Animal ("animal","comida",1,"nada");
    Animal b = new Perro ("babieca","heno",11,"caballoBlanco");
    Animal c = new Caballo ("chiquito","gati",15,"caniche");
    
    
 // a.alimento();
  b.alimento();
  c.alimento();
   
}
}