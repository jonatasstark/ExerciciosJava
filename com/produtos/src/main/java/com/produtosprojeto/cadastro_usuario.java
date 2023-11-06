package com.produtosprojeto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class cadastro_usuario {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String url = "jdbc:mysql://localhost:3306/cadastro_produto";
        String usuario = "root";
        String senha = "";

        try {
            Connection conexao = DriverManager.getConnection(url, usuario, senha);

            System.out.println("Digite o seu nome: ");
            String nome = scan.nextLine();
            System.out.println("Digite o seu E-mail: ");

            String email = scan.nextLine();
            boolean emailValido = false;
            while (!emailValido) {
                if (email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[A-Za-z]{2,}$")) {
                    emailValido = true;
                } else {
                    System.out.println("E-mail inválido. Digite novamente:");
                    email = scan.nextLine();
                }
            }

            System.out.println("Digite seu telefone: ");
            String telefone = scan.nextLine();

            // Parte 2: Inserir um aluno

            String sqlInserirUsuario = "INSERT INTO cadastro_usuario (nome, email, telefone) VALUES (?, ?, ?)";
            try (PreparedStatement statementInserir = conexao.prepareStatement(sqlInserirUsuario)) {
                statementInserir.setString(1, nome);
                statementInserir.setString(2, email);
                statementInserir.setString(3, telefone);
                int linhasAfetadas = statementInserir.executeUpdate();
                System.out.println(linhasAfetadas + " usuário inserido.");

                scan.close();
                statementInserir.close();
                conexao.close();
            } catch (SQLException e) {
                System.out.println("Erro ao inserir usuário, " + e.getMessage());
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}