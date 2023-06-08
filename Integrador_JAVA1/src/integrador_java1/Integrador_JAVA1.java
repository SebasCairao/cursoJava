//INTEGRADOR
package integrador_java1;

import integrador_java1.EntidadEstudiante.Estudiante;
import integrador_java1.Service.Service;

public class Integrador_JAVA1 {

    public static void main(String[] args) {

        Service s1 = new Service();
        Estudiante[] E1 = s1.creoGrupo();
        double promedioCurso = s1.promedio(E1);
        //String[] nuevoVectorAlumnosMejores = s1.nuevoVectorAlumnosCapos(E1, promedioCurso);

        s1.mostrarVector(E1);
        s1.promedio(E1);
        s1.nuevoVectorAlumnosCapos(E1, promedioCurso);

    }

}
