package Model;

public class EntradaCine {
    public String pelicula;
    public int sala;
    public double precio;

    public EntradaCine (String pelicula) {
        this.pelicula = pelicula;
        this.sala = 1;
        this.precio = 7.5;
    }

    public EntradaCine (String pelicula, int sala, double precio) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.precio = precio;
    }
}
