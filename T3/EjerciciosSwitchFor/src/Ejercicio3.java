import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int n1 = lector.nextInt();
        System.out.print("Introduce el segundo número: ");
        int n2 = lector.nextInt();
        System.out.print("Introduce la operacion (+, -, *, /): ");
        String op = lector.next();
        lector.close();

        switch (op) {
            case "+" -> {
                int suma = n1 + n2;
                System.out.printf("Resultado: %d  +  %d = %d \n", n1, n2, suma );
            }
            case "-" -> {
                int resta = n1 - n2;
                System.out.printf("Resultado: %d  -  %d = %d \n", n1, n2, resta );
            }
            case "*" -> {
                int multiplicacion = n1 * n2;
                System.out.printf("Resultado: %d  *  %d = %d \n", n1, n2, multiplicacion );
            }
            case "/" -> {
                if (n2 == 0) {
                    System.out.print("Un número no se puede dividir entre cero");
                } else {
                    double division = (double) n1 / n2;
                    System.out.printf("Resultado: %d  /  %d = %.2f \n", n1, n2, division);
                }
            }
            default -> System.out.println("Operación no valida");
        }
    }
}
