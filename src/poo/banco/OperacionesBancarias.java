package poo.banco;

public class OperacionesBancarias {

    public static void depositarDinero(CuentaBancaria cuenta, double monto) {
        System.out.print("Ingrese el dinero que quiere depositar: ");
        monto = LeerJava.getDouble();

        if (monto > 0) {
            double nuevoSaldo = cuenta.getSaldo() + monto;
            cuenta.setSaldo(nuevoSaldo);
            System.out.println("Depósito exitoso. Nuevo saldo: " + nuevoSaldo + "€");
        } else {
            System.out.println("El monto debe ser positivo");
        }
    }

    public static void retirarDinero(CuentaBancaria cuenta, double monto) {
        System.out.print("Ingrese el dinero que quiere retirar: ");
        monto = LeerJava.getDouble();

        if (monto > 0 && monto <= cuenta.getSaldo()) {
            double nuevoSaldo = cuenta.getSaldo() - monto;
            cuenta.setSaldo(nuevoSaldo);
            System.out.println("Retiro exitoso. Nuevo saldo: " + nuevoSaldo + "€");
        } else {
            System.out.println("Saldo insuficiente o monto inválido");
        }
    }

    public static void mostrarSaldo(CuentaBancaria cuenta) {
        System.out.println("\nSaldo de la cuenta: " + cuenta.getSaldo() + "€\n");
    }
}
