package JavaMatematica;
import java.util.Scanner;
public class AreaCirculo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o raio do circulo: ");
        double raio = scan.nextDouble(); // variavel raio do circulo 
        double pi = 3.1415; // variavel pi = 3.1415
        double area = pi * raio * raio; // calcula a area do circulo

        System.out.println("A area é de: " + area);
        scan.close();
    }
}
