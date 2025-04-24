package poo.automocion;

public class Moto extends Automovil {

    private int cilindrada = 249;

    public Moto(String brand, String model, int year) {
        super(brand, model, year);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "=== Moto === " + "\n" +
                "Cilindrada: " + cilindrada + "\n" +
                super.getBrand() + "\n" +
                super.getModel() + "\n" +
                super.getYear();
    }
}