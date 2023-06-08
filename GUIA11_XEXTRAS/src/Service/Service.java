/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Clientes;
import Entidades.Vehiculo;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Service {

    Scanner leer = new Scanner(System.in);

    private List<Polizas> Polizas = new ArrayList();
    private Random ran = new Random();

    public Clientes creaCliente() {

        System.out.println("ingrese nombre y apellido");
        String nombre = leer.next();
        System.out.println("DNI");
        Integer DNI = leer.nextInt();
        System.out.println("Apellido");
        String apellido = leer.next();
        System.out.println("mail");
        String mail = leer.next();
        System.out.println("num de cliente");
        Integer nroCliente = ran.nextInt(300 + 100);
        System.out.println("telefono");
        String telefono= leer.next();

        Clientes c1 = new Clientes (nombre,apellido,DNI,mail,telefono);

        return c1;
        
        
    }
    

    
    
    

}
