package poo.exercise3_heritage;

public class Autobus extends Vehiculo{
    private int precioDia;
    private String marcaModelo;
    private int numLlantas;

    public Autobus(int precioDia, String marcaModelo, int numLlantas) {
        super(precioDia, marcaModelo, numLlantas);
        this.precioDia = precioDia;
        this.marcaModelo = marcaModelo;
        this.numLlantas = numLlantas;
    }

    public int getPrecioDia() {
        return precioDia;
    }

    public void setPrecioDia(int precioDia) {
        this.precioDia = precioDia;
    }

    public String getMarcaModelo() {
        return marcaModelo;
    }

    public void setMarcaModelo(String marcaModelo) {
        this.marcaModelo = marcaModelo;
    }

    public int getNumLlantas() {
        return numLlantas;
    }

    public void setNumLlantas(int numLlantas) {
        this.numLlantas = numLlantas;
    }

    public void mostrarCaracteristicas() {
        System.out.println("Marca y modelo: " + getMarcaModelo());
        System.out.println("Precio por día: " + getPrecioDia());
        System.out.println("Número de llantas: " + getNumLlantas());
    }

    public void encenderMotor() {
        System.out.println(getMarcaModelo() + " encendiendo motor.");
    }

    public void apagarMotor() {
        System.out.println(getMarcaModelo() + " apagando motor.");
    }
}
