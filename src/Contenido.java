public abstract class Contenido {
    private String nombre;
    private String genero;
    private String fechaLanzamiento;
    private String creador;
    private TipoContenido tipoContenido;
    private UsuarioAdministrador usuario;

    public Contenido(String nombre, String genero, String fechaLanzamiento, String creador, TipoContenido tipoContenido, UsuarioAdministrador usuario) {
        this.nombre = nombre;
        this.genero = genero;
        this.fechaLanzamiento = fechaLanzamiento;
        this.creador = creador;
        this.tipoContenido = tipoContenido;
        this.usuario = usuario;

        //Añadimos el contenido creado a la lista de creaciones del usuario administrador.
        usuario.addCreacion(this);
    }

    /**
     * @return Nombre del contenido.
     */
    public String getNombre() {return this.nombre;}
    /**
     * @param nombre El nombre del contenido
     */
    public void setNombre(String nombre) {this.nombre = nombre;}


    /**
     * @return Género del contenido.
     */
    public String getGenero() {return this.genero;}

    /**
     * @param genero El género del contenido.
     */
    public void setGenero(String genero) {this.genero = genero;}


    /**
     * @return La fecha de lanzamiento del contenido.
     */
    public String getFechaLanzamiento() {return this.fechaLanzamiento;}

    /**
     * @param fechaLanzamiento La fecha de lanzamiento del contenido.
     */
    public void setFechaLanzamiento(String fechaLanzamiento) {this.fechaLanzamiento = fechaLanzamiento;}


    /**
     * @return El creador del contenido.
     */
    public String getCreador() {return this.creador;}

    /**
     * @param creador El creador del contenido.
     */
    public void setCreador(String creador) {this.creador = creador;}


    /**
     * @return El tipo del contenido.
     */
    public TipoContenido getTipoContenido() {return this.tipoContenido;}

    /**
     * @param tipoContenido El tipo del contenido.
     */
    public void setTipoContenido(TipoContenido tipoContenido) {this.tipoContenido = tipoContenido;}


    /**
     * @return El usuario administrador que ha añadido el contenido.
     */
    public UsuarioAdministrador getUsuario() {return this.usuario;}

    /**
     * @param usuario El usuario administrador que ha añadido el contenido.
     */
    public void setUsuario(UsuarioAdministrador usuario) {this.usuario = usuario;}
}
