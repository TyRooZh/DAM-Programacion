package Controller;

import Model.CuentaCorriente;

public class Banco {
    // Atributos -> direccion, nombre, numeroEntidad,
    // lista de cuentas (usuario, dinero, pin)
    private CuentaCorriente cuenta;
    private String nombre;

    // Constructores

    public Banco() {}

    public Banco(String nombre) {
        this.nombre = nombre;
    }
    // funcionalidades -> darAltaCuenta, ingresarDinero, sacarDinero, consultarSaldo, resetearPin, transferirSaldo,

    public void darAltaCuenta(CuentaCorriente cuenta) {
        this.cuenta = cuenta;
    }

    public void ingresarDinero(double saldoIngresar, int pin, String titular) throws NullPointerException {
        // puedo ingresar el dinero -> coincide el pin y el titular con lo que dan -> ingresa

        if (cuenta.getPin() == pin && cuenta.getTitular().equalsIgnoreCase(titular)) {
            // ingreso dinero
        } else {
            // aviso de que los datos no son validos
        }

    }


    public CuentaCorriente getCuenta() {
        return cuenta;
    }

    public void setCuenta(CuentaCorriente cuenta) {
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
