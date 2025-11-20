public class RecursoPelicula extends Recurso{

	private int fechaVisionado;
	private int numeroVisionados;

    private Pelicula pelicula;

    public RecursoPelicula(int calificacion, String resena, TipoEstado estado, boolean favorito, Usuario usuario, int fechaVisionado, int numeroVisionados,  Pelicula pelicula) {
        super(calificacion, resena, estado, favorito, usuario, TipoRecurso.LIBRO);
        this.fechaVisionado = fechaVisionado;
        this.numeroVisionados = numeroVisionados;

        this.pelicula = pelicula;

        pelicula.addRecurso(this);
    }

	public int getFechaVisionado() {

        return this.fechaVisionado;
	}

	/**
	 * 
	 * @param fechaVisionado
	 */
	public void setFechaVisionado(int fechaVisionado) {

        this.fechaVisionado = fechaVisionado;
	}

	public int getNumeroVisionados() {
		return this.numeroVisionados;
	}

	/**
	 * 
	 * @param numeroVisionados
	 */
	public void setNumeroVisionados(int numeroVisionados) {
		this.numeroVisionados = numeroVisionados;
	}

    /// Devuelve la pelicula a la que hacer referencia
    public Pelicula getPelicula() {
        return pelicula;
    }
}