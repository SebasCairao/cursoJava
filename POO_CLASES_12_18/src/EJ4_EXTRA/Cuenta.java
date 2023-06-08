/*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego, crea un método "retirar_dinero" que permita 
retirar una cantidad de dinero del saldo de la cuenta. 
Asegúrate de que el saldo nunca sea negativo después de realizar una transacción de retiro.
 */
package EJ4_EXTRA;

import java.util.Scanner;

public class Cuenta {

    private int saldo = 1000;
    private String titual;
    private int saldorestante = 0;

    public Cuenta() {
    }

    public Cuenta(int saldo, String titual) {
        this.saldo = saldo;
        this.titual = titual;
    }

    public int getSaldo() {
        return saldo;
    }

    public String getTitual() {
        return titual;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setTitual(String titual) {
        this.titual = titual;
    }

    public Cuenta(String titual) {
        this.titual = titual;
    }

    public void setSaldorestante(int saldorestante) {
        this.saldorestante = saldorestante;
    }

    public int getSaldorestante() {
        return saldorestante;
    }

    public void retirarDinero() {
        saldorestante = saldo;
        Scanner leer = new Scanner(System.in);
        System.out.println("Retire dienero");

        saldorestante = leer.nextInt();
        if (saldorestante > saldo) {
            System.out.println("saldo insuficiente, es:" + saldo);

        } else {
            saldorestante = saldo - saldorestante;

        }
        
        if (saldorestante < 1001) {

            System.out.println(" su saldo es " + saldorestante);

        }

    }

}
