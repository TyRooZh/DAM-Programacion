import java.util.Scanner;

public class T2Ejercicio9 {
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        System.out.println("Cuantas bebidas pides");
        int nBebidas = lector.nextInt();
        System.out.println("Cuanto vale cada unidad");
        double bebidaUnidad = lector.nextDouble();
        System.out.println("Cunatos bocatas pides");
        int nBocatas = lector.nextInt();
        System.out.println("Cuanto vale cada unidad");
        double bocadilloUnidad = lector.nextDouble();
        System.out.println("Cuantos sois");
        int comensales = lector.nextInt();
        lector.close();

        double costeBebidas = nBebidas*bebidaUnidad;
        double costeBocatas = nBocatas*bocadilloUnidad;
        double costeTotal = costeBocatas+costeBocatas;
        double costeIndividual = costeTotal/comensales;
        System.out.println("ARTICULO\t\t\t\tCANTIDAD\t\t\t\tPRECIO\t\t\t\tCOSTE\t\t\t\t");
        System.out.printf("%s\t\t\t\t%d\t\t\t\t%.2f\t\t\t\t%.2f\t\t\t\t","Bebida",nBebidas,bebidaUnidad,costeBebidas);
        System.out.printf("%s\t\t\t\t%d\t\t\t\t%.2f\t\t\t\t%.2f\t\t\t\t","Bocata",nBocatas,bocadilloUnidad,costeBocatas);
        System.out.printf("%s\t\t\t\t%d\t\t\t\t%d\t\t\t\t%.2f\t\t\t\t","Unidad",comensales,comensales,costeBebidas);
        System.out.printf("%s\t\t\t\t%d\t\t\t\t%.2f\t\t\t\t%.2f\t\t\t\t",nBebidas,bebidaUnidad,costeBebidas);
        //TODO acabar del repositorio CLASES
    }
}
