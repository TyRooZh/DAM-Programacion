import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        final String APLICACION = "MiApp";
        String version = "1.0.0";
        final double PI = 3.14159;
        Scanner lector = new Scanner(System.in);

        System.out.println("Aplicación: "+APLICACION);
        System.out.println("Versión: "+version);
        System.out.println("Valor de PI: "+PI);

        System.out.println("Introduce tu nombre");
        String nombre = lector.nextLine();
        System.out.println("Nombre actual: "+nombre);

        int nivel = 1;
        System.out.println("Nivel: "+nivel);

        System.out.println("Introduzca su puntuación");
        int puntuacion = lector.nextInt();
        lector.nextLine();
        System.out.println("Puntuación: "+puntuacion);

        System.out.println("Introduce tu nombre");
        nombre = lector.nextLine();
        System.out.println("Nombre actualizado: "+nombre);

        int nivel1 = 2;
        System.out.println("Nivel: "+nivel1);

        System.out.println("Introduzca su puntuación");
        puntuacion = lector.nextInt();
        lector.nextLine();
        System.out.println("Puntuación: "+puntuacion);

        lector.close();
    }
}
