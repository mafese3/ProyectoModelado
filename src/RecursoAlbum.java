import java.util.ArrayList;
import java.util.List;

public class RecursoAlbum extends Recurso {

	private String fechaEscucha;
    private Album album;

    private List<RecursoColeccion> colecciones;

    /// Creamos el constructor de la clase.
    public RecursoAlbum(int calificacion, String resena, TipoEstado estado, boolean favorito, Usuario usuario, String fechaEscucha,  Album album) {
        super(calificacion, resena, estado, favorito, usuario, TipoRecurso.MUSICA);
        this.fechaEscucha = fechaEscucha;

        this.album = album;
        album.addRecurso(this);
    }

    @Override
    public Album getContenido() {
        return this.album;
    }

    /**
     * @return La fecha en la que se ha escuchado el álbum.
     */
	public String getFechaEscucha() {
		return this.fechaEscucha;
	}

	/**
	 * @param fechaEscucha La fecha en la que se ha escuchado el álbum.
	 */
	public void setFechaEscucha(String fechaEscucha) {
		this.fechaEscucha = fechaEscucha;
	}


    /**
     * Elimina el recurso propio.
     */
    public void eliminar() {
        this.album.removeRecurso(this);

        for(RecursoColeccion coleccion: colecciones) {

        }
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