package JavaMatematica;

public class VolumeEsfera {
    public static void main(String[] args) {
        double raio = 10;//variavel que declara o raio da esfera
        double pi = 3.1415;// variavel que declara o valor de pi

        double volume = 4 * pi * Math.pow(raio, 3) / 3;// variavel que calcula o volume da esfera

        System.out.println("O volume da esfera é de : " + volume);
    }
    
}
