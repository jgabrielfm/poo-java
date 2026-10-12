import java.time.LocalDateTime;

public abstract class ChatBot {
    private String nome, empresa;

    public ChatBot(String nome, String empresa) {
        this.nome = nome;
        this.empresa = empresa;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getEmpresa() { return empresa; }
    public void setEmpresa(String empresa) { this.empresa = empresa; }

    protected void saudar() {
        String[] msg = {"boa madrugada", "bom dia", "boa tarde", "boa noite"};
        int hora = LocalDateTime.now().getHour();
        System.out.println(msg[hora / 6]);
    }

    protected void seApresentar() {
        System.out.printf("Olá, eu sou %s, a atendente da %s.%n", nome, empresa);
    }

    protected abstract void identificar();
    protected abstract void exibirOpcoes();

    public final void iniciarAtendimento() {
        saudar(); seApresentar(); identificar(); exibirOpcoes();
    }
}
