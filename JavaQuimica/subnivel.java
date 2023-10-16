package JavaQuimica;
import java.util.Scanner;
public class subnivel {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a configuraçao eletronica: ");
        String configuracaoEletronica = ler.nextLine();

        int ultimoSubnivel = Character.getNumericValue(configuracaoEletronica.charAt(configuracaoEletronica.length() - 2));
        System.out.println("O ultimo Subnivel é " + ultimoSubnivel + "s.");
        ler.close();
    }
}
