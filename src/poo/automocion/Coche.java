package poo.automocion;

public class Coche extends Automovil {

    private int numPuertas;

    public Coche(String brand, String model, int year) {
        super(brand, model, year);
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    @Override
    public String toString() {
        return "=== Coche === " + "\n" +
                "Número de puertas: " + numPuertas + "\n" +
                super.toString();
    }
}
