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


	public String getDni() {
		return this.dni;
	}

	/**
	 * 
	 * @param dni
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getTelefono() {
		return this.telefono;
	}

	/**
	 * 
	 * @param telefono
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


    /// Métodos para acceder al listado de todas las creaciones del usuario administrador
    public List<Contenido> getCreaciones() {
        return creaciones;
    }


    /// Métodos para añadir creaciones
    public void addCreacion(Contenido contenido) {
        creaciones.add(contenido);
    }
}