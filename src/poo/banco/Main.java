package poo.banco;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("123456789", 0, "Jorge S.R.");

        int opcion = -1;
        double monto = 0;

        do {
            menuCajero();
            elegirOpcion(cuenta, monto);
        }while(opcion != 0);
    }

    public static void menuCajero() {
        System.out.println("+++++++++++++++++++++++++");
        System.out.println("+++ CAJERO AUTOMÁTICO +++");
        System.out.println("+++++++++++++++++++++++++");

        System.out.println("\n" + "1. Depositar dinero");
        System.out.println("2. Retirar dinero");
        System.out.println("3. Mostrar saldo");
        System.out.println("0. Salir");
    }

    public static void elegirOpcion(CuentaBancaria cuenta, double monto) {
        System.out.print("\n" + "Elige una opción: ");
        int opcion = LeerJava.getInt();

        switch (opcion) {
            case 1:
                OperacionesBancarias.depositarDinero(cuenta, monto);
                break;
            case 2:
                OperacionesBancarias.retirarDinero(cuenta, monto);
                break;
            case 3:
                OperacionesBancarias.mostrarSaldo(cuenta);
                break;
            case 0:
                System.out.println("Vuelve pronto!");
                System.exit(1);
            default:
                System.out.println("Opción incorrecta.");
        }
    }
}
