package poo.Persona;

public class Persona {
    private String nombre;
    private int edad;
    private String dni;

    public Persona(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public boolean esMayorDeEdad() {
        boolean mayorDeEdad = true;

        if(edad < 18) {
            mayorDeEdad = false;
            System.out.println(this.nombre + " no es mayor de edad.");
        } else {
            System.out.println(this.nombre + " es mayor de edad.");
        }
        return mayorDeEdad;
    }

    @Override
    public String toString() {
        return  "Nombre: " + this.nombre + '\n' +
                "Edad: " + this.edad + '\n' +
                "Dni: " + this.dni;
    }
}