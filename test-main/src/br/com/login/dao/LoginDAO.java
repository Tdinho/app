
package br.com.login.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {
    
    public void cadastrarUsuario(String nome, String email, String senha) throws SQLException {
        Connection conexao = null;
        PreparedStatement statement = null;
        
        try {
            // Obtém a conexão com o banco de dados
            conexao = new Conexao().getConnection();
            
            // Define a instrução SQL com placeholders (?)
            String sql = "INSERT INTO USUARIOS (nome, email, senha, data_criacao) VALUES (?, ?, ?, NOW())";
            
            // Prepara a instrução SQL
            statement = conexao.prepareStatement(sql);
            
            // Atribui os valores aos placeholders (?)
            statement.setString(1, nome);
            statement.setString(2, email);
            statement.setString(3, senha);
            
            // Executa a instrução SQL
            statement.execute();
            
            // Fecha a conexão
            conexao.close();
        } catch (SQLException e) {
            // Em caso de erro, imprime o erro
            e.printStackTrace();
        } finally {
            // Garante que a conexão será fechada mesmo em caso de exceção
            if (conexao != null) {
                conexao.close();
            }
        }
    }
    
public void login(String email, String senha) throws SQLException {
    Connection conexao = null;
    PreparedStatement statement = null;
    ResultSet resultSet = null;
    
    try {
        // Obtém a conexão com o banco de dados
        conexao = new Conexao().getConnection();
        
        // Define a instrução SQL com placeholders (?)
        String sql = "SELECT EMAIL, SENHA FROM USUARIOS WHERE EMAIL = ? AND SENHA = ?";
        
        // Prepara a instrução SQL
        statement = conexao.prepareStatement(sql);
        
        // Atribui os valores aos placeholders (?)
        statement.setString(1, email);
        statement.setString(2, senha);
        
        // Executa a consulta SQL
        resultSet = statement.executeQuery();
        
        // Verifica se há algum resultado retornado pela consulta
        if (resultSet.next()) {
            // Se houver resultado, o login foi bem-sucedido
            System.out.println("Login bem-sucedido!");
        } else {
            // Se não houver resultado, o login falhou
            System.out.println("Email ou senha incorretos.");
        }
        
    } catch (SQLException e) {
        // Em caso de erro, imprime o erro
        e.printStackTrace();
    } finally {
        // Fecha todos os recursos utilizados
        if (resultSet != null) {
            resultSet.close();
        }
        if (statement != null) {
            statement.close();
        }
        if (conexao != null) {
            conexao.close();
        }
    }
}
}

    
