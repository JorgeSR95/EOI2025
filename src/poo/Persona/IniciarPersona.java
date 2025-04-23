package poo.Persona;

public class IniciarPersona {
    private static Persona p1;
    private static Persona p2;
    private static Persona p3;

    public static void main(String [] args) {
        p1 = new Persona("Jorge", 29, "54179472M");
        p2 = new Persona("Alfredo", 18, "12312312A");
        p3 = new Persona("Manolo", 14, "32132132B");

        mostrarPersonas();
        esMayorDeEdad();
    }

    public static void mostrarPersonas() {
        System.out.println(p1.toString() + "\n");
        System.out.println(p2.toString() + "\n");
        System.out.println(p3.toString() + "\n");
    }

    public static void esMayorDeEdad() {
        p1.esMayorDeEdad();
        p2.esMayorDeEdad();
        p3.esMayorDeEdad();
    }
}