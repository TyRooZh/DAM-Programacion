import Model.Jugador;

import java.util.Scanner;

public class Main {

    //TIPOS DE VARIABLES
    //Primitivas: solo se guarda el dato. Asignacione y operaciones
    //Completas: guarda el dato y se guarda el puntero de toda la funcionalidad que tiene ese dato.

    //POO -> programacion orientada a objetos -> La realidad de una clase creada por el sistema o definida por el programador.
    /*
    Jugadores
       nombre
       correo
       vidas
       habilidad
       atacar()
       defender()
       correr()
     */
    // acceso static retorno main(argumentos(datos que yo le voy a dar al metodo de entrada para que funcione)) { algoritmo } -> esto es la firma del metodo. Ejemplo del yo te doy 10 euros para comprar un bocata. Vas lo compras y me traes el bocata.
    public static void main(String[] args) {
        System.out.println("Iniciamos el juego de los objetos");
        //public es el acceso, si es publico to-do el mundo puede acceder
        //void es el retorno, en este caso no retorna nada

        String nombre = "Leyre"; //new String("Leyre");-> en este caso redundante, pero cualquiera compleja tiene que haber new
        int edad = 30;
        Jugador jugador1 = new Jugador();
        System.out.println("Atributos Jugador 1");
        System.out.println(jugador1.nombre);
        System.out.println(jugador1.vidas);
        System.out.println(jugador1.estrella);
        System.out.println(jugador1.habilidad);
        System.out.println("");

        Jugador jugador2 = new Jugador("Maria",5,100,true );
        //  correo = null, nombre = Maria, vidas = 5, habilidad = 100 estrella = true
        System.out.println("Atributos Jugador 2");
        System.out.println(jugador2.nombre);
        System.out.println(jugador2.vidas);
        System.out.println(jugador2.estrella);
        System.out.println("");

        Jugador jugador3 = new Jugador("Pablo",20,50,false);
        System.out.println("Atributos Jugador 3");
        System.out.println(jugador3.nombre);
        System.out.println(jugador3.vidas);
        System.out.println(jugador3.estrella);
        System.out.println("");

        Jugador jugador4 = new Jugador("Marcos","marcos@gmail.com");
        System.out.println("Atributos Jugador 4");
        System.out.println(jugador4.correo);
        System.out.println("");

        Jugador jugador5 = new Jugador();
        System.out.println("Atributos Jugador 5");
        System.out.println(jugador5.habilidad);
        System.out.println("");

        jugador2.saludar();
        jugador2.recibirImpacto();
        jugador2.recibirImpacto();
        jugador2.recibirImpacto();
        jugador2.recibirImpacto();
        jugador2.recibirImpacto();
        jugador2.recibirImpacto();
        jugador2.recibirImpacto();
        jugador2.recibirImpacto();
        System.out.println("Despues de la guerra...");
        jugador2.saludar();











        //Model(M): clases que representan los futuros elementos del programa. Los moldes
        //View(V): clases que representan la interaccion con el usuario o sistemas. La parte grafica
        //
    }
}
