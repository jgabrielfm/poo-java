public class HomeTheater {
    private Aparelho primeiro;

    public HomeTheater(Aparelho primeiro) { this.primeiro = primeiro; }

    public void ligarModoFilme() {
        if (primeiro != null) primeiro.ligarModoFilme();
    }

    public Aparelho getPrimeiro() { return primeiro; }
    public void setPrimeiro(Aparelho primeiro) { this.primeiro = primeiro; }
}
