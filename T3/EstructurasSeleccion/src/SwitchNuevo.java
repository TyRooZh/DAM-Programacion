import java.util.Scanner;

public class SwitchNuevo {
    //Sirve para hacer menus
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("introduce nombre");
        String nombre = lector.next();
        String mensaje = null;
        switch (nombre) {
            case "Leyre" -> {
                int dato = 10;
                mensaje = "Nombre Leyre";
                System.out.println("El nombre introducido es Leyre");
            }
            case "Maria" -> {
                int dato = 10;
                System.out.println("El nombre introducido es Maria");
            }
            default -> {
                mensaje = "nombre sin contemplar";
                System.out.println("Nombre no contemplado");
            }
        }
        System.out.println("Terminada la evaluacion");
    }
}
