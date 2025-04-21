package poo.exercise1;

public class Movie {
    private String title;
    private String genre;
    private int rating;

    public Movie(String title, String genre, int rating) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void playIt() {
        System.out.println(title + " se está reproduciendo. Es una película de " + genre + " con una valoración de " + rating + ".");
    }

    public void stopIt() {
        System.out.println(title + " se ha pausado.");
    }
}