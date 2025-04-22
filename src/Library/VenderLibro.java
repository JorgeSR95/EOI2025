package Library;

import java.util.Scanner;

public class VenderLibro {
    private static Libro libro1;
    private static Libro libro2;
    private static Vendedor vendedor1;
    private static Vendedor vendedor2;

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        libro1 = new Libro("9788491294283", "La asistenta", "Freida McFadden", 344);
        libro2 = new Libro("9788494820694", "Tengo un volcán", "Miriam Tirado", 28);
        vendedor1 = new Vendedor("Manolo", 0003436);
        vendedor2 = new Vendedor("Alicia", 0003437);

        MostrarMenus.mostrarMenuPrincipal();
        elegirOpcionPrincipal();
    }

        public static void elegirOpcionPrincipal() {
            int opcion = LeerJava.getInt();

            switch (opcion) {
                case 1:
                    MostrarMenus.mostrarMenuCompra();
                    elegirOpcionComprar();
                    break;
                case 2:
                    MostrarMenus.mostrarMenuInformacion();
                    elegirOpcionInformacion();
                    break;

            }
        }

        public static void elegirOpcionComprar() {
            int opcion = LeerJava.getInt();

            switch (opcion) {
                case 1:
                    System.out.println("Libro comprado: " + libro1.getTitulo());
                    break;
                case 2:
                    System.out.println("Libro comprado: " + libro2.getTitulo());
                    break;

            }
        }

        public static void elegirOpcionInformacion() {
            int opcion = LeerJava.getInt();

            switch (opcion) {
                case 1:
                    System.out.println("La asistenta: " + libro1.toString());
                    break;
                case 2:
                    System.out.println("Tengo un volcán: " + libro2.toString());
                    break;

            }
        }

        public static void libroMasPag() {
            if(libro1.getNumPag() > libro2.getNumPag()) {
                System.out.println("\n" + "El libro " + libro1.getTitulo() + " tiene más páginas.");
            } else {
                System.out.println("\n" + "El libro " + libro2.getTitulo() + " tiene más páginas.");
            }
        }

}