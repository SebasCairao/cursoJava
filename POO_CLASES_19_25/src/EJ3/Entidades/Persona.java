package EJ3.Entidades;

public class Persona {

    private String nombre;
    private int edad;
    private String sexo;
    private double altura;
    private int peso;
    private int OTRO;

    public Persona() {
    }

    
    
    public Persona(String nombre, int edad, String sexo, double altura, int peso, int OTRO) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
        this.OTRO = OTRO;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public double getAltura() {
        return altura;
    }

    public int getPeso() {
        return peso;
    }

    public int getOTRO() {
        return OTRO;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setOTRO(int OTRO) {
        this.OTRO = OTRO;
    }

    
    
}
