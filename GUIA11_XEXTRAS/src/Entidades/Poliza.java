/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Enum.NewEnumFormaPago;
import Enum.NewEnumTipoPol;
import java.util.Date;

/**
 *
 * @author Seba
 */
public class Poliza {


private Vehiculo vehiculo;
private Clientes clientes;
private Integer nro;
private Date fechaIni;
private Date fechaFin;
private int cuotas;
private NewEnumFormaPago formaDePago;
private double montoasegurado;
private boolean granizo;
private double montoGranizo;
private NewEnumTipoPol tipoPoliza;

    public Poliza() {
    }

    public Poliza(Vehiculo vehiculo, Clientes clientes, Integer nro, Date fechaIni, Date fechaFin, int cuotas, NewEnumFormaPago formaDePago, double montoasegurado, boolean granizo, double montoGranizo, NewEnumTipoPol tipoPoliza) {
        this.vehiculo = vehiculo;
        this.clientes = clientes;
        this.nro = nro;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.cuotas = cuotas;
        this.formaDePago = formaDePago;
        this.montoasegurado = montoasegurado;
        this.granizo = granizo;
        this.montoGranizo = montoGranizo;
        this.tipoPoliza = tipoPoliza;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public Clientes getClientes() {
        return clientes;
    }

    public Integer getNro() {
        return nro;
    }

    public Date getFechaIni() {
        return fechaIni;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public int getCuotas() {
        return cuotas;
    }

    public NewEnumFormaPago getFormaDePago() {
        return formaDePago;
    }

    public double getMontoasegurado() {
        return montoasegurado;
    }

    public boolean isGranizo() {
        return granizo;
    }

    public double getMontoGranizo() {
        return montoGranizo;
    }

    public NewEnumTipoPol getTipoPoliza() {
        return tipoPoliza;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

    public void setNro(Integer nro) {
        this.nro = nro;
    }

    public void setFechaIni(Date fechaIni) {
        this.fechaIni = fechaIni;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setCuotas(int cuotas) {
        this.cuotas = cuotas;
    }

    public void setFormaDePago(NewEnumFormaPago formaDePago) {
        this.formaDePago = formaDePago;
    }

    public void setMontoasegurado(double montoasegurado) {
        this.montoasegurado = montoasegurado;
    }

    public void setGranizo(boolean granizo) {
        this.granizo = granizo;
    }

    public void setMontoGranizo(double montoGranizo) {
        this.montoGranizo = montoGranizo;
    }

    public void setTipoPoliza(NewEnumTipoPol tipoPoliza) {
        this.tipoPoliza = tipoPoliza;
    }

    @Override
    public String toString() {
        return "Poliza{" + "vehiculo=" + vehiculo + ", clientes=" + clientes + ", nro=" + nro + ", fechaIni=" + fechaIni + ", fechaFin=" + fechaFin + ", cuotas=" + cuotas + ", formaDePago=" + formaDePago + ", montoasegurado=" + montoasegurado + ", granizo=" + granizo + ", montoGranizo=" + montoGranizo + ", tipoPoliza=" + tipoPoliza + '}';
    }
    





}