package model;
// molde - plantilla -> futuro objeto

import util.NotaException;

public class Alumno {

    // Atributos: cualifican -> depende de las necesidades de tu programa
    private String nombre, dni;
    private double nota;

    // contrucotres: crear el objeto - hacer realidad
    // metodos: funcionalidades

    public Alumno() {}

    public Alumno(String nombre,String dni) {
        this.nombre = nombre;
        this.dni = dni;
        nota = -1; // indico que no se ha calificado
    }


    public void mostrarDatos() {
        System.out.println("nombre = " + nombre);
        System.out.println("dni = " + dni);
        System.out.println("nota = " + nota);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getNota() {

        return nota;
    }

    public void setNota(double nota) throws NotaException {
        //validacion
        if(nota <0 || nota >10) {
            throw new NotaException("Nota inválida");
        }
        this.nota = nota;
    }

}
