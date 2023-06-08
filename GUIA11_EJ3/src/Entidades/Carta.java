/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Enumeraciones.EnumCartas;

/**
 *
 * @author Seba
 */
public class Carta {
    
    private String palo;
    private Integer numero;
    private EnumCartas enumcartas;

    public Carta() {
    }

    public Carta(String palo, Integer numero, EnumCartas enumcartas) {
        this.palo = palo;
        this.numero = numero;
        this.enumcartas = enumcartas;
    }

    public String getPalo() {
        return palo;
    }

    public Integer getNumero() {
        return numero;
    }

    public EnumCartas getEnumcartas() {
        return enumcartas;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setEnumcartas(EnumCartas enumcartas) {
        this.enumcartas = enumcartas;
    }

    @Override
    public String toString() {
        return "Carta{" + "palo=" + palo + ", numero=" + numero + ", enumcartas=" + enumcartas + '}';
    }
    
    
    
    
    

    
}
