package JavaMatematica2;

public class basePiramide {
    // v = Ab * h / 3 volume da piramide
    public static void main(String[] args) {
       double volume = 180; // variavel volume da piramide
       double altura = 10; // variavel altura da piramide
       double area = 3 * volume / altura; // calcula a area da base da piramide

       System.out.println("A area da base da piramide é de: " + area);
    }
}
