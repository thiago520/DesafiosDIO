import java.util.Scanner;

public class Batmain {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int t = scan.nextInt();
        
        int count = 0; 
        while(count < t) {
        	String vilao = scan.next();
        	System.out.println("Y"); //complete aqui com sua solução
        	count++;
        }       
    }
}


/* Entrada
A primeira linha da entrada é composta por um número inteiro T que indica a quantidade de casos de testes. 
Cada caso de teste é composto por uma cadeia de caracteres de tamanho N (1 < N < 26). Todos os caracteres são letras maiúsculas ou minúsculas do alfabeto inglês.

Saída
Caso o vilão alguma vez já foi capturado pelo Batmain, imprima Y. Caso contrário, imprima N.

 

 
Exemplo de Entrada	Exemplo de Saída
1
Pistoleiro

Y */