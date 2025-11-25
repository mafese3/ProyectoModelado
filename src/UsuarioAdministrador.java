import java.util.ArrayList;
import java.util.List;

public class UsuarioAdministrador extends Usuario {
    private String dni;
    private String telefono;

    ///Añadimos los listados de creaciones que ha hecho
    private List<Contenido> creaciones;


    ///Creamos el constructor haciendo referencia a la clase abstracta
    public UsuarioAdministrador(String nombreUsuario, String email, String contrasena, String fechaRegistro, String dni, String telefono) {
        super(nombreUsuario, email, contrasena,fechaRegistro);
        this.dni = dni;
        this.telefono = telefono;

        //Inicializamos la lista de las creaciones
        creaciones = new ArrayList<Contenido>();
    }

    /**
     * @return El DNI del usuario.
     */
	public String getDni() {
		return this.dni;
	}

	/**
	 * 
	 * @param dni El DNI del usuario.
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

    /**
     * @return El teléfono del usuario.
     */
	public String getTelefono() {
		return this.telefono;
	}

	/**
	 * @param telefono El teléfono del usuario.
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


    /**
     * @return Las creaciones del usuario.
     */
    public List<Contenido> getCreaciones() {
        return creaciones;
    }


    /**
     * @param contenido El contenido que ha creado el usuario.
     */
    public void addCreacion(Contenido contenido) {
        creaciones.add(contenido);
    }
}