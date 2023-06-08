
package MAIN;

import Entidades.EntidadMascota;
import Servicios.Servicios;

public class main {


    public static void main(String[] args) {
       
       Servicios s1 = new Servicios ();
       EntidadMascota m1 = new EntidadMascota ();
       
       
       s1.crearPersonaYPerro();
       s1.mostrar();
       
        
        
        
    }
    
}
