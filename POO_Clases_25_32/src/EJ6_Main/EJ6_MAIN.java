package EJ6_Main;

import EJ6_Main.Entidades.Servicios.Curso;

public class EJ6_MAIN {

    public static void main(String[] args) {

        Curso c1 = new Curso();

        c1.cargarAlum(c1.getArreglo1());
        c1 = c1.crearCurso();
        c1.mostrarAlum(c1.getArreglo1());
        c1.ganacias(c1);
    }
}
