/*
* Desafio
* Crie um programa que leia 6 valores. Você poderá receber valores negativos e/ou positivos como entrada,
* devendo desconsiderar os valores nulos. Em seguida, apresente a quantidade de valores positivos digitados.

* Entrada
* Você receberá seis valores, negativos e/ou positivos.

* Saída
* Exiba uma mensagem dizendo quantos valores positivos foram lidos assim como é exibido abaixo no exemplo de saída.
* Não esqueça da mensagem "valores positivos" ao final.

* Exemplo de Entrada	    Exemplo de Saída
*    7                      4 valores positivos
*   -5
*    6
*    -3.4
*    4.6
*    12
* */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NumPositivos {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = 0;
        StringTokenizer st;

        for (int i = 0; i < 6; i++ ) {
            st = new StringTokenizer(br.readLine());

            if ( Double.parseDouble(st.nextToken()) > 0) {
                ++num;
            }
        }

        System.out.println(num + " valores positivos");

    }
}