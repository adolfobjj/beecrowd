import java.util.Scanner;
import java.io.IOException;

public class Main {



    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double raio = leitor.nextDouble();
        double pi = 3.14159;
        double volume = (4.0 / 3) * pi * Math.pow(raio, 3.0);
        System.out.println(String.format("VOLUME = %.3f", volume));
    }


}