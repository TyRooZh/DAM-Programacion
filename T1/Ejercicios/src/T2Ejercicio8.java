import java.util.Scanner;

public class T2Ejercicio8 {
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);

        System.out.println("Introduzca grados centigrados");
        float grados = lector.nextFloat();
        double farenheitCentigrados = (((9.0f * grados) / 5.0f) + 32.0f);
        float kelvinCentigrados = (grados + 273.15f);
        System.out.println("Farenheit: "+farenheitCentigrados +" Kelvin: "+kelvinCentigrados);



        System.out.println("Introduzca grados farenheit");

        System.out.println("Introduzca grados kelvin");
    }
}
