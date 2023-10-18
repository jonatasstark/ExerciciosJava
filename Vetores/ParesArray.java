package Vetores;

public class ParesArray {
    public static void main(String[] args) {
        int array[] = {2, 3, 6, 8, 10, 11}; 

        somaPares(array);
    }

    public static void somaPares(int[] array){
        int soma = 0;

        for(int i = 0; i < 6; i++){
            if(array[i] % 2 == 0){
                soma += array[i];
            }
        }

        System.out.println("A soma entre os números pares do vetor é: " + soma);
    }
}
