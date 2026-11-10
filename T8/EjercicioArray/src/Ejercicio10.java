import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("¿Cuantos estudiantes hay en clase?");
            int nEstudiantes = sc.nextInt(); // PE: 5 [ , , , , ]
            int[]calificaciones = new int[nEstudiantes]; //nos interesa la primera. [0,0,0,0,0]
            int posicion = 0;
            for (int i = 0; i <calificaciones.length; i++) { // o calificaciones.length -1
                System.out.println("Introduce la calificacion del estdiante"+(i+1));
                calificaciones[i] = sc.nextInt();
            }
            /*while(posicion<nEstudiantes) {
                calificaciones[posicion] = 1;
                posicion++;
            }

             */
            //[2,7,4,9,6]
            //se podria poner dentro del for

            // FOR EACH, no puedes modificar
            /*

            for (int item: calificaciones) {
                System.out.print(item + " ");
            }

             */

            //FOR Si puedes modificar
            /*
            for (int i = 0; i <calificaciones.length; i++) {
                System.out.println(calificaciones[i]);
            }

             */
            System.out.println(Arrays.toString(calificaciones));
            //System.out.println(calificaciones); // la direccion de memoria
            //Cierra los elementos definitos en el try()

            int totalCalificaciones = 0, nAprobados = 0, nAlta = calificaciones[0], nBaja = calificaciones[0];
            for (int item:calificaciones) {
                totalCalificaciones += item; // totalCalificaciones = totalCalificaciones + item;
                /*if (item >= 5) {
                    nAprobados++;
                }*/
                nAprobados = item >=5 ? nAprobados+1 : nAprobados; // IF TERNARIO
                /*if(item> nAlta) {
                    nAlta = item;
                }*/
                nAlta = item>nAlta ? item : nAlta;
                // nAlta = Arrays.stream(calificaciones).max().getAsInt();

                /*if (item<nBaja) {
                    nBaja = item;
                }*/
                nBaja = item<nBaja ? item : nBaja;
                // nBaja = Arrays.stream(calificaciones).min().getAsInt();
            }
            // double media = Arrays.stream(calificaciones).asDoubleStream().average().getAsDouble();
            System.out.println("La media de las calificaciones es de "+(double) totalCalificaciones/calificaciones.length);
            System.out.println("El numero de aprobados es de "+nAprobados);
            System.out.println("La nota mas alta es: "+nAlta);
            System.out.println("La nota mas baja es: "+nBaja);

        }catch (Exception e) {
            System.out.println("Error en el programa");
        }


    }
}
