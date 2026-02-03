//Receba dois números e informe qual é o maior, ou se são iguais

package ifs;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Adicionar prompts para o usuário
        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();
        
        // Lógica para comparar
        if (a > b) {
            System.out.println("O maior número é: " + a);
        } else if (b > a) {
            System.out.println("O maior número é: " + b);
        } else {
            System.out.println("Os números são iguais: " + a);
        }
        
        sc.close();
    }
}
