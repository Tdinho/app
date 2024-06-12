
package br.com.login.controller;

import br.com.login.dao.Conexao;
import br.com.login.dao.LoginDAO;
import br.com.telas.view.cadastroview;
import br.com.telas.view.loginview;
import java.sql.Connection;
import java.sql.SQLException;


public class LoginController {
    
public void cadastroUsuario(cadastroview view) throws SQLException{
    Connection conexao = new Conexao().getConnection();
    LoginDAO cadastro = new LoginDAO();
    cadastro.cadastrarUsuario(view.getJTextFieldNome().getText(), view.getJTextFieldEmail().getText(), view.getJPasswordFieldSenha().getText());
      
}

public void loginUsuario(loginview view) throws SQLException{
    Connection conexao = new Conexao().getConnection();
    LoginDAO login = new LoginDAO();
    login.login(view.getJTextFieldEmail().getText(), view.getJPasswordFieldSenha().getText());
      
}
}