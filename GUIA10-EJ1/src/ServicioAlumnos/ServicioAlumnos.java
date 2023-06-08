/*
Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package ServicioAlumnos;

import EntidadAlumno.EntidadAlumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ServicioAlumnos {

    //doy vida a las clases
    Scanner leer = new Scanner(System.in);
    ArrayList<EntidadAlumno> grupoDeAlumnos = new ArrayList();

    public void crearAlumno() {
        int[] aux = new int[3];  // Creo un vector Auxiliar

        EntidadAlumno alumnoCreado = new EntidadAlumno();
        System.out.println("Ingrese el nombre del alumno");
        alumnoCreado.setNombre(leer.next());

        //lleno el vector aux para poder completar sus notas
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese las notas del alumno por favor, son 3 : ");
            aux[i] = leer.nextInt();
        }
        alumnoCreado.setArray(aux); // seteo mi Array 

        grupoDeAlumnos.add(alumnoCreado);   //agrego el objeto a mi lista
    }

    //este metodo es el que crea y agrega
    public void agregarAlumno() {
        String x;
        do {
            crearAlumno();
            System.out.println("Desea agregar otro alumno S/N");
            x = leer.next().toUpperCase();
        } while (x.equals("S"));
        System.out.println("cantida de alumnos que ingresaste: " + grupoDeAlumnos.size());
    }

    public void mostrarGrupoAlumnos() {
        for (EntidadAlumno foreDeGrupoAlumno : grupoDeAlumnos) {
            System.out.println(" " + foreDeGrupoAlumno.toString());
        }

    }

    public void metodoUltimun() {
        String alumnoBuscado;
        System.out.println("Ingrese un nombre de alumno para ver notas");
        alumnoBuscado = leer.next().toLowerCase();

        //creo mi iterator de la clase entidalum, le pongo un nombre y lo igualo a mi lista a recorrer
        Iterator<EntidadAlumno> iteratorQueBusca = grupoDeAlumnos.iterator();
        //creo un vector aux para meter dentro el Array y calcular el promedio
        int[] aux2 = new int[3];
        while (iteratorQueBusca.hasNext()) {
            
            EntidadAlumno elAlumno = iteratorQueBusca.next();
            
            if (elAlumno.getNombre().equals(alumnoBuscado)) {
                System.out.println("es igual");
                double prom = 0;
                double suma = 0;
                
                aux2 = elAlumno.getArray();
                for (int i = 0; i < aux2.length; i++) {
                    suma = suma + aux2[i];
                }
                prom = suma/aux2.length;
                System.out.println("El promedio del alumno seleccionado es: " + prom );
                
            } else {
                System.out.println(" no es igual ");
            }
         }
        
            
    }

    
    public void metodoUltimun2() {
    String alumnoBuscado;
    System.out.println("Ingrese un nombre de alumno para ver notas");
    alumnoBuscado = leer.next().toLowerCase();

    int[] aux2 = new int[3];
    boolean encontrado = false;

    for (EntidadAlumno alumno : grupoDeAlumnos) {
        if (alumno.getNombre().equals(alumnoBuscado)) {
            System.out.println("Es igual");
            double prom = 0;
            double suma = 0;
            aux2 = alumno.getArray();

            for (int i = 0; i < aux2.length; i++) {
                suma = suma + aux2[i];
            }
            prom = suma / aux2.length;
            System.out.println("El promedio del alumno seleccionado es: " + prom);
            encontrado = true;
            break;
        }
    }

    if (!encontrado) {
        System.out.println("No es igual");
    }
}
    
    
    
    
    
    
}
