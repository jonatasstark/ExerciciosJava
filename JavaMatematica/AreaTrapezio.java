package JavaMatematica;
import java.util.Scanner;
public class AreaTrapezio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a Base Maior do Trapézio: ");
        double baseMaior = scan.nextDouble(); // variavel base maior do trapézio 
        System.out.println("Digite a Base Menor do Trapézio: ");
        double baseMenor = scan.nextDouble(); // base menor do trapézio
        System.out.println("Digite a altura do Trapézio: ");
        double altura = scan.nextDouble(); // altura do trapézio

        double area = (baseMaior + baseMenor) * altura / 2; // calcula a área do trapézio

        System.out.println("A area do trapezio é de : " + area);
        scan.close();
    }
    
}
