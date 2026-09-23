import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        //void significa que no retorna nada, no me da el resultado de algo
        // los argumentos en un metodo es aquellos datos o cosas que el metodo necesita para funcionar
        System.out.println("Proyecto operadores");
        Scanner lector = new Scanner(System.in);
                //tipo complejo java tiene que ir a buscarlo a import que es una libreria que esta dentro de la libreria
        System.out.println("Introduce tu nombre");
        String nombre = lector.nextLine();
        System.out.println("Introduce el ciclo donde estas matriculado");
        String ciclo = lector.nextLine();
        System.out.println("¿Que nota crees que sacaras al final del curso");
        int nota = lector.nextInt();
        System.out.println("Nombre: "+nombre);
        System.out.println("Ciclo: "+ciclo);
        System.out.println("Nota: "+nota);

        // TODO Hacer ejercicios desde la pagina del 1 al 5




    }
}
