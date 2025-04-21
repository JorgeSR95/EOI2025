package poo.exercise2_heritage;

public class Doctor {

    private boolean worksAtHospital;

    public Doctor(boolean worksAtHospital) {
        this.worksAtHospital = worksAtHospital;
    }

    public boolean isWorksAtHospital() {
        return worksAtHospital;
    }

    public void setWorksAtHospital(boolean worksAtHospital) {
        this.worksAtHospital = worksAtHospital;
    }

    public void treatPatient()
    {
        System.out.println("Treating patient...");
    }
}
