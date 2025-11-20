public abstract class Recurso {

	private int calificacion;
	private String resena;
	private TipoEstado estado;
	private boolean favorito;
    private TipoRecurso tipo;

    private Usuario usuario;    ///Creamos el atributo del usuario que lo crea para hacer la relacion

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

	public int getCalificacion() {
		return this.calificacion;
	}

	/**
	 * 
	 * @param calificacion
	 */
	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}

	public String getResena() {
		return this.resena;
	}

	/**
	 * 
	 * @param resena
	 */
	public void setResena(String resena) {
		this.resena = resena;
	}

	public TipoEstado getEstado() {
		return this.estado;
	}

	/**
	 *
	 * @param estado
	 */
	public void setEstado(TipoEstado estado) {
		this.estado = estado;
	}

	public boolean getFavorito() {
		return this.favorito;
	}

	/**
	 * 
	 * @param favorito
	 */
	public void setFavorito(boolean favorito) {
		this.favorito = favorito;
	}


    /// Asigna un usuario creador al recurso.
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /// Devuelve el usuario que ha creado el recurso.
    public Usuario getUsuario() {
        return this.usuario;
    }

    public TipoRecurso getTipo() {return this.tipo;}
    public void setTipo(TipoRecurso tipo) {this.tipo = tipo;}
}