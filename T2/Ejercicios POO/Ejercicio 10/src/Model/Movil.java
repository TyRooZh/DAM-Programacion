package Model;

public class Movil {
    public String marca, modelo;
    public int almacenamiento;
    public boolean encendido;

    public Movil (String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.almacenamiento = 64;
        this.encendido = false;
    }

    public Movil (String marca, String modelo, int almacenamiento) {
        this.marca = marca;
        this.modelo = modelo;
        this.almacenamiento = almacenamiento;
        this.encendido = false;
    }

    public Movil (String marca, String modelo, int almacenamiento, boolean encendido) {
        this.marca = marca;
        this.modelo = modelo;
        this.almacenamiento = almacenamiento;
        this.encendido = encendido;
    }
}
