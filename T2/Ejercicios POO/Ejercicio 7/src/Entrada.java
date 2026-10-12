import Model.Rectangulo;

public class Entrada {
    public static void main(String[] args) {

        Rectangulo rectangulo1 = new Rectangulo (5.0, 3.0);
        System.out.printf("Rectangulo: base %.1f - altura %.1f\n", rectangulo1.base, rectangulo1.altura);
        System.out.printf("Área del rentángulo: %.1f\n", (rectangulo1.base * rectangulo1.altura));

        Rectangulo rectangulo2 = new Rectangulo (4.0);
        System.out.printf("Cuadrado: base %.1f - altura %.1f\n", rectangulo2.base, rectangulo2.base);
        System.out.printf("Área del cuadrado: %.1f\n", (rectangulo2.base * rectangulo2.base));


    }
}
