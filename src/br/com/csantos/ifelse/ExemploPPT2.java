package br.com.csantos.ifelse;

public class ExemploPPT2 {
    public static void main(String[] args) {
        int result = 7;
        if (result > 1 && result < 5) {
            System.out.println("Resultado entre 2 e 4");
        } else if (result > 5 && result < 8) {
            System.out.println("Resultado entre 6 e 8");

        } else {
            System.out.println("Resultado diferente dos anteriores");
        }
    }
}
