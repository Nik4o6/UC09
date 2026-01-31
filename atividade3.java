
import java.util.Scanner;

public class atividade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double preco = sc.nextDouble();
        int quantidade = sc.nextInt();

        double custoTotal = preco * quantidade;

        System.out.println(custoTotal);
    }
}
