package Vetores;
import java.util.Scanner;

public class CalcularMedia {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Quantas notas serão digitadas: ");
        int numeros = ler.nextInt();

        double[] notas = new double[numeros]; 

        System.out.println("Digite as notas: ");
        for (int i = 0; i < numeros; i++) {
            notas[i] = ler.nextDouble();
        }

        ler.close();

        double media = calcularMedia(notas); 

        System.out.println("A média das notas é de: " + media);
    }

    public static double calcularMedia(double[] notas) {
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        return soma / notas.length;
    }
}
