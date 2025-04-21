package poo.WildGame;

public class Bambi implements Presa {

    @Override
    public void pasear() {
        System.out.println("Bambi está brincando.");
    }

    @Override
    public void comer() {
        System.out.println("Bambi está comiendo.");
    }

    @Override
    public void escapar() {
        System.out.println("Bambi ha escapado.");
    }
}
