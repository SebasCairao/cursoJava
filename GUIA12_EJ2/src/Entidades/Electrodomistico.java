package Entidades;

import java.util.Scanner;

public class Electrodomistico {

    protected Double price;
    protected String colour;
    protected char consElec;
    protected Integer height;

    public Electrodomistico() {
    }

    public Electrodomistico(Double price, String colour, char consElec, Integer height) {
        this.price = price;
        this.colour = colour;
        this.consElec = consElec;
        this.height = height;
    }

    public Double getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public char getConsElec() {
        return consElec;
    }

    public Integer getHeight() {
        return height;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setConsElec(char consElec) {
        this.consElec = consElec;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Electrodomistico{" + "price=" + price + ", colour=" + colour + ", consElec=" + consElec + ", height=" + height + '}';
    }



    //este metodo contorla si esta ok el color
    Scanner leer = new Scanner(System.in);

    public void comprobarConsumo() {

        System.out.println("Ingrese el consumo de la A a la F");
        this.consElec = leer.next().charAt(0);

        if (consElec == 'a' || consElec == 'b' || consElec == 'c' || consElec == 'd' || consElec == 'e'
                || consElec == 'A' || consElec == 'B' || consElec == 'C' || consElec == 'D' || consElec == 'E') {
            this.consElec = consElec;
        } else {
            this.consElec = 'F';
        }

    }

    public void crearelctro() {
        this.price = 1000d;
        System.out.println("Ingrese el peso");
        this.height = leer.nextInt();
        comprobarConsumo();
        comprobarColor();

    }

    public void comprobarColor() {
        System.out.println("Ingrese el color");
        this.colour = leer.next().toLowerCase();

        if (colour.equals("negro") || colour.equals("rojo") || colour.equals("negro") || colour.equals("azul") || colour.equals("gris")) {
            this.colour = colour;
        } else {

            this.colour = "blanco";
        }
    }

    public void mostrar() {

        System.out.println(toString());

    }

}
