package integrador_java1.EntidadEstudiante;

public class Estudiante {

    String name;
    double note;

    public Estudiante() {
    }

    public Estudiante(String name, double note) {
        this.name = name;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public double getNote() {
        return note;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNote(double note) {
        this.note = note;
    }

}
