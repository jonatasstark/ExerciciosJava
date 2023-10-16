package JavaQuimica;
import java.util.Scanner;
public class AreaSuperficie {
    
    public static void main(String[] args) {
        //A=4πr²
        Scanner ler = new Scanner(System.in); // função scanner para realizar leitura

        final double pi = 3.1415;//constante pi de valor 3.1415 

        System.out.println("Digite o raio: ");
        double raio = ler.nextDouble();

        double area = 4 * pi * Math.pow(raio, 2);

        System.out.println("A area da superficie da esfera é de: " + area + " cm³");

        ler.close();
    }
    
}
