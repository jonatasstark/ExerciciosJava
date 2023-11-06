package com.produtosprojeto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class eclipses_solares {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/cadastro_produto";
        String usuario = "root";
        String senha = "";

        try (Connection conexao = DriverManager.getConnection(url, usuario, senha)) {

            // Parte 2: Inserir informação sobre eclipse
            Scanner scan = new Scanner(System.in);
            String dataTexto, tipo;
            LocalDate data = null;
            boolean dataValida = false;
            while (!dataValida) {
                System.out.println("Digite a data do eclipse (DD/MM/AAAA):");
                dataTexto = scan.nextLine();
                try {
                    data = LocalDate.parse(dataTexto, java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    dataValida = true;
                } catch (DateTimeParseException e) {
                    System.out.println("Data inválida. Digite novamente.");
                }
            }

            System.out.println("Digite o tipo do eclipse (total, parcial, anular):");
            tipo = scan.nextLine();

            String sqlInserirEclipse = "INSERT INTO eclipses_solares (data, tipo) VALUES (?, ?)";
            try (PreparedStatement statement = conexao.prepareStatement(sqlInserirEclipse)) {
                statement.setDate(1, java.sql.Date.valueOf(data));
                statement.setString(2, tipo);
                statement.executeUpdate();
                System.out.println("Informação sobre eclipse inserida.");
            } catch (SQLException e) {
                System.out.println("Erro ao inserir informação sobre eclipse, " + e.getMessage());
            }
            scan.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}