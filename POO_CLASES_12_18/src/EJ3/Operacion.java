/*Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. A continuación, se deben crear los siguientes métodos:
Método constructor con todos los atributos pasados por parámetro.
Método constructor sin los atributos pasados por parámetro.
Métodos get y set.
Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
Método sumar(): calcular la suma de los números y devolver el resultado al main.
Método restar(): calcular la resta de los números y devolver el resultado al main
Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si no, se hace la multiplicación y se devuelve el resultado al main
Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero, el método devuelve 0 y se le informa al usuario el error se le informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
 */
package EJ3;

import java.util.Scanner;

public class Operacion {

    private int numeros1;
    private int numeros2;

    //constructores
    public Operacion() {
    }

    public Operacion(int numeros1, int numeros2) {
        this.numeros1 = numeros1;
        this.numeros1 = numeros1;
    }

    public int getNumeros1() {
        return numeros1;
    }

    public int getNumeros2() {
        return numeros2;
    }

    public void setNumeros1(int numeros1) {
        this.numeros1 = numeros1;
    }

    public void setNumeros2(int numeros2) {
        this.numeros2 = numeros2;
    }

    //ingreso numeros
    public void crearOperacion() {
        Scanner leer = new Scanner(System.in);
        System.out.println(" ingrese un numero ");
        numeros1 = leer.nextInt();
        System.out.println("Ingrese otro numero ");
        numeros2 = leer.nextInt();
    }

    public int sumar() {
        int sumar = numeros1 + numeros2;
        return sumar;
    }

    public int restar() {
        int restar = numeros1 - numeros2;
        return restar;
    }

    public int multiplicar() {
        if (numeros1 == 0 || numeros2 == 0) {
            System.out.println("LA multiplicaciones es con un valor en cero es invalida");
            int multiplicar = 0;
            return multiplicar;
        } else {
            int multiplicar = numeros1 * numeros2;
            return multiplicar;
        }
    }

    public double dividir() {
        if (numeros2 == 0) {
            System.out.println("No se puede dividir por cero");
            double dividir = 0;
            return dividir;
        } 
        double dividir = numeros1 / numeros2;
        return dividir;
    }
}
