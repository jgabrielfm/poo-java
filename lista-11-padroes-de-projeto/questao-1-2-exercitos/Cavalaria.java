public class Cavalaria extends Unidade {
    public Cavalaria() { super("Cavalaria"); }

    @Override
    public boolean ganhaQuandoAtacadoPor(Unidade a) {
        return a instanceof Catapulta;
    }
}
