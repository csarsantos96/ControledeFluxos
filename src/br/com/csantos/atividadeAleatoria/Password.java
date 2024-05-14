package br.com.csantos.atividadeAleatoria;
/*
Create a Java program that prompts the user to enter a password.
If the password is correct after three attempts, display a success message. If the user enters the correct password, break the loop. If the user exceeds three incorrect attempts, display an error message and terminate the program.
Use a for, break, else and if loop.
 */
import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String password = "";
        int attempts = 0;

        System.out.println("Digite a senha: ");
        password = s.nextLine();

        for (int i = 0; i < 3; i++) {
            System.out.println("Confirme a senha: ");
            String senha = s.nextLine();

            if (senha.equals(password)) {
                System.out.println("Senha correta!");
                break;
            } else {
                attempts++;
                System.out.println("Senha incorreta. Tentativa " + (attempts + 1) + "/3");
            }
        }

        if (attempts == 3) {
            System.out.println("Número máximo de tentativas excedido. Programa encerrado.");
        }
    }
}