package EJ3;

import EJ3.Entidades.Servicios.Servicios;


public class EJ3_Main {

    public static void main(String[] args) {

        Servicios P1 = new Servicios();
        Servicios P2 = new Servicios();
        Servicios P3 = new Servicios();
        Servicios P4 = new Servicios();
        
       

        P1.crearPersona();
        P1.calcularIMC();
        P1.esMayor();
        System.out.println("Es mayor de edad " + P1.esMayorDeEdad());

        System.out.println("-------------");
        P2.crearPersona();
        P2.calcularIMC();
        System.out.println("Es mayor de edad " + P2.esMayorDeEdad());

        System.out.println("-------------");
        P3.crearPersona();
        P3.calcularIMC();
        System.out.println("Es mayor de edad " + P3.esMayorDeEdad());

        System.out.println("-------------");
        P4.crearPersona();
        P4.calcularIMC();
        System.out.println("Es mayor de edad " + P4.esMayorDeEdad());

        //ARRAY
        int[] est = new int[4];
        double sobreP = 0;
        double bajoP = 0;
        double okP = 0;

        //lleno vector 
        est[0] = P1.calcularIMC();
        est[1] = P2.calcularIMC();
        est[2] = P3.calcularIMC();
        est[3] = P4.calcularIMC();

        System.out.println(" su vector es ");

        for (int i = 0; i < 4; i++) {
            System.out.print(est[i] + " ");
        }
        System.out.println(" ");

        for (int i = 0; i < 4; i++) {
            switch (est[i]) {
                case 1:
                    sobreP++;
                    break;
                case 0:
                    okP++;
                    break;
                case -1:
                    bajoP++;
                    break;
                default:
                    break;
            }
        }
        System.out.println(" El % de Gente con sobrepeso es :" + sobreP / 4 + "%");
        System.out.println(" El % de Gente con peso IDEAL es :" + okP / 4 + "%");
        System.out.println(" El % de Gente con bajopeso es :" + bajoP / 4 + "%");
        System.out.println("  ");

        //ahora mayor de edad /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        int[] edad = new int[4];

        double mayor = 0;
        double menor = 0;

        //lleno vector
        
        edad[0] = P1.esMayor();
        edad[1] = P2.esMayor();
        edad[2] = P3.esMayor();
        edad[3] = P4.esMayor();

        System.out.println(" su vector mayor de edad es ");

        for (int i = 0; i < 4; i++) {
            System.out.print(edad[i] + " ");
        }

        System.out.println(" ");

        for (int i = 0; i < 4; i++) {
            switch (edad[i]) {
                case 1:
                    mayor++;
                    break;
                case 0:
                    menor++;
                default:
                    break;
            }
        }

        System.out.println(" El % de gente mayor es: " + mayor / 4 + "%");

    }
}
