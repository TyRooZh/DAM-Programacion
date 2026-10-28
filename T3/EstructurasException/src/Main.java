import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner lector = new Scanner(System.in);
        boolean fallo = false;
        int resultado = 0;
        do {

            try (Scanner lector = new Scanner(System.in)) {
                System.out.println("Introduce el valor op1");
                int op1 = lector.nextInt();
                System.out.println("Introduce el valor op2");
                int op2 = lector.nextInt();
                // yo como programador decido que es un error que los numeros sean negativos
                if (op1<0 || op2<0) {
                    throw new RuntimeException("Error en el codigo numerico");
                } else if (op1>100 || op2<100) {
                    throw new Exception("Fallo, numeros muy grandes");
                }
                resultado = op1 / op2;
                System.out.println("El resultado es " + resultado);
                lector.close();
            } catch (InputMismatchException | ArithmeticException e) {
                System.out.println("Error en la lectura de los operandos o resultado");
                fallo = true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (fallo);

        System.out.println("Programa excepciones");
        System.out.println("Procedemos a ejecutar errores en codigo");
        // int resultado = 0;
        // boolean fallo = false;
        /*
        do {

            try {
                lector = new Scanner(System.in);
                System.out.println("Introduce el primer numero");
                int op1 = lector.nextInt();
                System.out.println("Introduce el segundo numero");
                int op2 = lector.nextInt();
                resultado = op1 / op2;
                fallo = false;
            } catch (InputMismatchException e) {
                System.out.println("Algun dato de los introducidos no es correcto");
                fallo = true;
            }
            catch (ArithmeticException e) {
                fallo = true;
                System.out.println("El operando 2 no es valido, por favor introduce otro numero");
            }

        } while (fallo);
        lector.close();
        System.out.println("El resultado de la division es "+resultado);

         */
        /*
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

         */

        System.out.println("Ejecutamos el final del programa");

    }
}
