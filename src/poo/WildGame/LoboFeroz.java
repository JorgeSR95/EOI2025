package poo.WildGame;

public class LoboFeroz implements Depredador {
    @Override
    public void acechar() {
        System.out.println("Lobo Feroz está acechando.");
    }

    @Override
    public void atacar() {
        System.out.println("Lobo Feroz está atacando.");
    }

    @Override
    public void comer() {
        System.out.println("Lobo Feroz está comiendo.");
    }
}
