import java.util.Scanner;

public class MainTernario {
    public static void main(String[] args) {
        // if ternario: utilizado para poder asignar valores dependiendo de una condicion
        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce la tarjeta");

        int pin = lector.nextInt(); // si pin es de 4 digitos

        /*if (pin>9999 || pin<0) {
            System.out.println("Número invalido"); // si no tiene 4 digitos
        } else {
            System.out.println("Número valido"); // si tiene 4 digitos
        }*/

        String mensaje = pin >= 0 && pin <=9999 ? "Numero válido" : "Numero invalido";
        System.out.println(mensaje);
        System.out.println("Terminando la operativa del banco");
    }
}
