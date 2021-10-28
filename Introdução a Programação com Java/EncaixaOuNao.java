import java.util.Scanner;

public class EncaixaOuNao {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();
		
		for (int i = 0; i < count; i++) {
			String A = scan.next();
            String B = scan.next();

			if ( A.endsWith(B) ) System.out.println("encaixa");
			else System.out.println("nao encaixa");
		}

	}
}


/* 
Paulinho tem em suas mãos um pequeno problema. A professora lhe pediu que ele construísse um programa para verificar, à partir de dois valores inteiros A e B, se B corresponde aos últimos dígitos de A.

Entrada
A entrada consiste de vários casos de teste. A primeira linha de entrada contém um inteiro N que indica a quantidade de casos de teste. Cada caso de teste consiste de dois inteiros A (1 ≤ A < 231 ) e B (1 ≤ B < 231) positivos.

Saída
Para cada caso de entrada imprima uma mensagem indicando se o segundo valor encaixa no primeiro valor, confome exemplo abaixo.

 
Exemplo de Entrada	Exemplo de Saída
4
5678690 78690
5434554 543
1243 1243
54 654

encaixa
nao encaixa
encaixa
nao encaixa */