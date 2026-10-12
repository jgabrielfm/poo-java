public class Infantaria extends Unidade {
    public Infantaria() { super("Infantaria"); }

    @Override
    public boolean ganhaQuandoAtacadoPor(Unidade a) {
        return a instanceof Cavalaria;
    }
}
