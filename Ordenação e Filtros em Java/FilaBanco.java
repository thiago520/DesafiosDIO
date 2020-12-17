/* Desafio 
O banco que você trabalha sempre tem problemas para organizar as filas de atendimento dos clientes.

Após uma reunião com a gerência ficou decidido que os clientes ao chegar na agência receberão 
uma senha numérica em seu aparelho de celular via sms e que a ordem da fila será dada não pela ordem de chegada, 
mas sim pelo número recebido via sms. Sendo, aqueles com número maior deverão ser atendidos primeiro. 

Então, dada a ordem de chegada dos clientes reordene a fila de acordo com o número recebido via sms, 
e diga quantos clientes não precisaram trocar de lugar nessa reordenação.

Entrada
A primeira linha contém um inteiro N, indicando o número de casos de teste a seguir.

Cada caso de teste inicia com um inteiro M (1 ≤ M ≤ 1000), indicando o número de clientes. 
Em seguida haverá M inteiros distintos Pi (1 ≤ Pi ≤ 1000), onde o i-ésimo inteiro indica o número recebido 
via sms do i-ésimo cliente.

Os inteiros acima são dados em ordem de chegada, ou seja, 
o primeiro inteiro diz respeito ao primeiro cliente a chegar na fila, 
o segundo inteiro diz respeito ao segundo cliente, e assim sucessivamente.

Saída
Para cada caso de teste imprima uma linha, contendo um inteiro, 
indicando o número de clientes que não precisaram trocar de lugar mesmo após a fila ser reordenada. */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class FilaBanco {
    public static void main(String[] args) throws IOException {
    
     
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()); 
        Integer a = Integer.parseInt(st.nextToken());

        List<Integer> list;
        List<Integer> listReversa;
        List<Integer> comparacao,index;
        List<Integer> resultado=new ArrayList<>();

        for(var i=1;i<=a;i++){
            br.readLine();
            String[] numeros = br.readLine().trim().split(" ");

            list=Arrays.stream(numeros).map(elem -> Integer.parseInt(elem)).collect(Collectors.toList());
            listReversa=list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

            List<Integer> finalList = list;
            index=list.stream().map(elem-> finalList.indexOf(elem)).collect(Collectors.toList());
            comparacao=listReversa.stream().map(elem-> finalList.indexOf(elem)).collect(Collectors.toList());

            List<Integer> finalComparacao = comparacao;
            resultado.add(index.stream()
                    .reduce(0,(acc, elem)->elem== finalComparacao.indexOf(elem)?++acc:acc));
        }
        resultado.stream().forEach(System.out::println);
    
    }
  
}