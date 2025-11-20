public class RecursoLibro extends Recurso {

	private int horasParaCompletar;
	private int paginasLeidas;
	private String fechaInicio;
	private String fechaFin;

    private Libro libro;

    //Creamos el constructor haciendo referencia al de la clase abstracta
    public RecursoLibro(int calificacion, String resena, TipoEstado estado, boolean favorito, Usuario usuario, int horasParaCompletar, int paginasLeidas, String fechaInicio, String fechaFin, Libro libro) {
        super(calificacion, resena, estado, favorito, usuario, TipoRecurso.LIBRO);
        this.horasParaCompletar = horasParaCompletar;
        this.paginasLeidas = paginasLeidas;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;

        this.libro = libro;
        libro.addRecurso(this);
    }
	public int getHorasParaCompletar() {
		return this.horasParaCompletar;
	}

	/**
	 * 
	 * @param horasParaCompletar
	 */
	public void setHorasParaCompletar(int horasParaCompletar) {
		this.horasParaCompletar = horasParaCompletar;
	}

	public int getPaginasLeidas() {
		return this.paginasLeidas;
	}

	/**
	 * 
	 * @param paginasLeidas
	 */
	public void setPaginasLeidas(int paginasLeidas) {
		this.paginasLeidas = paginasLeidas;
	}

	public String getFechaInicio() {
		return this.fechaInicio;
	}

	/**
	 * 
	 * @param fechaInicio
	 */
	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getFechaFin() {
		return this.fechaFin;
	}

	/**
	 * 
	 * @param fechaFin
	 */
	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}


    /// Devuelve el libro al que hace referencia
    public Libro getLibro() {
        return libro;
    }

}