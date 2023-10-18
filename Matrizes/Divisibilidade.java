package Matrizes;
import java.util.Scanner;
public class Divisibilidade {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double numero = ler.nextDouble();

        boolean divisivel = divisibilidade(numero);
        if (divisivel){
            System.out.println("O número é divisível por 4 e 7");
        }else{
            System.out.println("O número não é divisível por 4 e 7");
        }

        ler.close();

    }
    public static boolean divisibilidade(double num) {
        if (num % 7 == 0 && num % 4 == 0){
            return true;
        }else{
            return false;
        }
    }
}
