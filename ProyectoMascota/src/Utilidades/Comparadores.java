
package Utilidades;

import java.util.Comparator;
import proyectomascota.Entidad.EntidadMascota;

public class Comparadores {

    public static Comparator<EntidadMascota> ordenNombre = new Comparator<EntidadMascota>() {
        @Override
        public int compare(EntidadMascota t, EntidadMascota t1) {
            return t1.getNombre().compareTo(t.getNombre()); 
        }
    };
    
    
        public static Comparator<EntidadMascota> ordenEdad = new Comparator<EntidadMascota>() {
        @Override
        public int compare(EntidadMascota t, EntidadMascota t1) {
            return t1.getEdad().compareTo(t.getEdad()); 
        }
    };
        
        
        
        
        
        
        
        
        
        
}
