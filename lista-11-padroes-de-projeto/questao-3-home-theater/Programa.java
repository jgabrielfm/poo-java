public class Programa {
    public static void main(String[] args) {
        HomeTheater ht = new HomeTheater(new TV(new Luz(new Som(null))));
        ht.ligarModoFilme();
    }
}
