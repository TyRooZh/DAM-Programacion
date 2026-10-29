package Model;

public class CuentaCorriente {
    // Atributos -> cualifica / otorga una caracteristica
    private double saldo;
    private String titular;
    private int pin;

    // Constructores -> ejecutar los atributos que tiene un objeto

    public CuentaCorriente() {}

    public CuentaCorriente(String titular, double saldo, int pin) {
        this.titular = titular;
        this.saldo = saldo;
        this.pin = pin;
    }

    public CuentaCorriente(String titular) {
        // saldo = 0.0;
        this.pin =(int) (Math.random()*10000); //0-9999
    }

    public CuentaCorriente(String titular, double saldo) {
        // saldo = 0.0;
        this.pin =(int) (Math.random()*10000); //0-9999
    }

    // ingresarDinero

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

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
}
