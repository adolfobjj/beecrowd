import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int codigo1 = leitor.nextInt();
        int quantidade1 = leitor.nextInt();
        double peca1 = leitor.nextDouble();

        int codigo2 = leitor.nextInt();
        int quantidade2 = leitor.nextInt();
        double peca2 = leitor.nextDouble();

        double total = (quantidade1 * peca1 + quantidade2 * peca2);

        System.out.println(String.format("VALOR A PAGAR: R$ %.2f" , total));

    }

}