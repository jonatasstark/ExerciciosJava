package JavaMatematica2;

public class raioCilindro {
    public static void main(String[] args) {
        // Vcilindro = π · r² · h 
        final double pi = 3.14; // constante pi definida como 3.14
        double volume = 785; // volume em cm 
        double altura = 13; // altura em cm

        double raio = Math.sqrt(volume / (pi * altura)); // calcula o raio do cilindro

        System.out.println("O raio do cilindro é: " + raio);
    }
}
