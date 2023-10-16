package JavaQuimica;

import java.util.Scanner;

public class ValorAbsoluto {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um numero real: ");
        double numero = ler.nextDouble();

        double valorAbsoluto = Math.abs(numero);

        System.out.println("O valor absoluto de " + numero + " é: " + valorAbsoluto);

        ler.close();
    }
}
