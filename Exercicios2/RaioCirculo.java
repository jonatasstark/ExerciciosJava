package Exercicios2;
import java.util.Scanner;
public class RaioCirculo {
    public static void main(String[] args) {
        double pi = 3.1415;
        Scanner ler = new Scanner(System.in);//funçao SCANNER para ler a entrada do usuario 

        System.out.print("Digite o raio do circulo: ");
        float raio = ler.nextFloat();//lê o raio digitado pelo usuario 

        double perimetro = 2 * pi * raio;//variavel que calcula o perimetro do circulo
        double area = pi * raio * raio;//variavel que calcula a area do circulo

        System.out.println("O perímetro do círculo é: " + perimetro + " e a área é: " + area);
        
        ler.close();
    }
}
