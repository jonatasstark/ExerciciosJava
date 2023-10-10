package Exercicios2;
import java.util.Scanner;
public class ParImpar {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);//funçao scanner que le a entrada do usuario

        System.out.print("Digite um numero: ");
        int numero1 = ler.nextInt();//lê o numero digitado pelo usuario

        if(numero1 % 2 == 0){//funçao if identifica se numero1 dividido por 2 da resto 0
            System.out.println("O numero " + numero1 + " é par!");
        }else{//funçao else, caso numero1 nao de resto 0, identifica que o numero é impar
            System.out.println("O numero " + numero1 + " é impar!");
        }

        ler.close();
    }
}
