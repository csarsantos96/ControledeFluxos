package br.com.csantos.atividadeModulo11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        System.out.println("Digite a quarta nota: ");
        double nota4 = scanner.nextDouble();

        CalcularMedia calcularMedia = new CalcularMedia(nota1, nota2, nota3, nota4);
        double media = calcularMedia.getMedia();

        System.out.println("A média da sua nota é: " + media);
    }
}