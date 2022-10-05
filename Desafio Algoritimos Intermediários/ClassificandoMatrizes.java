// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner,
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);".
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

// Abaixo segue um exemplo de código que você pode ou não utilizar:

import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int i, aux;
        //System.out.println("Digite o tamanho do Array: ");
        int N = input.nextInt();
        int [] nums = new int[N];

        for (i = 0; i < N; i++)
        {
            //System.out.println("Digite o " + (i+1) +"°" + " número: ");
            nums[i] = input.nextInt();
        }

        for (i = 0; i < N; i++)
        {
            if (nums[i] % 2 != 0){

                for (int j = (i+1); j < N; j++)
                {
                    if (nums[j] % 2 == 0) {
                        aux = nums[i];
                        nums[i] = nums[j];
                        nums[j] = aux;
                        j = N;
                    }
                }
            }
        }

        for (i = 0; i < N; i++)
        {
            System.out.println(nums[i]);
        }
    }
}

/*

Desafio
        Dado um array inteiro nums, mova todos os inteiros pares no início do array seguido por todos os inteiros ímpares.

        Retorne qualquer array que satisfaça essa condição.


        Entrada
        A primeira linha da entrada deverá conter um inteiro que corresponda ao tamanho do array. As linhas seguintes deverão conter os valores que esse array receberá.

        Saída
        A saída deverá retornar todos os valores pares para o começo do array, seguido pelos ímpares, conforme exemplo abaixo:

        Exemplo 1

        Entrada	Saída
        4
        3
        1
        2
        4	2
        4
        3
        1
        Exemplo 2

        Entrada	Saída
        1
        0	0*/
