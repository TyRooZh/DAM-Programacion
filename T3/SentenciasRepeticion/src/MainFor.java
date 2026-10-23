import java.util.Scanner;

public class MainFor {
    public static void main(String[] args) {
        // Repeticion (bucle) : ejecutar un bucle numero de veces que indique.
        // Tengo que tener en cuenta como salir de veces, si no salgo -> bucle infinito.
        // for foreach -> repetir un bloque dependiendo de un arango de datos (0veces .....Nveces)
        // while -> repetir un bloque dependiendo de una consicion boolean (0veces ... Nveces)
        // do-while -> ejecuto un bloque y luego repetir dependiendo de una condicion boolean (1veces .. Nveces)

        /* FOR - FOREACH
             [1...40] -> para que haya 40 numeros, [0...39] -> para que haya 40 numeros


             for(inicio ; final ; incremento) {
                bloque de codigo a repetir
                puedes acceder a la i
             }
             for (int i=0; i<5; i++)
             no puedes acceder a la i

         */
        //[0 1 2 3 4 5) -> parantesis quiere decir que no incluye el 5, si fuese ] lo incluiria.
        for (int i=0; i<5; i++) {
            if (i % 2 == 0) {
                System.out.println("Ejecucion numero " + (i));
            } else {
                System.out.println("Impar");
            }
        }

        for (int i =10; i>= 0; i--) { //se ejecuta 11 veces
            System.out.println("Ejecucion "+i);
        }

        // tabla de multiplicar
        // 8*0 = 0
        // 8*1 = 8
        // 8*2 = 16

        Scanner lector = new Scanner(System.in);
        //System.out.println("Indica el numero para ver su tabla");
       /* int numero = 10;
        int max = n1; int min = n2;
        if (n2>max) {
            max = n2;
            min = n2;
        } else ()
        if (numero < 0) {
            System.out.println("Numero negativo, no se puede");
        } else {
            // sacar las tablas de multiplicar del 0 al 10
            for (int i = min; i<max; i++) {
                System.out.println("Tabla del "+i);
                // i=0
                for (int j = 0; j<11; j++) {
                    System.out.printf("\tLa multiplicacion del %d * %d = %d\n", i, j, j*i);
                }
            }
        }

        */
    }
}
