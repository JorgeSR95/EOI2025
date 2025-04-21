package poo.exercise2;

public class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void guess(int secretNumber) {
        int chosenNumber = ((int)(Math.random()*10));
        if(secretNumber == chosenNumber) {
            System.out.println(getName() + ": " + chosenNumber);
            System.out.println("¡" + getName() + " ha acertado el número!" + "\n");
        } else {
            System.out.println(getName() + ": " + chosenNumber);
            System.out.println(getName() + " ha fallado el número." + "\n");
        }
    }
}