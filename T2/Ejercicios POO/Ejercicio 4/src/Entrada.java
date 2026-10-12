import Model.Producto;

public class Entrada {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Cuaderno");
        System.out.printf("Producto 1: %s - %.1f€\n", producto1.nombre, producto1.precio);

        Producto producto2 = new Producto("Mochila", 25.5);
        System.out.printf("Producto 2: %s - %.1f€\n", producto2.nombre, producto2.precio);

    }
}
