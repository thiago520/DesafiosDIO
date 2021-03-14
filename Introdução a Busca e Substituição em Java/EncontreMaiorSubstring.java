/*
Desafio
Encontre a maior substring comum entre as duas strings informadas. 
A substring pode ser qualquer parte da string, inclusive ela toda. 
Se não houver subseqüência comum, a saída deve ser “0”. A comparação é case sensitive ('x' != 'X').

Entrada
A entrada contém vários casos de teste. Cada caso de teste é composto por duas linhas, 
cada uma contendo uma string. Ambas strings de entrada contém entre 1 e 50 caracteres ('A'-'Z','a'-'z' ou espaço ' '), 
inclusive, ou no mínimo uma letra ('A'-'Z','a'-'z').

Saída
O tamanho da maior subsequência comum entre as duas Strings.

 
Exemplo de Entrada	
abcdef
cdofhij
TWO
FOUR
abracadabra
open
Hey This java is hot
Java is a new paradigm

Exemplo de Saída

2
1
0
7
*/
import java.io.IOException;
import java.util.*;
import java.util.regex.*;

public class EncontreMaiorSubstring {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    String str1, str2;
    int greatestSubstringLength;

    while (scanner.hasNextLine()) {

      str1 = scanner.nextLine();
      str2 = scanner.nextLine();

      if (str1.length() >= str2.length()) {
        greatestSubstringLength = checkGreatestSubstringLength(str1, str2);
      } else {
        greatestSubstringLength = checkGreatestSubstringLength(str2, str1);
      }

      System.out.println(greatestSubstringLength);
    }

    scanner.close();
  }

  

  static int checkGreatestSubstringLength(String str1, CharSequence str2) {

    int greatestSubstringLength = 0;
    int localSubstringLength = 0;

    for (int i = 0; i < str2.length(); i++) {
      if (str1.contains(Character.toString(str2.charAt(i)))) {
        localSubstringLength = 1;
        StringBuilder subString = new StringBuilder(String.valueOf(str2.charAt(i)));

        for (int j = i + 1; j < str2.length(); j++) {
          subString.append(String.valueOf(str2.charAt(j)));

          if (!str1.contains(subString)) {
            break;
          }
          localSubstringLength++;
        }

        if (localSubstringLength > greatestSubstringLength) {
          greatestSubstringLength = localSubstringLength;
        }

        localSubstringLength = 0;
      }

    }

    return greatestSubstringLength;
  }

}