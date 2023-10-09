package Exercicios;

public class Fibonacci {
    public static void main(String[] args) {
        int num1 = 0;//declara um numeroo
        int num2 = 1;//declara outro numero
        int num3;// declara uma variável para receber a sequência (soma)

        System.out.print(num1 + " ");
        System.out.print(num2 + " ");
        for (int i = 3; i <= 10; i++){//loop for até 10
            num3 = num2 + num1; // soma os numeros anteriores numero2 e numero1
            num1 = num2; // numero1 passa a ser numero2
            num2 = num3; // e numero2 passa a ser numero3 para fazer a sequência fibonacci
            System.out.print(num3 + " ");
        }
    }
}
