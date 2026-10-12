public class Dividir extends OperacaoMatematica {
    public Dividir(int operando1, int operando2) { super(operando1, operando2); }
    public float retornarResultado() { return (float) getOperando1() / getOperando2(); }
}
