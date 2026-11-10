import java.util.Scanner;

public class main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n1 = 0;
            int n2 = 0;
            double resultado= 0;

            do {
                try {
                System.out.print("Introduce el primer número: ");
                n1 = scanner.nextInt();
                System.out.print("Introduce el segundo número: ");
                n2 = scanner.nextInt();
                resultado =  n1/ n2;
                System.out.println("Resultado: " + resultado);

                } catch (ArithmeticException e) {
                        System.out.println("Error: No se puede dividir por cero");
                    }
            } while (resultado == 0);
        }
}



