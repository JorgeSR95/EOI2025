package poo.WildGame;

public class Conejito implements Presa {

    @Override
    public void pasear() {
        System.out.println("Conejito está paseando.");
    }

    @Override
    public void comer() {
        System.out.println("Conejito está comiendo.");
    }

    @Override
    public void escapar() {
        System.out.println("Conejito ha escapado.");
    }
}
