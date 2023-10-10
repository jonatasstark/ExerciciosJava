package JavaMatematica;
import java.util.Scanner;
public class VolumeAreaCubo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor da aresta do cubo: ");
        double a = scan.nextDouble();//variavel A que é a aresta do cubo
        double volume = Math.pow(a, 3);//variavel que calcula o volume
        double area = 6 * a * a;//calcula a area

        System.out.println("O volume do cubo é " + volume);
        System.out.println("A área do cubo é "+ area);
        scan.close();
    }
}
