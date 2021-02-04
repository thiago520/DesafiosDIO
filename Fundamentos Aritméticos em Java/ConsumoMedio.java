//Desafio
//        Você deve calcular o consumo médio de um automóvel onde será informada a distância total percorrida (em Km) e o total de combustível consumido (em litros).
//
//        Entrada
//        Você receberá dois valores: um valor inteiro X com a distância total percorrida (em Km), e um valor real Y que representa o total de combustível consumido, com um dígito após o ponto decimal.
//
//        Saída
//        Exiba o valor que representa o consumo médio do automóvel (3 casas após a vírgula), incluindo no final a mensagem "km/l".
//
//
//        Exemplo de Entrada	Exemplo de Saída
//              500                   14.286 km/l
//              35.0

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ConsumoMedio {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        Double distancia = Double.parseDouble(st.nextToken());
        st = new StringTokenizer(br.readLine());
        Double consumo = Double.parseDouble(st.nextToken());

        System.out.printf("%.3f km/l\n", distancia/consumo);
    }

}