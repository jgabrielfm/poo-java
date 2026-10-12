public class Corte implements Ataque {
    @Override
    public void executar(Pokemon p) {
        System.out.printf("%s usou Corte!%n", p.getNome());
    }
}
