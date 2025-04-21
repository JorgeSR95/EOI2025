package poo.training;

public class UseCarGame {
    public static void main(String[] args)
    {
        CarGame coche1 = new CarGame("Red", 1, "Renault", "Laguna");
        CarGame coche2 = new CarGame("Yellow", 2, "Volkswagen", "T-Cross");

        coche1.cambiarMarcha(1);
        coche1.acelerar();
        coche1.cambiarMarcha(2);
        coche1.acelerar();

        coche2.cambiarMarcha(1);
        coche2.acelerar();
        coche2.cambiarMarcha(2);
        coche2.acelerar();

        coche1.frenar();
    }
}
