import java.util.ArrayList;
import java.util.List;

public class Pelicula extends Contenido{


	private int duracion;
    private double sumaCalificaciones;
    private double calificacionMedia;

    private UsuarioAdministrador usuario;
    private List<RecursoPelicula> recursos;


    /// Creamos el constructor de la clase
    public Pelicula(String nombre, String director, String fechaEstreno, int duracion, String genero, UsuarioAdministrador usuario) {
        super(nombre, genero, fechaEstreno, director, TipoContenido.PELICULA, usuario);
        this.duracion = duracion;
        this.recursos = new ArrayList<RecursoPelicula>();

        this.calificacionMedia = 0.0;
        this.sumaCalificaciones = 0.0;
        usuario.addCreacion(this);
    }

    public int getDuracion() {return this.duracion;}

	/**
	 * 
	 * @param duracion
	 */
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}



    /// Devuelve el usuario creador
    public UsuarioAdministrador getUsuario() {return this.usuario;}

    /// Añadir un recurso
    public void addRecurso(RecursoPelicula recurso) {
        this.recursos.add(recurso);
    }
}