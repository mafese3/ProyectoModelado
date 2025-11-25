public abstract class Recurso {

	private int calificacion;
	private String resena;
	private TipoEstado estado;
	private boolean favorito;
    private TipoRecurso tipo;

    ///Creamos el atributo del usuario que lo crea para hacer la relacion
    private Usuario usuario;

    ///Creamos el constructor de la clase
    public Recurso(int calificacion, String resena, TipoEstado estado, boolean favorito, Usuario usuario, TipoRecurso tipo) {
        this.calificacion = calificacion;
        this.resena = resena;
        this.estado = estado;
        this.favorito = favorito;
        this.usuario = usuario;
        this.tipo = tipo;

        //Para mantener la consistencia de la asociacion.
        usuario.addRecurso(this);
    }

    /**
     * @return La calificación asignada.
     */
	public int getCalificacion() {
		return this.calificacion;
	}

	/**
	 * @param calificacion La calificación a asignar.
	 */
	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}

    /**
     * @return La reseña escrita.
     */
	public String getResena() {
		return this.resena;
	}

	/**
	 * 
	 * @param resena La reseña a escribir.
	 */
	public void setResena(String resena) {
		this.resena = resena;
	}

    /**
     * @return El estado del recurso.
     */
	public TipoEstado getEstado() {
		return this.estado;
	}

	/**
	 * @param estado El estado del recurso.
	 */
	public void setEstado(TipoEstado estado) {
		this.estado = estado;
	}

    /**
     * @return true si es favorito. false si no lo es.
     */
	public boolean getFavorito() {
		return this.favorito;
	}

	/**
	 * @param favorito Valor del boolean.
	 */
	public void setFavorito(boolean favorito) {
		this.favorito = favorito;
	}


    /**
     * @param usuario El usuario creador del recurso.
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * @return El usuario creador del recurso.
     */
    public Usuario getUsuario() {
        return this.usuario;
    }

    /**
     * @return El tipo del recurso.
     */
    public TipoRecurso getTipo() {return this.tipo;}

    /**
     * @param tipo El tipo del recurso.
     */
    public void setTipo(TipoRecurso tipo) {this.tipo = tipo;}

    /**
     * @return El contenido al que hace referencia
     */
    public Contenido getContenido() {
        return null;
    }

    /**
     * Funcion que se va a sobreescribir para añadir una colección a las listas de colecciones propias de cada recurso.
     */
    public void addToColeccion(RecursoColeccion coleccion) {}
}