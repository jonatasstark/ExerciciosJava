package JavaMatematica;

public class AreaTrapezio {
    public static void main(String[] args) {
        double baseMaior = 8; // variavel base maior do trapézio = 8
        double baseMenor = 5; // base menor do trapézio = 5
        double altura = 6; // altura do trapézio = 6

        double area = (baseMaior + baseMenor) * altura / 2; // calcula a área do trapézio

        System.out.println("A area do trapezio é de : " + area);
    }
    
}
