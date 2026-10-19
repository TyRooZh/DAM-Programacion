import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca su nota");
        int nota = lector.nextInt();

        if (nota < 0 || nota > 10) {
            System.out.println("Valor incorrecto. Por favor vuelva a introducir su nota");
        } else if (nota >= 5) {
            System.out.println("¡Enhorabuena! Has aprobado");
        } else  {
            System.out.println("Lo sentimos. Ha suspendido");
        }
        }
    }
