import java.util.Scanner;

public class T2Ejercicio7 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca el radio de la circunferencia (entre 0 y 100)");
        double radio = lector.nextDouble();
        lector.close();
        double longitud = Math.PI * Math.pow(radio,2);
        double area = 2*Math.PI*radio;
        System.out.println("Longitud circunferencia: "+longitud);
        System.out.println("Area de la circunferencia: "+area);
    }
}
