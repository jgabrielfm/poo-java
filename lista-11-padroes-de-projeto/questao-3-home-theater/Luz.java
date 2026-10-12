public class Luz extends Aparelho {
    private boolean acesa;

    public Luz(Aparelho proximo) { super(proximo); }

    public void ligar() { acesa = true; }
    public void desligar() { acesa = false; }

    @Override
    protected void modoFilme() { desligar(); }

    public boolean isAcesa() { return acesa; }
    public void setAcesa(boolean acesa) { this.acesa = acesa; }
}
