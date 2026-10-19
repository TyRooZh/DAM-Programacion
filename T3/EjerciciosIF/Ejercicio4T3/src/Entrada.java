import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el importe de la compra");
        double importe = lector.nextDouble();
        lector.close();

        double importeDescuento = 0;
        double importeFinal = importe;

        if (importe >= 100) {
            importeDescuento = importe * 0.10;
            importeFinal = importe - importeDescuento;
            System.out.println("¡Enhorabuena! Se ha podido aplicar el descuento");
        } else {
            System.out.println("No se puede aplicar el descuento. Importe menor a 120€");
        }
        System.out.println("Importe original: "+importe);
        System.out.println("Descuento aplicado: "+importeDescuento);
        System.out.println("Importe final: "+importeFinal);
    }
}
