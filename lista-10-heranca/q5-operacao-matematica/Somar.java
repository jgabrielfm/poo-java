public class Somar extends OperacaoMatematica {
    public Somar(int operando1, int operando2) { super(operando1, operando2); }
    public float retornarResultado() { return getOperando1() + getOperando2(); }
}
