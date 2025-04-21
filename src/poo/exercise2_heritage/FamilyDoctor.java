package poo.exercise2_heritage;

public class FamilyDoctor extends Doctor{

    private boolean makesHouseCalls;

    public FamilyDoctor(boolean worksAtHospital) {
        super(worksAtHospital);
    }

    public void giveAdvice() {
        System.out.println("Giving advice...");
    }

    @Override
    public void treatPatient() {
        System.out.println("Treating patient... at home.");
    }
}
