package poo.Videoclub;

import java.util.ArrayList;

public class main {
    private static ArrayList<Pelicula> movieList;

    public static void main(String[] args) {
        movieList = new ArrayList<>();
        int opcion;

        do {
            mostrarMenu();
            opcion = introducirOpcion();
            ejecutarOpcion(opcion);
        }while(opcion != 0);
    }

    private static void mostrarMenu() {
        System.out.println("\n" + "### MOVIE-JAVA ###" + "\n");
        System.out.println("1. Añadir película");
        System.out.println("2. Borrar película");
        System.out.println("3. Listar películas");
        System.out.println("4. Modificar película");
        System.out.println("0. Salir");
    }

    private static int introducirOpcion() {
        int opcion;
        System.out.print("Introduce una opción: ");
        opcion = LeerJava.getInt();
        return opcion;
    }

    private static void ejecutarOpcion(int opcion) {
        switch (opcion) {
            case 1: introducirPelicula();
                    break;

            case 2: borrarPelicula();
                    break;

            case 3: listarPeliculas();
                    break;

            case 4: modificarPelicula();
                    break;

            default:
                System.out.println("¡Vuelva pronto! =)");
                System.exit(1);
        }
    }

    private static void modificarPelicula() {
        System.out.println("Introduce el ID de la película a modificar: ");
        int id = LeerJava.getInt();

        for(Pelicula pelicula : movieList) {
            if(pelicula.getId() == id) {
                System.out.println("Has elegido la película " + pelicula.getTitle() + " cuyo género es de " + pelicula.getGenre() + " y el año es " + pelicula.getYear() + ".");
                System.out.println("Establece un nuevo título: ");
                String title = LeerJava.getString();
                pelicula.setTitle(title);

                System.out.println("\n" + "Establece un nuevo género: ");
                String genre = LeerJava.getString();
                pelicula.setGenre(genre);

                System.out.println("\n" + "Establece un nuevo año: ");
                int year = LeerJava.getInt();
                pelicula.setYear(year);
            }
        }
    }

    private static void listarPeliculas() {
        System.out.println("\n" + " ### LISTA DE PELÍCULAS ### ");
        for(Pelicula pelicula : movieList) {
            System.out.println("ID: " + pelicula.getId());
            System.out.println("Título: " + pelicula.getTitle());
            System.out.println("Género: " + pelicula.getGenre());
            System.out.println("Año: " + pelicula.getYear() + "\n");
        }
    }

    private static void borrarPelicula() {
        if(movieList.isEmpty()) {
            System.err.println("La lista se encuentra vacía. No puedes borrar nada.");
        } else {

            int id;

            System.out.println("Introduce el ID de la película a eliminar: ");
            id = LeerJava.getInt();

            if (id <= 0 || id > movieList.size()) {
                System.err.println("Sólo se pueden introducir números entre 1 y " + movieList.size() + ".");
            } else {
                movieList.remove(id - 1);
                System.out.println("La película ha sido eliminada exitosamente.");
            }
        }
    }

    private static void introducirPelicula() {
        String title, genre;
        int year;

        // ** EL USUARIO INTRODUCE LOS DATOS POR TECLADO **

        System.out.println("Introduce el título de la película:");
        title = LeerJava.getString();

        System.out.println("Introduce el género de la película:");
        genre = LeerJava.getString();

        System.out.println("Introduce el año de la película:");
        year = LeerJava.getInt();

        // ** CREAMOS EL OBJETO DE LA CLASE PELÍCULA CON LOS DATOS INTRODUCIDOS **

        Pelicula pelicula = new Pelicula(movieList.size() + 1, title, genre, year);
        movieList.add(pelicula);
        System.out.println("La película ha sido introducida exitosamente.");
    }
}
