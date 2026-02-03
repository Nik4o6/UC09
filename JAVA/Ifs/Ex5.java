//Receba um número e classifique-o como "Positivo", "Negativo" ou "Zero"

package ifs;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Adicionar mensagem para o usuário
        System.out.print("Digite um número inteiro: ");
        int n = sc.nextInt();
        
        // Verificar se é positivo, negativo ou zero
        if (n > 0) {
            System.out.println("O número " + n + " é Positivo");
        } else if (n < 0) {
            System.out.println("O número " + n + " é Negativo");
        } else {
            System.out.println("O número é Zero");
        }
        
        sc.close();
    }
}