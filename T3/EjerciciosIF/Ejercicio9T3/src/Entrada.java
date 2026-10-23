import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Introduce tu peso en kg: ");
        double peso = lector.nextInt();
        System.out.print("Introduce tu altura en metros: ");
        double altura = lector.nextDouble();
        lector.close();
        double imc = peso / Math.pow(altura, 2);
        System.out.printf("Tu IMC es: %.2f\n", imc);

        if (imc <= 24.9 && imc >= 18.5) {
            System.out.println("Estás en peso normal");
        } else if (imc > 24.9){
            System.out.println("Estás por encima del peso normal");
        } else {
            System.out.println("Estás por debajo del peso normal");
        }
    }
}
