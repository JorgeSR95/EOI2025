package Videoclub;

public class Pelicula {
    // ** ATRIBUTOS **
    private int id;
    private String title;
    private String genre;
    private int year;

    // ** CONSTRUCTOR CON TODOS LOS ATRIBUTOS **
    public Pelicula(int id, String title, String genre, int year) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.year = year;
    }
    // ** CONSTRUCTOR VACÍO **
    public Pelicula() {
    }

    // ** MÉTODOS GETTER Y SETTER **
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
