import java.util.Scanner;

public class TempoDownload {

    public static void main(String[] Args) {

        Scanner sc = new Scanner(System.in);

        // Recebe o tamanho do arquivo em MB
        double tamanhoArquivo = sc.nextFloat();

        // Recebe a velocidade do link de internet em Mbps
        double velocidadeLink = sc.nextFloat();

        // Calcula o tempo de download em minutos
        double tempoMinutos = tamanhoArquivo / (velocidadeLink * 60);

        // Imprime o resultado
        System.out.printf(" %.2f ", tempoMinutos);
    }
}

/* 
Desafio
Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet (em Mbps). Calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos). 

Entrada  
Você receberá duas entradas que representam o tamanho do arquivo para download em MB e a velocidade de um link para Internet em Mbps. 

Saída
A saída será o tempo aproximado de download do arquivo em minutos. 

Entrada	Saída
159

200

 0.01
80

60

 0.02
30

60

 0.01 */