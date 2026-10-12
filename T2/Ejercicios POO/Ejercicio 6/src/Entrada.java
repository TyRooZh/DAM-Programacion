import Model.Estudiante;

public class Entrada {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante ("Alex", "1º DAM");
        System.out.printf("Estudiante 1; %s - %s - Matriculado: %b\n", estudiante1.nombre, estudiante1.curso, estudiante1.matriculado);

        Estudiante estudiante2 = new Estudiante ("Sara", "1º DAM", true);
        System.out.printf("Estudiante 1; %s - %s - Matriculado: %b\n", estudiante2.nombre, estudiante2.curso, estudiante2.matriculado);

    }
}
