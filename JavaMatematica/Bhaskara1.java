package JavaMatematica;
import java.lang.Math;
import java.util.Scanner;
public class Bhaskara1 {
    public static void main(String[] args) { // x=−b±Δ√2a bhaskara
        
        Scanner ler = new Scanner(System.in); // função scanner que lê a entrada do usuário

        System.out.println("Calculadora de Bhaskara");
        System.out.println("Digite o valor de 'a' ");
        double a = ler.nextDouble(); // le a variavel A

        System.out.println("Digite o valor de 'b' ");
        double b = ler.nextDouble(); // le a variavel B

        System.out.println("Digite o valor de 'c' ");
        double c = ler.nextDouble(); // le a variavel C

        double delta = Math.pow(b, 2) - 4 * a * c; // calcula o delta

        if (delta < 0){ // se delta < 0, possui uma unica raiz
            double x = -b / (2*a); // calcula o x 
            System.out.println("A equação possui 1 raíz real: " + x);
        }else{
            double x1 = (-b + Math.sqrt(delta)) / (2*a); // calcula o X linha

            double x2 = (-b - Math.sqrt(delta)) / (2*a); // calcula o X duas linhas
        
            System.out.println("A equação possui 2 raízes reais: x': " + x1 + " e x'': " + x2);
        }
        ler.close();
    }
}
