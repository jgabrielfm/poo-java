import java.util.Arrays;
import java.util.Scanner;

public class Unomino {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Jogo j = new Jogo();
        j.embaralharPecas();
        Domino[] mao = new Domino[6];
        for (int i = 0; i < 6; i++) mao[i] = j.puxarPeca();
        Domino vez = j.puxarPeca();
        int pts = 0;
        while (pts < 6) {
            System.out.printf("Peça da vez: %s%nPeças na mão: %s%nIndique o índice da peça que deseja casar (0-5): ",
                    vez, Arrays.toString(mao));
            int i = s.nextInt();
            boolean ok = mao[i].validarJuncao(vez);
            System.out.printf("%s %sse conecta com %s%n", mao[i], ok ? "" : "não ", vez);
            if (!ok) break;
            vez = mao[i];
            mao[i] = null;
            pts++;
        }
        System.out.printf("%s Fim de Jogo. Você fez %d pontos.%n", pts == 6 ? "Você ganhou!" : "Você perdeu.", pts);
    }
}
