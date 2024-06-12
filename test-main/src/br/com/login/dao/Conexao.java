
package br.com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    public Connection getConnection() throws SQLException{
        Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/app_development", "root", "password");
        return conexao;
    }
   
}