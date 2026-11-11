import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        try (Scanner sc = new Scanner(System.in)){
            System.out.println("De que cantidad es el array de los numeros");
            int cantidad = sc.nextInt();
            Operaciones operaciones = new Operaciones(5);
            // numeros = [0,0,0,0,0]
            int opcion = 0;
            do {
                System.out.println("1. Rellenar datos");
                System.out.println("2. Mostrar datos");
                System.out.println("3. Buscar datos");
                System.out.println("4. Modificar datos");
                System.out.println("5. Rotar datos");
                System.out.println("6. Invertir datos");
                System.out.println("7. Ordenar datos");
                System.out.println("8. Salir");
                System.out.println("Indica que quieres hacer");
                //TODO -> caso 5 y 6
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1 -> operaciones.rellenar();
                    case 2 -> operaciones.mostrar();
                    case 3 -> {
                        System.out.println("Indica un numero a buscar");
                        int numeroBuscar = sc.nextInt();
                        System.out.println("La busqueda tiene como resultado "+operaciones.buscar(numeroBuscar));
                    }
                    case 4 -> {
                        System.out.println("Indicame que numero quieres modificar");
                        int numeroBuscar = sc.nextInt();
                        if (operaciones.buscar(numeroBuscar)) {
                            // El numero esta en el array
                            int numeroCambiar;
                            do{
                                System.out.println("Indicame el numero a cambiar");
                                numeroCambiar = sc.nextInt();
                            }while (operaciones.buscar(numeroCambiar));

                            // 1 -> el numero a buscar esta
                            // 2 -> el numero amodificar no esta
                            operaciones.modificar(numeroBuscar, numeroCambiar);

                        } else {
                            System.out.println("El numero no se encuentra en el array");
                        }
                    }
                    case 7 -> operaciones.ordenar();
                    case 8 -> System.out.println("Saliendo del sistema...");

                }
            } while (opcion != 8);
        } catch(Exception e){
            System.out.println("Error en la IO");
        }

        //rellenar
        //rotar
        //ordenar
        //invertir
        //mostrar
    }
}
