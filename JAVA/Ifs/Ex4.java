//Receba uma nota (0 a 10) e imprima "Aprovado" se for maior ou igual a 6, caso contrário "Reprovado"

package ifs;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Adicionar mensagem para o usuário
        System.out.print("Digite a nota (0 a 10): ");
        double nota = sc.nextDouble();
        
        // Validar se a nota está no intervalo correto
        if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
        } else if (nota >= 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
        
        sc.close();
    }
}