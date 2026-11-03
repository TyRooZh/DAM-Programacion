import Controller.Banco;
import Model.CuentaCorriente;
import utils.BancoException;

import java.util.Scanner;

public class MainBanco {

    public static void main(String[] args) {

        Banco bbva = new Banco("BBVA");
        Scanner lector = new Scanner(System.in);
        /*try {
            bbva.ingresarDinero(1000.0,1111, "Leyre");
        } catch (NullPointerException e) {
            System.out.println("No hay cuenta en el banco");
        }

         */
        // tienes tres intentos para ingresar dinero
        int intentos = 3;
        do {
            try {

                System.out.println("Dime el titular");
                String titular = lector.next();
                System.out.println("Dime el pin");
                int pin = lector.nextInt();
                System.out.println("Dime un dinero a ingresar");
                double saldo = lector.nextDouble();
                bbva.ingresarDinero(saldo, pin, titular);
                break;
            } catch (BancoException e) {
                System.out.println(e.getMessage());
                intentos--;
            }
        } while (intentos > 0);

        bbva.darAltaCuenta(new CuentaCorriente("Borja", 1111, 1000));
        try {
            bbva.ingresarDinero(1000, 1111, "Borja");
        } catch (BancoException e) {
            System.out.println(e.getMessage());
        }
        // nombre = bbva cuentaCorriente = null
        /*CuentaCorriente c1 = new CuentaCorriente("Borja", 1000, 1111);
        CuentaCorriente c2 = new CuentaCorriente("Leyre", 2000, 2222);
        CuentaCorriente c3 = new CuentaCorriente();

         */

    }
}
