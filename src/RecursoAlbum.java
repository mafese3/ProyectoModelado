public class RecursoAlbum extends Recurso {

	private String fechaEscucha;
    private Album album;

    public RecursoAlbum(int calificacion, String resena, TipoEstado estado, boolean favorito, Usuario usuario, String fechaEscucha,  Album album) {
        super(calificacion, resena, estado, favorito, usuario, TipoRecurso.MUSICA);
        this.fechaEscucha = fechaEscucha;
        this.album = album;

        album.addRecurso(this);
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


    /// Devuelve el album al que hace referencia
    public Album getAlbum() {
        return this.album;
    }

}