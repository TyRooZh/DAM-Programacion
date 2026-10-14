package Model;

public class Calculadora {
    // atributos
       // operador1, operador2, tipoOperacion, resultado
    private int operando1, operando2;
    private double resultado;
    private String tipoOperacion;
    // constructores -> el vacio lo tengo por defecto. Ojo desaparece si escribo otro

    public Calculadora() {}

    public void sumar(int operando1, int operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
        this.resultado = this.operando1 + this.operando2;
        this.tipoOperacion = "suma";
        System.out.println("Esta realizando una suma. Calculando resultado...");
        System.out.println("El resultado es "+this.resultado);
    }

    /* public double sumar(int operando1, int operando2, int operando3) {
        this.operando1 = operando1;
        this.operando2 = operando2;
        this.resultado = this.operando1 + this.operando2;
        this.tipoOperacion = "suma";
        System.out.println("Esta realizando una suma. Calculando resultado...");
        return resultado;
    } */
    public void restar(int operando1, int operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
        this.resultado = this.operando1 - this.operando2;
        this.tipoOperacion = "resta";
        System.out.println("Esta realizando una resta. Calculando resultado...");
        System.out.println("El resultado es "+this.resultado);
    }

    public void multiplicar(int operando1, int operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
        this.resultado = this.operando1 * this.operando2;
        this.tipoOperacion = "multiplicación";
        System.out.println("Esta realizando una multiplicacion. Calculando resultado...");
        System.out.println("El resultado es "+this.resultado);
    }

    public void dividir(int operando1, int operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
        this.resultado = (double)this.operando1 / this.operando2;
        this.tipoOperacion = "división";
        System.out.println("Esta realizando una division. Calculando resultado...");
        System.out.println("El resultado es "+this.resultado);
    }

    public void modulo(int operando1, int operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
        this.resultado = this.operando1 % this.operando2;
        this.tipoOperacion = "modulo";
        System.out.println("Esta realizando una módulo. Calculando resultado...");
        System.out.println("El resultado es "+this.resultado);
    }


    public double getResultado() {
        return resultado;
    }

    public int getOperando2() {
        return operando2;
    }

    public int getOperando1() {
        return operando1;
    }

    public String getTipoOperacion() {
        return tipoOperacion;
    }

    // TODO resta, multiplicacion, division, modulo
}
