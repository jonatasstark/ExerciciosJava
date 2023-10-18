package Matrizes;
import java.util.Scanner;
public class perimetroQuadrado {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o comprimento do lado do quadrado: ");
        double comprimento = ler.nextDouble();

        double perimetro = calcularPerimetro(comprimento);
        System.out.println("O perimetro do quadrado é de: " + perimetro);
        ler.close();
    }
    public static double calcularPerimetro(double comprimento) {
        // `4 * lado`
        double perimetro = 4 * comprimento;
        return perimetro;
    }
}
