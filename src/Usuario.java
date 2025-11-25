import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.enumeration;

public class Usuario {

	private String nombreUsuario;
	private String email;
	private String contrasena;
	private String fechaRegistro;

    private List<Recurso> recursos;

    ///Creamos el constructor de la clase
    public Usuario(String nombreUsuario, String email, String contrasena, String fechaRegistro) {
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.contrasena = contrasena;
        this.fechaRegistro = fechaRegistro;

        //Al crear un usuario, creamos el array de recursos que puede crear, aunque esté vacío.
        this.recursos = new ArrayList<Recurso>();
    }

    /**
     * @return El correo electrónico del usuario.
     */
	public String getEmail() {
		return this.email;
	}

	/**
	 * @param email El correo electrónico del usuario.
	 */
	public void setEmail(String email) {
		this.email = email;
	}

    /**
     * @return La contraseña del usuario.
     */
	public String getContrasena() {
		return this.contrasena;
	}

	/**
	 * @param contrasena La contraseña del usuario.
	 */
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

    /**
     * @return La fecha de registro del usuario.
     */
	public String getFechaRegistro() {
		return this.fechaRegistro;
	}

	/**
	 * @param fechaRegistro La fecha de registro del usuario.
	 */
	public void setFechaRegistro(String fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

    /**
     * @return El nombre del usuario.
     */
	public String getNombreUsuario() {
		return this.nombreUsuario;
	}

	/**
	 * @param nombreUsuario El nombre del usuario.
	 */
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

    /**
     * @return La lista de recursos creados por el usuario.
     */
    public List<Recurso> getRecursos() {
        return this.recursos;
    }

    /**
     * @param recurso El recurso a añadir a la lista.
     */
    public void addRecurso(Recurso recurso) {
        this.recursos.add(recurso);
    }

    /**
     * @param recurso El recurso a eliminar de la lista.
     */
    public void removeRecurso(Recurso recurso) {
        this.recursos.remove(recurso);
    }

    /**
     * Devuelve una lista de todas las colecciones que ha creado el usuario.
     * @return Lista de las colecciones del usuario.
     */
    public List<RecursoColeccion> getColecciones() {
        List<RecursoColeccion> colecciones = new ArrayList<>();
        for (Recurso recurso : this.recursos) {
            if(recurso instanceof RecursoColeccion) {
                colecciones.add((RecursoColeccion) recurso);
            }
        }

        return colecciones;
    }


}