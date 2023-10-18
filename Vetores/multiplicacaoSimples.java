package Vetores;

import java.util.Scanner;

public class multiplicacaoSimples {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Multiplicação");
        System.out.println("Digite um numero: ");
        double numero1 = ler.nextDouble();

        System.out.println("Digite outro número: ");
        double numero2 = ler.nextDouble();

        multiplicar(numero1, numero2);

        ler.close();
    }

    public static void multiplicar(double a, double b){
        double resultado = a * b;
        System.out.println("O resultado é: " + resultado);
    }
    
}
