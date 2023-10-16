package JavaQuimica;
import java.util.Scanner;
public class VelocidadeFinal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final double gravidade = 9.8;

        System.out.println("Digite a altura do objeto em queda livre: ");
        double altura = ler.nextDouble();

        double tempo = Math.sqrt(altura * 2 / gravidade);

        double velocidade = gravidade * tempo;

        System.out.println("A velocidade final do objeto em queda livre é de: " + velocidade);

        ler.close();
    }
    
}
