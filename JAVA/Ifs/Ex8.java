//Classifique a idade: 0-12 "Criança", 13-17 "Adolescente", 18-59 "Adulto", 60+ "Idoso

package ifs;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();

        if (idade <= 12)
            System.out.println("Criança");
        else if (idade <= 17)
            System.out.println("Adolescente");
        else if (idade <= 59)
            System.out.println("Adulto");
        else
            System.out.println("Idoso");

        sc.close();
    }
}
