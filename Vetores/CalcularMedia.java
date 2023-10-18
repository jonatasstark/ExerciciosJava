package Vetores;
import java.util.Scanner;
public class CalcularMedia {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double media = 0, soma = 0;

        System.out.println("Quantas notas serão digitadas: ");
        int numeros = ler.nextInt();

        double notas;
        System.out.println("Digite as notas: ");
        for (int i = 0; i < numeros; i ++){
            notas = ler.nextDouble();
            soma += notas;

            media = soma / numeros;

        }

        ler.close();

        System.out.println("A média das notas é de: " + media);
    }
}
