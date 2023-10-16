package JavaQuimica;
import java.util.Scanner;
public class TotalEletrons {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a configuração eletrônica: ");
        String configuracaoEletronica = ler.nextLine();

        int totalEletrons = 0;
        for (int i = 0; i < configuracaoEletronica.length(); i++) {
            if (Character.isDigit(configuracaoEletronica.charAt(i))){
                totalEletrons += Character.getNumericValue(configuracaoEletronica.charAt(i));
            }
        }

        System.out.println("O átomo possui " + totalEletrons + " elétrons.");
        ler.close();
    }
}
