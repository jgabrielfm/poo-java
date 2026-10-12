public class ContaEspecial extends ContaCorrente {
    public ContaEspecial(String titular, float saldo, int numeroDaConta) {
        super(titular, saldo, numeroDaConta);
    }

    public void sacar(float valor) {
        if (valor > 0) setSaldo(getSaldo() - valor - 0.5f);
    }
}
