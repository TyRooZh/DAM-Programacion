import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int numero = lector.nextInt();
        lector.close();
        int suma = 0;
        String cadenaSuma = "Sumando: ";

        // [0, 1, 2, 3, 4, 5)

        for (int i = 1; i <= numero; i++) {
            suma += i;
            cadenaSuma += i;
            if (i < numero) {
                cadenaSuma += " + ";
            }
        }
        System.out.println(cadenaSuma);
        System.out.printf("La suma de números del 1 al %d es: %d\n", numero, suma);

    }

}
