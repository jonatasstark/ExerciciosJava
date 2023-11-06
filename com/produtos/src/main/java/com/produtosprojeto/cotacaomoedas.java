package com.produtosprojeto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import java.sql.Statement;
import java.util.Scanner;

public class cotacaomoedas {

   public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String url = "jdbc:mysql://localhost:3306/cadastro_produto";
        String usuario = "root";
        String senha = "";

        try {
            Connection conexao = DriverManager.getConnection(url, usuario, senha);

            System.out.println("Digite o nome da moeda: ");
            String Nome = scan.nextLine().toLowerCase();
            System.out.println("Digite o valor da moeda: ");
            double Valor = scan.nextDouble();

            // Parte 2: Inserir uma moeda

            String sqlInserirMoeda = "INSERT INTO cotacao_moeda (nome, valor) VALUES (?, ?)";
            try(PreparedStatement statementInserir = conexao.prepareStatement(sqlInserirMoeda)){
                statementInserir.setString(1, Nome);
                statementInserir.setDouble(2, Valor);
                int linhasAfetadas = statementInserir.executeUpdate();
                System.out.println(linhasAfetadas + " moeda inserida.");

                scan.close();
                statementInserir.close();
                conexao.close();           
            }catch (SQLException e){
                System.out.println("Esta moeda já existe " + e.getMessage());
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
   }
}