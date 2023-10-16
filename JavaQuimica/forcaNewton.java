package JavaQuimica;
import java.util.Scanner;
public class forcaNewton {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a massa: ");
        double massa = ler.nextDouble();

        System.out.println("Digite a aceleraçao: ");
        double aceleracao = ler.nextDouble();

        double forcaNecessaria = massa * aceleracao;

        System.out.println("A força necessaria é de: " + forcaNecessaria + " N");

        ler.close();
    }
}