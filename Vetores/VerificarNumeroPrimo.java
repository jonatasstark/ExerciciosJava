package Vetores;

import java.util.Scanner;

public class VerificarNumeroPrimo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); // função scanner

        System.out.println("Digite um número: ");
        int numero = ler.nextInt(); // faz a leitura do que o usuário digitou

        verificarPrimo(numero);

        ler.close();
    }

    public static void verificarPrimo(int numero){
        int contador = 0;//declara outro numero

        for(int i = 1; i <= numero; i++){//loop for
            if (numero % i == 0){//funçao else
                contador++;
            }
        }

        if (contador == 2){//funçao if
            System.out.println("O número " + numero + " é primo!");
        }else{//funçao else
            System.out.println("O número " + numero + " não é primo!");
        }

    }
}
