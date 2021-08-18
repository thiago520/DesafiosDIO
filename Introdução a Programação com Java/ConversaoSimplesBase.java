import java.io.IOException;
import java.util.Scanner;

public class ConversaoSimplesBase {

    public static void main(String[] args) throws IOException {
    
            Scanner leitor = new Scanner(System.in);
            String entrada = leitor.next();
            while (!entrada.contains("-")) {
                if (entrada.contains("x")) {
                    System.out.println(Integer.parseInt(entrada.substring(2), 16));
                } else {
                    System.out.println("0x" + Integer.toHexString(Integer.parseInt(entrada)).toUpperCase());
                }
                entrada = leitor.next();
            }        
    }
}

/* Neste problema você é solicitado a escrever um simples programa de conversão de base. A entrada será um valor hexadecimal ou decimal. Você deverá converter cada valor da entrada. Se o valor for hexadecimal, você deve convertê-lo para decimal e vice-versa. O valor hexadecimal inicia sempre com “0x” ou também, é aquele valor cuja segunda casa contém a letra 'x'.

Entrada
A entrada contém vários casos de teste. Cada linha de entrada, com exceção da última, contém um número não-negativo, decimal ou hexa. O valor decimal será menor ou igual a 231. A última linha contém um número negativo que não deve ser processado, indicando o encerramento do programa.

Saída
Para cada linha de entrada (exceto a última) deve ser produzido uma linha de saída. Todo número hexadecimal deve ser precedido na saída por '0x' (zero xis).

 
Exemplo de Entrada	
4
7
44
0x80685
-1

Exemplo de Saída

0x4
0x7
0x2C
525957 */