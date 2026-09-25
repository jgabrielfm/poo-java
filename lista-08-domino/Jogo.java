import java.util.Random;

public class Jogo {
    private Domino[] pecas = new Domino[28];
    private int indice = 0;
    private int pontaEsq = -1, pontaDir = -1;

    public Jogo() {
        int k = 0;
        for (int a = 0; a <= 6; a++)
            for (int b = a; b <= 6; b++)
                pecas[k++] = new Domino(a, b);
    }

    public int getPontaEsq() { return pontaEsq; }
    public int getPontaDir() { return pontaDir; }

    public void embaralharPecas() {
        Random r = new Random();
        for (int t = 0; t < 100; t++) {
            int i = r.nextInt(28), j = r.nextInt(28);
            while (j == i) j = r.nextInt(28);
            Domino aux = pecas[i];
            pecas[i] = pecas[j];
            pecas[j] = aux;
        }
        indice = 0;
        pontaEsq = pontaDir = -1;
    }

    public Domino puxarPeca() {
        return indice < 28 ? pecas[indice++] : null;
    }

    public boolean conectarPontaEsquerda(Domino d) {
        int a = d.getLadoA(), b = d.getLadoB();
        if (pontaEsq == -1 || pontaDir == -1) { pontaEsq = a; pontaDir = b; return true; }
        if (a != pontaEsq && b != pontaEsq) return false;
        pontaEsq = a == pontaEsq ? b : a;
        return true;
    }

    public boolean conectarPontaDireita(Domino d) {
        int a = d.getLadoA(), b = d.getLadoB();
        if (pontaEsq == -1 || pontaDir == -1) { pontaEsq = a; pontaDir = b; return true; }
        if (a != pontaDir && b != pontaDir) return false;
        pontaDir = a == pontaDir ? b : a;
        return true;
    }

    public static boolean testeSeAcabou(Domino[] m) {
        for (Domino d : m) if (d != null) return false;
        return true;
    }
}
