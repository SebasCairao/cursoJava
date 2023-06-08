/*/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. A continuación, se deben crear los siguientes métodos:
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Circunferencia.
Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
 */
package EJ2;

import java.util.Scanner;

public class Circunferencia {
//atributo

    private double radio;

    //constructorespermiten acceder a las variables
    public Circunferencia() {
    }

//seteadores permiten modificar los argumentos y aplicar logica
    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    //metodeo guardo radio
    public void crearCircunferencia() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un RADIO:");
        this.radio = leer.nextInt();
    }

    public double area() {
        double area = 0;
        area = Math.PI * Math.pow((radio), 2);
        return area;
    }

    public double perimetro() {
        double perimetro = 0;
        perimetro = 2 * Math.PI * radio;
        return perimetro;
    }

}
