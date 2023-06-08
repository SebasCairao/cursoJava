/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ4_MAIN.EntidadesDate;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class EntidadesDate {

    Scanner leer = new Scanner(System.in);

    private int dia;
    private int mes;
    private int anio;

    public EntidadesDate(int dia, int mes, int anio) {

    }

    public EntidadesDate() {
        System.out.println("Ingrese el DIA de su nacimeinto");
        dia = leer.nextInt();
        System.out.println("Ingrese el MES de su nacimeinto");
        mes = leer.nextInt();
        System.out.println("Ingrese el AÑO de su nacimeinto");
        anio = leer.nextInt();
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

}
