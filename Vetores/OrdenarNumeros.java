package Vetores;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrdenarNumeros {
    public static void main(String[] args) {
        List<Integer> listaOriginal = new ArrayList<>();
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite 8 números: ");
        for(int i = 0; i < 8; i++){
            int numero = ler.nextInt();
            listaOriginal.add(numero);
        }

        ordenarLista(listaOriginal);

        ler.close();
    }

    public static void ordenarLista(List<Integer> lista){

        lista.sort(null);
        
        System.out.println("\nNova lista ordenada: ");
        for(int i = 0; i < lista.size(); i++){
            System.out.print(lista.get(i) + " ");
        }
    }
}