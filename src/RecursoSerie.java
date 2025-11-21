import java.util.List;

public class RecursoSerie extends Recurso {

	private int temporadaActual;
	private int episodioActual;
	private String fechaInicio;
	private String fechaFin;
    private int numeroVisionados;

    private Serie serie;
    private List<RecursoColeccion> colecciones;

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

    /**
     * @return La temporada que está viendo el usuario.
     */
	public int getTemporadaActual() {
		return this.temporadaActual;
	}

	/**
	 * @param temporadaActual La temporada que está viendo el usuario.
	 */
	public void setTemporadaActual(int temporadaActual) {
		this.temporadaActual = temporadaActual;
	}

    /**
     * @return El episodio que está viendo el usuario.
     */
	public int getEpisodioActual() {
		return this.episodioActual;
	}

	/**
	 * @param episodioActual El episodio que está el usuario.
	 */
	public void setEpisodioActual(int episodioActual) {
		this.episodioActual = episodioActual;
	}

    /**
     * @return La fecha en la que se empezó el visionado.
     */
	public String getFechaInicio() {
		return this.fechaInicio;
	}

	/**
	 * @param fechaInicio La fecha en la que se empezó el visionado.
	 */
	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

    /**
     * @return La fecha en la que acabó de ver la serie.
     */
	public String getFechaFin() {
		return this.fechaFin;
	}

	/**
	 * @param fechaFin La fecha en la que se acabó de ver la serie.
	 */
	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

    /**
     * @return El número de veces que se ha visto la serie.
     */
    public int getNumeroVisionados() {return this.numeroVisionados;}

    /**
     * @param numeroVisionados El número de veces que se ha visto la serie.
     */
    public void setNumeroVisionados(int numeroVisionados) {this.numeroVisionados = numeroVisionados;}

    /**
     * @return La serie a la que hace referencia.
     */
    public Serie getSerie() {
        return this.serie;
    }

    public void eliminar() {
        this.serie.removeRecurso(this);
    }

    /**
     * @return Una cadena de todas las colecciones en las que está contenido el recurso.
     */
    public String getListaColecciones() {
        String listaColecciones = "";

        if (this.colecciones != null) {
            for (RecursoColeccion coleccion : this.colecciones) {
                if (coleccion.equals(colecciones.get(colecciones.size()-1))) {
                    listaColecciones += coleccion.getNombreColeccion();
                } else {
                    listaColecciones += coleccion.getNombreColeccion() + ", ";
                }
            }
        }

        return listaColecciones;
    }

}