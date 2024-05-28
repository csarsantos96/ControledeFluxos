package br.com.csantos.forewhile;
import java.util.Scanner;

public class TabuadaDoWhile {
    public static void main(String arg[]) {
        Scanner s = new Scanner(System.in);
    String resposta ="";

    do {
        System.out.println("Digite um numero para gerar a tabuada: ");
        int num = s.nextInt();
        for (int i = 0; i<=10; i++){
            System.out.println(num + "X" + i + "=" + num*i);
        }

        System.out.println("Deseja gerar novamente a tabuada de algum número? ");
         resposta = s.next();
    } while (resposta.equalsIgnoreCase("Sim"));

    System.out.println("Obrigado. ");

    }
}

