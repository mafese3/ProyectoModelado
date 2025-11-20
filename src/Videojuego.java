import java.util.ArrayList;
import java.util.List;

public class Videojuego extends Contenido{

    private double calificacionMedia;
    private double sumaCalificaciones;

    private List<RecursoVideojuego> recursos;

    /// Creamos el constructor de la clase
    public Videojuego(String nombre, String desarrollador, String fechaLanzamiento, int duracion, String genero, UsuarioAdministrador usuario) {
        super(nombre, genero, fechaLanzamiento, desarrollador, TipoContenido.VIDEOJUEGO, usuario);

        this.calificacionMedia = 0;
        this.sumaCalificaciones = 0;

        this.recursos = new ArrayList<RecursoVideojuego>();
    }

    /**
     * @return La calificación media del álbum.
     */
    public double getCalificacionMedia() {
        return calificacionMedia;
    }

    /**
     * Añade un recurso en el que ha sido referenciado el videojuego.
     * @param recurso El recurso a añadir.
     */
    public void addRecurso(RecursoVideojuego recurso) {
        this.recursos.add(recurso);

        //Actualizamos la calificación media del contenido.
        sumaCalificaciones += recurso.getCalificacion();
        calificacionMedia =  sumaCalificaciones/recursos.size();

        System.out.println("Recurso añadido. Calificación media del videojuego: " + this.calificacionMedia);
    }

    /**
     * Elimina un recurso en el que estaba referenciado el videojuego.
     * @param recurso El recurso a eliminar.
     */
    public void removeRecurso(RecursoVideojuego recurso) {
        this.recursos.remove(recurso);

        sumaCalificaciones -= recurso.getCalificacion();
        calificacionMedia = sumaCalificaciones/recursos.size();

        System.out.println("Recurso eliminado. Calificación media del videojuego: " + this.calificacionMedia);
    }

    /**
     * Devuelve una cadena con las propiedades necesarias para que defina al álbum.
     * @return String descriptiva del álbum.
     */
    public String toString(){
        return ("Título: " + this.getNombre() + ", Calificación media: " +  this.calificacionMedia +
                ", Creador por: " + this.getCreador());
    }
}