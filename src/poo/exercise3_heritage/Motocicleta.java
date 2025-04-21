package poo.exercise3_heritage;

public class Motocicleta extends Vehiculo {
    private int precioDia;
    private String marcaModelo;
    private int numLlantas;

    public Motocicleta(int precioDia, String marcaModelo, int numLlantas) {
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
        super.mostrarCaracteristicas();
    }

    public void encenderMotor() {
        System.out.println(getMarcaModelo() + " encendiendo motor.");
    }

    public void apagarMotor() {
        System.out.println(getMarcaModelo() + " apagando motor.");
    }
}
