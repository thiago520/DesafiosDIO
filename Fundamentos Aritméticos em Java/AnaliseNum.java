
/**
 * Desafio Você deve fazer a leitura de 5 valores inteiros. Em seguida mostre
 * quantos valores informados são pares, quantos valores informados são ímpares,
 * quantos valores informados são positivos e quantos valores informados são
 * negativos.
 * 
 * Entrada Você receberá 5 valores inteiros.
 * 
 * Saída Exiba a mensagem conforme o exemplo de saída abaixo, sendo uma mensagem
 * por linha e não esquecendo o final de linha após cada uma.
 * 
 Exemplo de Entrada 	Exemplo de Saída
*       -5                  3 valor(es) par(es)
*       0                   2 valor(es) impar(es)
*       -3                  1 valor(es) positivo(s)
*       -4                  3 valor(es) negativo(s)
*       12
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class AnaliseNum {

    public static void main(String[] args) throws IOException { 

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        

        int num = 0;
        int par = 0;
        int impar = 0;
        int positivo = 0;
        int negativo = 0;
        StringTokenizer st;

        for (int i = 0; i < 5; i++ ) {
            st = new StringTokenizer(br.readLine());
            num = Integer.parseInt(st.nextToken());

            if ( num % 2 == 0 ) {
                par++;
            } else {
                impar++;
            }

            if ( num > 0 ) {
                positivo++;                
            } else if ( num < 0) {
                negativo++;
            }
        }
        System.out.println(par + " valor(es) par(es)\n" +
                impar + " valor(es) impar(es)\n" +
                positivo + " valor(es) positivo(s)\n" +
                negativo + " valor(es) negativo(s)");
    }    
    
}
