package poo.exercise1_heritage;

public class ClaseB extends ClaseA {

    private String s;
    private int i;

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void m2(){
        System.out.println("m2");;
    }
}