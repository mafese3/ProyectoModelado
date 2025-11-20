public class RecursoColeccion extends Recurso {

	private String nombreColeccion;

    //Creamos el constructor haciendo uso del de la clase abstracta
    public RecursoColeccion(int calificacion, String resena, TipoEstado estado, boolean favorito, Usuario usuario, String nombreColeccion) {
        super(calificacion, resena, estado, favorito, usuario, TipoRecurso.COLECCION);
        this.nombreColeccion = nombreColeccion;
    }

	public String getNombreColeccion() {
		return this.nombreColeccion;
	}

	/**
	 * 
	 * @param nombreColeccion
	 */
	public void setNombreColeccion(String nombreColeccion) {
		this.nombreColeccion = nombreColeccion;
	}

}