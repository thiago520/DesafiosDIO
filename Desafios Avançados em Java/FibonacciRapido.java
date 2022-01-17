import java.util.Locale;
import java.util.Scanner;

public class FibonacciRapido {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	  double n = sc.nextDouble();
	  double resul, x, y;
	  
	  x = (1 + Math.sqrt(5))/2.0;
	  y = (1 - Math.sqrt(5))/2.0;
	  
	  resul = (Math.pow(x,n) - Math.pow(y,n))/Math.sqrt(5);
	  
	  
	  
	  System.out.printf("%.1f", resul);
     

	}
}


/* A fórmula de Binet é uma forma de calcular números de Fibonacci.



Sua tarefa é, dado um natural n, calcular o valor de Fibonacci(n) usando a fórmula acima.

Entrada
A entrada é um número natural n (0 < n ≤ 50).

Saída
A saída é o valor de Fibonacci(n) com 1 casa decimal utilizando a fórmula de Binet dada.

 
Exemplos de Entrada	Exemplos de Saída
1

1.0

 
2

1.0

 
3

2.0

Prova 2 (D2) de Programação de Computadores 2016/1 da UNILA

 */