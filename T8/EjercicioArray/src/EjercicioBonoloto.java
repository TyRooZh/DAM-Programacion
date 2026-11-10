import java.util.Arrays;

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
        System.out.println(Arrays.toString(cartonSistema));
    }

    // [2,3,4,5,7] quiero comprobar si esta el 5

    public static boolean estaNumero(int numero, int[] carton) {
        for (int item: carton) {
            if (numero == item) {
                System.out.println("Repetido el numero: "+numero);
                return true;
            }
        }
        return false;
    }



}
