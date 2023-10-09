package Exercicios;

public class MaiorDivisor {
    public static void main(String[] args) {
        int numero = 30;//declara um numero
        int maior_divisor = 0;//declara outro numeroo
        for (int i = 1; i <= numero; i++){// loop for
            if (numero % i == 0){//funçao if
                maior_divisor = i;
            }
        }

        System.out.println("O maior divisor de " + numero + " é: " + maior_divisor);
    }
}
