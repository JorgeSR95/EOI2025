package poo.WildGame;

public class Entorno {
    private Presa presa;
    private Depredador depredador;

    public Entorno(Presa presa, Depredador depredador) {
        this.presa = presa;
        this.depredador = depredador;
    }

    public void jugar() {
        presa.pasear();
        depredador.acechar();
        presa.pasear();
        depredador.acechar();
        presa.pasear();
        depredador.acechar();

        presa.pasear();
        depredador.acechar();
        

        presa.comer();
        depredador.atacar();
        int num = (int) ((Math.random() * 10) + 1);
        System.out.println("Has sacado " + num);
        if (num < 5) {
            depredador.comer();
            System.out.println("");
        } else {
            presa.escapar();
            System.out.println("");
        }

        presa.pasear();
        presa.comer();
        depredador.acechar();
        depredador.atacar();
        int num2 = (int) ((Math.random() * 10) + 1);
        System.out.println("Has sacado " + num2);
        if (num2 < 5) {
            depredador.comer();
            System.out.println("");
        } else {
            presa.escapar();
            System.out.println("");
        }

        if((num > 5) && (num2 > 5)) {
            System.out.println("¡Enhorabuena, Conejito y Bambi han escapado de sus depredadores!");
        } else if ((num < 5) && (num2 > 5)) {
            System.out.println("Bambi ha escapado de Hiena, pero Conejito no ha podido escapar de Lobo Feroz :(");
        } else if ((num > 5) && (num2 < 5)) {
            System.out.println("Conejito ha escapado de Lobo Feroz, pero Bambi no ha podido escapar de Hiena :(");
        } else {
            System.out.println("¡Desastre! Bambi y Conejito han sido cazados por sus depredadores D:");
        }
    }
}
