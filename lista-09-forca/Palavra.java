public class Palavra {
    private String palavra, dica;

    public Palavra(String p, String dica) { setPalavra(p); setDica(dica); }

    public String getPalavra() { return palavra; }
    private void setPalavra(String p) { palavra = p; }
    public String getDica() { return dica; }
    public void setDica(String dica) { this.dica = dica; }
}
