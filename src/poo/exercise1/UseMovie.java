package poo.exercise1;

public class UseMovie {
    public static void main (String [] args) {
        Movie movie1 = new Movie("Regreso al Futuro", "Sci-fi", 100);
        Movie movie2 = new Movie("Regreso al Futuro II", "Sci-fi", 100);
        Movie movie3 = new Movie("Regreso al Futuro III", "Sci-fi", 100);

        movie1.playIt();
        movie1.stopIt();

        movie2.playIt();
        movie2.stopIt();

        movie3.playIt();
        movie3.stopIt();
    }
}
