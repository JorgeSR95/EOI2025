package poo.exercise3_heritage;

public class EjecutaVehiculo {
    public static void main(String[] args) {

        Autobus autobus = new Autobus(150, "Volvo Z50", 4);
        Automovil automovil = new Automovil(32, "Opel Mokka", 4, 5, 5);
        Motocicleta motocicleta = new Motocicleta(15, "Yamaha M30", 2);

        autobus.encenderMotor();
        autobus.apagarMotor();
        autobus.mostrarCaracteristicas();
        System.out.println("==========-=========");
        automovil.encenderMotor();
        automovil.apagarMotor();
        automovil.mostrarDatos();
        System.out.println("==========-=========");
        motocicleta.encenderMotor();
        motocicleta.apagarMotor();
        motocicleta.mostrarCaracteristicas();
    }
}
