package JavaMatematica;
import java.util.Scanner;
public class Hipotenusa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor do Cateto Oposto: ");
        double a = scan.nextDouble(); // valor de A do cateto oposto
        System.out.println("Digite o valor do Cateto Adjacente: ");
        double b = scan.nextDouble(); // valor de B do cateto adjacente
        double hipotenusa = Math.sqrt(a*a + b*b); // calcula a hipotenusa do triangulo

        System.out.println(hipotenusa);
        scan.close();
    }
}
