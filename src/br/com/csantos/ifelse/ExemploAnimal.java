package br.com.csantos.ifelse;
import java.util.Scanner;

public class ExemploAnimal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o nome do animal: ");
        String texto = s.nextLine();
        String animal = exempleOfIf(texto);
        System.out.println(animal);
    }

    public static String exempleOfIf(String texto) {
        String result;
        if (texto.equals("DOG") || texto.equals("CAT")) {
            result = "domestic animal";
        }
        else if (texto.equals("TIGER")) {
            result = "wild animal";
        } else {
            result = "unknown animal";
        }
        return result;
    }
}