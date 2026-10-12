import Model.Mascota;

public class Entrada {
    public static void main(String[] args) {
        Mascota mascota1 = new Mascota("Luna", "Gato", 3);
        System.out.printf("Mascota 1: %s - %s - %d años\n", mascota1.nombre, mascota1.raza, mascota1.edad);
        Mascota mascota2 = new Mascota("Toby", "Perro", 5);
        System.out.printf("Mascota 2: %s - %s - %d años\n", mascota2.nombre, mascota2.raza, mascota2.edad);
    }
}
