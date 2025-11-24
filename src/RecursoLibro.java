import java.util.List;

public class RecursoLibro extends Recurso {

	private int horasLeidas;
	private int paginasLeidas;
	private String fechaInicio;
	private String fechaFin;

    private Libro libro;

    private List<RecursoColeccion> colecciones;

    //Creamos el constructor haciendo referencia al de la clase abstracta
    public RecursoLibro(int calificacion, String resena, TipoEstado estado, boolean favorito, Usuario usuario, int horasLeidas, int paginasLeidas, String fechaInicio, String fechaFin, Libro libro) {
        super(calificacion, resena, estado, favorito, usuario, TipoRecurso.LIBRO);
        this.horasLeidas = horasLeidas;
        this.paginasLeidas = paginasLeidas;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;

        this.libro = libro;
        libro.addRecurso(this);
    }

    @Override
    public Libro getContenido() {
        return this.libro;
    }

    /**
     * @return Las horas en las que ha sido completado el libro.
     */
	public int getHorasLeidas() {
		return this.horasLeidas;
	}

	/**
	 * @param horasLeidas Las horas en las que ha sido completada
	 */
	public void setHorasLeidas(int horasLeidas) {
		this.horasLeidas = horasLeidas;
	}

    /**
     * @return Las páginas leídas del libro.
     */
	public int getPaginasLeidas() {
		return this.paginasLeidas;
	}

	/**
	 * 
	 * @param paginasLeidas Las páginas leídas.
	 */
	public void setPaginasLeidas(int paginasLeidas) {
		this.paginasLeidas = paginasLeidas;
	}

    /**
     * @return La fecha de inicio en la que se ha empezado a leer el libro.
     */
	public String getFechaInicio() {
		return this.fechaInicio;
	}

	/**
	 * 
	 * @param fechaInicio La fecha en la que se ha empezado a leer el libro.
	 */
	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getFechaFin() {
		return this.fechaFin;
	}

	/**
	 * 
	 * @param fechaFin La fecha en la que se ha acabado el libro.
	 */
	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

    /**
     * Elimina el recurso propio.
     */
    public void eliminar() {
        this.libro.removeRecurso(this);
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