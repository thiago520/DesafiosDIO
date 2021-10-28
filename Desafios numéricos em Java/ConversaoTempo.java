import java.util.Scanner;

public class Main {
    //complete os espaços em branco com sua solução
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sec;
        sec = input.nextInt();
        int hour =  sec / 3600;
        sec = sec-( hour * 3600 );

        int min = sec / 60;
        sec = sec-( min * 60 );

        System.out.println(hour+":"+min+ ":"+sec);
    }
}


/* 
Desafio
Você terá o desafio de ler um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma loja, e informe-o expresso no formato horas:minutos:segundos.

Entrada
O arquivo de entrada contém um valor inteiro N.

Saída
Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.

 
Exemplo de Entrada	Exemplo de Saída
556

0:9:16

1

0:0:1 */