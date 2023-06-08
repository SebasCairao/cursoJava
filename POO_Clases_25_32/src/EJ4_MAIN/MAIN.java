package EJ4_MAIN;

import EJ4_MAIN.ENTIDADES.FechaServicios.FechaServicios;
import java.util.Date;

public class MAIN {

    public static void main(String[] args) {

        FechaServicios s1 = new FechaServicios(); // creo objeto del tipo ""

        Date fechaYo = s1.fechaNacimiento();
        // System.out.println("naciste: " + fechaYo + "FECHA: "+ fechaYo.getDate() +"/"+ (fechaYo.getMonth()+1)+"/"+fechaYo.getYear() );
        Date fechaHoy = s1.fechaActual();

        s1.mostrar(fechaYo,fechaHoy);
        System.out.println("Edad: " +s1.edad(fechaYo, fechaHoy) );    

      

    }
}
