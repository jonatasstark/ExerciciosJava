package JavaMatematica2;

public class raioEsfera {
    public static void main(String[] args) {
        // A=4πr² >>> área esfera
        final double pi = 3.14; // constante pi declarada como 3.14
        double area = 154; // variavel area da esfera = 154 em cm³
        double raio = Math.sqrt(area / (4 * pi)); // calcula o raio da esfera

        System.out.println("O raio da esfera é: " + raio);
    }
}
