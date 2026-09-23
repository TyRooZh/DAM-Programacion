
/**
 * @author leyre
 * @version 1.0
 * @
 */
public class Entrada {
    // aqui explicas brevemente algo para aclarate las ideas
    // en esta duda hago una aclaracion diferente
    // otra aclaracion
    /*
    Este comentario admite unas cuantas lineas
    Esta es la segunda linea
     */
    // TODO esta tarea la dejo mpendiente para el lunes


    /*
    atributos son cualidades (nombre, edad,...) SUSTANTIVO
    metodos son funcionalidades correr, andar,.. VERBO
     */

    //mod_acceso retorno nombre(main) (argumentos(args) {funcionalidad}
    // static es que algo no se mueve
    /* main siempre tiene que a ver en una entrada

     */
    //public static void main es un metodo
    //TODO ESTOY HAY QUE APRENDERSELO DE MEMORIA
    public static void main (String[] args) {


        // variables:
            // segun el dato que guarda: String, char(letra), byte/shot/int/long (numero, va de menos a mas), double/float (decimales), boolena(true or false)
            // segun la forma de construirse: primitivos (solo guarda el valor) / complejos (ademas del valor por ejemplo Leyre, se guarda una funcionalidad)
                // lo que esta en minuscula y coloreado es primitvo
            // segun la mutabilidad del dato: mutables (aquella variables que pueden cambiar su valor) / no mutables (constante) siempre esta fijo, por ejemplo el dni
                // las constantes siempre tienen todas sus letras en mayusculas
            // segun el scope de la variable: metodo (bloque) / clase
        // tipo nombre = valor
        final String DNI = "123A";
            // para que no cambie ,final,

        String nombreLegal = "Leyre";
        nombreLegal = "Leyre C";

        char letra = 'a';
        Character letraCompleja = 'a';

        int edad = 30;
        edad = 31;
        Integer numeroComplejo = 2;

        double altura = 1.65;
         // float alturaFloat = 1.65f;
        Double alturaComplejo = 1.65;

        //float alturaFloat = 1.65f;
        boolean acierto = true;
        Boolean aciertoComplejo = true;


        // ordenes a ejecutar

        System.out.println("Mi nombre es "+nombreLegal);
        System.out.println("La letra de mi DNI es "+letra);
        System.out.println("El resultado de la evaluacion es "+acierto);
        System.out.println("Hola Mundo");
        System.out.println(9);
        System.out.println(9*5);
        System.out.println("Segunda línea");
        System.out.println("Tercera línea");
        System.out.println("Cuarta línea");
        // sout para mandar el System.out.println()
        System.out.println("Quinta linea");
        System.out.println("Sexta linea");
        //
        System.out.println("Septima linea\nOctava linea");
        // la suma de 9 y 6 es 15
        System.out.println("La suma de "+9+" y "+6+" tiene como resultado "+ (9+6));


    }
    /* Un programa un main
       Varias main daria error
    */
    /**
     *
     * @param arg explica el parametro
     * @return explica el retono
     */
    public int metodo(String arg) {
        return 1;
    }
}

