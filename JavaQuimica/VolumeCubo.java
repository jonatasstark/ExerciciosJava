package JavaQuimica;
import java.util.Scanner;
public class VolumeCubo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Qual a medida da aresta: ");
        double aresta = ler.nextDouble();

        double volumeCubo = Math.pow(aresta, 3);

        System.out.println("O volume do cubo é de: " + volumeCubo + " cm³");

        ler.close();
    }
}
