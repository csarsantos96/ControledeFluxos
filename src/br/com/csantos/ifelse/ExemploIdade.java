package br.com.csantos.ifelse;
import java.util.Scanner;

public class ExemploIdade {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = s.nextInt();
        String idadeStr = getIdade(idade);
        System.out.print(idadeStr);
    }

    public static String getIdade(int idade) {
        if (idade >= 18) {
            return "Você é maior de idade";
        } else {
            return "Você é menor de idade";
        }
    }
}
