import java.util.Scanner;

public class ProibidoEntradaMenores {
    // TODO: complete os espaços em branco com sua solução para o problema

    public static void main(String[] args) {

        // a classe Scanner auxilia na leitura dos dados de entrada
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        String string = scan.nextLine();

        // quebra string em várias substrings a partir de um caractere
        String[] s = string.split(" ");

        double[] idade = new double[N];

        for (int i = 0; i < idade.length; i++) {
            double idades = scan.nextDouble();
            idade[i] = idades;
        }

        System.out.println("Nao poderao entrar as idades: ");
        for (int i = 0; i < N; i++) {
            if (idade[i] < 18) {
                System.out.println((int) idade[i]);
            }

        }

    }
}
