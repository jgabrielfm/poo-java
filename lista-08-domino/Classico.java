import java.util.Arrays;
import java.util.Scanner;

public class Classico {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Jogo j = new Jogo();
        j.embaralharPecas();
        Domino[] m1 = new Domino[6], m2 = new Domino[6];
        for (int i = 0; i < 6; i++) { m1[i] = j.puxarPeca(); m2[i] = j.puxarPeca(); }
        Domino p = j.puxarPeca();
        j.conectarPontaEsquerda(p);
        System.out.println("Peça sorteada para iniciar o jogo: " + p);
        int v = 1;
        while (true) {
            Domino[] m = v == 1 ? m1 : m2;
            System.out.printf("Em jogo: esquerda: %d │ direita: %d%nMão do Jogador %d: %s%nJogador %d, indique o índice da peça que deseja jogar: ",
                    j.getPontaEsq(), j.getPontaDir(), v, Arrays.toString(m), v);
            int i = s.nextInt();
            System.out.printf("Jogador %d, em qual lado deseja conectar? ", v);
            boolean ok = s.next().startsWith("e") ? j.conectarPontaEsquerda(m[i]) : j.conectarPontaDireita(m[i]);
            if (!ok) {
                System.out.printf("Não conectou. Jogador %d perdeu. Jogador %d venceu!%n", v, 3 - v);
                break;
            }
            m[i] = null;
            if (Jogo.testeSeAcabou(m)) {
                System.out.printf("Jogador %d jogou todas as peças e venceu!%n", v);
                break;
            }
            v = 3 - v;
        }
        System.out.println("Fim de Jogo.");
    }
}
