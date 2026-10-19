import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero = lector.nextInt();

        if (numero < 0) {
            System.out.println("El numero es negativo");
        } else if (numero == 0) {
            System.out.println("EL numero es igual a 0");
        } else {
            System.out.println("El número es positivo");
        }
    }
}
