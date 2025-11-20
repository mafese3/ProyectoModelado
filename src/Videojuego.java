import java.util.ArrayList;
import java.util.List;

public class Videojuego extends Contenido{


	private int duracion;

    private double calificacionMedia;
    private double sumaCalificaciones;

    private UsuarioAdministrador usuario;
    private List<RecursoVideojuego> recursos;

    /// Creamos el constructor de la clase
    public Videojuego(String nombre, String desarrollador, String fechaLanzamiento, int duracion, String genero, UsuarioAdministrador usuario) {
        super(nombre, genero, fechaLanzamiento, desarrollador, TipoContenido.VIDEOJUEGO, usuario);
        this.duracion = duracion;
        this.recursos = new ArrayList<RecursoVideojuego>();

        this.calificacionMedia = 0.0;
        this.sumaCalificaciones = 0.0;
        usuario.addCreacion(this);
    }



	public int getDuracion() {
		return this.duracion;
	}

	/**
	 * 
	 * @param duracion
	 */
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}


    /// Devuelve el usuario creador
    public UsuarioAdministrador getUsuario() {return this.usuario;}

    /// Añade un recurso a la lista
    public void addRecurso(RecursoVideojuego recurso) {
        this.recursos.add(recurso);
        sumaCalificaciones += recurso.getCalificacion();
        calificacionMedia =  sumaCalificaciones/recursos.size();
    }

}