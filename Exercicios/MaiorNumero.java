package Exercicios;

public class MaiorNumero {
    public static void main(String[] args) {
        int a = 50;//declara um numeroo
        int b = 100;//declara outro numero
        int maior;// declara o maior

        if (a > b){//funcao if
            maior = a;
        }else{//funçao else
            maior = b;
        }

        System.out.println("O maior número é: " + maior);
    }
}
