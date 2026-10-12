import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Operação (adição, subtração, multiplicação, divisão): ");
        String s = sc.nextLine().toLowerCase();
        System.out.print("Dois números: ");
        int a = sc.nextInt(), b = sc.nextInt();
        OperacaoMatematica o = s.equals("adição") ? new Somar(a, b)
                : s.equals("subtração") ? new Subtrair(a, b)
                : s.equals("multiplicação") ? new Multiplicar(a, b)
                : s.equals("divisão") ? new Dividir(a, b) : null;
        if (o != null) o.imprimirResultado();
        else System.out.println("Operação inválida!");
    }
}
