import java.util.Arrays;
import java.util.Scanner;

public class EjercicioBonoloto {
    // [1,23,56,98,423] -> carton sistema

    // TODO -> pedir al usuario 5 numeros ty comprobar cuantos han sido acertados (numero y posicion)
    // // [1,15,23,458,423] -> carton sistema tiene que estar en la misma posicion para acertar
    public static void main(String[] args) {

        int[] cartonSistema = new int[5];
        for (int i= 0; i < cartonSistema.length; i++) {
            int aleatorio = 0;
            do {
                aleatorio = (int) (Math.random()*11)+1; // si pongo 4 en vez de 11 nunca saldria del bucle porque siempre se repetiria un numero
            } while (estaNumero(aleatorio, cartonSistema));
            cartonSistema[i] = aleatorio;


            // si esta en el carton -> saca otro aleatorio
            // si no esta en el carton -> (int) (Math.random()*11)
        }
        System.out.println("Carton del sistema "+Arrays.toString(cartonSistema));

        int[] cartonUsuario = new int[5];
        try (Scanner sc = new Scanner(System.in)) {

            // los numeros no se pueden repetir / no se pueden indica 1<x>10
            for (int i = 0; i < cartonUsuario.length ; i++) {
                int numeroUsuario;
                do {
                    System.out.println("Introduce numero "+(i+1));
                    numeroUsuario = sc.nextInt();
                } while (estaNumero(numeroUsuario, cartonUsuario) || numeroUsuario > 9 || numeroUsuario < 1);
                    cartonUsuario[i] = numeroUsuario;
            }
            System.out.println("Carton del sistema "+Arrays.toString(cartonUsuario));

            int aciertos = 0;
            for (int i = 0; i < cartonUsuario.length; i++) {
                if (cartonUsuario[i] == cartonSistema[i]) {
                    aciertos++;
                }
                // aciertos = cartonUsuario[i] == cartonSistema[i] ? aciertos+1 : aciertos;
            }
            System.out.println("El numero de aciertos es "+aciertos);

        } catch (Exception e) {
            System.out.println("Error en el sistema. "+e.getMessage());
        }



        /*try (Scanner sc = new Scanner(System.in)) {
            int[] cartonUsuario = new int[5];
            int[] cartonGanador = new int[] {3,6,9,11,4};
            for (int i = 0; i < cartonUsuario.length; i++) {
                System.out.println("Introduzca el numero de su boleto "+(i+1));
                cartonUsuario[i] = sc.nextInt();
            }

            System.out.println(Arrays.toString(cartonUsuario));
            System.out.println(Arrays.toString(cartonGanador));
            System.out.println("Tu número de aciertos ha sido de "+comprobarAciertos(cartonUsuario,cartonGanador));


        } catch (Exception e) {
            System.out.println("Error en el sistema. "+e.getMessage());
        }

         */

    }



    // [2,3,4,5,7] quiero comprobar si esta el 5

    public static boolean estaNumero(int numero, int[] carton) {
        for (int item: carton) {
            if (numero == item) {
                return true;
            }
        }
        return false;
    }

    public static int comprobarAciertos(int[] usuario, int[] ganador) {
        int aciertos = 0;
        for (int i = 0; i < usuario.length ; i++) {
            if (usuario[i] == ganador[i]) {
                aciertos++;
            }
        }
        return aciertos;
    }



}
