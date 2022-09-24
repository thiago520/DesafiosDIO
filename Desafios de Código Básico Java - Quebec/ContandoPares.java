public class ContandoPares {

    public static void main(String[] args) {

        int number = new java.util.Scanner(System.in).nextInt();

        System.out.println(numPar(number));

    }

    public static int numPar(int n) {

        int q = 0;

        for (int i = 1; i <= n; i++) {

            String sNum = String.valueOf(i);

            int s = 0;

            for (int j = 0; j < sNum.length(); j++) {

                s += Integer.parseInt(sNum.substring(j, j + 1));

            }

            if (s % 2 == 0)
                q++;

        }

        return q;

    }

}

/* 
Desafio
Dado um inteiro positivo num, retorne o número de inteiros positivos menor ou igual a num cuja soma de dígitos é par. A soma dos dígitos de um inteiro positivo é a soma de todos os seus dígitos.

Entrada
Como entrada você recerá um valor inteiro e positivo.

Saída
Como saída, será impresso a soma de todos os numeros inteiros positivos menores ou iguais ao num, como nos exemplos a baixo:

Exemplo 1:

Entrada	Saída
4	2
 Explicação:

Os únicos inteiros menores ou iguais a 4 cujas somas de dígitos são pares são: [ 2 e 4 ].    

Exemplo 2:

Entrada	Saída
30	14
 Explicação:

Os 14 inteiros menores ou iguais a 30 cujas somas de dígitos são pares são:

[ 2, 4, 6, 8, 11, 13, 15, 17, 19, 20, 22, 24, 26 e 28 ].

 */