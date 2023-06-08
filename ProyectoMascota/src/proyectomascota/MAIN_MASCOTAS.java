package proyectomascota;

import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import proyectomascota.Entidad.EntidadMascota;
import proyectomascota.Servicio.Servicio;

public class MAIN_MASCOTAS {

    public static void main(String[] args) {

        Servicio servmasc = new Servicio();
        ArrayList<EntidadMascota> mascotas = new ArrayList();
       

        servmasc.fabricaMascota(3);

        servmasc.mostrarMascotas();
        
        servmasc.eliminaMascotaPorNombre("LOLA");
        
         servmasc.mostrarMascotas();

        servmasc.actualizarMascota2(1);

        servmasc.mostrarMascotas();

        //servmasc.eliminarMascotas(2);
        
        
       Collections.sort( mascotas, Comparadores.ordenNombre);
        
        
        
        
        
        
        
    }

}
