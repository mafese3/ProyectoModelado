import java.util.ArrayList;
import java.util.List;

public class Pelicula extends Contenido{


	private int duracion;
    private double sumaCalificaciones;
    private double calificacionMedia;

    private List<RecursoPelicula> recursos;


    /// Creamos el constructor de la clase
    public Pelicula(String nombre, String director, String fechaEstreno, int duracion, String genero, UsuarioAdministrador usuario) {
        super(nombre, genero, fechaEstreno, director, TipoContenido.PELICULA, usuario);
        this.duracion = duracion;
        this.recursos = new ArrayList<RecursoPelicula>();

        this.calificacionMedia = 0;
        this.sumaCalificaciones = 0;

        this.recursos = new ArrayList<RecursoPelicula>();
    }

    /**
     * @return La duración de la película.
     */
    public int getDuracion() {return this.duracion;}

	/**
	 * @param duracion La duración de la película
	 */
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}


    /**
     * Añadr un recurso en el que ha sido referenciada la película.
     * @param recurso El recurso a añadir
     */
    public void addRecurso(RecursoPelicula recurso) {
        this.recursos.add(recurso);

        //Actualizamos la calificación media del contenido
        this.sumaCalificaciones +=  recurso.getCalificacion();
        this.calificacionMedia = sumaCalificaciones / recursos.size();
    }

    /**
     * Elimina un recurso en el que estaba referenciada la película.
     * @param recurso El recurso a eliminar.
     */
    public void removeRecurso(RecursoPelicula recurso) {
        this.recursos.remove(recurso);

        //Actualizamos la calificación media del contenido.
        this.sumaCalificaciones -= recurso.getCalificacion();
        this.calificacionMedia = sumaCalificaciones / recursos.size();
    }

    public String toString() {
        return("Título: " + this.getNombre() + ", Calificación media: " + this.calificacionMedia +
                ", Dirigido por: " + this.getCreador());
    }


}