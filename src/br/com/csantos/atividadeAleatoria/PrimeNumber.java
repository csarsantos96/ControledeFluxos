package br.com.csantos.atividadeAleatoria;
public class PrimeNumber {

    public static void main(String[] args) {
        int number = 1010; // Start checking from the next number after 100

        while (true) {
            if (isPrime(number)) {
                System.out.println("The first prime number greater than 100 is: " + number);
                break;
            }
            number++;
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}