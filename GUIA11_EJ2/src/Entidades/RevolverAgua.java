package Entidades;

import java.util.Random;

public class RevolverAgua {

    private Integer posActual;
    private Integer posAgua;
    Random random = new Random();

    public RevolverAgua() {
    }

    public RevolverAgua(Integer posActual, Integer posAgua) {
        this.posActual = posActual;
        this.posAgua = posAgua;
    }

    public Integer getPosActual() {
        return posActual;
    }

    public Integer getPosAgua() {
        return posAgua;
    }

    public void setPosActual(Integer posActual) {
        this.posActual = posActual;
    }

    public void setPosAgua(Integer posAgua) {
        this.posAgua = posAgua;
    }

//METODOS////////////////////////////////////////////////////////////////
    
    
    
    public void llenar() {
        posActual = random.nextInt(6);
        posAgua = random.nextInt(6);
    }

    public void tostring() {

        System.out.println("Resultado de las posiciones");
        System.out.println("ruleta: " + posActual + " " + "Bala: " + posAgua);
    }

    public boolean mojar() {
               if (posActual == posAgua) {
          return true;
        }
        return false;
    }
    
   
    public void siguienteChorro() {
        if (posActual == 6) {
            posActual = 1;
        } else {
            posActual++;
        }
    }

}
