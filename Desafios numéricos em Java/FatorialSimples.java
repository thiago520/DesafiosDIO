import java.util.Scanner;

public class FatorialSimples {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int numero ;
        numero = sc.nextInt();

        System.out.println(factorial(numero));
    }

    public static final int factorial(int numero) {
        int fact = 1;
        for (int i = numero; i >= 1; i--) {
            fact *= i;
        }
        return fact;
    }

} 

/* 
Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.

Entrada
A entrada contém um valor inteiro N (0 < N < 13).

Saída
A saída contém um valor inteiro, correspondente ao fatorial de N.

 
Exemplo de Entrada	Exemplo de Saída
4

24 */