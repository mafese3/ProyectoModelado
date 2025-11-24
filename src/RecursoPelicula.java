import java.util.ArrayList;
import java.util.List;

public class RecursoPelicula extends Recurso{

	private int fechaVisionado;
	private int numeroVisionados;

    private Pelicula pelicula;
    private List<RecursoColeccion> colecciones;


    public RecursoPelicula(int calificacion, String resena, TipoEstado estado, boolean favorito, Usuario usuario, int fechaVisionado, int numeroVisionados,  Pelicula pelicula) {
        super(calificacion, resena, estado, favorito, usuario, TipoRecurso.AUDIOVISUAL);
        this.fechaVisionado = fechaVisionado;
        this.numeroVisionados = numeroVisionados;

        this.pelicula = pelicula;
        pelicula.addRecurso(this);
    }
    @Override
    public Pelicula getContenido() {
        return pelicula;
    }

    /**
     * @return La fecha en la que se ha visto la película.
     */
	public int getFechaVisionado() {
        return this.fechaVisionado;
	}

	/**
	 * @param fechaVisionado La fecha en la que se ha visto la película.
	 */
	public void setFechaVisionado(int fechaVisionado) {

        this.fechaVisionado = fechaVisionado;
	}

	public int getNumeroVisionados() {
		return this.numeroVisionados;
	}

	/**
	 * @param numeroVisionados El número de veces que se ha visto la película.
	 */
	public void setNumeroVisionados(int numeroVisionados) {
		this.numeroVisionados = numeroVisionados;
	}


    /**
     * Elimina el recurso propio.
     */
    public void eliminar() {
        this.pelicula.removeRecurso(this);
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

        return  listaColecciones;
    }
}