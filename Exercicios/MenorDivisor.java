package Exercicios;

public class MenorDivisor {
    public static void main(String[] args) {
        int numero = 30;//declara um numeroo
        int menor_divisor = 0;//declara outro numero
        for (int i = numero; i >= 1; i--){//loop for
            if (numero % i == 0){//funçao if
                menor_divisor = i;
            }
        }

        System.out.println("O menor divisor de " + numero + " é: " + menor_divisor);
    }
}
