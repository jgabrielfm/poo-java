import java.util.ArrayList;

public class ChatBotNetflix extends ChatBot {
    private ArrayList<String> programas;

    public ChatBotNetflix(ArrayList<String> programas) {
        super("Neta", "Netflix");
        this.programas = programas;
    }

    public ArrayList<String> getProgramas() { return programas; }
    public void setProgramas(ArrayList<String> programas) { this.programas = programas; }

    protected void identificar() { System.out.println("Seu email:\n Sua senha: "); }

    protected void exibirOpcoes() {
        System.out.println("Programas na sua lista:\n" + programas);
    }
}
