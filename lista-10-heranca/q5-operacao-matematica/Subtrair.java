public class Subtrair extends OperacaoMatematica {
    public Subtrair(int operando1, int operando2) { super(operando1, operando2); }
    public float retornarResultado() { return getOperando1() - getOperando2(); }
}
