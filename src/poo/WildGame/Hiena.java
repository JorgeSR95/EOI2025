package poo.WildGame;

public class Hiena implements Depredador {

    @Override
    public void acechar() {
        System.out.println("Hiena está acechando.");
    }

    @Override
    public void atacar() {
        System.out.println("Hiena está atacando.");
    }

    @Override
    public void comer() {
        System.out.println("Hiena está comiendo.");
    }
}
