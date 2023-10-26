package com.tabelabrasileirao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] times = {
            "América Mineiro",  "Athletico-PR", "Atlético Mineiro", "Bahia", "Botafogo",
            "Corinthians", "Coritiba", "Cruzeiro", "Cuiabá", "Flamengo",
            "Fluminense", "Fortaleza", "Goiás", "Grêmio", "Internacional",
            "Palmeiras", "Red Bull Bragantino", "Santos", "São Paulo", "Vasco"
        };

        int[] pontuacoes = new int[times.length];

        int[] cartoesAmarelos = new int[times.length];

        int[] vitorias = new int[times.length];

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("\n\033[1;37mEscolha uma opção: ");
            System.out.println("1 - Visualizar Tabela");
            System.out.println("2 - Editar Pontuação");
            System.out.println("3 - Editar Cartões Amarelos");
            System.out.println("4 - Editar Vitórias");
            System.out.println("0 - Sair\033[m");

            int opcao = scanner.nextInt();

            switch(opcao){
                case 0:
                    scanner.close();
                    return;
                case 1:
                    exibirTabela(times, pontuacoes, cartoesAmarelos, vitorias);
                    break;
                case 2:
                    editarPontuacao(times, pontuacoes, cartoesAmarelos, vitorias, scanner);
                    break;
                case 3:
                    editarCartoesAmarelos(times, pontuacoes, cartoesAmarelos, vitorias, scanner);
                    break;
                case 4:
                    editarVitorias(times, pontuacoes, cartoesAmarelos, vitorias, scanner);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente!");
                    break;
            }
        }
    }

    public static void exibirTabela(String[] times, int[] pontuacoes, int[] cartoesAmarelos, int[] vitorias) {
        System.out.println("\033[1m_______________________________________________________________________________");
        System.out.println("\nPosição  | Time                 | Pontuação| Cartões Amarelos     | Vitórias   |");
        System.out.println("---------|----------------------|----------|----------------------|------------|");
        for(int i = 0; i < times.length; i++){
            if (i < 4){
                System.out.printf("\033[1;32m%-8d |\033[m \033[1m%-20s | %-8d | %-8d             | %-8d   |\n", (i + 1), times[i], pontuacoes[i], cartoesAmarelos[i], vitorias[i]);
            }else if (i > 15){
                System.out.printf("\033[1;31m%-8d |\033[m \033[1m%-20s | %-8d | %-8d             | %-8d   |\n", (i + 1), times[i], pontuacoes[i], cartoesAmarelos[i], vitorias[i]);
            }else{
                System.out.printf("\033[1m%-8d | %-20s | %-8d | %-8d             | %-8d   |\n", (i + 1), times[i], pontuacoes[i], cartoesAmarelos[i], vitorias[i]);
            }
        }
        System.out.println("\033[1m--------------------------------------------------------------------------------\033[m");
    }

    public static void editarPontuacao(String[] times, int[] pontuacoes, int[] cartoesAmarelos, int[] vitorias, Scanner scanner){
        while(true){
            System.out.println("\nTimes disponíveis para edição:");
            exibirTabela(times, pontuacoes, cartoesAmarelos, vitorias);
            System.out.println("Escolha a posição do time para editar a pontuação (ou 0 para voltar):");
            
            int posicao = scanner.nextInt();

            if(posicao == 0){
                break;
            }

            if(posicao >= 1 && posicao <= times.length) {
                System.out.println("Digite a nova pontuação para " + times[posicao - 1] + ":");
                int novaPontuacao = scanner.nextInt();

                if(novaPontuacao >= 0){
                    pontuacoes[posicao - 1] = novaPontuacao;
                } else {
                    System.out.println("A pontuação não pode ser negativa.");
                }
            } else {
                System.out.println("Posição inválida. Tente novamente.");
            }

            scanner.nextLine();
        }
        ordenarPorPontuacaoCartoesVitorias(times, pontuacoes, cartoesAmarelos, vitorias);
    }

    public static void editarCartoesAmarelos(String[] times, int[]  pontuacoes, int[] cartoesAmarelos, int[] vitorias, Scanner scanner){
        while(true){
            System.out.println("\nTimes disponíveis para edição:");
            exibirTabela(times, pontuacoes, cartoesAmarelos, vitorias);
            System.out.println("Escolha a posição do time para editar a quantidade de cartões amarelos (ou 0 para voltar):");
            
            int posicao = scanner.nextInt();

            if(posicao == 0){
                break;
            }

            if(posicao >= 1 && posicao <= times.length) {
                System.out.println("Digite a quantidade de cartões para " + times[posicao - 1] + ":");
                int novaQuantidadeCartoesAmarelos = scanner.nextInt();

                if(novaQuantidadeCartoesAmarelos >= 0){
                    cartoesAmarelos[posicao - 1] = novaQuantidadeCartoesAmarelos;
                } else {
                    System.out.println("A quantidade não pode ser negativa.");
                }
            } else {
                System.out.println("Posição inválida. Tente novamente.");
            }

            scanner.nextLine();
        }
        ordenarPorPontuacaoCartoesVitorias(times, pontuacoes, cartoesAmarelos, vitorias);    
    }

    public static void editarVitorias(String[] times, int[] pontuacoes, int[] cartoesAmarelos, int[] vitorias, Scanner scanner){
        while(true){
            System.out.println("\nTimes disponíveis para edição:");
            exibirTabela(times, pontuacoes, cartoesAmarelos, vitorias);
            System.out.println("Escolha a posição do time para editar a quantidade de vitórias (ou 0 para voltar):");
            
            int posicao = scanner.nextInt();

            if(posicao == 0){
                break;
            }

            if(posicao >= 1 && posicao <= times.length) {
                System.out.println("Digite a quantidade de vitorias para " + times[posicao - 1] + ":");
                int novaQuantidadeVitorias = scanner.nextInt();

                if(novaQuantidadeVitorias >= 0){
                    vitorias[posicao - 1] = novaQuantidadeVitorias;
                } else {
                    System.out.println("A quantidade não pode ser negativa.");
                }
            } else {
                System.out.println("Posição inválida. Tente novamente.");
            }

            scanner.nextLine();
        }
        ordenarPorPontuacaoCartoesVitorias(times, pontuacoes, cartoesAmarelos, vitorias); 
    }

    public static void ordenarPorPontuacaoCartoesVitorias(String[] times, int[] pontuacoes, int[] cartoesAmarelos, int[] vitorias){
        for (int i = 0; i < pontuacoes.length - 1; i++){
            for (int j = i + 1; j < pontuacoes.length; j++){
                if (pontuacoes[i] < pontuacoes[j] || 
                    (vitorias[i] < vitorias[j] && pontuacoes[i] == pontuacoes[j]) ||
                    (pontuacoes[i] == pontuacoes[j] && cartoesAmarelos[i] > cartoesAmarelos[j] && vitorias[i] < vitorias[j]) ||
                    (pontuacoes[i] == pontuacoes[j] && vitorias[i] == vitorias[j] && cartoesAmarelos[i] > cartoesAmarelos[j])){
                    
                        int tempPontuacao = pontuacoes[i];
                        pontuacoes[i] = pontuacoes[j];
                        pontuacoes[j] = tempPontuacao;

                        int tempCartoesAmarelos = cartoesAmarelos[i];
                        cartoesAmarelos[i] = cartoesAmarelos[j];
                        cartoesAmarelos[j] = tempCartoesAmarelos;

                        String tempTime = times[i];
                        times[i] = times[j];
                        times[j] = tempTime;

                        int tempVitorias = vitorias[i];
                        vitorias[i] = vitorias[j];
                        vitorias[j] = tempVitorias;
                }
            }
        }
    }
}