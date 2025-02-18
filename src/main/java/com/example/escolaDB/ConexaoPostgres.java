package com.example.escolaDB;

import java.sql.*;

public class ConexaoPostgres {

    public static void main(String[] args) throws SQLException {

        String url = "jdbc:postgresql://localhost:5432/postgres";
        String usuario = "postgres";
        String senha = "admin";

        try (Connection conexao = DriverManager.getConnection(url, usuario, senha)) {
            System.out.println("Conexão bem-sucedida com o PostgreSQL!");

            // Criar uma consulta
            String sql = "SELECT * FROM alunos";

            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            // Exibir os resultados
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Nome: " + rs.getString("nome"));
                System.out.println("Idade: " + rs.getString("idade"));
                System.out.println("Serie: " + rs.getString("serie"));
                System.out.println("-------------------");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
    }
}

