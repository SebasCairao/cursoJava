package Entidades;

public class EntidadPersona {

    private String nombre;
    private String apellido;
    private String posicion;
    private Integer num;

    public EntidadPersona() {
    }

    public EntidadPersona(String nombre, String apellido, String posicion, Integer num) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.posicion = posicion;
        this.num = num;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getPosicion() {
        return posicion;
    }

    public Integer getNum() {
        return num;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "EntidadPersona{" + "nombre=" + nombre + ", apellido=" + apellido + ", posicion=" + posicion + ", num=" + num + '}';
    }

}
