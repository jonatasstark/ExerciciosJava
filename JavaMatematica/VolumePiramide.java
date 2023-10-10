package JavaMatematica;
import java.util.Scanner;
public class VolumePiramide { // Pirâmide Base Quadrada
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Pirâmide de base quadrada:");
        System.out.println("Digite o lado da base da pirâmide: ");
        double ladoBase = scan.nextDouble();//variavel que declara o lado da base de uma piramide de base quadrada
        System.out.println("Digite a altura da pirâmide: ");
        double altura = scan.nextDouble();//variavel que declara a altura

        double areaBase = ladoBase * ladoBase;//variavel que calcula a area do retangulo

        double volume = areaBase * altura / 3;//variavel que calcula o volume da piramide

        System.out.println("Volume: " + volume + ", Área da base: " + areaBase); // exibe o volume e a área
        scan.close();
    }
}
