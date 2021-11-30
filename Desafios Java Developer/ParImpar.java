import java.io.IOException;
import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	int N = leitor.nextInt();
    	for (int i = 0; i < N; i++) {
    	  
    	 int X = leitor.nextInt();
    	 
    	 if ( X == 0 ) {
    	   System.out.println("NULL");
    	 }
    	 if ( X != 0 ) {
    	   if ( X > 0 ) {
    	     System.out.println( X % 2 == 0 ? "EVEN POSITIVE" : "ODD POSITIVE");
    	   } else if ( X < 0 ) {
    	     System.out.println( X % 2 == 0 ? "EVEN NEGATIVE" : "ODD NEGATIVE");
    	   }
    	 }
    		//complete sua solução aqui.
    	}
	}
	
}

/* 
Leia um valor inteiro N. Este valor será a quantidade de valores que serão lidos em seguida. Para cada valor lido, mostre uma mensagem em inglês dizendo se este valor lido é par (EVEN), ímpar (ODD), positivo (POSITIVE) ou negativo (NEGATIVE). No caso do valor ser igual a zero (0), embora a descrição correta seja (EVEN NULL), pois por definição zero é par, seu programa deverá imprimir apenas NULL.

Entrada
A primeira linha da entrada contém um valor inteiro N(N < 10000) que indica o número de casos de teste. Cada caso de teste a seguir é um valor inteiro X (-107 < X <107).

Saída
Para cada caso, imprima uma mensagem correspondente, de acordo com o exemplo abaixo. Todas as letras deverão ser maiúsculas e sempre deverá haver um espaço entre duas palavras impressas na mesma linha.

 
Exemplo de Entrada	Exemplo de Saída
4
-5
0
3
-4

ODD NEGATIVE
NULL
ODD POSITIVE
EVEN NEGATIVE */