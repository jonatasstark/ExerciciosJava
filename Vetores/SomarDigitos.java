package Vetores;

import java.util.Scanner;

public class SomarDigitos {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = ler.nextInt();

        somarAlgarismos(numero);

        ler.close();
    }

    public static void somarAlgarismos(int num){
        int soma = 0;
        while(num > 0){
            soma += num % 10;
            num /= 10;
        }
        
        System.out.println("A soma entre os algarismos é: " + soma);
    }

}
