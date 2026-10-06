package Model;

// importaciones

public class Jugador {

    // atributos -> variables que cualifican al jugador
    public String nombre, correo;
    public int numeroVidas, habilidad;
    public boolean estrella;
    public Jugador(){} //constructor vacio. Enmascarado.

    // constructores -> hace realidad el objeto. 1 a n. Siempre si no escribo nada tengo 1.
    public Jugador(String nombreParametro, int vidasParametro, int habilidadParametro, boolean estrellaParametro) {
        nombre = nombreParametro;
        numeroVidas = vidasParametro;
        habilidad = habilidadParametro;
        estrella = estrellaParametro;
    }



}
