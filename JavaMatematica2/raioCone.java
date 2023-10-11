package JavaMatematica2;

public class raioCone {
    public static void main(String[] args) {
        // V=πr2⋅h / 3 volume do cone
        final double pi = 3.14; // constante pi definida como 3.14
        double volume = 94; // variavel volume do cone
        double altura = 9; // variavel altura do cone
        double raio = Math.sqrt(3 * volume / (pi * altura)); // calcula o raio do cone
        

        System.out.println("O raio do cone é: " + raio);
    }
}
