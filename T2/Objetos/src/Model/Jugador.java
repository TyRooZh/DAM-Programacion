package Model;

// importaciones

public class Jugador {

    // atributos -> variables que cualifican al jugador
    private String nombre, correo;
    private int vidas, habilidad;
    private boolean estrella;

    public Jugador() {
        this.nombre = "Bot";
        this.estrella = true;
        this.habilidad = (int) (Math.random() * 101);
        this.correo = "sistema@gmail.com"; // 0 - 0.9999999 * 101 -> 0 - 100.99999
    } //public Jugador() {} constructor vacio. Enmascarado.

    //Contructores
    // Si tu no tienes ningun construccion escrito, siempre habra 1, el vacio.
    // correo = null, nombre = null, vidas = 0, habilidad = 0 estrella = false
    // SI escribes un constructor (cualquiera)-> el vacio queda enmascarado
    // tener mas de un constructor -> SOBRECARGA

    // constructores -> METODO. hace realidad el objeto. 1 a n. Siempre si no escribo nada tengo 1.
    public Jugador(String nombre, int vidas, int habilidad, boolean estrella) {
        this.nombre = nombre;
        this.vidas = vidas;
        this.habilidad = habilidad;
        this.estrella = estrella;
    }

    public Jugador(String nombre, int vidas) {
        this.nombre = nombre;
        this.vidas = vidas;
    }

    public Jugador(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    /* public Jugador(String correo, int habilidad){
        this.correo = correo;
        this.habilidad = habilidad;
    }
    Me daria error porque ya tengo un constructor con esa misma linea String, int
     */

    // metodos -> funcionalidades

    public void saludar() {
        System.out.println("Hola me llamo " + nombre);
        System.out.printf("Actualmente tengo %d de vidas\n", vidas);
    }

    public void saludar(String mensaje) {
        System.out.println("El jugador dice " + mensaje);
    }

    public void recibirImpacto() {
        if (vidas == 0) {
            System.out.println("Estoy muerto");
        } else if (vidas < 0) {
            System.out.println("Para, ya estoy muerto");
        } else {
            vidas--;
        }
    }

    public void setNombre(String nombre) {
       if (nombre.equals("Bartolito") || nombre.equals("Pepito") || nombre.length() == 0)
           System.out.println("No se permite el cambio");
       this.nombre = nombre;
    }

    // (public / protected / private ) (void / int / double / float) getter -> da el dato
    public String getNombre() {
        return this.nombre; //La ultima linea
    }

    public int getVidas() {
        return this.vidas;
    }

    public boolean isEstrella() { // Con los boolean en vez de get es is
        return this.estrella;
    }

    public int getHabilidad() {
        return habilidad;
    }

    public String getCorreo() {
        return correo;
    }
}
