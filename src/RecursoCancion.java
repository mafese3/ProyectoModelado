public class RecursoCancion extends Recurso {

	private String fechaEscucha;
    private Cancion cancion;

    //Creamos el constructor haciendo referencia al de la clase abstracta
    public RecursoCancion(int calificacion, String resena, TipoEstado estado, boolean favorito, Usuario usuario, String fechaEscucha, Cancion cancion) {
        super(calificacion, resena, estado, favorito, usuario, TipoRecurso.MUSICA);
        this.fechaEscucha = fechaEscucha;
        this.cancion = cancion;

        cancion.addRecurso(this);
    }

	public String getFechaEscucha() {
		return this.fechaEscucha;
	}

	/**
	 * 
	 * @param fechaEscucha
	 */
	public void setFechaEscucha(String fechaEscucha) {
		this.fechaEscucha = fechaEscucha;
	}


    /// Devuelve la cancion a la que hace referencia
    public Cancion getCancion() {
        return this.cancion;
    }

}