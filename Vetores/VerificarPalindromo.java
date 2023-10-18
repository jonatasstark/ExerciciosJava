package Vetores;

import java.util.Scanner;

public class VerificarPalindromo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = ler.nextLine().toLowerCase().replace(" ", "");

        verificar_palindromo(palavra);

        ler.close();
    }

    public static void verificar_palindromo(String palavra) {
        boolean ehPalindromo = true;
        int inicio = 0;
        int fim = palavra.length() - 1;

        while(inicio < fim){
            if(palavra.charAt(inicio) != palavra.charAt(fim)){
                ehPalindromo = false;
                break;
            }
            inicio++;
            fim--;
        }

        if(ehPalindromo){
            System.out.println(palavra + " é um palíndromo!");
        }else{
            System.out.println(palavra + " não é um palíndromo!");
        }
    }
}
