package EJ6_Main.Entidades.Servicios;

import java.util.Scanner;

public class Curso {

    String nombreCurso;
    int cantidadHorasPorDia;
    int cantidadDiasPorSemana;
    String turno;
    double precioPorHora;
    String[] arreglo1 = new String[5];
    Scanner leer = new Scanner(System.in);

    public Curso() {
    }

    public Curso(String nombreCurso, int cantidadHorasPorDia, int cantidadDiasPorSemana, String turno, double precioPorHora) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public String[] getArreglo1() {
        return arreglo1;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    @Override
    public String toString() {
        return "Curso{" + "nombreCurso=" + nombreCurso + ", cantidadHorasPorDia=" + cantidadHorasPorDia + ", cantidadDiasPorSemana=" + cantidadDiasPorSemana + ", turno=" + turno + ", precioPorHora=" + precioPorHora + ", arreglo1=" + arreglo1 + '}';
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public void setArreglo1(String[] arreglo1) {
        this.arreglo1 = arreglo1;
    }

    public void cargarAlum(String[] arreglo1) {

        System.out.println("Ingrese de a uno los alumnos presente ");
        for (int i = 0; i < arreglo1.length; i++) {
            arreglo1[i] = leer.next();
        }
    }

    public void mostrarAlum(String[] arreglo1) {

        for (int i = 0; i < arreglo1.length; i++) {
            System.out.print(arreglo1[i] + " ");
        }
        System.out.println(" ");
    }

    public Curso crearCurso() {

        Curso curso1 = new Curso();
        System.out.println("nombre del curso");

        curso1.setNombreCurso(leer.next());
        System.out.println("DiasPorSemana del curso");
        curso1.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println("HorasPorDia del curso");
        curso1.setCantidadHorasPorDia(leer.nextInt());
        //System.out.println("turno del curso");
        //curso1.turno = leer.next();
        System.out.println("precioPorHora del curso");
        curso1.setPrecioPorHora(leer.nextDouble());
        System.out.println(curso1.toString());

        return curso1;
    }

    public void ganacias(Curso curso1) {
        System.out.println(curso1.toString());
        double ganancias = curso1.getCantidadHorasPorDia() * curso1.getPrecioPorHora() * 5 * curso1.getCantidadDiasPorSemana();
        System.out.println("las ganancias son " + ganancias);

    }

}
