package Model;

public class Estudiante {
    public String nombre, curso;
    public boolean matriculado;

    public Estudiante(String nombre, String curso) {
        this.nombre = nombre;
        this.curso = curso;
        this.matriculado = false;
    }

    public Estudiante(String nombre, String curso, boolean matriculado) {
        this.nombre = nombre;
        this.curso = curso;
        this.matriculado = matriculado;
    }

}
