import java.util.Scanner;

public class MainSwitchTradicional {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el numero que quiere evaluar");
        int numero = lector.nextInt();
        String mensaje;
        switch (numero) {
            // aqui no escribas nada
            case 1:
                //aqui had lo que quieras

                System.out.println("Variable con valor 1");
                mensaje = "Opcion 1";
                break;
            case 2:
                System.out.println("Variable con valor 2");
                mensaje = "Opcion 2";
                break;
            case 3:
                System.out.println("Variable con valor 3");
                mensaje = "Opcion 3";
                break;
            case 4:
                System.out.println("Variable con valor 4");
                mensaje = "Opcion 4";
                break;
            case 5,6,7,8,0:
                System.out.println("Variable con valor conjunto");
                mensaje = "Opcion conjunta";
                break;
            default:
                System.out.println("Variable no contemplada");
                mensaje = "no contemplado";
        }
        System.out.println("El mensaje es "+mensaje);
        System.out.println("Terminada la evaluación");
    }
}
