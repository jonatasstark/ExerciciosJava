package JavaMatematica2;

public class arestaCubo {
    public static void main(String[] args) {
        double volume = 512; // variavel que declara o volume do cubo
        double aresta = Math.cbrt(volume); // variavel que calcula a raiz cubica do volume para encontrar a aresta

        System.out.println("A aresta do cubo é: " + aresta);
    }
}
