import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca su edad");
        int edad = lector.nextInt();
        lector.close();

        if (edad < 18) {
            System.out.println("Eres menor de edad. No puedes votar");
        } else {
            System.out.println("Eres mayor de edad. Puedes votar");
        }
    }
}
