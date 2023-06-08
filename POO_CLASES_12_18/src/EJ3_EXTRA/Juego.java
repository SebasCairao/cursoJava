//Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos 
//jugadores jugar un juego de adivinanza de números. El primer jugador elige un número 
//y el segundo jugador intenta adivinarlo. El segundo jugador tiene un número limitado de intentos 
//y recibe una pista de "más alto" o "más bajo" después de cada intento. El juego termina cuando el 
//segundo jugador adivina el número o se queda sin intentos. Registra el número de intentos necesarios
//para adivinar el número y el número de veces que cada jugador ha ganado.
package EJ3_EXTRA;

import java.util.Scanner;

public class Juego {

    Scanner leer = new Scanner(System.in);
    private int num1;
    private int num2;
    private String Jugador1;
    private String Jugador2;
    int cont2 = 0;
    int win2 = 0;

    public Juego() {
    }

    public Juego(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getCont2() {
        return cont2;
    }

    public int getWin2() {
        return win2;
    }

    public void setCont(int cont2) {
        this.cont2 = cont2;
    }

    public void setWin(int win2) {
        this.win2 = win2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

//    public void iniciarJuego() {
//
//        num1 = (int) (Math.random() * 10 + 1); //PC
//        System.out.println("el numero de la pc es  " + num1);
//    }
    public void juegoGo() {
        int ronda = 1;
        System.out.println(" Adivine el numero del jugador 2, tenes 3 intentos");
        do {
            System.out.println("RONDA " + ronda);
            num1 = (int) (Math.random() * 10 + 1); //PC
            System.out.println("el numero de la pc es  " + num1);
            do {
                num2 = leer.nextInt();
                if (num1 == num2) {
                    System.out.println("Adivinaste");
                    System.out.println("   ");
                    win2++;
                    break;
                } else if (num2 > num1) {
                    cont2++;
                    System.out.println("Pista: Es mayor " + "Te restan " + cont2 + " intentos ");
                } else if (num2 < num1) {
                    cont2++;
                    System.out.println("Pista: Es mayor " + "Te restan " + cont2 + " intentos ");
                }
            } while (cont2 < 3);
            System.out.println("FIN INTENTOS");
            ronda++;
        } while (ronda < 4);
    }
}
