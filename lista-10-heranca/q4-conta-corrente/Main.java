import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1- Conta normal | 2- Conta especial: ");
        int op = sc.nextInt();
        System.out.print("Saldo inicial: ");
        float s = sc.nextFloat();
        int n = (int) (Math.random() * 9000) + 1000;
        System.out.print("Titular: ");
        String t = sc.nextLine();
        ContaCorrente c = op == 2 ? new ContaEspecial(t, s, n) : new ContaCorrente(t, s, n);
        System.out.print("Valor do saque: ");
        c.sacar(sc.nextFloat());
        System.out.printf("%s, conta %d: novo saldo R$ %.2f%n", c.getTitular(),
                c.getNumeroDaConta(), c.getSaldo());
    }
}
