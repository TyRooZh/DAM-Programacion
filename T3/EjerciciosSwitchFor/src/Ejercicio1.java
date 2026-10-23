import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Introduce un número (1-7): ");
        int numero = lector.nextInt();
        lector.close();

        switch (numero) {
            case 1 -> {
                System.out.printf("El día %d es: Lunes\n", numero);
            }
            case 2 -> {
                System.out.printf("El día %d es: Martes\n", numero);
            }
            case 3 -> {
                System.out.printf("El día %d es: Miércoles\n", numero);
            }
            case 4 -> {
                System.out.printf("El día %d es: Jueves\n", numero);
            }
            case 5 -> {
                System.out.printf("El día %d es: Viernes\n", numero);
            }
            case 6 -> {
                System.out.printf("El día %d es: Sabado\n", numero);
            }
            case 7 -> {
                System.out.printf("El día %d es: Domingo\n", numero);
            }
        }
    }
}
