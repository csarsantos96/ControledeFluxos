package br.com.csantos.atividadeAleatoria;
/*
Write a Java program that prints the numbers 1 to 10, skipping even numbers.
Use a for, continue and if Loop.
 */
public class SkippingEvenNumbers {

    public static void main(String[] args) {
        for (int number = 1; number <= 10; number++) {
            if (number % 2 == 0) { // Se o número for par, pula para a próxima iteração
                continue;
            }
            System.out.println(number);
        }
    }
}