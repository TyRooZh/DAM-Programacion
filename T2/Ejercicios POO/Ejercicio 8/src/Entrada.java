import Model.EntradaCine;

public class Entrada {
    public static void main(String[] args) {
        EntradaCine entradaCine1 = new EntradaCine ("Toy Story");
        System.out.printf("Entrada 1: %s - Sala %d - %.1f€\n", entradaCine1.pelicula, entradaCine1.sala, entradaCine1.precio);

        EntradaCine entradaCine2 = new EntradaCine ("Encanto", 3, 8.5);
        System.out.printf("Entrada 1: %s - Sala %d - %.1f€\n", entradaCine2.pelicula, entradaCine2.sala, entradaCine2.precio);
        System.out.printf("Total de las entradas: %.1f€\n", (entradaCine1.precio + entradaCine2.precio));
    }
}
