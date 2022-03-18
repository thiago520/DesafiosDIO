import java.util.Locale;
import java.util.Scanner;
public class Experiencias{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int nrocobaia;
        char tipocobaia;
        int rato = 0, sapo = 0, coelho = 0, total = 0;
        double percrato = 0.0, percsapo = 0.0, perccoelho = 0.0;

        int a = input.nextInt();

        for (int i = 0; i < a; i++) {
            nrocobaia = input.nextInt();
            tipocobaia = input.next().toUpperCase().charAt(0);

            switch (tipocobaia) {
                case 'R':
                    rato += nrocobaia;
                    break;
                case 'S':
                    sapo += nrocobaia;
                    break;
                default:
                    coelho += nrocobaia;
                    break;
            }
            total += nrocobaia;
        }
        perccoelho = (coelho * 100.0) / total;
        percrato = (rato * 100.0) / total;
        percsapo = (sapo * 100.0) / total;

        System.out.printf("Total: %d cobaias\n", total);
        System.out.printf("Total de coelhos: %d\n", coelho);
        System.out.printf("Total de ratos: %d\n", rato);
        System.out.printf("Total de sapos: %d\n", sapo);
        System.out.printf("Percentual de coelhos: %.2f", perccoelho);
        System.out.println(" %");
        System.out.printf("Percentual de ratos: %.2f", percrato);
        System.out.println(" %");
        System.out.printf("Percentual de sapos: %.2f", percsapo);
        System.out.println(" %");

    }
}

/* Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa de sua ajuda para organizar os experimentos de um laboratório o qual ela é responsável. Ela quer saber no final do ano, quantas cobaias foram utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada.

Este laboratório em especial utiliza três tipos de cobaias: sapos, ratos e coelhos. Para obter estas informações, ela sabe exatamente o número de experimentos que foram realizados, o tipo de cobaia utilizada e a quantidade de cobaias utilizadas em cada experimento.

Entrada
A primeira linha de entrada contém um valor inteiro N que indica os vários casos de teste que vem a seguir. Cada caso de teste contém um inteiro Quantia (1 ≤ Quantia ≤ 15) que representa a quantidade de cobaias utilizadas e um caractere Tipo ('C', 'R' ou 'S'), indicando o tipo de cobaia (R:Rato S:Sapo C:Coelho).

Saída
Apresente o total de cobaias utilizadas, o total de cada tipo de cobaia utilizada e o percentual de cada uma em relação ao total de cobaias utilizadas, sendo que o percentual deve ser apresentado com dois dígitos após o ponto.

 
Exemplo de Entrada	Exemplo de Saída
10
10 C
6 R
15 S
5 C
14 R
9 C
6 R
8 S
5 C
14 R

Total: 92 cobaias
Total de coelhos: 29
Total de ratos: 40
Total de sapos: 23
Percentual de coelhos: 31.52 %
Percentual de ratos: 43.48 %
Percentual de sapos: 25.00 %

 */