public class Som extends Aparelho {
    private int volume;

    public Som(Aparelho proximo) { super(proximo); }

    public void mutar() { volume = 0; }
    public void aumentar() { volume++; }
    public void baixar() { volume--; }

    @Override
    protected void modoFilme() {
        mutar();
        for (int i = 0; i < 30; i++) aumentar();
    }

    public int getVolume() { return volume; }
    public void setVolume(int volume) { this.volume = volume; }
}
