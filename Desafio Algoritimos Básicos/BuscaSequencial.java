// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println. 

import java.util.*;

public class BuscaSequencial {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int numero, pos = -1;
        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}; 

       // System.out.println("Digite o valor para buscar: ");
        numero = leitor.nextInt();

        pos = posicao(numero, elementos);

        if (pos == -1){
            System.out.println("Numero " + numero + " nao encontrado!");
        } else {
            System.out.println("Achei " + numero + " na posicao " + pos);
        }
    }
    
    static int posicao(int numero, int[] elementos) {
        int pos = -1;
        for (int i = 0; i < elementos.length; i++){
            if(numero == elementos[i]){
                pos = i;
            }
        }

        return pos;
    }

}

/* 
Desafio
Uma busca sequencial se caracteriza por percorrermos todos os  elementos de uma estrutura em busca do elemento “X” desejado. Neste desafio, dada uma estrutura de vetor A [a1, a2...an], percorra todo o vetor fazendo as comparações de A[N] = X. Caso a condição seja verdadeira, “X” existe na estrutura e a busca será concluída com sucesso. 

Considere um array de 10 elementos do tipo inteiro: 

Os elementos são {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}. 

● Implemente uma classe em Java que aloque e carregue esses elementos em um array.  

● Implementação da busca sequencial: 

● Crie um método em Java que realiza uma busca sequencial.  

● Se o valor constar no array, retorne um texto contendo o valor e sua respectiva posição no array. Caso contrario retorne um texto dizendo que o número não foi encontrado, conforme exemplos abaixo.

 

Entrada
A entrada consiste em um valor de busca e/ou array

Saída
A saída será a a posição do elemento no array, caso o valor não se encontre na Array, retorne a frase " Numero __ nao encontrado!", como no exemplo abaixo:

 

EXEMPLO DE ENTRADA 

EXEMPLO DE SAÍDA 

81 

Achei 81 na posicao 5 

10 

Achei 10 na posicao 8 

-16 

Achei –16 na posicao 2 

4 

Numero 4 nao encontrado!  */