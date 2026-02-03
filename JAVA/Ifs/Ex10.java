//Se o valor da compra for maior que R$ 100, aplique 10% de desconto. Mostre o valor final

package ifs;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double valor = sc.nextDouble();

        if (valor > 100)
            valor = valor * 0.9;

        System.out.println(valor);

        sc.close();
    }
}
