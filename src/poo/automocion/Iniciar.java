package poo.automocion;

public class Iniciar {
    public static void main(String[] args) {

        Automovil coche = new Coche("Ford", "Focus", 2010);
        Automovil moto = new Moto("Kawasaki", "Cargo", 2021);

    }

    public static void mostrarDatos(Automovil automovil) {
        System.out.println();
    }
}
