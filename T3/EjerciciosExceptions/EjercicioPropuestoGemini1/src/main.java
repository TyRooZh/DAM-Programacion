import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalFactura = 0;
        int personas;
        boolean repetir = true;

        do {
            try {
                System.out.print("Introduce el total de la factura (€): ");
                totalFactura = scanner.nextInt();
                System.out.print("Introduce el total de personas: ");
                personas = scanner.nextInt();
                int pagoEntero = totalFactura / personas;

                if (totalFactura > 99) {
                    double totalDescuento = (double)totalFactura * 0.9;
                    int facturaPersona = (int)totalDescuento / personas;
                    System.out.println("¡Descuento del 10% aplicado!");
                    System.out.println("Total con descuento: "+totalFactura);
                    System.out.println("Cada persona debe pagar: "+facturaPersona);
                } else {
                    int facturaPersona = totalFactura / personas;
                    System.out.println("No se ha aplicado el descuento, factura menor a 100€");
                    System.out.println("Total factura: "+totalFactura);
                    System.out.println("Cada persona debe pagar: "+facturaPersona);
                }
                repetir = false;

            } catch (ArithmeticException e) {
                System.out.println("Error: No se puede dividir la factura entre cero personas.");
            }

        } while (repetir);
        }
    }
