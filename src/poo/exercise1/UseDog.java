package poo.exercise1;

public class UseDog {
    public static void main (String [] args) {
        Dog dog1 = new Dog("Toby", "Yorkshire", "50cm");
        Dog dog2 = new Dog("Jerry", "Chihuaha", "35cm");
        Dog dog3 = new Dog("Max", "Labrador", "110cm");

        dog1.bark();
        dog2.bark();
        dog3.bark();

    }
}
