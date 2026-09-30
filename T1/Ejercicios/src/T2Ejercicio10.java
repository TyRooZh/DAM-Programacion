import java.util.Scanner;

public class T2Ejercicio10 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("dmillar");
        int dmillar = lector.nextInt();
        System.out.println("umillar");
        int umillar = lector.nextInt();
        System.out.println("centenas");
        int centenas = lector.nextInt();
        System.out.println("decenas");
        int decenas = lector.nextInt();
        System.out.println("unidades");
        int unidades = lector.nextInt();
        System.out.println("El numero completo es "+dmillar+umillar+centenas+decenas+unidades);
        //System.out.println("El numero completo es "+(dmillar+umillar+centenas+decenas+unidades)); 15
        System.out.println(""dmillar+umillar+centenas+decenas+unidades);
        System.out.println(dmillar+umillar+centenas+decenas+unidades);
        System.out.println("Indicame el numero completo");
        int numeroCompleto = lector.nextInt(); // 56789
        dmillar = numeroCompleto/10000; //5
        umillar = (numeroCompleto%10000)/100; //6,789 -> 6
        centenas = ((numeroCompleto%10000)/1000); //7,89 -> 7
        decenas = ((numeroCompleto%10000)%1000)/10; //8,9 -> 8
        // unidades = (((numeroCompleto%10000)%1000)%10)%10; //
        unidades = numeroCompleto%10; // 5678,9
        System.out.println("La descomposicion es");
        System.out.println("d millar "+dmillar);

    }
}
