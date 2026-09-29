import java.util.Scanner;

public class T2Ejercicio7 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca el radio de la circunferencia (entre 0 y 100)");
        int radio = lector.nextInt();
        final double PI = Math.PI;
        double longitud = (2 * PI * radio);
        System.out.println("Longitud circunferencia: "+longitud);
        double area = (PI * (radio * radio));
        System.out.println("Area de la circunferencia: "+area);
    }
}
