package Biblioteca;

public class EjecutarLibro {
    private static Libro libro1;
    private static Libro libro2;

    public static void main(String [] args) {
        libro1 = new Libro("9788491294283", "La asistenta", "Freida McFadden", 344);
        libro2 = new Libro("9788494820694", "Tengo un volcán", "Miriam Tirado", 28);

        mostrarLibro();
        libroMasPag();
    }
        public static void libroMasPag() {
            if(libro1.getNumPag() > libro2.getNumPag()) {
                System.out.println("\n" + "El libro " + libro1.getTitulo() + " tiene más páginas.");
            } else {
                System.out.println("\n" + "El libro " + libro2.getTitulo() + " tiene más páginas.");
            }
        }
        public static void mostrarLibro() {
        System.out.println(libro1.toString());
        System.out.println("\n" + libro2.toString());
    }
}