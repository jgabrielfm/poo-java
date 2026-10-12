public class Terremoto implements Ataque {
    @Override
    public void executar(Pokemon p) {
        System.out.printf("%s usou Terremoto!%n", p.getNome());
    }
}
