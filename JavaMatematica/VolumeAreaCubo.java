package JavaMatematica;

public class VolumeAreaCubo {
    public static void main(String[] args) {
        int a = 7;//variavel a = 7 que é a aresta do cubo
        double volume = Math.pow(a, 3);//variavel que calcula o volume
        double area = 6 * a * a;//calcula a area

        System.out.println("O volume do cubo é " + volume);
        System.out.println("A área do cubo é "+ area);
    }
}
