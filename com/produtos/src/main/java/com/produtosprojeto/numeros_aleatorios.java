package com.produtosprojeto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

public class numeros_aleatorios {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/cadastro_produto";
        String usuario = "root";
        String senha = "";

        try (Connection conexao = DriverManager.getConnection(url, usuario, senha)) {

            // Parte 2: Inserir números aleatórios
            Random random = new Random();
            String sqlInserirNumero = "INSERT INTO numeros_aleatorios (numero) VALUES (?)";
            try (PreparedStatement statement = conexao.prepareStatement(sqlInserirNumero)) {
                for (int i = 0; i < 1; i++) {
                    int numero = random.nextInt(100);
                    statement.setInt(1, numero);
                    statement.executeUpdate();
                    System.out.println("Número " + numero + " inserido.");
                }
            } catch (SQLException e) {
                System.out.println("Erro ao inserir número, " + e.getMessage());
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}