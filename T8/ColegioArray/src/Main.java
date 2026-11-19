import controller.Colegio;
import model.Alumno;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Alumno alumno1 = new Alumno("Borja", "1234A");

        Alumno alumno2 = new Alumno("MArta", "1234B");
         */
        Colegio thpw = new Colegio("ThePW"); // 5
        thpw.listarAlumnos();
        thpw.buscarAlumno("1234A");
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Menu de ejecución");
            int opcion;
            do{
                System.out.println("1. Agregar");
                System.out.println("2. Expulsar");
                System.out.println("3. Calificar");
                System.out.println("4. Mostrar");
                System.out.println("5. Buscar");
                System.out.println("6. Ordenar");
                System.out.println("7. Salir");
                System.out.println("Dime que quieres hacer");
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1 -> {
                        System.out.println("Indica el nombre");
                        String nombre = sc.next();
                        System.out.println("Indica el dni");
                        String dni = sc.next();
                        Alumno alumno = new Alumno(nombre,  dni);
                        if (thpw.inscribirAlumnos(alumno)) {
                            System.out.println("Agregado correctamente");
                        } else {
                            System.out.println("FAllo de inscripcion");
                        }
                    }
                    case 2 ->  {
                        System.out.println("Indica el dni del alumno que quieres expulsar");
                        String dni = sc.next();
                        if (thpw.expulsarAlumno(dni)) {
                            System.out.println("Expulsado");
                        } else {
                            System.out.println("No se ha podido expulsar");
                        }
                    }
                    case 3 -> {
                        System.out.println("indica el dni a calificar");
                        String dni = sc.next();
                        boolean fallo = false;
                        do {
                            System.out.println("Indica la nota a calificar");
                            double nota = sc.nextDouble();
                            try {
                                if (thpw.calificarAlumno(dni, nota)) {
                                    System.out.println("Calificado correctamente");
                                    fallo = false;

                                } else {
                                    System.out.println("No encontrado");
                                }
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                                fallo = true;
                            }
                        } while (fallo);

                    }
                    case 4 -> {
                        thpw.mostrarDatos();
                        thpw.listarAlumnos();
                    }
                    case 5 -> {
                        System.out.println("Indica el Dni que quieres buscar");
                        String dni = sc.next();
                        Alumno encontrado = thpw.buscarAlumno(dni);
                        if (encontrado == null) {
                            System.out.println("El dni no se encuentra en la lista");
                        } else {
                            encontrado.mostrarDatos();
                        }
                    }
                    case 6 -> {
                        // TODO ordenar por notas -> mayor a menor
                        // Arrays.sort(); //  -> un arrays de numeros -> numericamente
                        // array string -> alfabeticamente
                        Arrays.sort(thpw.getListaAlumnos(), new Comparator<Alumno>() {
                            // TODO este metodo se ejecuta por pares -> Bubble sort
                            @Override
                            public int compare(Alumno o1, Alumno o2) {
                                // TODO solo se retorna 1 o -1 (orden de ordenacion)
                                return 0;
                            }
                        });

                    }
                }
            } while (opcion !=7);

        }


    }
}
