package JavaQuimica;
import java.util.Scanner;
public class potenciaDissipada {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a tensão: ");
        double tensao = ler.nextDouble();

        System.out.println("Digite a resistência: ");
        double resistencia = ler.nextDouble();

        double potencia = Math.pow(tensao, 2) / resistencia;

        System.out.println("A potência dissipada foi de: " + potencia + " W");

        ler.close();
    }
}
