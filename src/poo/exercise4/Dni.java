package poo.exercise4;

public class Dni {
    private String dni;

    public Dni(String dni) {
        if(!isValidDni(dni)) {
            throw new RuntimeException(String.format("El DNI %s no es correcto.", dni));
        }
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public boolean isValidDni(String dni) {
        if (dni.length() != 9) {
            return false;
        }
        if (!Character.isLetter(dni.charAt(8))) {
            return false;
        }

        return true;
    }
}