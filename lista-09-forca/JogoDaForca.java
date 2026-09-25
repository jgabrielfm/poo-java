import java.util.Random;

public class JogoDaForca {
    private Palavra[] dicionario;
    private int posicaoSorteada = -1;
    private String gabarito;

    public JogoDaForca(Palavra[] d) { setDicionario(d); }

    public Palavra[] getDicionario() { return dicionario; }
    public void setDicionario(Palavra[] d) { dicionario = d; }
    public int getPosicaoSorteada() { return posicaoSorteada; }
    public String getGabarito() { return gabarito; }

    public String pegarDica() { return dicionario[posicaoSorteada].getDica(); }

    public void sortear() {
        Random r = new Random();
        do posicaoSorteada = r.nextInt(dicionario.length);
        while (dicionario[posicaoSorteada] == null);
        gabarito = dicionario[posicaoSorteada].getPalavra().replaceAll(".", "?");
    }

    public boolean testarLetra(char c) {
        String p = dicionario[posicaoSorteada].getPalavra(), g = "";
        for (int i = 0; i < p.length(); i++)
            g += p.charAt(i) == c ? c : gabarito.charAt(i);
        gabarito = g;
        return p.indexOf(c) >= 0;
    }

    public boolean testaSeAcabou() {
        if (gabarito.contains("?")) return false;
        dicionario[posicaoSorteada] = null;
        posicaoSorteada = -1;
        return true;
    }
}
