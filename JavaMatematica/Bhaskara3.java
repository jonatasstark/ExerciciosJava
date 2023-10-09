package JavaMatematica;

public class Bhaskara3 {
    public static void main(String[] args) {
        double a = 2; // valor de A da equação bhaskara
        double b = 5; // valor de B
        double c = -3; // valor de C

        double delta = b * b - 4 * a * c; // calcula o delta

        if (delta < 0){ // se delta < 0, possui uma unica raiz
            double x = -b / (2*a); // calcula o X
            System.out.println("A equação possui 1 raíz real: " + x);
        }else{
            double x1 = (-b + Math.sqrt(delta)) / (2*a); // calcula o X linha

            double x2 = (-b - Math.sqrt(delta)) / (2*a); // calcula o X duas linhas
        
            System.out.println("A equação possui 2 raízes reais: x': " + x1 + " e x'': " + x2);
        }
    }
}
