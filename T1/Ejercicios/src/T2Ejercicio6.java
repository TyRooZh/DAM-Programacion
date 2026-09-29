import java.util.Scanner;

public class T2Ejercicio6 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Bienvenido, para conocer el importe de su cuenta y el IVA necesitamos conocer su importe.");
        System.out.println("Introduzca el valor de la compra");
        double compra = lector.nextDouble();
        System.out.println("Valor de la compra: "+compra);
        System.out.println("Introduzca el IVA");
        double iva = 1+lector.nextInt()/100.0;
        double compraSinIva = compra/iva;
        double precioIva = compra-compraSinIva;
        // %f -> decimales %s -> palabras %d-> enteros
        System.out.printf("Has pagado un total de %.2f de IVA sobre %.2f\n" ,precioIva,compra);
        System.out.printf("Has pagado un articulo de %.2f donde el precio real sin Iva es de %.2f\n" ,compra,compraSinIva);

    }
}
