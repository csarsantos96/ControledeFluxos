package br.com.csantos.breakcontinue;

public class BreakContinue {
    public static void main(String[] args) {
        for (int contador = 1; contador <= 1000; contador++) {
            System.out.println("Essa é a repetição nr: " + contador);
            if (contador == 500) {
                break;
            }
        }
    }
}
