import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);

        int tempo = leitor.nextInt();
        int velocidade = leitor.nextInt();

        double kilometros = tempo * velocidade;
        double media = kilometros / 12;

        System.out.println(String.format("%.3f", media));
    }

}