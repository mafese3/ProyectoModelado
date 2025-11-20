import java.util.ArrayList;
import java.util.List;

public class Serie extends Contenido {

	private int numeroTemporadas;
    private double sumaCalificaciones;
    private double calificacionMedia;

    private List<RecursoSerie> recursos;

    /// Creamos el constructor de la clase
    public Serie(String nombre, String creador, int numeroTemporadas, String fechaEstreno, String genero, UsuarioAdministrador usuario) {
        super(nombre, genero, fechaEstreno, creador, TipoContenido.SERIE, usuario);
        this.numeroTemporadas = numeroTemporadas;
        this.recursos = new ArrayList<RecursoSerie>();

        sumaCalificaciones = 0;
        calificacionMedia = 0;
    }

    /**
     * @return El número de temporadas.
     */
	public int getNumeroTemporadas() {
		return this.numeroTemporadas;
	}

	/**
	 * @param numeroTemporadas El número de temporadas.
	 */
	public void setNumeroTemporadas(int numeroTemporadas) {
		this.numeroTemporadas = numeroTemporadas;
	}

    /**
     * @return La calificación media de la serie.
     */
    public double getCalificacionMedia() {
        return this.calificacionMedia;
    }

    /**
     * Añade un recurso en el que ha sido referenciada la serie.
     * @param recurso El recurso a añadir.
     */
    public void addRecurso(RecursoSerie recurso) {
        this.recursos.add(recurso);

        //Actualizamos la calificación media del contenido.
        sumaCalificaciones += recurso.getCalificacion();
        calificacionMedia = sumaCalificaciones / recursos.size();

        System.out.println("Recurso añadido. Calificación media de la serie: " + this.calificacionMedia);
    }

    /**
     * Elimina un recurso en el que estaba referenciada la serie.
     * @param recurso El recurso a eliminar.
     */
    public void removeRecurso(RecursoSerie recurso) {
        this.recursos.remove(recurso);

        //Actualizamos la calificación media del contenido.
        sumaCalificaciones -= recurso.getCalificacion();
        calificacionMedia = sumaCalificaciones / recursos.size();

        System.out.println("Recurso eliminado. Calificación media del álbum: " + this.calificacionMedia);
    }

    /**
     * Devuelve una cadena con las propiedades necesarias para que defina a la serie.
     * @return String descriptiva de la serie.
     */
    public String toString() {
        return ("Título: " + this.getNombre() + ", Calificación media: " + this.getCalificacionMedia() +
                ", Creada por: " + this.getCreador());
    }

}