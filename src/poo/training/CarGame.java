package poo.training;

public class CarGame {
    private String colour;
    private int number;
    private String brand;
    private String model;

    public CarGame(String colour, int number, String brand, String model) {
        this.colour = colour;
        this.number = number;
        this.brand = brand;
        this.model = model;
    }

    public void acelerar(){
        System.out.println("COCHE " + number + " ACELERANDO...");
    }

    public void frenar(){
        System.out.println("COCHE " + number + " FRENANDO...");
    }

    public void cambiarMarcha(int marcha){
        if((marcha >= 0) && (marcha <= 6)) {
            System.out.println("COCHE " + number + " CAMBIANDO MARCHA A " + marcha + "...");
        }
    }
}
