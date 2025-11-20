import java.util.ArrayList;
import java.util.List;

public class Libro extends Contenido{

	private String saga;
	private String editorial;
	private int paginas;
    private double sumaCalificaciones;
    private double califiacionMedia;

    /// Una lista con todos los recursos en los que está referenciado el libro.
    private List<RecursoLibro>  recursos;

    /// Creamos el constructor de la clase
    public Libro(String titulo, String genero, String fechaLanzamiento, String autor, String saga, String editorial, int paginas, UsuarioAdministrador usuario) {
        super(titulo, genero, fechaLanzamiento, autor, TipoContenido.LIBRO, usuario);

        this.saga = saga;
        this.editorial = editorial;
        this.paginas = paginas;
        this.sumaCalificaciones = 0;
        this.califiacionMedia = 0;

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

	public String getEditorial() {
		return this.editorial;
	}

	/**
	 * 
	 * @param editorial
	 */
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public int getPaginas() {
		return this.paginas;
	}

	/**
	 * 
	 * @param paginas
	 */
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}



    /// Añade un recurso
    public void addRecurso(RecursoLibro recurso) {
        this.recursos.add(recurso);
        sumaCalificaciones += recurso.getCalificacion();
        califiacionMedia = sumaCalificaciones / recursos.size();
    }

}