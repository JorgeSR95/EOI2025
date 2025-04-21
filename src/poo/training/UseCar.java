package poo.training;

public class UseCar {
    public static void main(String [] args) {

        Car toyota = new Car("Toyota", "Yaris", 2012);
        Car bmw = new Car("BMW", "Serie 3", 2008);
        Car renault = new Car("Renault", "Laguna", 1996);

        System.out.println("Tengo un " + toyota.getBrand() + " " + toyota.getModel() + " del año " + toyota.getYear() + ".");
        System.out.println("Pues yo tengo un " + bmw.getBrand() + " " + bmw.getModel() + " del año " + bmw.getYear() + ".");
        System.out.println("Yo solamente tengo un " + renault.getBrand() + " " + renault.getModel() + " del año " + renault.getYear() + ".");
    }
}
