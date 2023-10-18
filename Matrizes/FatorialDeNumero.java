package Matrizes;

import java.util.Scanner;

public class FatorialDeNumero {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero;

        while (true) {
            System.out.println("Digite um numero inteiro e nao negativo: ");
            
            if (ler.hasNextInt()) {
                numero = ler.nextInt();
                if (numero >= 0) {
                    int fatorial = calcularFatorial(numero);
                    System.out.println("O fatorial de " + numero + " é " + fatorial);
                    break;
                } else {
                    System.out.print("Tente novamente. ");
                }
            } else {
                System.out.print("Por favor, Tente novamente. ");
                ler.next(); 
            }
        }

        ler.close();
    }

    public static int calcularFatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int resultado = 1;
            for (int i = 2; i <= n; i++) {
                resultado *= i;
            }
            return resultado;
        }
    }
}
