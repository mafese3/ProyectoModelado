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

        usuario.addCreacion(this);
    }



	public int getNumeroTemporadas() {
		return this.numeroTemporadas;
	}

	/**
	 * 
	 * @param numeroTemporadas
	 */
	public void setNumeroTemporadas(int numeroTemporadas) {
		this.numeroTemporadas = numeroTemporadas;
	}


    /// Se añade un recurso a la lista
    public void addRecurso(RecursoSerie recurso) {
        this.recursos.add(recurso);
        sumaCalificaciones += recurso.getCalificacion();
        calificacionMedia = sumaCalificaciones / recursos.size();
    }

}