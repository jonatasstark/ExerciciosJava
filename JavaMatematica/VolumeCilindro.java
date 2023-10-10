package JavaMatematica;
import java.util.Scanner;
public class VolumeCilindro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double pi = 3.1415;//variavel com valor de pi
        System.out.println("Digite o Raio do Cilindro: ");
        double raio = scan.nextDouble();//variavel para declarar o raio do cilindro
        System.out.println("Digite a Altura do Cilindro: ");
        double altura = scan.nextDouble();//variavel que declara a altura do cilindro 

        double VolumeCilindro = pi * raio * raio * altura;//variavel que calcula o volume do cilindro

        System.out.println("O Volume do cilindro é " + VolumeCilindro);
        scan.close();
    }
}
