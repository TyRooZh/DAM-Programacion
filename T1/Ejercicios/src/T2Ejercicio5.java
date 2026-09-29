import java.util.Scanner;

public class T2Ejercicio5 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Indica cuantos segundos quieres pasar");
        int segundosSistema = lector.nextInt(); //34567
        // 1 hora -> 60*60 = 3600
        // 1 Hora -> 60 minutos
        // 1 minuto -> 60 segundos
        int horas = segundosSistema / 3600; //9,601
        System.out.println("Horas "+horas);
        // int segundosRestantes = segundosSistema%3600; // 0.601 segundos --> 2167 segundos
        int minutos = segundosSistema%60; // 36,11
        System.out.println("Minutos "+minutos);
        int segundos = segundosSistema%60;
        System.out.println("Segundos "+segundos);


        lector.close();

        int segundos2 = 24973;
        int resto =  segundos % 3600;
        int horas2 = (segundos - resto) /3600;
        System.out.println("Numero de horas es "+horas2);
        int resto2 = resto % 60;
        int minutos2 = (resto - resto2) / 60;
        System.out.println("Numero de minutos es "+minutos2);
        System.out.println("Numero de segundos es "+resto2);

    }
}
