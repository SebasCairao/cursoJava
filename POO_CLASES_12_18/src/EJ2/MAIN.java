/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. A continuación, se deben crear los siguientes métodos:
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Circunferencia.
Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
 */
package EJ2;

public class MAIN {

    public static void main(String[] args) {

        //creo objeto
        Circunferencia c1 = new Circunferencia();
        //necesito darle valor a radio
        c1.crearCircunferencia();
        //metodos llamo
        System.out.println("Radio es " + c1.getRadio());
        System.out.println("Perimetro es " + c1.perimetro());
        System.out.println("Area es " + c1.area());

    }

}
