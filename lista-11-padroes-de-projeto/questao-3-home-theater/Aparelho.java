public abstract class Aparelho {
    private Aparelho proximo;

    public Aparelho(Aparelho proximo) { this.proximo = proximo; }

    public void ligarModoFilme() {
        modoFilme();
        if (proximo != null) proximo.ligarModoFilme();
    }

    protected abstract void modoFilme();

    public Aparelho getProximo() { return proximo; }
    public void setProximo(Aparelho proximo) { this.proximo = proximo; }
}
