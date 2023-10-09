package Exercicios;

public class Fatorial {
    public static void main(String[] args) {
        int numero = 6;//declara um numero
        int fatorial = 1;// declara outro numero

        System.out.println("O fatorial de " + numero + "! é: ");// funçao para imprimir na tela
        
        for (int i = numero; i >= 1; i--){// loop for
            fatorial *= i;//calcula o fatorial
            System.out.print(i);
            if (i > 1){
                System.out.print(" * ");
            }else{
                System.out.print(" = ");
            }
        }

        System.out.println(fatorial);
    }
}
