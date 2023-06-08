/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Enum.NewEnumColor;
import Enum.NewEnumTipo;

/**
 *
 * @author Seba
 */
public class Vehiculo {
    
    private String marca;
    private String modelo;
    private int anio;
    private Integer chasis;
    private Integer motor;
    private String tipo;
    private String color;

    public Vehiculo() {
        
        
    }

    public Vehiculo(String marca, String modelo, int anio, Integer chasis, Integer motor, String tipo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.chasis = chasis;
        this.motor = motor;
        this.tipo = tipo;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public Integer getChasis() {
        return chasis;
    }

    public Integer getMotor() {
        return motor;
    }

    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setChasis(Integer chasis) {
        this.chasis = chasis;
    }

    public void setMotor(Integer motor) {
        this.motor = motor;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", chasis=" + chasis + ", motor=" + motor + ", tipo=" + tipo + ", color=" + color + '}';
    }
    
    
    
    }

