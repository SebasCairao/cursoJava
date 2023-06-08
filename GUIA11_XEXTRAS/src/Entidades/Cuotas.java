
package Entidades;

import Enum.NewEnumFormaPago;
import java.util.Date;

public class Cuotas {
    
    
    
    
    private int cantCuotas;
    private int montoTotal;
    private boolean paga;
    private Date fechaVenc;
    private NewEnumFormaPago formaDePago;

    public Cuotas() {
    }

    public Cuotas(int cantCuotas, int montoTotal, boolean paga, Date fechaVenc, NewEnumFormaPago formaDePago) {
        this.cantCuotas = cantCuotas;
        this.montoTotal = montoTotal;
        this.paga = paga;
        this.fechaVenc = fechaVenc;
        this.formaDePago = formaDePago;
    }

    public int getCantCuotas() {
        return cantCuotas;
    }

    public int getMontoTotal() {
        return montoTotal;
    }

    public boolean isPaga() {
        return paga;
    }

    public Date getFechaVenc() {
        return fechaVenc;
    }

    public NewEnumFormaPago getFormaDePago() {
        return formaDePago;
    }

    public void setCantCuotas(int cantCuotas) {
        this.cantCuotas = cantCuotas;
    }

    public void setMontoTotal(int montoTotal) {
        this.montoTotal = montoTotal;
    }

    public void setPaga(boolean paga) {
        this.paga = paga;
    }

    public void setFechaVenc(Date fechaVenc) {
        this.fechaVenc = fechaVenc;
    }

    public void setFormaDePago(NewEnumFormaPago formaDePago) {
        this.formaDePago = formaDePago;
    }

    @Override
    public String toString() {
        return "Cuotas{" + "cantCuotas=" + cantCuotas + ", montoTotal=" + montoTotal + ", paga=" + paga + ", fechaVenc=" + fechaVenc + ", formaDePago=" + formaDePago + '}';
    }
    
    
    
    
    
    
    
    
    
   
}
