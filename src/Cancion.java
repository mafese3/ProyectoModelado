import java.util.ArrayList;
import java.util.List;

public class Cancion extends Contenido{

	private int duracion;

    private double sumaCalificaciones;
    private double calificacionMedia;

    /// Una lista de todos los recursos en los que está referenciado la canción.
    private List<RecursoCancion> recursos;
    /// Una lista de todos los álbumes que contienen a la canción.
    private List<Album> albumes;

    /// Creamos el constructor de la clase
    public Cancion(String nombre, String artista, String fechaLanzamiento, int duracion, String genero, UsuarioAdministrador usuario) {
        //Construimos el objeto, inicializando todos sus atributos.
        super(nombre, genero, fechaLanzamiento, artista, TipoContenido.CANCION, usuario);

        this.duracion = duracion;
        this.sumaCalificaciones = 0;
        this.calificacionMedia = 0;

        this.recursos = new ArrayList<RecursoCancion>();
        this.albumes = new ArrayList<Album>();
    }

    /**
     * Devuelve la duración de la canción.
     * @return Duración de la canción.
     */
	public int getDuracion() {
		return this.duracion;
	}

	/**
     * Modifica o añade la duración de la canción.
	 * @param duracion Duracion de la canción.
	 */
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

    /**
     * Devuelve la calificación media de la canción.
     * @return Calificación media del contenido.
     */
    public double getCalificacionMedia() {return this.calificacionMedia;}


    /**
     * Añade un recurso en el que ha sido mencionada la canción.
     * @param recurso Recurso a añadir.
     */
    public void addRecurso(RecursoCancion recurso) {
        this.recursos.add(recurso);
        sumaCalificaciones += recurso.getCalificacion();
        calificacionMedia =  sumaCalificaciones/recursos.size();

        System.out.println("Recurso añadido. Calificacion media de la canción: " + this.calificacionMedia);
    }

    /**
     * Añade la canción a un álbum.
     * @param album Álbum en el que la canción va a ser contenida.
     */
    public void addToAlbum(Album album) {
        album.addCancion(this);
        this.albumes.add(album);
    }

    /**
     * Elimina la canción de un álbum
     * @param album Álbum del que la canción va a ser eliminada.
     */
    public void removeFromAlbum(Album album) {
        album.removeCancion(this);
        this.albumes.remove(album);
    }

}