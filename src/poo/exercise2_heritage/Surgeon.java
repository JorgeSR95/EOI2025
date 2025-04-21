package poo.exercise2_heritage;

public class Surgeon extends Doctor{

    public Surgeon(boolean worksAtHospital) {
        super(worksAtHospital);
    }
    @Override
    public void treatPatient() {
        System.out.println("Treating patient... at hospital.");
    }

    public void makeIncision() {
        System.out.println("Making incision...");
    }
}
