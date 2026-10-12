import Model.Movil;

public class Entrada {
    public static void main(String[] args) {
        Movil movil1 = new Movil("Samsumg","Galaxy A15");
        System.out.printf("Móvil 1: %s - %s - %dGB - Encendido: %b\n", movil1.marca, movil1.modelo, movil1.almacenamiento, movil1.encendido);

        Movil movil2 = new Movil("Xiaomi", "Redmi Note 13", 128);
        System.out.printf("Móvil 2: %s - %s - %dGB - Encendido: %b\n", movil2.marca, movil2.modelo, movil2.almacenamiento, movil2.encendido);

        Movil movil3 = new Movil("Apple", "iPhone 15", 256, true);
        System.out.printf("Móvil 3: %s - %s - %dGB - Encendido: %b\n", movil3.marca, movil3.modelo, movil3.almacenamiento, movil3.encendido);

    }
}
