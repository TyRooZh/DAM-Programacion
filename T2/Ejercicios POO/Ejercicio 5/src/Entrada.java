import Model.Coche;

public class Entrada {
    public static void main(String[] args) {
        Coche coche1 = new Coche();
        System.out.printf("Coche 1: %s - %s - %d\n", coche1.marca, coche1.modelo, coche1.anio);

        Coche coche2 = new Coche("Toyota", "Corolla");
        System.out.printf("Coche 2: %s - %s - %d\n", coche2.marca, coche2.modelo, coche2.anio);

        Coche coche3 = new Coche("Seat", "Ibiza", 2020);
        System.out.printf("Coche 3: %s - %s - %d\n", coche3.marca, coche3.modelo, coche3.anio);

    }
}
