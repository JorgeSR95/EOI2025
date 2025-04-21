package Ciudad;

public class Policia extends Persona {
    private int numPlaca;

    public Policia(int numPlaca, String nombre, int edad) {
        super(nombre, edad);
        this.numPlaca = numPlaca;
    }

    public int getNumPlaca() {
        return numPlaca;
    }

    public void setNumPlaca(int numPlaca) {
        this.numPlaca = numPlaca;
    }
}
