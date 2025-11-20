import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Album extends Contenido {

    private double sumaCalificaciones;
    private double calificacionMedia;

    /// Una lista de todos los recursos en los que está referenciado el álbum.
    private List<RecursoAlbum> recursos;

    /// Para hacer la asociación con Cancion, definimos una lista de canciones que van a estar contenidas en el álbum.
    private List<Cancion> canciones;

    /// Creamos el constructor de la clase.
    public Album(String nombre, String artista, String fechaLanzamiento, String genero, UsuarioAdministrador usuario, List<Cancion> listaCanciones) {
        //Construimos el objeto, inicializando todos sus atributos.
        super(nombre, genero, fechaLanzamiento, artista, TipoContenido.ALBUM, usuario);

        this.sumaCalificaciones = 0;
        this.calificacionMedia = 0;

        this.recursos = new ArrayList<RecursoAlbum>();
        this.canciones.addAll(listaCanciones);
    }

    /**
     * @return Calificación media del contenido.
     */
    public double getCalificacionMedia() {return this.calificacionMedia;}

    /**
     * Añade un recurso en el que ha sido referenciado el álbum.
     * @param recurso El recurso a añadir.
     */
    public void addRecurso(RecursoAlbum recurso) {
        this.recursos.add(recurso);

        //Actualizamos la calificación media del contenido.
        this.sumaCalificaciones += recurso.getCalificacion();
        this.calificacionMedia = sumaCalificaciones / recursos.size();

        System.out.println("Recurso añadido. Calificacion media del álbum: " + this.calificacionMedia);
    }

    /**
     * Elimina un recurso en el que estaba referenciado el álbum.
     * @param recurso El recurso a eliminar.
     */
    public void removeRecurso(RecursoAlbum recurso) {
        this.recursos.remove(recurso);

        //Actualizamos la calificación media del contenido.
        this.sumaCalificaciones -= recurso.getCalificacion();
        this.calificacionMedia = sumaCalificaciones / recursos.size();

        System.out.println("Recurso eliminado. Calificación media del álbum: " + this.calificacionMedia);
    }

    /**
     * Añade una canción a la listas de canciones contenidas en el álbum.
     * @param cancion La canción a añadir.
     */
    public void addCancion(Cancion cancion) {
        this.canciones.add(cancion);

        System.out.println("Cancion: " + cancion + " añadida al álbum: " + this.getNombre());
    }

    /**
     * Elimina una canción que estaba contenida en el álbum.
     * @param cancion
     */
    public void removeCancion(Cancion cancion) {
        if(this.canciones.size()==1) {
            throw new NullPointerException("El album no puede quedarse vacío");
        } else if(this.canciones.contains(cancion)) {
            this.canciones.remove(cancion);
            System.out.println("La canción: " + cancion.getNombre() + " ha sido eliminada del álbum: " + this.getNombre());
        }
    }

    /**
     * Devuelve una lista de las canciones contenidas dentro del álbum.
     * @return String con los títulos de las canciones concatenadas.
     */
    public String getListaCanciones() {
        String cancionesString = "";

        for(Cancion cancion: this.canciones) {
            if(cancion.equals(this.canciones.get(this.canciones.size()-1))) {
                cancionesString += cancion.getNombre();
            } else {
                cancionesString += cancion.getNombre() + ", ";
            }
        }

        return cancionesString;
    }


    /**
     * Devuelve una cadena con las propiedades necesarias para que defina al álbum.
     * @return String descriptiva del álbum.
     */
    public String toString() {
        return ("Título: " + this.getNombre() + ", Calificación media: "+ this.getCalificacionMedia() +
                ", Creado por: " + this.getCreador() + "\n Canciones contenidas: " + this.getListaCanciones());
    }
}