package com.produtosprojeto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

public class produtos_estoque {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/cadastro_produto";
        String usuario = "root";
        String senha = "";

        // Produtos para transferir para o estoque
        String[] nomes = {"Camiseta de Algodão", "Calça Jeans Skinny", "Tênis Esportivo Nike", "Vestido Floral", "Óculos de Sol Ray-Ban", "Relógio de Pulso Casio", "Mochila para Notebook", "Bolsa de Couro Feminina", "Boné Estilizado", "Jaqueta Corta-Vento", "Calça de Moletom", "Sapato Social Masculino", "Biquíni Estampado", "Shorts de Praia", "Perfume Importado", "Batom Matte", "Camisa Polo Lacoste", "Saia Midi Plissada", "Tênis Converse Chuck Taylor", "Camisa de Flanela", "Pulseira de Prata", "Anel de Diamante", "Colar de Pérolas", "Blusa de Tricô", "Chapéu Fedora", "Bolsa Tote de Couro", "Blazer Slim Fit", "Relógio Smartwatch", "Calça Legging Esportiva", "Camisa Social Branca", "Bota de Couro", "Vestido de Festa Longo", "Mala de Viagem Grande", "Camisola de Seda", "Sapato de Salto Alto", "Blusa de Cetim", "Sneaker Plataforma"};
        int[] quantidades = {61, 30, 22, 57, 72, 55, 66, 38, 56, 34, 68, 57, 47, 28, 60, 21, 22, 42, 21, 35, 65, 45, 47, 45, 23, 54, 52, 51, 33, 46, 61, 24, 38, 36, 23, 32, 64};
        LocalDate[] datasCompras = {LocalDate.parse("2023-10-10"), LocalDate.parse("2023-10-11"), LocalDate.parse("2023-10-12"), LocalDate.parse("2023-10-13"), LocalDate.parse("2023-10-14"), LocalDate.parse("2023-10-15"), LocalDate.parse("2023-10-16"), LocalDate.parse("2023-10-17"), LocalDate.parse("2023-10-18"), LocalDate.parse("2023-10-19"), LocalDate.parse("2023-10-20"), LocalDate.parse("2023-10-21"), LocalDate.parse("2023-10-22"), LocalDate.parse("2023-10-23"), LocalDate.parse("2023-10-24"), LocalDate.parse("2023-10-25"), LocalDate.parse("2023-10-26"), LocalDate.parse("2023-10-27"), LocalDate.parse("2023-10-28"), LocalDate.parse("2023-10-29"), LocalDate.parse("2023-10-30"), LocalDate.parse("2023-10-31"), LocalDate.parse("2023-11-01"), LocalDate.parse("2023-11-02"), LocalDate.parse("2023-11-03"), LocalDate.parse("2023-11-04"), LocalDate.parse("2023-11-05"), LocalDate.parse("2023-11-06"), LocalDate.parse("2023-11-07"), LocalDate.parse("2023-11-08"), LocalDate.parse("2023-11-09"), LocalDate.parse("2023-11-10"), LocalDate.parse("2023-11-11"), LocalDate.parse("2023-11-12"), LocalDate.parse("2023-11-13"), LocalDate.parse("2023-11-14"), LocalDate.parse("2023-11-15")};
        double[] precos = {19.99, 49.99, 89.99, 29.99, 129.99, 79.99, 39.99, 59.99, 14.99, 54.99, 34.99, 69.99, 24.99, 19.99, 89.99, 9.99, 69.99, 39.99, 49.99, 29.99, 19.99, 149.99, 99.99, 44.99, 24.99, 74.99, 64.99, 129.99, 29.99, 49.99, 79.99, 129.99, 99.99, 34.99, 54.99, 29.99, 44.99};

        try (Connection conexao = DriverManager.getConnection(url, usuario, senha)) {

            // Transfere os produtos para o estoque, com as condições especificadas
            for (int i = 0; i < nomes.length; i++) {
                String nome = nomes[i];
                int quantidade = quantidades[i];
                LocalDate dataCompra = datasCompras[i];
                double preco = precos[i];

                // Verifica se a quantidade está dentro dos limites
                if (quantidade >= 20 && quantidade <= 75) {
                    // Insere o produto no estoque, com a data de compra e o preço
                    String sqlInserir = "INSERT INTO estoque (nome, quantidade, valor, data_compra) VALUES (?, ?, ?, ?)";
                    try (PreparedStatement statement2 = conexao.prepareStatement(sqlInserir)) {
                        statement2.setString(1, nome);
                        statement2.setInt(2, quantidade);
                        statement2.setDouble(3, preco);
                        statement2.setDate(4, java.sql.Date.valueOf(dataCompra));
                        statement2.executeUpdate();
                        System.out.println("Produto " + nome + " inserido no estoque.");
                    } catch (SQLException e) {
                        System.out.println("Erro ao inserir produto " + nome + " no estoque, " + e.getMessage());
                    }
                } else {
                    System.out.println("Quantidade inválida para o produto " + nome + ": " + quantidade);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}