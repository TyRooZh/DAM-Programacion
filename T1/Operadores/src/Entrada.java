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

        // OPERADORES -> realizar operaciones
        // Aritmeticos -> Operaciones matematicas(depende del tipo del dato)
          // Unarias -> incrementan en 1. Unica exclusivamente utiliza un operando
        int operando1 = 10;
        int operando2 = 5;
        operando1++;
        operando1++;
        operando1++; // 13
        operando2--;
        operando2--;
        operando2--; // 2
          // Binarias -> + - * / %
        int suma = operando1+operando2; // 15
        int resta = operando1-operando2; // 11
        int multiplicacion = operando1*operando2; // 26
        double division = (double) operando1 / operando2; // 6.5

             //int division = operando1 / operando2; // 6.5 --> double division = (double) operando1 / operando2; // 6.5
             // Esto se llama casteo
        int resto = operando1 % operando2;  // 13%2 -> 1 -> el resto es 0? (sabemos si es par o no) El resto de una division.


        System.out.println("La suma "+suma);
        System.out.println("La resta "+resta);
        System.out.println("La multiplicacion "+multiplicacion);
        System.out.println("La division "+division);
        System.out.println("El resto "+resto);

        operando1 = 10;
        operando2 = 7;
        System.out.println("la suma "+ (operando1+operando2));
        String op1 = "5"; //int Al ser palabras no se pueden sumar, solo concatenar
        String op2 = "15"; //int
             // Parse = (no es un cambio natural)
        System.out.println("La suma de los numeros string es "+ (Integer.parseInt(op1) + Integer.parseInt(op2)));
        //  Asignacion
        operando1 = 20;
        operando2 = 10;
        // operando1 = operando1+34; // 34
        operando1 +=14; // operando1 = operando1+14; 34
        operando1 -=4; // 30
        operando1 *=2; // 60
        operando1 /=10; // 6
         //operando1 %=2; // 0
        operando1 *= operando2; // operando1 = 6 * 10 -> 60

        // Relacionales (siempre obtengo un boolean) > >= < <= == !=
        operando1 = 10;
        operando2 = 15;
        boolean comparacion = operando1>10; // false
        System.out.println("El resultado de la comparacion de > es "+comparacion);
        comparacion = operando1>=10; // True
        System.out.println("El resultado de la comparacion de >= es "+comparacion);
        comparacion = operando2<operando1; // False
        System.out.println("El resultado de la comparacion de < es "+comparacion);
        comparacion = operando2<=operando1;
        System.out.println("El resultado de la comparacion de <= es "+comparacion);
        comparacion = operando1 == operando2; // False
        System.out.println("El resultado de la comparacion de == es "+comparacion);
        comparacion = operando1 != operando2;
        System.out.println("El resultado de la comparacion de != es "+comparacion);

        // Logicos -> AND (AND &&) | OR (OR ||) --> (siempre obtengo boolean)
           // Mirar tabla en apuntes
           // sueldo mas de 40000 y edad menor de 20

        operando1 = 10;
        operando2 = 20;
        boolean resultadoLogico = operando1<10 && operando2*2>30; // F&T -> Fasle
        resultadoLogico = operando1<10 || operando2*2>30; // F&T -> True

        //TODO todos los ejercicios de ejercicios basicos. Ejercicios 3 al 10. Tema 2. estructura de un programa informatico




    }
}
