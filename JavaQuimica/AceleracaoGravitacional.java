package JavaQuimica;
import java.util.Scanner;
public class AceleracaoGravitacional {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); // função scanner para realizar leitura
        
        final double gravidadeMarte = 3.7; // constante gravidade de Marte
        System.out.println("Peso de um objeto em Marte");
        System.out.println("Digite o peso do objeto: ");
        double peso = ler.nextDouble(); // lê o peso do objeto

        double forca = peso * gravidadeMarte; // calcula a força em newton

        System.out.println("O peso do objeto em Marte é de: " + forca + " N");
        ler.close();
    }
    
}
