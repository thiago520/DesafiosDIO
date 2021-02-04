// Desafio
// Faça a leitura de um valor inteiro. Em seguida, calcule o menor número de notas possíveis (cédulas) onde o valor pode ser decomposto. As notas que você deve considerar são de 100, 50, 20, 10, 5, 2 e 1. Na sequência mostre o valor lido e a relação de notas necessárias.

// Entrada
// Você receberá um valor inteiro N (0 < N < 1000000).

// Saída
// Exiba o valor lido e a quantidade mínima de notas de cada tipo necessárias, seguindo o exemplo de saída abaixo. Após cada linha deve ser imprimido o fim de linha.

 
// Exemplo de Entrada	Exemplo de Saída
// 576

// Exemplo de Saída
// 576
// 5 nota(s) de R$ 100,00
// 1 nota(s) de R$ 50,00
// 1 nota(s) de R$ 20,00
// 0 nota(s) de R$ 10,00
// 1 nota(s) de R$ 5,00
// 0 nota(s) de R$ 2,00
// 1 nota(s) de R$ 1,00

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ContagemCedulas {

    public static void main(String[] args) throws IOException { 

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int aux = num;
        int[] cedulas = { 100, 50, 20, 10, 5, 2, 1 };
        int[] qntCedula = { 0, 0, 0, 0, 0, 0, 0 };

        for (int i = 0; i < cedulas.length; i++) {
            int divisao = num / cedulas[i];

            if (divisao > 0) {
                qntCedula[i] = divisao;
                num = num % cedulas[i];
            }
        }
        System.out.println(aux);
        for(int j = 0; j < cedulas.length; j++) {
          System.out.println(qntCedula[j] + " nota(s) de R$ " + cedulas[j] + ",00");
        }
    }        
}