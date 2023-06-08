/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrador_java1.Service;

import integrador_java1.EntidadEstudiante.Estudiante;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Service {

    Scanner leer = new Scanner(System.in);

    //creo y lleno mi vector o clase llena de estudiantes
    public Estudiante[] creoGrupo() {
        Estudiante e1 = new Estudiante(); //creo mi objeto del tipo estudiante
        Estudiante[] grupo = new Estudiante[3]; //creo mi grupo

        for (int i = 0; i <= 2; i++) {

            System.out.println("Ingrese el nombre del estudiante");
            e1.setName(leer.next());
            //String nombre = leer.next();
            System.out.println("Ingrese la nota");
            e1.setNote(leer.nextDouble());
            //double nota = leer.nextDouble();
            grupo[i] = new Estudiante(e1.getName(), e1.getNote()); //uso constructor con argumento
        }
        return grupo;

    }

    public void mostrarVector(Estudiante[] grupo) {

        System.out.println("El vector es:");
        for (int i = 0; i <= 2; i++) {
            System.out.println(grupo[i].getName() + "-" + grupo[i].getNote() + "   ");
        }
        System.out.println(" ");

    }

    public double promedio(Estudiante[] grupo) {
        int cantidad = grupo.length;
        double suma = 0;
        double promedio = 0;

        for (int i = 0; i < grupo.length; i++) {
            suma = grupo[i].getNote() + suma;
        }
        promedio = suma / cantidad;

        System.out.println("El promedio de la clase es " + promedio);
        return promedio;
    }

    public String[] nuevoVectorAlumnosCapos(Estudiante[] grupo, double promedio) {
        int cont = 0;
        for (int i = 0; i < grupo.length; i++) {
            if (promedio < grupo[i].getNote()) {
                cont++;//Dim de mi nuevo arreglo
            }
        }
        System.out.println(" Cantidad de alumnos que Superan el promedio es: " + cont);
        String[] nombresCapos = new String[cont];
        int j = 0;
        for (int i = 0; i < grupo.length; i++) {
            if (promedio < grupo[i].getNote()) {
                nombresCapos[j] = grupo[i].getName();
            }
            else nombresCapos[j] = "";
        }
        for ( j = 0; j < cont; j++) {
            System.out.println("/"+nombresCapos[j]+"/");

        }
        return nombresCapos;
    }

}
