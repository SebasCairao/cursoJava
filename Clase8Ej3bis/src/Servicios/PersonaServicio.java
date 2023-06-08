/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author crish
 */
public class PersonaServicio {
    
    Scanner sc = new Scanner(System.in);
    
    Persona[] persona = new Persona[4];
    
    // creamo personas como objetos del tipo persona N veces en este caso 4
    
    
    public Persona crearPersona(){
        
        for (int i = 0; i < persona.length; i++) {
            
            System.out.println("Ingrese el nombre de la persona: ");
            String nombre = sc.next();

            System.out.println("Ingrese la edad de la persona: ");
            int edad = sc.nextInt();

            System.out.println("Ingrese el sexo de la persona (H para hombre, M para mujer y O para otro): ");
            String sexo = sc.next();
            sexo = sexo.toUpperCase();
            while (!"H".equals(sexo) && !"M".equals(sexo) && !"O".equals(sexo)) {

                System.out.println("El sexo ingresado es inválido. Ingrese el sexo de la persona: ");
                sexo = sc.next();
                sexo = sexo.toUpperCase();
            }

            System.out.println("Ingrese el peso de la persona: ");
            double peso = sc.nextDouble();

            System.out.println("Ingrese la altura de la persona: ");
            double altura = sc.nextDouble();
            
           // lo que hago aca es meter cada dato que  pedi por teclado en  "i" 
            persona[i] = new Persona(nombre, edad, sexo, peso, altura);
        }
        //tengo que retornar el objeto para usarlo (n-1)
        
        return persona[3];
    }
    
    public void esMayorDeEdad(){
        
        double cont=0;
        
        for (Persona persona:persona){
            
            if(persona.getEdad()>=18){
            cont = cont + 1;
            }
        }
        System.out.println("El porcentaje de personas mayores a 18 años es "+((cont/persona.length)*100)+"%");
    }
    
    public void calcularIMC(){
        
        double cont1=0, cont0=0, cont2=0;
        
        for (Persona persona:persona){
            if ((persona.getPeso() / Math.pow(persona.getAltura(), 2)) < 20) {
                cont2++;
            } else {
                if ((persona.getPeso() / Math.pow(persona.getAltura(), 2)) > 25) {
                    cont1++;
                } else {
                    cont0++;
                }
            }
        }
        System.out.println("La cantidad de personas con sobreso es "+((cont1/persona.length)*100)+"%");
        System.out.println("La cantidad de personas con peso ideal es "+((cont0/persona.length)*100)+"%");
        System.out.println("La cantidad de personas con bajo peso es "+((cont2/persona.length)*100)+"%");
    }
   
}
