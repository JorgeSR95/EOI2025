package poo.exercise3_heritage;

public class Automovil extends Vehiculo {
    private int numAsientos = 5;
    private int numPuertas = 5;

    public Automovil(int precioDia, String marcaModelo, int numLlantas, int numAsientos, int numPuertas) {
        super(precioDia, marcaModelo, numLlantas);
        this.numAsientos = numAsientos;
        this.numPuertas = numPuertas;
    }

    public void mostrarDatos() {
        super.mostrarCaracteristicas();
        System.out.println("Número de asientos: " + numAsientos);
        System.out.println("Número de puertas: " + numPuertas);
    }
}