package poo.WildGame;

public class main {
    public static void main(String [] args) {
        Presa bambi = new Bambi();
        Depredador lobo = new LoboFeroz();
        Entorno entorno = new Entorno(bambi, lobo);
        entorno.jugar();
    }
}
