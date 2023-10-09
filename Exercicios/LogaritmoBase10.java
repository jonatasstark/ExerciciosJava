package Exercicios;
import java.lang.Math;
public class LogaritmoBase10 {
    public static void main(String[] args) {
        float numero = 25;//declara um numeroo
        double logaritmo = Math.log10(numero);//declara outro numero

        System.out.printf("O logaritmo na base 10 de %.2f é: %.3f", numero, logaritmo);
    }
}
