// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner,
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);".
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

import java.util.*;

public class ValidParentheses {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        boolean caracter = ehValido(scanner.nextLine());

        System.out.println(caracter);
    }

    public static boolean ehValido(String s) {
        //TODO: implemente a lógica de caracteres válidos e retorne se a string é valida ou não.

        String[] letras = s.split("");
        String[] tags = {"(",")","{","}","[","]"};
        boolean b = false;

        for(int i = 0; i < tags.length; i++){
            if (letras[0].equals(tags[i]) && letras[letras.length-1].equals(tags[i + 1])){
                b = true ;
            }
        }
        return b;
    }

}

/*

Desafio
        Dada uma string com apenas os seguintes caracteres '(', ')', '{', '}', '[', ']' determine se uma determinada string é válida.

        Entrada
        Uma string é considerada válida se:

        Caracteres de abertura devem ser fechadas pelo mesmo tipo. Abertura devem ser fechados com uma chave correspondente. Uma string vazia é considerada válida.

        Saída
        A saída corresponde a um valor Booleano como no exemplo abaixo:

        Entrada	Saída
        [ ]

        true
        ( )

        true
        [ )

        false
 */
