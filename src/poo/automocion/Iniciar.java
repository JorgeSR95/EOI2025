package poo.automocion;

public class Iniciar {
    public static void main(String[] args) {

        Automovil coche = new Coche("Ford", "Focus", 2010);
        Automovil moto = new Moto("Kawasaki", "Cargo", 2021);

        mostrarDatos(coche, moto);
    }

    public static void mostrarDatos(Automovil coche, Automovil moto) {
        System.out.println("\n" + coche.toString() + "\n");
        System.out.println(moto.toString());
    }
}
