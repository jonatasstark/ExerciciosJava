package JavaQuimica;
import java.util.Scanner;
public class distribuirEletrons {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o número total de elétrons: ");
        int totalEletrons = ler.nextInt();

        int n = 1;
        int eletronsRestantes = totalEletrons;

        while(eletronsRestantes > 0) {
            int capacidadeCamada = 2 * n * n;
            int eletronsCamada = Math.min(capacidadeCamada, eletronsRestantes);

            System.out.println("Camada " + n + ": " + eletronsCamada + " elétrons");

            eletronsRestantes -= eletronsCamada;
            n++;
        }

        ler.close();
    }
}
