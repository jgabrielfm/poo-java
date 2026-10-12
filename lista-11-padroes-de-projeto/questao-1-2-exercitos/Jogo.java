import java.util.List;
import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Jogador[] js = new Jogador[2];

        for (int i = 0; i < 2; i++) {
            System.out.printf("Nome do jogador %d: ", i + 1);
            js[i] = new Jogador(sc.nextLine());
            while (js[i].getDinheiro() >= 100) {
                System.out.printf("%s, R$%d. 1-Catapulta 2-Cavalaria 3-Infantaria: ",
                        js[i].getNome(), js[i].getDinheiro());
                int op = sc.nextInt();
                js[i].comprar(op == 1 ? new Catapulta()
                        : op == 2 ? new Cavalaria() : new Infantaria());
            }
            sc.nextLine();
        }

        List<Unidade> e1 = js[0].getExercito();
        List<Unidade> e2 = js[1].getExercito();
        while (!e1.isEmpty() && !e2.isEmpty()) {
            Unidade a = e1.get((int) (Math.random() * e1.size()));
            Unidade d = e2.get((int) (Math.random() * e2.size()));
            System.out.printf("%s (%s) x %s (%s) -> ", a.getTipo(), js[0].getNome(),
                    d.getTipo(), js[1].getNome());
            if (d.ganhaQuandoAtacadoPor(a)) {
                e1.remove(a);
                System.out.printf("%s venceu%n", d.getTipo());
            } else if (a.ganhaQuandoAtacadoPor(d)) {
                e2.remove(d);
                System.out.printf("%s venceu%n", a.getTipo());
            } else {
                e1.remove(a);
                e2.remove(d);
                System.out.println("empate, ambas perdem");
            }
        }
        System.out.printf("Fim de jogo! %s%n", e1.isEmpty() && e2.isEmpty() ? "Empate."
                : "Vencedor: " + (e1.isEmpty() ? js[1] : js[0]).getNome());
    }
}
