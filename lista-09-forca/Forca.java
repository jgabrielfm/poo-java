import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Forca {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner arq = new Scanner(new File("palavras.txt"));
        Palavra[] d = new Palavra[10];
        int n = 0;
        while (arq.hasNextLine() && n < 10) {
            String[] c = arq.nextLine().split(",", 2);
            if (c.length == 2) d[n++] = new Palavra(c[0].trim(), c[1].trim());
        }
        arq.close();

        JogoDaForca j = new JogoDaForca(d);
        j.sortear();
        Scanner s = new Scanner(System.in);
        int erros = 0;
        System.out.println("Dica: " + j.pegarDica());
        while (!j.testaSeAcabou()) {
            System.out.printf("Palavra: %s%nQual letra deseja testar? ", j.getGabarito());
            boolean ok = j.testarLetra(s.next().charAt(0));
            if (!ok) erros++;
            System.out.println(ok ? "Acertou!" : "Errou!");
        }
        System.out.printf("Palavra: %s%nFim de jogo! Pontuação: %d%n", j.getGabarito(), 2 * j.getGabarito().length() - erros);
    }
}
