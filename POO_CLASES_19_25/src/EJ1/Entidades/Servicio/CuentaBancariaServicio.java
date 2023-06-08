package EJ1.Entidades.Servicio;

import EJ1.Entidades.ClaseBancaria; // me traigo la clase entidad, donde construye cada cuenta bancaria
import java.util.Scanner;  //trae calse scanner

public class CuentaBancariaServicio {

    Scanner leer = new Scanner(System.in);
    ClaseBancaria c1 = new ClaseBancaria(); //creo objeto

    public void crearCuenta() {

        // priemer metodo para crear cuenta,como mi molde esta en "CLASEBANCARIA"
        //lo que hago es importar la clase y es comos i estuviera, pero hago ref al objeto.set o get
        System.out.println("ingrese numero de cuenta");
        c1.setNumeroCuenta(leer.nextInt());
        System.out.println("ingrese numero DNI");
        c1.setDniCliente(leer.nextInt());
        System.out.println("ingrese numero saldo");
        c1.setSaldoAtual(leer.nextDouble());
        //listo dimos los atributos

    }

    public void ingresar() {

        //este metodo lo que hace es ingresar
        double ingreso = 0;
        System.out.println("Ingrese dinero");
        ingreso = leer.nextDouble();
        c1.setSaldoAtual(c1.getSaldoAtual() + ingreso);//aca seteo mi nuevo saldo actual, paso por 
        //parametros --> geteo el saldo nuevo que coloco el usuario
        // sumado a lo que ingreso
    }

    public void retiro() {
        double retiro = 0;
        System.out.println("Retire dinero");
        retiro = leer.nextDouble();
        c1.setSaldoAtual(c1.getSaldoAtual() - retiro);
    }

    public void extraccionRapida() {
        double retiroR = 0;
        System.out.println("Realice un retiro rapido que no supere el 20% de su SA");
        retiroR = leer.nextDouble();

        if (retiroR > c1.getSaldoAtual() * 0.2) {
            System.out.println(" no puede retirar mas del 20% de su SA");
        } else {
            System.out.println("ok");
            c1.setSaldoAtual(c1.getSaldoAtual() - retiroR);
        }
    }

    public void consultarSaldo() {
        System.out.println("Su saldo actual es " + c1.getSaldoAtual());
    }

    public void consultarDatos() {
        System.out.println("Los Datos de su cuenta son: " + c1.toString());
    }

}
