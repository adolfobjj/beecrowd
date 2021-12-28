# beecrowd
Problemas resolvidos no site em Java.


Problem 1000

O seu primeiro programa em qualquer linguagem de programação normalmente é o "Hello World!". Neste primeiro problema tudo o que você precisa fazer é imprimir esta mensagem na tela.

Entrada
Este problema não possui nenhuma entrada.

Saída
Você deve imprimir a mensagem "Hello World!" e em seguida o final de linha, conforme o exemplo abaixo.

Exemplo de Entrada	Exemplo de Saída
Hello World!


Problem 1000
import java.io.IOException;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
       System.out.println("Hello World!");
 
    }
 
}

--------------------------------------------------------------------

Leia 2 valores inteiros e armazene-os nas variáveis A e B. Efetue a soma de A e B atribuindo o seu resultado na variável X. Imprima X conforme exemplo apresentado abaixo. Não apresente mensagem alguma além daquilo que está sendo especificado e não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".

Entrada
A entrada contém 2 valores inteiros.

Saída
Imprima a mensagem "X = " (letra X maiúscula) seguido pelo valor da variável X e pelo final de linha. Cuide para que tenha um espaço antes e depois do sinal de igualdade, conforme o exemplo abaixo.

Problem 1001
import java.io.IOException;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int x = a + b;
        System.out.println("X = " + x);
        
    
    }
	
}

