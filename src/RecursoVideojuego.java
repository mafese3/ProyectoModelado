public class RecursoVideojuego extends Recurso {

	private int horasJugadas;
	private int dificultad;
	private String fechaInicio;
	private String fechaFin;

    private Videojuego videojuego;


    //Creamos el constructor haciendo referencia a la clase abstracta
    public RecursoVideojuego(int calificacion, String resena, TipoEstado estado, boolean favorito, Usuario usuario, int horasJugadas, int dificultad, String fechaInicio, String fechaFin, Videojuego videojuego) {
        super(calificacion, resena, estado, favorito, usuario, TipoRecurso.VIDEOJUEGO);
        this.horasJugadas = horasJugadas;
        this.dificultad = dificultad;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;

        this.videojuego = videojuego;
        videojuego.addRecurso(this);
    }


	public int getHorasJugadas() {
		return this.horasJugadas;
	}

	/**
	 * 
	 * @param horasJugadas
	 */
	public void setHorasJugadas(int horasJugadas) {
		this.horasJugadas = horasJugadas;
	}

	public int getDificultad() {
		return this.dificultad;
	}

	/**
	 * 
	 * @param dificultad
	 */
	public void setDificultad(int dificultad) {
		this.dificultad = dificultad;
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


    /// Devuelve el videojuego
    public Videojuego getVideojuego() {
        return videojuego;
    }

}