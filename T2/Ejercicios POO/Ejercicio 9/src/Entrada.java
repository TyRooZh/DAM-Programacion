import Model.Jugador;

public class Entrada {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador ("Alex");
        System.out.printf("Jugador 1: %s - Nivel %d - Puntuación - %d\n", jugador1.nombre, jugador1.nivel, jugador1.puntuacion);
        Jugador jugador2 = new Jugador ("Dani", 3);
        System.out.printf("Jugador 2: %s - Nivel %d - Puntuación - %d\n", jugador2.nombre, jugador2.nivel, jugador2.puntuacion);
        Jugador jugador3 = new Jugador ("Cris", 5, 200);
        System.out.printf("Jugador 3: %s - Nivel %d - Puntuación - %d\n", jugador3.nombre, jugador3.nivel, jugador3.puntuacion);

        jugador1.puntuacion = jugador1.puntuacion + 50;
        System.out.println("");
        System.out.println("Puntuaciones después del cambio");
        System.out.printf("Alex: %d\n", jugador1.puntuacion);
        System.out.printf("Dani: %d\n", jugador2.puntuacion);
        System.out.printf("Cris: %d\n", jugador3.puntuacion);


    }
}
