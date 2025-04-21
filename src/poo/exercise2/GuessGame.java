package poo.exercise2;

public class GuessGame {

    Player p1;
    Player p2;
    Player p3;

    public int startGame () {
    int secretNumber = ((int) (Math.random() * 10));

    p1 = new Player("Jorge");
    p2 = new Player("Juan");
    p3 = new Player("Luis");

    p1.guess(secretNumber);
    p2.guess(secretNumber);
    p3.guess(secretNumber);

    System.out.println("El número era el " + secretNumber + "\n");

    return secretNumber;
}
}
