/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ2_Main;

import EJ2_Main.Entidades.ParDeNumeros;
import EJ2_Main.Entidades.Servicios.ParDeNumerosServicios;

/**
 *
 * @author Seba
 */
public class Main {

    public static void main(String[] args) {
        
        ParDeNumerosServicios n1 = new ParDeNumerosServicios(); //creo objeto n1 del tipo servicios
        
        ParDeNumeros c1 = n1.crear(); // creo c1 del tipo ParDeNumeros. Uso metodo Crear
        
        n1.mostar(c1);
        n1.mayor(c1);
        n1.CalcularPotencia(c1);
        
        
    }
}
