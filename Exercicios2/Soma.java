package Exercicios2;
import java.util.Scanner;
public class Soma {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); //funçao SCANNER para ler a entrada do usuario 

        System.out.print("Digite um número: ");
        int numero1 = ler.nextInt(); // le o numero digitado pelo usuario

        System.out.print("Digite outro número: ");
        int numero2 = ler.nextInt(); // le outro numero digitado pelo usuario

        int soma = numero1 + numero2; // calcula a soma entre os numeros

        System.out.printf("A soma entre %d + %d = %d", numero1, numero2, soma);

        ler.close();
    }
}
