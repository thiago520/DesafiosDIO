import java.util.Scanner;

public class VolumeTV {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int V = leitor.nextInt();
        int T = leitor.nextInt();
        for (int i = 0; i < T; i++) {
            V += leitor.nextInt();
            if (V > 100) { V = 100; }
            if (V < 0)   { V = 0; }
        }
        System.out.println(V);
    }
}