public class T2Ejercicio5 {
    public static void main(String[] args) {
        int segundos = 24973;
        int resto =  segundos % 3600;
        int horas = (segundos - resto) /3600;
        System.out.println("Numero de horas es "+horas);
        int resto2 = resto % 60;
        int minutos = (resto - resto2) / 60;
        System.out.println("Numero de minutos es "+minutos);
        System.out.println("Numero de segundos es "+resto2);




    }
}
