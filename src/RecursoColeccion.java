import java.util.ArrayList;
import java.util.List;

public class RecursoColeccion extends Recurso {

	private String nombreColeccion;
    private TipoRecurso tipoRecurso;
    private List<Recurso> recursos;

    //Creamos el constructor haciendo uso del de la clase abstracta
    public RecursoColeccion(int calificacion, String resena, TipoEstado estado, boolean favorito, Usuario usuario, String nombreColeccion) {
        super(calificacion, resena, estado, favorito, usuario, TipoRecurso.COLECCION);
        this.nombreColeccion = nombreColeccion;
        this.tipoRecurso = TipoRecurso.COLECCION;
        this.recursos = new ArrayList<Recurso>();
    }

    /**
     * @return El nombre de la colección.
     */
	public String getNombreColeccion() {
		return this.nombreColeccion;
	}

	/**
	 * @param nombreColeccion El nombre de la colección.
	 */
	public void setNombreColeccion(String nombreColeccion) {
		this.nombreColeccion = nombreColeccion;
	}

    /**
     * @param tipoRecurso El tipo de los recursos incluidos.
     */
    public void setTipoRecurso(TipoRecurso tipoRecurso) {
        this.tipoRecurso = tipoRecurso;
    }

    /**
     * @return El tipo de los recursos de la colección. "COLECCION" si está vacía.
     */
    public TipoRecurso getTipoRecurso() {return this.tipoRecurso;}

    /**
     * @param recurso El recurso a añadir en la colección.
     */
    public void addRecurso(Recurso recurso) {
        if (this.tipoRecurso == TipoRecurso.COLECCION) {
            this.tipoRecurso = recurso.getTipo();
        } else if(recurso.getTipo() == this.tipoRecurso) {
            this.recursos.add(recurso);
            System.out.println("El recurso de: "+ recurso.getContenido().getNombre() +" ha sido añadido.");
        } else {
            System.out.println("El recurso a añadir debe ser del mismo tipo que la colección.");
        }
    }

    /**
     * @param recurso El recurso a eliminar en la colección.
     */
    public void removeRecurso(Recurso recurso) {
        this.recursos.remove(recurso);
        //Si la colección se queda vacía, se convierte en tipo colección.
        if (this.recursos.isEmpty()) {
            this.tipoRecurso = TipoRecurso.COLECCION;
        }
        System.out.println("El recurso de: "+ recurso.getContenido().getNombre() + " ha sido eliminado.");
    }

    public List<Recurso> getRecursos() {
        return this.recursos;
    }

    /**
     * Devuelve una String con los títulos de los contenidos de todos los recursos que forman parte de la colección.
     * @return La cadena de los títulos concatenados.
     */
    public String getListaRecursos() {
        String listaRecursos = "";

        if (this.recursos != null) {
            for (Recurso recurso : this.recursos) {
                if (recurso.equals(recursos.get(recursos.size()-1))) {
                    listaRecursos += recurso.getContenido().getNombre();
                } else {
                    listaRecursos += recurso.getContenido().getNombre() + ", ";
                }
            }
        }

        return listaRecursos;
    }

    public void eliminar() {
        this.getUsuario().removeRecurso(this);
    }


}