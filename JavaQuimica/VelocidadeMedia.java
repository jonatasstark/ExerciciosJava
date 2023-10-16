package JavaQuimica;
import java.util.Scanner;
public class VelocidadeMedia {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a distância percorrida: ");
        double distancia = ler.nextDouble();

        System.out.println("Digite o tempo gasto: ");
        double tempo = ler.nextDouble();

        double velocidadeMedia = distancia / tempo;

        System.out.println("A velocidade media é de: " + velocidadeMedia + " m/s");

        ler.close();
    }
    
}
