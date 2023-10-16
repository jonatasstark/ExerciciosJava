package JavaQuimica;
import java.util.Scanner;
public class NumerosHidrogenios {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);//funçao para ler a entrada do usuario
        System.out.println("Cadeia Saturada de Carbonos:");
        System.out.println("Digite quantos carbonos existem na cadeia: ");
        int carbono = ler.nextInt();//leitura de entrada do usuário

        int hidrogenio = carbono * 2 + 2;//calcula a quantidade de hidrogenios
        
        System.out.println("A quantidade de hidrogênios presentes na cadeia são de: " + hidrogenio);

        ler.close();
    }
}
