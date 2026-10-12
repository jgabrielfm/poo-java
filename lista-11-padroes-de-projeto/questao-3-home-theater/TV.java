public class TV extends Aparelho {
    private boolean ligada;

    public TV(Aparelho proximo) { super(proximo); }

    public void ligar() {
        ligada = true;
        System.out.println("Ligada");
    }

    public void desligar() {
        ligada = false;
        System.out.println("Desligada");
    }

    @Override
    protected void modoFilme() { ligar(); }

    public boolean isLigada() { return ligada; }
    public void setLigada(boolean ligada) { this.ligada = ligada; }
}
