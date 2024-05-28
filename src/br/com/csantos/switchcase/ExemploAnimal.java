package br.com.csantos.switchcase;

import java.util.Scanner;

public class ExemploAnimal {
   public static void main(String args[]){
       Scanner s = new Scanner(System.in);


       System.out.println("Digite o nome de um animal: ");
       String texto = s.next();
       String animal = exempleOfSwitch(texto);
       System.out.println(animal);
   }
   public static String exempleOfSwitch(String animal){
       String result;
       switch (animal){
           case "DOG":
           case "CAT":
               result = "domestic animal";
               break;
           case "TIGER":
               result = "wild animal";
               break;
           default:
               result = "unknown animal";
               break;
               
       }
       return result;
   }
}
