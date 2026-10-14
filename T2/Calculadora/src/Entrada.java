import Model.Calculadora;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        //MVC (Model View Control)
        Calculadora calculadora1 = new Calculadora();
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el primer operando");
        int operando1 = lector.nextInt();
        System.out.println("Introduce el segundo operando");
        int operando2 = lector.nextInt();

        calculadora1.sumar(operando1, operando2);
        //System.out.println(+calculadora1.getResultado());

        // calculadora1.sumar(operando1, operando2, 10);

        calculadora1.restar(operando1, operando2);
        //System.out.println(+calculadora1.getResultado());

        calculadora1.multiplicar(operando1, operando2);
        //System.out.println(+calculadora1.getResultado());

        calculadora1.dividir(operando1, operando2);
        //System.out.println(+calculadora1.getResultado());

        calculadora1.modulo(operando1, operando2);
        //System.out.println(+calculadora1.getResultado());

        System.out.println("La ultima operación realizada ha sido: "+calculadora1.getTipoOperacion());

        Calculadora calculadora2 = new Calculadora();
        System.out.println("Introduzca el primer operando");
        operando1 = lector.nextInt();
        System.out.println("Introduzca el segundo operando");
        operando2 = lector.nextInt();

        calculadora2.sumar(operando1, operando2);
        System.out.println(+calculadora2.getResultado());

        calculadora2.restar(operando1, operando2);
        System.out.println(+calculadora2.getResultado());

        calculadora2.multiplicar(operando1, operando2);
        System.out.println(+calculadora2.getResultado());

        calculadora2.dividir(operando1, operando2);
        System.out.printf("%.2f\n", calculadora2.getResultado());

        calculadora2.modulo(operando1, operando2);
        System.out.println(+calculadora2.getResultado());

        System.out.println("La ultima operación realizada ha sido: "+calculadora1.getTipoOperacion());



        lector.close();


    }
}
