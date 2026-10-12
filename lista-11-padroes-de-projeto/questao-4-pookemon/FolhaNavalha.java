public class FolhaNavalha implements Ataque {
    @Override
    public void executar(Pokemon p) {
        System.out.printf("%s usou Folha Navalha!%n", p.getNome());
    }
}
