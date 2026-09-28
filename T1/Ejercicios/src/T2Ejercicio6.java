import java.util.Scanner;

public class T2Ejercicio6 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Bienvenido, para conocer el importe de su cuenta y el IVA necesitamos conocer su importe.");
        System.out.println("Introduzca el valor de la compra");
        Double compra = lector.nextDouble();
        System.out.println("Valor de la compra: "+compra);
        System.out.println("Introduzca el IVA");
        int iva = lector.nextInt();
        System.out.println("IVA: "+iva);
        double compraFinal = compra * (iva/100.0);
        System.out.println("Compra: "+ (compra - compraFinal));
        System.out.println("IVA: "+compraFinal);
        System.out.println("====");
        System.out.println(compra);


    }
}
