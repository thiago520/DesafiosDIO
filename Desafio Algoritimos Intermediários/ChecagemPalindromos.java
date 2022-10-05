// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println. 

import java.util.Scanner;

public class ChecagemPalindromos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();

        String palavraInvertida = new StringBuilder(palavra).reverse().toString();

        System.out.println(palavra.equals(palavraInvertida) ? "TRUE" : "FALSE");

        //TODO: Retorne TRUE ou FALSE, caso a "palavra" seja ou não um Palíndromo.
    }
}

/*

Desafio
        Neste desafio você deverá construir uma função que recebe uma String e identifique se a mesma é um palíndromo, ou seja, se a String é igual a ela mesma invertida.

        Dado que temos a String "digital" uma vez invertida temos "latigid" que são diferentes.

        Logo, NÃO é um Palíndromo.

        Já se recebemos a string "radar" uma vez invertida temos "radar" que são iguais.

        Entrada
        A entrada consiste em um palavra.

        Saída
        Para cada String informada, terá uma saída de valor Booleano: TRUE, caso a palavra seja um palíndromo, ou FALSE caso a palavra NÃO seja um palíndromo.



        Exemplos de Entrada	Exemplos de Saída
        radar

        TRUE
        digital	FALSE
        ana	TRUE

*/
