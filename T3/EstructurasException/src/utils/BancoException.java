package utils;

// error

public class BancoException extends Exception {
    // heredado de Exception --> tengo todas las caracteristicas y funcionalidades de la clase padre
    // constructores --> solo tengo el por defecto si quieres los de la clase padre, LOS PIDES

    public BancoException() {}
    public BancoException(String element) {
        super(element);
        // mas cosas, pero Primero la llamada al constructor de la clase padre
    }
}
