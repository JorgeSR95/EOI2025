package poo.exercise3_heritage;

public class Vehiculo {
    private int precioDia;
    private String marcaModelo;
    private int numLlantas;

    public Vehiculo(int precioDia, String marcaModelo, int numLlantas) {
        this.precioDia = precioDia;
        this.marcaModelo = marcaModelo;
        this.numLlantas = numLlantas;
    }

    public void mostrarCaracteristicas() {
        System.out.println("Marca y modelo: " + marcaModelo);
        System.out.println("Precio por día: " + precioDia);
        System.out.println("Número de llantas: " + numLlantas);
    }

    public void encenderMotor() {
        System.out.println(marcaModelo + " encendiendo motor.");
    }

    public void apagarMotor() {
        System.out.println(marcaModelo + " apagando motor.");
    }

    public void funciona() {
        System.out.println(marcaModelo + " funciona.");
    }
}
