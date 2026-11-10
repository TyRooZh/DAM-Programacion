package Controller;

import Model.CuentaCorriente;
import utils.BancoException;

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

    public void retirarSaldo(double saldoRetirar, int pin, String titular) throws BancoException {
        try {
            if (cuenta.getTitular().equalsIgnoreCase(titular) && cuenta.getPin() == pin)  {
                if (saldoRetirar > cuenta.getSaldo()) {
                    throw new BancoException();
                }
                //sacaras dinero
                cuenta.setSaldo(cuenta.getSaldo() - saldoRetirar);
                System.out.println("Retirada  válido");
            } else {
                throw new BancoException("Error validacion");
            }
        } catch (NullPointerException e) {
            System.out.println("No hay cuenta asociada en el banco");
        }
    }

    public void ingresarDinero(double saldoIngresar, int pin, String titular) throws BancoException {
        // puedo ingresar el dinero -> coincide el pin y el titular con lo que dan -> ingresa

        try {
            if (cuenta.getPin() == pin && cuenta.getTitular().equalsIgnoreCase(titular)) {
                // ingreso dinero
                cuenta.setSaldo(cuenta.getSaldo() + saldoIngresar);
                System.out.println("Ingreso válido");
            } else {
                // aviso de que los datos no son validos
                throw new BancoException("Validación errónea");
            }
        } catch (NullPointerException e) {
            System.out.println("No hay cuenta creada en el banco");
        }
    }

     public void cancelarCuenta(String titular, int pin) throws Exception {
        // para hacer esto cuenta = null
        // que tiene que pasar?

        if (cuenta.getTitular().equals(titular) && cuenta.getPin() == pin) {
            System.out.println("Cuenta cancelada");
            cuenta = null;
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
