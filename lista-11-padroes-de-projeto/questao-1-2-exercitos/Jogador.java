import java.util.ArrayList;
import java.util.List;

public class Jogador {
    private String nome;
    private int dinheiro;
    private List<Unidade> exercito;

    public Jogador(String nome) {
        this.nome = nome;
        this.dinheiro = 1200;
        this.exercito = new ArrayList<>();
    }

    public boolean comprar(Unidade u) {
        if (dinheiro < 100) return false;
        dinheiro -= 100;
        exercito.add(u);
        return true;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public int getDinheiro() { return dinheiro; }
    public void setDinheiro(int dinheiro) { this.dinheiro = dinheiro; }
    public List<Unidade> getExercito() { return exercito; }
    public void setExercito(List<Unidade> exercito) { this.exercito = exercito; }
}
