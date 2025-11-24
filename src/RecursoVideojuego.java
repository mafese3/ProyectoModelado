import java.util.List;

public class RecursoVideojuego extends Recurso {

	private int horasJugadas;
	private int dificultad;
	private String fechaInicio;
	private String fechaFin;

    private Videojuego videojuego;
    private List<RecursoColeccion> colecciones;


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

    @Override
    public Videojuego getContenido() {
        return this.videojuego;
    }


    /**
     * @return Las horas que ha jugado.
     */
	public int getHorasJugadas() {
		return this.horasJugadas;
	}

	/**
	 * @param horasJugadas Las horas que ha jugado.
	 */
	public void setHorasJugadas(int horasJugadas) {
		this.horasJugadas = horasJugadas;
	}

    /**
     * @return El grado de dificultad del videojuego.
     */
	public int getDificultad() {
		return this.dificultad;
	}

	/**
	 * @param dificultad El grado de dificultad del videojuego
	 */
	public void setDificultad(int dificultad) {
		this.dificultad = dificultad;
	}

    /**
     * @return La fecha en la que se ha empezado el videojuego.
     */
	public String getFechaInicio() {
		return this.fechaInicio;
	}

	/**
	 * @param fechaInicio La fecha en la que se ha empezado el videojuego.
	 */
	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

    /**
     * @return La fecha en la que se ha acabado el videojuego.
     */
	public String getFechaFin() {
		return this.fechaFin;
	}

	/**
	 * @param fechaFin La fecha en la que se ha acabado el videojuego.
	 */
	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}



    /**
     * Elimina el recurso propio.
     */
    public void eliminar() {
        this.videojuego.removeRecurso(this);
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