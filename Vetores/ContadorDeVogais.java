package Vetores;

import java.util.Scanner;

public class ContadorDeVogais {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = ler.nextLine().toLowerCase();

        contarVogais(frase);

        ler.close();
    }

    public static void contarVogais(String frase){
        int contador = 0;
        for(int i = 0; i < frase.length(); i++){
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u'){
                contador++;
            }
        }

        System.out.println("Número de vogais: " + contador);

    }
}
