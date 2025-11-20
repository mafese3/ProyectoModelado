public class RecursoSerie extends Recurso {

	private int temporadaActual;
	private int episodioActual;
	private String fechaInicio;
	private String fechaFin;
    private int numeroVisionados;

    private Serie serie;

    //Creamos el constructor haciendo referencia a la clase abstracta
    public RecursoSerie(int calificacion, String resena, TipoEstado estado, boolean favorito, Usuario usuario, int temporadaActual, int episodioActual, String fechaInicio, String fechaFin, int numeroVisionados, Serie serie) {
        super(calificacion, resena, estado, favorito, usuario, TipoRecurso.AUDIOVISUAL);
        this.temporadaActual = temporadaActual;
        this.episodioActual = episodioActual;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.numeroVisionados = numeroVisionados;

        this.serie = serie;
        serie.addRecurso(this);
    }

	public int getTemporadaActual() {
		return this.temporadaActual;
	}

	/**
	 * 
	 * @param temporadaActual
	 */
	public void setTemporadaActual(int temporadaActual) {
		this.temporadaActual = temporadaActual;
	}

	public int getEpisodioActual() {
		return this.episodioActual;
	}

	/**
	 * 
	 * @param episodioActual
	 */
	public void setEpisodioActual(int episodioActual) {
		this.episodioActual = episodioActual;
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

    public int getNumeroVisionados() {return this.numeroVisionados;}
    public void setNumeroVisionados(int numeroVisionados) {this.numeroVisionados = numeroVisionados;}


    public Serie getSerie() {
        return this.serie;
    }

}