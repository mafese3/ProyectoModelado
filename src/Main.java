//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //Creamos los usuarios que van a formar parte del flujo de la app
    Usuario usuario1 = new Usuario("Paula Fernandez", "paulafj@gmail.com", "paulafernandez123","25/11/25");
    Usuario usuario2 = new Usuario("Antonio Martin", "antoniomg@gmail.com", "antoniomartin123","25/11/25");
    Usuario usuario3 = new Usuario("Daniel Robles", "danielrc@gmail.com", "danielrobles123","25/11/25");
    Usuario usuario4 = new Usuario("Ainhoa Garcia", "ainhoagr@gmail.com", "ainhoagarcia123","25/11/25");

    UsuarioAdministrador admin1 = new UsuarioAdministrador("Marina Fernandez","marinafs@gmail.com","marinafernandez123","25/11/25","11111111A", "611111111");
    UsuarioAdministrador admin2 = new UsuarioAdministrador("Javier Urbaneja", "javierub@gmail.com","javierurbaneja123","25/11/25","22222222A","622222222");

    // Crear canciones sueltas
    Cancion cancion1 = new Cancion("Latin Girl", "Claudia Arenas", "2024-01-15", 180, "Pop", admin1);
    Cancion cancion2 = new Cancion("The fate of ophelia", "Taylor Swift", "2023-10-20", 220, "Pop", admin1);
    Cancion cancion3 = new Cancion("Je vole", "Téyou", "2024-03-10", 195, "Pop/Balade", admin2);
    Cancion cancion4 = new Cancion("Catarata", "Guillo Rist", "2023-08-05", 210, "Techno/Pop", admin2);
    Cancion cancion5 = new Cancion("Peaches", "Justin Bieber", "2021-03-19", 198, "R&B", admin2);
    Cancion cancion6 = new Cancion("4TO23", "Aitana", "2019-11-29", 200, "Pop", admin1);

    Cancion cancion7 = new Cancion("Euphoria", "Loreen", "2025-02-14", 185, "Dance-Pop", admin1);
    Cancion cancion8 = new Cancion("Starlight", "The Weeknd", "2025-03-22", 210, "R&B", admin1);
    Cancion cancion9 = new Cancion("Midnight Dreams", "Dua Lipa", "2025-04-10", 195, "Pop", admin2);
    Cancion cancion10 = new Cancion("Electric Soul", "Calvin Harris", "2025-05-18", 200, "Electronic", admin2);
    Cancion cancion11 = new Cancion("Neon Lights", "Billie Eilish", "2025-06-25", 178, "Alternative", admin1);


    // Crear canciones del álbum Lux de Rosalía
    Cancion cancionLux1 = new Cancion("Berghain", "Rosalía", "2022-07-28", 200, "Pop", admin1);
    Cancion cancionLux2 = new Cancion("La Perla", "Rosalía", "2022-03-18", 175, "Pop", admin1);
    Cancion cancionLux3 = new Cancion("Dios es un Stalker", "Rosalía", "2022-03-18", 160, "Flamenco/Pop", admin1);
    List<Cancion> cancionesLux = new ArrayList<>();
    cancionesLux.add(cancionLux1);
    cancionesLux.add(cancionLux2);
    cancionesLux.add(cancionLux3);

    // Crear canciones del álbum Anela de Belén Aguilera
    Cancion cancionAnela1 = new Cancion("Ático", "Belén Aguilera", "2023-05-12", 190, "Pop/Electrónica", admin2);
    Cancion cancionAnela2 = new Cancion("Mutantes", "Belén Aguilera", "2023-05-12", 185, "Pop", admin2);
    Cancion cancionAnela3 = new Cancion("Laberinto", "Belén Aguilera", "2023-05-12", 170, "Pop/Electrónica", admin2);
    List<Cancion> cancionesAnela = new ArrayList<>();
    cancionesAnela.add(cancionAnela1);
    cancionesAnela.add(cancionAnela2);
    cancionesAnela.add(cancionAnela3);

    // Crear canciones del álbum Cuarto Azul de Aitana
    Cancion cancionCuartoAzul1 = new Cancion("Conexión Psíquica", "Aitana", "2024-02-09", 200, "Pop", admin2);
    Cancion cancionCuartoAzul2 = new Cancion("Duele un montón despedirse de ti", "Aitana", "2024-02-09", 195, "Pop", admin2);
    Cancion cancionCuartoAzul3 = new Cancion("Superestrella", "Aitana", "2024-02-09", 180, "Pop", admin2);
    List<Cancion> cancionesCuartoAzul = new ArrayList<>();
    cancionesCuartoAzul.add(cancionCuartoAzul1);
    cancionesCuartoAzul.add(cancionCuartoAzul2);
    cancionesCuartoAzul.add(cancionCuartoAzul3);

    // Crear álbumes
    Album album1 = new Album("Lux", "Rosalía", "2022-03-18", "Flamenco Pop", admin1, cancionesLux);
    Album album2 = new Album("Anela", "Belén Aguilera", "2023-05-12", "Pop", admin2, cancionesAnela);
    Album album3 = new Album("Cuarto Azul", "Aitana", "2024-02-09", "Pop", admin2, cancionesCuartoAzul);

    // Crear libros
    Libro libro1 = new Libro("Los siete maridos de Evelyn Hugo", "Ficción contemporánea", "2017-06-13", "Taylor Jenkins Reid", "N/A", "Umbriel", 400, admin1);
    Libro libro2 = new Libro("La chica de nieve", "Thriller", "2020-10-22", "Javier Castillo", "N/A", "Suma de Letras", 448, admin1);
    Libro libro3 = new Libro("Harry Potter y la piedra filosofal", "Fantasía", "1997-06-26", "J.K. Rowling", "Harry Potter", "Salamandra", 254, admin2);
    Libro libro4 = new Libro("Harry Potter y el cáliz de fuego", "Fantasía", "2000-07-08", "J.K. Rowling", "Harry Potter", "Salamandra", 636, admin2);

    // Crear películas
    Pelicula pelicula1 = new Pelicula("Wicked", "Jon M. Chu", "2024-11-22", 160, "Musical", admin1);
    Pelicula pelicula2 = new Pelicula("Avatar", "James Cameron", "2009-12-18", 162, "Ciencia Ficción", admin1);
    Pelicula pelicula3 = new Pelicula("La La Land", "Damien Chazelle", "2016-12-09", 128, "Musical", admin2);
    Pelicula pelicula4 = new Pelicula("Whiplash", "Damien Chazelle", "2014-10-10", 106, "Drama", admin2);
    Pelicula pelicula5 = new Pelicula("La bella y la bestia", "Bill Condon", "2017-03-17", 129, "Musical", admin1);
    
    // Películas adicionales para Watchlist
    Pelicula pelicula6 = new Pelicula("Dune: Part Three", "Denis Villeneuve", "2026-03-20", 155, "Ciencia Ficción", admin1);
    Pelicula pelicula7 = new Pelicula("The Batman II", "Matt Reeves", "2026-10-03", 145, "Acción", admin2);
    Pelicula pelicula8 = new Pelicula("Oppenheimer", "Christopher Nolan", "2023-07-21", 180, "Drama", admin1);

    // Crear series
    Serie serie1 = new Serie("Los 100", "Jason Rothenberg", 7, "2014-03-19", "Ciencia Ficción", admin1);
    Serie serie2 = new Serie("Juego de Tronos", "David Benioff", 8, "2011-04-17", "Fantasía", admin2);
    Serie serie3 = new Serie("Stranger Things", "The Duffer Brothers", 5, "2016-07-15", "Ciencia Ficción", admin2);

    Serie serie4 = new Serie("The Last of Us", "Craig Mazin", 2, "2023-01-15", "Drama", admin1);
    Serie serie5 = new Serie("Wednesday", "Alfred Gough", 2, "2022-11-23", "Comedia", admin2);
    Serie serie6 = new Serie("The Crown", "Peter Morgan", 6, "2016-11-04", "Drama", admin1);


    // Crear videojuegos
    Videojuego videojuego1 = new Videojuego("Minecraft", "Mojang Studios", "2011-11-18", 0, "Sandbox", admin1);
    Videojuego videojuego2 = new Videojuego("Hollow Knight: Silksong", "Team Cherry", "2025-01-01", 20, "Metroidvania", admin1);
    Videojuego videojuego3 = new Videojuego("Hades", "Supergiant Games", "2020-09-17", 22, "Roguelike", admin2);
    Videojuego videojuego4 = new Videojuego("Hades II", "Supergiant Games", "2024-05-06", 25, "Roguelike", admin2);
    Videojuego videojuego5 = new Videojuego("Balatro", "LocalThunk", "2024-02-20", 15, "Deckbuilder", admin1);

    // Crear recursos de álbum
    RecursoAlbum recursoAlbum1 = new RecursoAlbum(5, "Increíble álbum, muy innovador", TipoEstado.COMPLETADO, true, usuario1, "2024-05-10", album1);
    RecursoAlbum recursoAlbum2 = new RecursoAlbum(4, "Me encantó, muy emotivo", TipoEstado.COMPLETADO, false, usuario2, "2024-06-15", album2);

    // Crear recursos de canción
    RecursoCancion recursoCancion1 = new RecursoCancion(5, "Mi canción favorita del año", TipoEstado.COMPLETADO, true, usuario1, "2024-01-20", cancion1);
    RecursoCancion recursoCancion2 = new RecursoCancion(4, "Muy pegadiza y emocionante", TipoEstado.COMPLETADO, true, usuario3, "2024-02-12", cancion2);

    // Crear recursos de libro
    RecursoLibro recursoLibro1 = new RecursoLibro(5, "Una obra maestra, lloré mucho", TipoEstado.COMPLETADO, true, usuario2, 8, 400, "2024-07-01", "2024-07-10", libro1);
    RecursoLibro recursoLibro2 = new RecursoLibro(4, "Muy entretenido y adictivo", TipoEstado.EN_CURSO, false, usuario4, 5, 250, "2024-11-01", "", libro2);

    // Crear recursos de película
    RecursoPelicula recursoPelicula1 = new RecursoPelicula(5, "Espectacular visualmente", TipoEstado.COMPLETADO, true, usuario1, 20241125, 2, pelicula1);
    RecursoPelicula recursoPelicula2 = new RecursoPelicula(5, "Una obra de arte cinematográfica", TipoEstado.COMPLETADO, true, usuario3, 20240315, 3, pelicula2);

    // Crear recursos de serie
    RecursoSerie recursoSerie1 = new RecursoSerie(4, "Muy buena serie, algo lenta al principio", TipoEstado.EN_CURSO, true, usuario2, 3, 8, "2024-09-01", "", 1, serie1);
    RecursoSerie recursoSerie2 = new RecursoSerie(5, "Épica y emocionante", TipoEstado.COMPLETADO, true, usuario4, 8, 6, "2023-01-15", "2023-06-20", 2, serie2);

    // Crear recursos de videojuego
    RecursoVideojuego recursoVideojuego1 = new RecursoVideojuego(5, "Infinitas horas de diversión", TipoEstado.EN_CURSO, true, usuario1, 350, 1, "2022-05-10", "", videojuego1);
    RecursoVideojuego recursoVideojuego2 = new RecursoVideojuego(5, "Obra maestra del roguelike", TipoEstado.COMPLETADO, true, usuario3, 45, 3, "2024-08-01", "2024-09-15", videojuego3);

    RecursoCancion recursoCancion3 = new RecursoCancion(5, "Me encanta esta canción!", TipoEstado.COMPLETADO, true, usuario1, "2025-02-20", cancion7);
    RecursoCancion recursoCancion4 = new RecursoCancion(5, "Súper pegadiza", TipoEstado.COMPLETADO, true, usuario1, "2025-03-25", cancion8);
    RecursoCancion recursoCancion5 = new RecursoCancion(4, "Muy buena producción", TipoEstado.COMPLETADO, true, usuario1, "2025-04-15", cancion9);
    RecursoCancion recursoCancion6 = new RecursoCancion(5, "Perfecta para bailar", TipoEstado.COMPLETADO, true, usuario1, "2025-05-20", cancion10);
    RecursoCancion recursoCancion7 = new RecursoCancion(5, "Simplemente perfecta", TipoEstado.COMPLETADO, true, usuario1, "2025-06-28", cancion11);

    RecursoPelicula recursoPelicula3 = new RecursoPelicula(0, "Pendiente de ver", TipoEstado.PENDIENTE, false, usuario2, 0, 0, pelicula6);
    RecursoPelicula recursoPelicula4 = new RecursoPelicula(0, "Quiero verla pronto", TipoEstado.PENDIENTE, false, usuario2, 0, 0, pelicula7);
    RecursoPelicula recursoPelicula5 = new RecursoPelicula(5, "Obra maestra del cine", TipoEstado.COMPLETADO, true, usuario2, 20240810, 1, pelicula8);
    
    RecursoSerie recursoSerie3 = new RecursoSerie(0, "En mi lista para ver", TipoEstado.PENDIENTE, false, usuario2, 0, 0, "", "", 0, serie4);
    RecursoSerie recursoSerie4 = new RecursoSerie(4, "Muy entretenida", TipoEstado.EN_CURSO, true, usuario2, 1, 5, "2024-10-15", "", 1, serie5);
    RecursoSerie recursoSerie5 = new RecursoSerie(0, "Pendiente", TipoEstado.PENDIENTE, false, usuario2, 0, 0, "", "", 0, serie6);

    // Crear colección "Canciones favoritas de 2025"
    RecursoColeccion coleccionCanciones2025 = new RecursoColeccion(5, "Mis favs de 2025", TipoEstado.EN_CURSO, true, usuario1, "Canciones favoritas de 2025");
    coleccionCanciones2025.addRecurso(recursoCancion3);
    coleccionCanciones2025.addRecurso(recursoCancion4);
    coleccionCanciones2025.addRecurso(recursoCancion5);
    coleccionCanciones2025.addRecurso(recursoCancion6);
    coleccionCanciones2025.addRecurso(recursoCancion7);

    // Crear colección "Watchlist"
    RecursoColeccion coleccionWatchlist = new RecursoColeccion(4, "Watchlist", TipoEstado.EN_CURSO, true, usuario2, "Watchlist");
    coleccionWatchlist.addRecurso(recursoPelicula3);
    coleccionWatchlist.addRecurso(recursoPelicula4);
    coleccionWatchlist.addRecurso(recursoPelicula5);
    coleccionWatchlist.addRecurso(recursoSerie3);
    coleccionWatchlist.addRecurso(recursoSerie4);
    coleccionWatchlist.addRecurso(recursoSerie5);

    // Crear colección "Cine de Autor"
    RecursoColeccion coleccionCineAutor = new RecursoColeccion(5, "Mis películas de culto favoritas", TipoEstado.EN_CURSO, true, usuario2, "Cine de Autor");
    coleccionCineAutor.addRecurso(recursoPelicula2);
    coleccionCineAutor.addRecurso(recursoPelicula5);
    coleccionCineAutor.addRecurso(recursoPelicula1);


    
    // ========== PRUEBAS DE ASOCIACIONES ENTRE CLASES ==========
    
    System.out.println("\n=== PRUEBA 1: Añadir canciones a álbumes existentes ===");
    cancion5.addToAlbum(album1);
    cancion6.addToAlbum(album2);
    
    System.out.println("\n=== PRUEBA 2: Mostrar lista de canciones de un álbum ===");
    System.out.println("Canciones del álbum Lux: " + album1.getListaCanciones());
    System.out.println("Canciones del álbum Anela: " + album2.getListaCanciones());
    
    System.out.println("\n=== PRUEBA 3: Eliminar una canción de un álbum ===");
    cancion5.removeFromAlbum(album1);
    System.out.println("Canciones del álbum Lux después de eliminar: " + album1.getListaCanciones());
    
    System.out.println("\n=== PRUEBA 4: Crear nuevos recursos y observar actualización de calificación media ===");
    System.out.println("La calificación media previa del álbum: "+ album1.getCalificacionMedia());
    RecursoAlbum recursoAlbum3 = new RecursoAlbum(3, "No me convenció del todo", TipoEstado.COMPLETADO, false, usuario3, "2024-08-20", album1);
    RecursoAlbum recursoAlbum4 = new RecursoAlbum(5, "Obra maestra", TipoEstado.COMPLETADO, true, usuario4, "2024-09-10", album1);
    System.out.println("La calificación media posterior del álbum: "+album1.getCalificacionMedia());
    
    System.out.println("\n=== PRUEBA 5: Añadir y eliminar recursos de colecciones ===");
    System.out.println("Recursos en colección Canciones favoritas de 2025:");
    System.out.println(coleccionCanciones2025.getListaRecursos());
    
    coleccionCanciones2025.removeRecurso(recursoCancion5);
    System.out.println("Después de eliminar recursoCancion5:");
    System.out.println(coleccionCanciones2025.getListaRecursos());
    
    coleccionCanciones2025.addRecurso(recursoCancion1);
    System.out.println("Después de añadir recursoCancion1:");
    System.out.println(coleccionCanciones2025.getListaRecursos());
    
    System.out.println("\n=== PRUEBA 6: Crear recursos de canciones y ver actualización de calificación ===");
    RecursoCancion recursoCancion8 = new RecursoCancion(4, "Me gusta mucho", TipoEstado.COMPLETADO, true, usuario2, "2024-11-10", cancion1);
    RecursoCancion recursoCancion9 = new RecursoCancion(5, "Perfecta", TipoEstado.COMPLETADO, true, usuario3, "2024-11-15", cancion1);
    RecursoCancion recursoCancion10 = new RecursoCancion(3, "Regular", TipoEstado.COMPLETADO, false, usuario4, "2024-11-20", cancion1);
    
    System.out.println("\n=== PRUEBA 7: Crear recursos de libros con diferentes estados ===");
    RecursoLibro recursoLibro3 = new RecursoLibro(0, "Pendiente de leer", TipoEstado.PENDIENTE, false, usuario1, 0, 0, "", "", libro3);
    RecursoLibro recursoLibro4 = new RecursoLibro(4, "Muy emocionante hasta ahora", TipoEstado.EN_CURSO, true, usuario3, 12, 450, "2024-10-01", "", libro4);
    RecursoLibro recursoLibro5 = new RecursoLibro(5, "Increíble de principio a fin", TipoEstado.COMPLETADO, true, usuario2, 15, 636, "2024-08-05", "2024-08-20", libro4);
    
    System.out.println("\n=== PRUEBA 8: Crear recursos de películas y verificar visionados ===");
    RecursoPelicula recursoPelicula6 = new RecursoPelicula(5, "La he visto 5 veces", TipoEstado.COMPLETADO, true, usuario1, 20241010, 5, pelicula3);
    RecursoPelicula recursoPelicula7 = new RecursoPelicula(4, "Muy buena", TipoEstado.COMPLETADO, true, usuario3, 20240620, 2, pelicula4);
    
    System.out.println("\n=== PRUEBA 9: Crear recursos de series con progreso ===");
    RecursoSerie recursoSerie6 = new RecursoSerie(5, "Enganchado totalmente", TipoEstado.EN_CURSO, true, usuario1, 2, 3, "2024-11-01", "", 1, serie3);
    RecursoSerie recursoSerie7 = new RecursoSerie(0, "Quiero empezarla pronto", TipoEstado.PENDIENTE, false, usuario3, 0, 0, "", "", 0, serie1);
    
    System.out.println("\n=== PRUEBA 10: Crear recursos de videojuegos con diferentes dificultades ===");
    RecursoVideojuego recursoVideojuego3 = new RecursoVideojuego(5, "Adictivo y divertido", TipoEstado.COMPLETADO, true, usuario2, 120, 2, "2024-06-01", "2024-08-15", videojuego5);
    RecursoVideojuego recursoVideojuego4 = new RecursoVideojuego(4, "Muy desafiante", TipoEstado.EN_CURSO, true, usuario4, 35, 5, "2024-10-10", "", videojuego4);
    
    System.out.println("\n=== PRUEBA 11: Probar eliminación de recursos y actualización de calificaciones ===");
    album2.removeRecurso(recursoAlbum2);
    cancion2.removeRecurso(recursoCancion2);
    
    System.out.println("\n=== PRUEBA 12: Crear colección mixta y probar restricciones de tipo ===");
    RecursoColeccion coleccionTest = new RecursoColeccion(4, "Colección de prueba", TipoEstado.EN_CURSO, false, usuario4, "Test Collection");
    coleccionTest.addRecurso(recursoLibro1);
    coleccionTest.addRecurso(recursoLibro2);
    System.out.println("Intentando añadir un recurso de diferente tipo (película) a colección de libros:");
    coleccionTest.addRecurso(recursoPelicula1);
    
    System.out.println("\n=== PRUEBA 13: Mostrar información de álbumes con toString ===");
    System.out.println(album1.toString());
    System.out.println(album2.toString());
    
    System.out.println("\n=== PRUEBA 14: Crear más canciones y añadirlas a múltiples álbumes ===");
    Cancion cancionExtra1 = new Cancion("Colaboración especial", "Rosalía & Aitana", "2024-12-01", 205, "Pop", admin1);
    cancionExtra1.addToAlbum(album1);
    cancionExtra1.addToAlbum(album3);
    System.out.println("Canciones del álbum Lux: " + album1.getListaCanciones());
    System.out.println("Canciones del álbum Cuarto Azul: " + album3.getListaCanciones());
    
    System.out.println("\n=== PRUEBA 15: Añadir recursos a la colección Watchlist ===");
    RecursoPelicula recursoPelicula8 = new RecursoPelicula(0, "Pendiente en mi watchlist", TipoEstado.PENDIENTE, false, usuario2, 0, 0, pelicula5);
    coleccionWatchlist.addRecurso(recursoPelicula8);
    System.out.println("Watchlist actualizada: " + coleccionWatchlist.getListaRecursos());
    
    System.out.println("\n=== PRUEBA 16: Verificar que varios usuarios pueden tener recursos del mismo contenido ===");
    RecursoCancion recursoCancion11 = new RecursoCancion(5, "Me encanta", TipoEstado.COMPLETADO, true, usuario1, "2024-11-25", cancion3);
    RecursoCancion recursoCancion12 = new RecursoCancion(4, "Muy buena", TipoEstado.COMPLETADO, false, usuario2, "2024-11-25", cancion3);
    RecursoCancion recursoCancion13 = new RecursoCancion(3, "No está mal", TipoEstado.COMPLETADO, false, usuario3, "2024-11-25", cancion3);
    
    System.out.println("\n=== PRUEBA 17: Crear recursos y agregarlos a colección Cine de Autor ===");
    RecursoPelicula recursoPelicula9 = new RecursoPelicula(5, "Obra cinematográfica brillante", TipoEstado.COMPLETADO, true, usuario2, 20240915, 1, pelicula3);
    coleccionCineAutor.addRecurso(recursoPelicula9);
    System.out.println("Cine de Autor: " + coleccionCineAutor.getListaRecursos());
    
    System.out.println("\n=== PRUEBA 18: Probar toString de canción ===");
    System.out.println(cancion3.toString());
    
    System.out.println("\n=== FIN DE PRUEBAS ===");
    
    
}
