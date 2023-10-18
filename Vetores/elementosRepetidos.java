package Vetores;

public class elementosRepetidos {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 2, 1, 4, 5, 3};
        int novoTamanho = removeRepetidos(vetor);
        
        // Imprima o novo vetor sem elementos repetidos
        for (int i = 0; i < novoTamanho; i++) {
            System.out.print(vetor[i] + " ");
        }
    }

    public static int removeRepetidos(int[] vetor) {
        int novoTamanho = 0;
        
        for (int i = 0; i < vetor.length; i++) {
            boolean repetido = false;
            for (int j = 0; j < novoTamanho; j++) {
                if (vetor[i] == vetor[j]) {
                    repetido = true;
                    break;
                }
            }
            
            if (!repetido) {
                vetor[novoTamanho] = vetor[i];
                novoTamanho++;
            }
        }
        
        return novoTamanho;
    }
}
