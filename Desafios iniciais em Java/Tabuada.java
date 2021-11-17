import java.io.IOException;
import java.util.Scanner;

public class Tabuada {
	
	public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	int N = leitor.nextInt();
    	System.out.println("1 x " + N + " = " + (N * 1));
    	System.out.println("2 x " + N + " = " + (N * 2));
    	System.out.println("3 x " + N + " = " + (N * 3));
    	System.out.println("4 x " + N + " = " + (N * 4));
    	System.out.println("5 x " + N + " = " + (N * 5));
    	System.out.println("6 x " + N + " = " + (N * 6));
    	System.out.println("7 x " + N + " = " + (N * 7));
    	System.out.println("8 x " + N + " = " + (N * 8));
    	System.out.println("9 x " + N + " = " + (N * 9));
    	System.out.println("10 x " + N + " = " + (N * 10));
	}
	
}

/* 
Leia 1 valor inteiro N (2 < N < 1000). A seguir, mostre a tabuada de N:      
1 x N = N      2 x N = 2N        ...       10 x N = 10N

Entrada
A entrada contém um valor inteiro N (2 < N < 1000).

Saída
Imprima a tabuada de N, conforme o exemplo fornecido.

 
Exemplo de Entrada	Exemplo de Saída
140

1 x 140 = 140
2 x 140 = 280
3 x 140 = 420
4 x 140 = 560
5 x 140 = 700
6 x 140 = 840
7 x 140 = 980
8 x 140 = 1120
9 x 140 = 1260
10 x 140 = 1400 */