package br.com.csantos.forewhile;
import java.util.Scanner;

public class TabbuadaFor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // ler do console

        System.out.println("Digite um número para gerar a tabuada: "); // imprimir a mensagem no console
        int numero = s.nextInt(); // aqui faz a leitura do numero.
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        // 1 X 0 = 0
        //1 X 1 = 1
        //...
    }
}
