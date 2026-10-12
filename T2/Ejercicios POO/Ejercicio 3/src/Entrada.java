import Model.Libro;

public class Entrada {
    public static void main(String[] args) {
        Libro libro1 = new Libro();
        System.out.printf("Libro 1: %s - %s - %d paginas\n", libro1.titulo, libro1.autor, libro1.paginas);

        Libro libro2 = new Libro("El principito", "Antoine de Saint-Exupéry", 96);
        System.out.printf("Libro 2: %s - %s - %d paginas\n", libro2.titulo, libro2.autor, libro2.paginas);

    }
}
