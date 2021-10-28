import java.util.Scanner;

public class ParesEntreCincoNumeros {
//TODO: Complete os espaços em branco com uma solução possível.
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		
      for(int i = 0; i < 5; i++) {
		  	int n = scan.nextInt();

		  	if ( n % 2 == 0 ){
			   count++;
			    
		  	}
		}
		System.out.printf("%d valores pares\n", count);
	}
}

/* 
Faça um programa que leia 5 valores inteiros. Conte quantos destes valores digitados são pares e mostre esta informação.

Entrada
O arquivo de entrada contém 5 valores inteiros quaisquer.

Saída
Imprima a mensagem conforme o exemplo fornecido, indicando a quantidade de valores pares lidos.

 
Exemplo de Entrada	Exemplo de Saída
7
-5
6
-4
12

3 valores pares */