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

	public String getEmail() {
		return this.email;
	}

	/**
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	public String getContrasena() {
		return this.contrasena;
	}

	/**
	 * @param contrasena
	 */
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getFechaRegistro() {
		return this.fechaRegistro;
	}

	/**
	 * @param fechaRegistro
	 */
	public void setFechaRegistro(String fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public String getNombreUsuario() {
		return this.nombreUsuario;
	}

	/**
	 * @param nombreUsuario
	 */
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}




    /**
    MÉTODOS CREADOS A PARTIR DE LA CLASE PARA DARLE FUNCIONALIDADES.
    */


    ///Devuelve la lista de recursos que ha creado el usuario.
    public List<Recurso> getRecursos() {
        return this.recursos;
    }

    ///Añade un recurso a la lista de recursos creados por el usuario.
    public void addRecurso(Recurso recurso) {
        this.recursos.add(recurso);
    }

    ///Elimina un recurso de la lista de recursos creados por el usuario.
    public void removeRecurso(Recurso recurso) {
        this.recursos.remove(recurso);
    }
}