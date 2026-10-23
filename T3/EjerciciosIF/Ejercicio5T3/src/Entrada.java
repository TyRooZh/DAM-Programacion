import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.printf("Introduce un número: ");
        int numero = lector.nextInt();

        if ((numero%2) == 0) {
            System.out.printf("El número %d es par\n", numero);
        } else {
            System.out.printf("El número %d es impar\n", numero);
        }
    }
}
