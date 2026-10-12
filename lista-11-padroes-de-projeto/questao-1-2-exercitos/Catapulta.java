public class Catapulta extends Unidade {
    public Catapulta() { super("Catapulta"); }

    @Override
    public boolean ganhaQuandoAtacadoPor(Unidade a) {
        return a instanceof Infantaria;
    }
}
