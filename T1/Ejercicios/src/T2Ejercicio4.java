import java.util.Scanner;

public class T2Ejercicio4 {
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);

        System.out.println("Buenos días, bienvenidos a Bar Prometeo. El precio de las bebidas es 1,25€ y los bocadillos es 2,05€");
        System.out.println("¿Cuantas bebidas van a tomar?");
        int bebida = lector.nextInt();
        System.out.println("Numero de bebidas "+bebida);
        System.out.println("¿Cuantos bocadillos querran?");
        int bocadillo = lector.nextInt();
        System.out.println("Número de bocadillos "+bocadillo);
        double precioBebida = 1.25;
        double costeBebida = precioBebida*bebida;
        System.out.println("El coste de las bebidas es "+costeBebida);
        double precioBocadillo = 2.05;
        double costeBocadillo = precioBocadillo*bocadillo;
        System.out.println("El coste de los bocadillos es "+costeBocadillo);
        double costeTotal = costeBebida+costeBocadillo;
        System.out.println("El coste total de la comanda es "+costeTotal);

    }
}
