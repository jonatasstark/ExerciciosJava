package JavaQuimica;
import java.util.Scanner;
public class Resistor {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Qual sua tensão: ");
        double tensao = ler.nextDouble();

        System.out.println("Qual sua corrente: ");
        double corrente = ler.nextDouble();

        double resistencia = tensao / corrente;
        System.out.println("A resistência do circuito é de: " + resistencia + " ohms");

        ler.close();
    }
    
}
