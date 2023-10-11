package JavaMatematica2;

public class areaCirculo {
    public static void main(String[] args) {
        final double pi = 3.1415; // constante pi = 3.1415
        double comprimento_ret = 20; // comprimento do retangulo = 20
        double largura_ret = 10; // largura do retangulo = 10

        double diagonal_ret = Math.sqrt(Math.pow(largura_ret, 2) + Math.pow(comprimento_ret, 2)); // calcula a diagonal do retangulo usando pitágoras d² = a² + b²

        double raio_circulo = diagonal_ret / 2; // calcula o raio do circulo usando a diagonal do retangulo

        double area_circulo = pi * raio_circulo * raio_circulo; // calcula a area do circulo

        double perimetro_circulo = 2 * pi * raio_circulo; // calcula o perimetro do circulo

        System.out.println("A área do círculo é: " + area_circulo);
        System.out.println("O perímetro do círculo é: " + perimetro_circulo);
    }
}
