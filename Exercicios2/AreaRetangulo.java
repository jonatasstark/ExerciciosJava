package Exercicios2;
import java.util.Scanner;
public class AreaRetangulo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);//funçao SCANNER para ler a entrada do usuario 

        System.out.print("Digite a altura do retangulo: ");
        float altura = ler.nextFloat();// lê a altura digitada pelo usuario

        System.out.print("Digite a base do retangulo: ");
        float base = ler.nextFloat();//lê a base digitada pelo usuario

        float area = altura * base;//a variavel area do tipo float recebe altura * base

        System.out.println("A area do retangulo é de: " + area);
    }
    
}
