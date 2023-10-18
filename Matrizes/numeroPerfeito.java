package Matrizes;

import java.util.Scanner;

public class numeroPerfeito {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = ler.nextInt();

        boolean numeroPerfeito = verificarNumeroPerfeito(numero);
        
        if(numeroPerfeito){
            System.out.println("O número digitado é um número perfeito");
        }else{
            System.out.println("O número digitado não é um número perfeito");
        }

        ler.close();
    }

    public static boolean verificarNumeroPerfeito(int numero) {
        int soma = 0;
        for (int i = 1; i < numero; i++){
            if(numero % i == 0){
                soma += i;
            }
        }

        if(numero == soma){
            return true;
        }else{
            return false;
        }
    }
}
