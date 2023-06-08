
package EJ2;

import EJ2.Entidades.servicio.CafeteraServicio;

public class EJ2_Main {


    public static void main(String[] args) {
       
        CafeteraServicio A = new CafeteraServicio();
        
        A.agregarCafe();//lleno cafetera
        //A.llenarCafetera(); // declaro q loq ue tiene es su capacidad
        A.servirTaza(); //sirvo taza
        A.cafeActual(); //cafe actual
        
        
        
        
        
    }
    
}
