package poo.exercise1;

public class Dog {
    private String name;
    private String breed;
    private String size;

    public Dog(String name, String breed, String size) {
        this.name = name;
        this.breed = breed;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void bark(){
        System.out.println(name + " está ladrando.");
    }
}