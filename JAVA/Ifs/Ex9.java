//Verifique se um nome de usuário é "admin" e senha é "1234". Informe "Acesso concedido" ou "Acesso negado"

package ifs;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String user = sc.next();
        String senha = sc.next();

        if (user.equals("admin") && senha.equals("1234"))
            System.out.println("Acesso concedido");
        else
            System.out.println("Acesso negado");

        sc.close();
    }
}
