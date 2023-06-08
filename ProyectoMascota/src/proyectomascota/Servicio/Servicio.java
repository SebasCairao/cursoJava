package proyectomascota.Servicio;

import java.util.ArrayList;
import java.util.Scanner;
import proyectomascota.Entidad.EntidadMascota;

public class Servicio {

    //inicializo las variables
    private final Scanner leer = new Scanner(System.in);
     ArrayList<EntidadMascota> mascotas = new ArrayList();

    //Creo mascotas
    public EntidadMascota crearMascotas() {
        
        System.out.println("Ingrese nombre de mascota");
        String nombre = leer.nextLine();
        System.out.println("Ingrese apodo");
        String apodo = leer.nextLine();
        System.out.println("Ingrese tipo");
        String tipo = leer.nextLine();
        System.out.println("Ingrtese nombre de color");
        String color = leer.nextLine();
        
        EntidadMascota m = new EntidadMascota(nombre, apodo, tipo, color);

        //uso el contructor
        return m;
        
    }

// este metodo se encarga de meter las mascotas en el ARRAYLIST
    public void agregarMascotas(EntidadMascota m) {
        mascotas.add(m);
    }

    //muestro mascota
    public void mostrarMascotas() {
        System.out.println("LAs mascotas actuales son: ");
        for (EntidadMascota var : mascotas) {
            System.out.println(var.toString());
        }
    }

    //fabrica de mascoptas
    public ArrayList<EntidadMascota> fabricaMascota(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            EntidadMascota mascotaCreada = crearMascotas();
            agregarMascotas(mascotaCreada);
            
            //ArrayList<EntidadMascota> b = new ArrayList<> ();
        }return new ArrayList<EntidadMascota> ();
    }

//tomo objeto original y lo modifico, no es necesario volver a guardarlo en la colecccion
//public void actualizarMascota (int index){
//EntidadMascota x = mascotas.get(index);
//x.setApodo ("FORRO");}
    
    
    //Este metodo actualiza segun en index o indince la mascota(todos los atributos)
    public void actualizarMascota2(int index) {
        
        System.out.println("");
        System.out.println("-----ACTUALIZAR-----");
        
        EntidadMascota z = crearMascotas();
        mascotas.set(index, z);
    }
//metodo borrar

    public void eliminarMascotas(int index) {
        System.out.println("");
        System.out.println("-----ELIMINO POR i-----");
        mascotas.remove(index);
        
    }

    //metodo borrar 
    public void eliminaMascotaPorNombre(String nombre) {
        
         System.out.println("");
        System.out.println("-----ELIMINO POR NOMBRE-----");
        
        for (int i = 0; i < mascotas.size(); i++) {
            EntidadMascota m = mascotas.get(i);
            if (m.getNombre().equals(nombre)) {
                mascotas.remove(i);
                
            }
            
        }
       mostrarMascotas();
    }
    
}
