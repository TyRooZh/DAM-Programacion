import Controller.Banco;
import Model.CuentaCorriente;

public class MainBanco {

    public static void main(String[] args) {

        Banco bbva = new Banco("BBVA");
        try {
            bbva.ingresarDinero(1000.0,1111, "Leyre");
        } catch (NullPointerException e) {
            System.out.println("No hay cuenta en el banco");
        }
        // nombre = bbva cuentaCorriente = null
        /*CuentaCorriente c1 = new CuentaCorriente("Borja", 1000, 1111);
        CuentaCorriente c2 = new CuentaCorriente("Leyre", 2000, 2222);
        CuentaCorriente c3 = new CuentaCorriente();

         */

    }
}
