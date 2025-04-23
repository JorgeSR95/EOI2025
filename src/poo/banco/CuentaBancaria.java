package poo.banco;

public class CuentaBancaria {
    private String numCuenta;
    private double saldo;
    private String titular;

    public CuentaBancaria(String numCuenta, double saldo, String titular) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}