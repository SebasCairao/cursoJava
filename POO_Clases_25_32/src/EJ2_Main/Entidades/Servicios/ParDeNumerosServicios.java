package EJ2_Main.Entidades.Servicios;

import EJ2_Main.Entidades.ParDeNumeros;

public class ParDeNumerosServicios {

    public ParDeNumeros crear() {

        return new ParDeNumeros();
        
        
        // creo un objeto del tipo par numeros
        // ParDeNumeros c1 = new ParDeNumeros();
        // return c1;
    }

    public void mostar(ParDeNumeros c5) {

        System.out.println(" Los numeros son ");
        System.out.println(c5.getNum1() + "  y  " + c5.getNum2());
    }

    public double mayor(ParDeNumeros c1) {

        if (c1.getNum1() > c1.getNum2()) {
            System.out.println("EL NUMERO MAS GRANDE ES " + c1.getNum1());
            return c1.getNum1();
        } else {
            System.out.println("EL NUMERO MAS GRANDE ES " + c1.getNum2());
        }
        return c1.getNum2();
    }

    public void CalcularPotencia(ParDeNumeros c1) {

        Math.round(c1.getNum1());
        Math.round(c1.getNum2());

        if (c1.getNum1() > c1.getNum2()) {
            System.out.println("La porencia es : " + Math.pow(c1.getNum1(), c1.getNum2()));

        } else {
            System.out.println("La porencia es : " + Math.pow(c1.getNum2(), c1.getNum1()));

        }

    }

}
