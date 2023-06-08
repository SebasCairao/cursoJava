package EJ2.Entidades;

public class Cafetera {

    private int capacidadMaxima = 1000;
    private int capacidadactual;

    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int capacidadactual) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadactual = capacidadactual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getCapacidadactual() {
        return capacidadactual;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCapacidadactual(int capacidadactual) {
        this.capacidadactual = capacidadactual;
    }

}
