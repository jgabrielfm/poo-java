public class ContaCorrente {
    private String titular;
    private float saldo;
    private int numeroDaConta;

    public String getTitular() { return titular; }
    public float getSaldo() { return saldo; }
    public int getNumeroDaConta() { return numeroDaConta; }
    public void setTitular(String titular) { this.titular = titular; }
    public void setNumeroDaConta(int nConta) { numeroDaConta = nConta; }
    protected void setSaldo(float saldo) { this.saldo = saldo; }

    public ContaCorrente(String titular, float saldo, int numeroDaConta) {
        this.titular = titular;
        this.saldo = saldo;
        this.numeroDaConta = numeroDaConta;
    }

    public void depositar(float valor) { if (valor > 0) saldo += valor; }
    public void sacar(float valor) { if (valor > 0) saldo -= valor + 1; }
}
