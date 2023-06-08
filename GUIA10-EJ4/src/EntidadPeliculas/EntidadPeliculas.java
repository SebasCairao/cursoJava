
package EntidadPeliculas;

/**
Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
 */
public class EntidadPeliculas {
    
    private String titulo;
    private String director;
    private Double horas;

    public EntidadPeliculas() {
    }

    public EntidadPeliculas(String titulo, String director, Double horas) {
        this.titulo = titulo;
        this.director = director;
        this.horas = horas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public Double getHoras() {
        return horas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setHoras(Double horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return "EntidadPeliculas{" + "titulo=" + titulo + ", director=" + director + ", horas=" + horas + '}';
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
