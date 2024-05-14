package br.com.csantos.breakcontinue;

public class ContinueExemplo {
    public static void main(String[] args){
        for (int contador =1; contador<=100; contador ++){
            if(contador%5!=0)
                continue;
            System.out.println( "Contador: " + contador);
        }
    }
}

/*
O código acima conta de 1 a 100, mas só imprime os números múltiplo por 5,
ignorando o código que imprime os valores
 */