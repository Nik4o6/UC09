
import java.util.Scanner;

public class atividade {
    public static void main(String[] args) {
        String line, line2, firstLetter;
        Scanner in = new Scanner(System.in);

        
        System.out.println("Quem e o usuario? ");
        line = in.nextLine();

        
        System.out.println("Qual sobrenome do usuario? : ");
        line2 = in.nextLine();


        System.out.println("Seu nome de usuario é "+ line + " " + line2);

    }
}
