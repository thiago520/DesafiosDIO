import java.io.IOException;
import java.util.Scanner;

// Abaixo segue um exemplo de código que você pode ou não utilizar

public class Desafio {	
    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int N = leitor.nextInt();

//TODO: Complete os espaços em branco com uma solução possível

		for (int i = 1; i<= N; i++) {
            System.out.println(i + " " + (i*i) + " " + (i*i*i));
            System.out.println(i + " " + (i*i+1) + " " + (i*i*i+1));
		}
  }
}

/* Detalhe
Desenvolva um programa capaz de ler um valor inteiro N. N * 2 linhas de saída vão ser apresentadas na execução do programa, seguindo a lógica do exemplo mais abaixo. Para os valores com mais de seis dígitos, todos os dígitos devem ser apresentados.

Entrada
O arquivo de entrada contém um número inteiro positivo N (1 < N < 1000).

Saída
Imprima a saída conforme o exemplo fornecido.

 
Exemplo de Entrada	Exemplo de Saída
5

1 1 1
1 2 2
2 4 8
2 5 9
3 9 27
3 10 28
4 16 64
4 17 65
5 25 125
5 26 126

 */