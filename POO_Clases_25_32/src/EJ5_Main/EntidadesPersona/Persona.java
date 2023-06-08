package EJ5_Main.EntidadesPersona;

import java.util.Date;

public class Persona {

    String nombre;
    Date Nacimiento;

    public Persona() {
    }

    public Persona(String nombre, Date Nacimiento) {
        this.nombre = nombre;
        this.Nacimiento = Nacimiento;

    }

    public String getNombre() {
        return nombre;
    }

    public Date getNacimiento() {
        return Nacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNacimiento(Date Nacimiento) {
        this.Nacimiento = Nacimiento;
    }

}
