package Matrizes;
import java.util.Scanner;
public class AreaTrapezio {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a base maior do trapezio:");
        double baseMaior = ler.nextDouble();
        System.out.println("Digite a base menor do trapezio:");
        double baseMenor = ler.nextDouble();
        System.out.println("Digite a altura do trapezio:");
        double altura = ler.nextDouble();

        double areaTotal =areaDoTrapezio(baseMaior, baseMenor, altura);
        System.out.println("A área total do trapézio é: " + areaTotal);

        ler.close();
    }
    public static double areaDoTrapezio(double baseMaior, double baseMenor, double altura) {
        //(base_maior + base_menor) * altura / 2
        double area = (baseMaior + baseMenor) * altura / 2;
        
        return area;
    }
}
