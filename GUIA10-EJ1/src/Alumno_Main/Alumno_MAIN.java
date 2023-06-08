/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alumno_Main;

import ServicioAlumnos.ServicioAlumnos;

/**
 *
 * @author Seba
 */
public class Alumno_MAIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ServicioAlumnos servAlum1 = new ServicioAlumnos();
        
        
        servAlum1.agregarAlumno();
        servAlum1.mostrarGrupoAlumnos();
        servAlum1.metodoUltimun();
        
        
        
        
    }
    
    
    
    
}
