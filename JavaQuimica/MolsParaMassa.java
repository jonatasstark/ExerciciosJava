package JavaQuimica;

import java.util.Scanner;

public class MolsParaMassa {
        public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final double mols = 3; // constante mols = 3
        
        System.out.println("Digite a massa molar: ");
        double massaMolar = ler.nextDouble(); // leitura da massa molar digitada pelo usuario

        double massa = massaMolar * mols; // calcula a massa da substancia

        System.out.println("A massa da substância é de: " + massa);

        ler.close();
    }
}
