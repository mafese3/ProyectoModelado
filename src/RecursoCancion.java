import java.util.List;

public class RecursoCancion extends Recurso {

	private String fechaEscucha;
    private Cancion cancion;

    private List<RecursoColeccion> colecciones;

    //Creamos el constructor haciendo referencia al de la clase abstracta
    public RecursoCancion(int calificacion, String resena, TipoEstado estado, boolean favorito, Usuario usuario, String fechaEscucha, Cancion cancion) {
        super(calificacion, resena, estado, favorito, usuario, TipoRecurso.MUSICA);
        this.fechaEscucha = fechaEscucha;
        this.cancion = cancion;

        cancion.addRecurso(this);
    }

    /**
     * @return La fecha en la que se ha escuchado la canción.
     */
	public String getFechaEscucha() {
		return this.fechaEscucha;
	}

	/**
	 * @param fechaEscucha La fecha en la que se ha escuchado la canción.
	 */
	public void setFechaEscucha(String fechaEscucha) {
		this.fechaEscucha = fechaEscucha;
	}


    /**
     * @return La canción a la que hace referencia.
     */
    public Cancion getCancion() {
        return this.cancion;
    }

    /**
     * Elimina el recurso propio.
     */
    public void eliminar() {
        this.cancion.removeRecurso(this);
    }

    /**
     * @return Una cadena de todas las colecciones en las que está contenido el recurso.
     */
    public String getListaColecciones() {
        String listaColecciones = "";

        if(this.colecciones != null) {
            for (RecursoColeccion coleccion : this.colecciones) {
                if(coleccion.equals(colecciones.get(colecciones.size()-1))) {
                    listaColecciones += coleccion.getNombreColeccion();
                } else {
                    listaColecciones += coleccion.getNombreColeccion() + ", ";
                }
            }
        }

        return  listaColecciones;
    }

}