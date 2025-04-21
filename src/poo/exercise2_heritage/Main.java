package poo.exercise2_heritage;

public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor(true);
        Surgeon surgeon = new Surgeon(true);
        FamilyDoctor familyDoctor = new FamilyDoctor(false);

        familyDoctor.treatPatient();
        surgeon.treatPatient();
        surgeon.makeIncision();
        familyDoctor.giveAdvice();
    }
}
