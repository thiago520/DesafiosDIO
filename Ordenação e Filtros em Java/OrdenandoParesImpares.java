/* Desafio
Crie um programa onde você receberá valores inteiros não negativos como entrada.

Ordene estes valores de acordo com o seguinte critério:

Primeiro os Pares
Depois os Ímpares
Você deve exibir os pares em ordem crescente e na sequência os ímpares em ordem decrescente.

Entrada
A primeira linha de entrada contém um único inteiro positivo N (1 < N < 10000) 
Este é o número de linhas de entrada que vem logo a seguir. As próximas N linhas terão, cada uma delas, 
um valor inteiro não negativo.

Saída
Exiba todos os valores lidos na entrada segundo a ordem apresentada acima. 
Cada número deve ser impresso em uma linha, conforme exemplo de saída abaixo. */


import java.util.*;

public class OrdenandoParesImpares {
  public static void main(String [] args) {
    
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    ArrayList<Integer> entrada = new ArrayList();
    ArrayList<Integer> pares = new ArrayList();
    ArrayList<Integer> impares = new ArrayList();
    
    for (int i = 0; i < num; i++ ) {
      entrada.add(scan.nextInt());
      
      if ( entrada.get(i) % 2 == 0 ) {
        pares.add(entrada.get(i));
        Collections.sort(pares);
      } else {
        impares.add(entrada.get(i));
        Collections.sort(impares);
      }
    }
    
    Collections.reverse(impares);
    
    for (int par: pares) {
      System.out.println(par);
    }
    for (int impar: impares) {
      System.out.println(impar);
    }
  }
}