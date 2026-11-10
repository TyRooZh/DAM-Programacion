public class Main {
    public static void main(String[] args) {

        // [] conjunto de datos
        String[] clase = new String[5];
        // [null, null, null, null, null]
        String[] nombres = new String[]{"Borja", "Marcos","Marta", "Laura","Julia", "Mateo"};

        System.out.println("El tamaño de la coleccion de nombres es de "+nombres.length);
        clase[0] = "Marta";
        clase[clase.length-1] = "Juan";
        // [Marta, null, null, null, Juan]
        
        /*
        // como saco todos los nombres
        //muy utilizado para recorrer de principio a final (indicado por el frogramador) un array -> para recorrer y MODIFICAR
        for (int i=0; i < nombre.length; i++){
            System.out.println("Los nombres de la coleccion son: "+nombre[i]);
        }

         */

        /*
        //muy utilizado para recorrer de principio a final --> solo para recorrer FOR EACH
        for ( String element :nombres) {
            System.out.println(element);
        }

         */
        /*System.out.println("El nombre de la primera posicion es "+nombre[0]);
        System.out.println("El nombre de la primera posicion es "+nombre[2]);
        // Como saco el valor de la ultima posición
        System.out.println("El nombre de la ultima posicion es "+nombre[nombre.length-1]);

         */

        // [Borja, Marcos, Marta, Laura]
        /* int[] edades = new int[3];
        // [0, 0, 0]
        boolean[] aciertos = new boolean[4];
        // [false, false, false, false]

         */
    }
}
