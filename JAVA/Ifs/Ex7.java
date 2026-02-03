//Receba dois números e uma operação (+, -, *, /). Use switch para calcular e mostrar o resultado

package ifs;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        double a = sc.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double b = sc.nextDouble();
        
        System.out.print("Digite a operação (+, -, *, /): ");
        char op = sc.next().charAt(0);
        
        switch (op) {
            case '+': System.out.println("Resultado: " + (a + b)); break;
            case '-': System.out.println("Resultado: " + (a - b)); break;
            case '*': System.out.println("Resultado: " + (a * b)); break;
            case '/': 
                if (b != 0) {
                    System.out.println("Resultado: " + (a / b));
                } else {
                    System.out.println("Erro: divisão por zero!");
                }
                break;
            default: System.out.println("Operação inválida");
        }
        
        sc.close();
    }
}