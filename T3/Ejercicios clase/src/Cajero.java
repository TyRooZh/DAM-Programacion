public class Cajero {
    // atributos -> caracteristicas (cualifican)
    private int saldo;
    // contructores -> inicilaizar el elemento
    public Cajero() {
        saldo = 1000;
    }
    // metodos -> funcionalidad
    public void ingresarDinero(int dinero) {
        saldo+=dinero;
    }
    public void sacarDinero(int dinero) {
        saldo -= saldo;
    }
    public int getSaldo() {
        return saldo;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

}
