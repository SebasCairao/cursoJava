/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase8ej3bis;

import Servicios.PersonaServicio;

/**
 *
 * @author crish
 */
public class Clase8Ej3bis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PersonaServicio ps = new PersonaServicio();
        
        ps.crearPersona();  
        
        ps.esMayorDeEdad();
        
        ps.calcularIMC();
        
    }
    
}
