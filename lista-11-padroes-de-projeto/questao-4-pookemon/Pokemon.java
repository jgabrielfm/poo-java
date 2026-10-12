public class Pokemon {
    private String nome;
    private String tipo;
    private int nivel;
    private Ataque a, b, c, d;

    public Pokemon(String nome, String tipo, int nivel, Ataque a, Ataque b) {
        this.nome = nome;
        this.tipo = tipo;
        this.nivel = nivel;
        this.a = a;
        this.b = b;
        this.c = new SemAtaque();
        this.d = new SemAtaque();
    }

    public void ataqueA() { a.executar(this); }
    public void ataqueB() { b.executar(this); }
    public void ataqueC() { c.executar(this); }
    public void ataqueD() { d.executar(this); }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public int getNivel() { return nivel; }
    public void setNivel(int nivel) { this.nivel = nivel; }
    public Ataque getAtaqueA() { return a; }
    public void setAtaqueA(Ataque a) { this.a = a; }
    public Ataque getAtaqueB() { return b; }
    public void setAtaqueB(Ataque b) { this.b = b; }
    public Ataque getAtaqueC() { return c; }
    public void setAtaqueC(Ataque c) { this.c = c; }
    public Ataque getAtaqueD() { return d; }
    public void setAtaqueD(Ataque d) { this.d = d; }
}
