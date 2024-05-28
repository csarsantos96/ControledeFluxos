package br.com.csantos.atividadeModulo10;

public class CalcularMedia {

    double nota1;
    double nota2;
    double nota3;
    double nota4;
    double media;

    public CalcularMedia(double nota1, double nota2, double nota3, double nota4) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;

        media = (nota1 + nota2 + nota3 + nota4) / 4.0;
    }

    public double getMedia() {
        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 4 && media < 7) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
        return media;
    }
}