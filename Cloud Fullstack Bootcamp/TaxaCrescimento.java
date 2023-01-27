import java.util.Scanner;

public class TaxaCrescimento {
    public static void main(String[] args) {
        // Cria um Scanner para ler a entrada
        Scanner scanner = new Scanner(System.in);

        // Lê a população do país A e B
        int populacaoA = scanner.nextInt();
        int populacaoB = scanner.nextInt();

        // Calcula a taxa de crescimento do país A e B
        double crescimentoA = 0.03;
        double crescimentoB = 0.015;

        // Inicializa o número de anos com 0
        int anos = 0;

        // Enquanto a população do país A for menor que a população do país B
        while (populacaoA < populacaoB) {
            // Calcula o crescimento da população do país A e B neste ano
            populacaoA += populacaoA * crescimentoA;
            populacaoB += populacaoB * crescimentoB;

            // Incrementa o número de anos
            anos++;
        }

        // Imprime o resultado
        System.out.println(anos + " anos");
    }
}

/* 
Desafio
Supondo que a população de um país A tenha N habitantes com uma taxa anual de crescimento de 3% e que a população de B M habitantes com uma taxa de crescimento de 1.5%. Faça um programa que calcule e escreva o número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento.

Obs: O valor inicial da população A deverá ser sempre menor que do país B

Entrada
A entrada consiste em dois valores inteiros, sendo N a população do país A e M a população do país B.

Saída
A saída consiste em retornar o número de anos necessários para que a população do país A ultrapasse ou iguale a população B, mantidas as taxas de crescimento. Confira exemplo abaixo:

Exemplo 1

Entrada	Saída
80000

100000

16 anos
Exemplo 2

Entrada	Saída
100000

200000

48 anos */