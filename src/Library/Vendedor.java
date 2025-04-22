package Library;

public class Vendedor {
    private String nombre;
    private int numEmp;

    public Vendedor(String nombre, int numEmp) {
        this.nombre = nombre;
        this.numEmp = numEmp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumEmp() {
        return numEmp;
    }

    public void setNumEmp(int numEmp) {
        this.numEmp = numEmp;
    }
}
