import java.util.ArrayList;
import java.util.List;

public class Libro extends Contenido{

	private String saga;
	private String editorial;
	private int paginas;
    private double sumaCalificaciones;
    private double calificacionMedia;

    /// Una lista con todos los recursos en los que está referenciado el libro.
    private List<RecursoLibro>  recursos;

    /// Creamos el constructor de la clase
    public Libro(String titulo, String genero, String fechaLanzamiento, String autor, String saga, String editorial, int paginas, UsuarioAdministrador usuario) {
        super(titulo, genero, fechaLanzamiento, autor, TipoContenido.LIBRO, usuario);

        this.saga = saga;
        this.editorial = editorial;
        this.paginas = paginas;
        this.sumaCalificaciones = 0;
        this.calificacionMedia = 0;

        this.recursos = new ArrayList<RecursoLibro>();
    }

    /**
     * @return La saga a la que pertenece el libro.
     */
	public String getSaga() {
		return this.saga;
	}

	/**
	 * @param saga La saga a la que pertenece el libro.
	 */
	public void setSaga(String saga) {
		this.saga = saga;
	}


    /**
     * @return La editorial a la que forma parte el libro.
     */
	public String getEditorial() {
		return this.editorial;
	}

	/**
	 * 
	 * @param editorial La editorial a la que forma parte el libro.
	 */
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}


    /**
     * @return El número de páginas del libro.
     */
    public int getPaginas() {
		return this.paginas;
	}

	/**
	 * @param paginas El número de páginas del libro.
	 */
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}


    /**
     * Se añade un recurso en el que ha sido referenciado el libro.
     * @param recurso El recurso en el que ha sido referenciado.
     */
    public void addRecurso(RecursoLibro recurso) {
        this.recursos.add(recurso);
        sumaCalificaciones += recurso.getCalificacion();
        calificacionMedia = sumaCalificaciones / recursos.size();

        System.out.println("Recurso añadido. Calificacion media de la canción: " + this.calificacionMedia);
    }

}