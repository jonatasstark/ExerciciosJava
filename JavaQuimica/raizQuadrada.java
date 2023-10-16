package JavaQuimica;
import java.util.Scanner;
public class raizQuadrada {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double numero;

        while(true){
            System.out.println("Digite um numero real e nao negativo: ");
            numero = ler.nextDouble();
            if (numero < 0){
                System.out.print("Tente novamente. ");
            }else{
                break;
            }
        }

        double raiz = Math.sqrt(numero);
        System.out.println("A raíz quadrada de " + numero + " é: " + raiz);

        ler.close();
    }
}
