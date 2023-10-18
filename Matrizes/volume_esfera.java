package Matrizes;

import java.util.Scanner;

public class volume_esfera {

    public static double multi(int raio) { // definindo a função
        return 4 * Math.PI * Math.pow(raio, 3) / 3; // fazendo a função
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do raio: "); // pedindo um número ao usuário
        int n1 = scan.nextInt();

        double resultado = multi(n1);
        System.out.printf("Resultado: %.2f", resultado ); // printando o resultado

        scan.close();
    }
}