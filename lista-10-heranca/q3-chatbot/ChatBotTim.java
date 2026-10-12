public class ChatBotTim extends ChatBot {
    public ChatBotTim() {
        super("Tina", "Tim");
    }

    protected void identificar() { System.out.print("Qual seu telefone? "); }

    protected void exibirOpcoes() {
        System.out.println("Escolha o assunto:\n1-Crédito\n2-Plano\n3-Outros");
    }
}
