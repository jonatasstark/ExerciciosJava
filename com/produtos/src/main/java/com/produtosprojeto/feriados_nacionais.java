package com.produtosprojeto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class feriados_nacionais {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/cadastro_produto";
        String usuario = "root";
        String senha = "";

        try (Connection conexao = DriverManager.getConnection(url, usuario, senha)) {

            // Parte 2: Inserir feriado
            Scanner scan = new Scanner(System.in);
            String dataTexto, descricao;
            LocalDate data = null;
            boolean dataValida = false;
            while (!dataValida) {
                System.out.println("Digite a data do feriado (DD/MM/AAAA):");
                dataTexto = scan.nextLine();
                try {
                    data = LocalDate.parse(dataTexto, java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    dataValida = true;
                } catch (DateTimeParseException e) {
                    System.out.println("Data inválida. Digite novamente.");
                }
            }

            System.out.println("Digite uma breve descrição do feriado:");
            descricao = scan.nextLine();

            String sqlInserirFeriado = "INSERT INTO feriados_nacionais (data, descricao) VALUES (?, ?)";
            try (PreparedStatement statement = conexao.prepareStatement(sqlInserirFeriado)) {
                statement.setDate(1, java.sql.Date.valueOf(data));
                statement.setString(2, descricao);
                statement.executeUpdate();
                System.out.println("Feriado inserido.");
            } catch (SQLException e) {
                System.out.println("Erro ao inserir feriado, " + e.getMessage());
            }
            scan.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}