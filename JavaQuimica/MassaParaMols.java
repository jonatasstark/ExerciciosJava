package JavaQuimica;
import java.util.Scanner;
public class MassaParaMols {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final double massaMolar = 2; // constante massa molar em gramas
        
        System.out.println("Digite a massa de uma substância: ");
        double massaSubstancia = ler.nextDouble(); // leitura da massa de uma substancia digitada pelo usuario

        double mols = massaSubstancia / massaMolar; // converte a massa para mols

        System.out.println("A massa digitada convertida para Mols é de: " + mols + " mols");

        ler.close();
    }
}
