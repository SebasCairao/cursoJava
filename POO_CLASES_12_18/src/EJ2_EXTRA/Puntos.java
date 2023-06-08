//Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. A continuación, se deben crear los siguientes métodos:
//Método constructor que inicialice el radio pasado como parámetro.
//Métodos get y set para el atributo radio de la clase Circunferencia.
//Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
//Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
//Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
package EJ2_EXTRA;

import java.util.Scanner;

public class Puntos {



   

        public int x1;
        public int x2;
        public int y1;
        public int y2;

        public Puntos() {
        }

        public Puntos(int x1, int x2, int y1, int y2) {
            this.x1 = x1;
            this.x2 = x2;
            this.y1 = y1;
            this.y2 = y2;
        }
        
      
        public void crearPuntos() {
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese el primer valor de X: ");
            this.x1 = leer.nextInt();
            System.out.println("Ingrese el segundo valor de X: ");
            this.x2 = leer.nextInt();
            System.out.println("Ingrese el primer valor de Y: ");
            this.y1 = leer.nextInt();
            System.out.println("Ingrese el segundo valor de Y: ");
            this.y2 = leer.nextInt();
        }

        public double calcularPuntos() {
            int x = x2 - x1;
            int y = y2 - y1;
            double distancia = Math.sqrt(x * x + y * y);
            return distancia;
        }

    }

