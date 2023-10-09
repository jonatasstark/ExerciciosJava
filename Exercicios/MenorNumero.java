package Exercicios;

public class MenorNumero {
    public static void main(String[] args) {
        int a = 22;//declara um numeroo
        int b = 189;//declara outro numero
        int menor;//declara menor

        if (a < b){//funçao if
            menor = a;
        }else{//funçao else
            menor = b;
        }
        
        System.out.println("O menor número é: " + menor);
    }
    
}
