import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Programa excepciones");
        System.out.println("Procedemos a ejecutar errores en codigo");
        //arithmetic excepction
        int resultado = 10000000;
        String nombre = null;
        try {
            System.out.println("Indica un operando");
            int op1 = lector.nextInt();
            System.out.println("Indica un operando");
            int op2 = lector.nextInt();

            resultado = op1/op2;
            System.out.println("El resultado es "+resultado);
            if (nombre == null) {
                nombre = "Luis";
                System.out.println(nombre.charAt(10));
                System.out.println("El nombre guardado es Juan");
            }
        } catch (ArithmeticException e) {
            System.out.println("El op2 ha producido fallo");
            resultado = 0;
        } catch (NullPointerException e) {
            System.out.println("Fallo en la variable nombre");
        } catch (Exception e) {
            System.out.println("Cualquier fallo que no sea de los anteriores");
        }
        finally {
            // Cerrar streams -> ya veremos lo que significa streams
            System.out.println("EL resultado es "+resultado);
        }


        // Null Pointer exception
        // String Index Out of Bounds Exception

        System.out.println("Ejecutamos el final del programa");

    }
}
