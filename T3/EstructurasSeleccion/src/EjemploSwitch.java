import java.util.Locale;
import java.util.Scanner;

public class EjemploSwitch {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        /*System.out.println("1. Opcion 1");
        System.out.println("1. Opcion 2");
        System.out.println("1. Opcion 3");
        System.out.println("1. Opcion 4");
         */
        System.out.println("indicame la calificacion");
        char calificacion = lector.next().toUpperCase().charAt(0); // "ANdar" -> 'A'
        String mensaje = null;
        switch (calificacion) {
            case 'A' -> {
                mensaje = "Excelente";
            }
            case 'B' -> {
                mensaje = "Muy bien";
            }
            case 'C' -> {
                mensaje = "Bien";
            }
            case 'D' -> {
                mensaje = "Suficiente";
            }
            case 'F' -> {
                mensaje = "Suspenso";
            }
            default -> {
                mensaje = "Sin calificar";
            }
        }
        System.out.println(mensaje);

    }
}
