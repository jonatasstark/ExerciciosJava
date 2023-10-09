package JavaMatematica;

public class Hipotenusa {
    public static void main(String[] args) {
        double a = 3; // valor de A do cateto
        double b = 4; // valor de B do cateto
        double hipotenusa = Math.sqrt(a*a + b*b); // calcula a hipotenusa do triangulo

        System.out.println(hipotenusa);
    }
}
